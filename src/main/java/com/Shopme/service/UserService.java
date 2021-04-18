package com.Shopme.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Shopme.model.User;
import com.Shopme.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> listAllUser() {
		return userRepository.findAll();
	}

	public void saveUser(User user) {
		userRepository.save(user);
	}

	public User getUserById(Integer userId) {

		if (userRepository.findById(userId).isPresent()) {
			return userRepository.findById(userId).get();
		}
		throw new NoSuchElementException();
	}

	public void deleteUserById(Integer userId) {
		userRepository.deleteById(userId);
	}

}
