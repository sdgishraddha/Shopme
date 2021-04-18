package com.Shopme.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Shopme.model.User;
import com.Shopme.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("")
	public List<User> listUsers() {
		return userService.listAllUser();
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable Integer userId) {
		try {
			User user = userService.getUserById(userId);
			return new ResponseEntity<>(user, HttpStatus.OK);

		} catch (NoSuchElementException exp) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/")
	public void addUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Integer userId) {

		if (userService.getUserById(userId) != null) {
			user.setUserId(userId);
			userService.saveUser(user);
			return new ResponseEntity<>(HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable Integer userId) {
		userService.deleteUserById(userId);
	}

}