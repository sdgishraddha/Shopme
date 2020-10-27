package com.sportyshoesweb.model;

import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {

	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	private short isAdmin;
	private SimpleDateFormat lastLogin;
	private SimpleDateFormat createdAt;

	public User(int userId, String firstName, String lastName, String email, String phoneNumber, String password,
			short isAdmin, SimpleDateFormat lastLogin) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.isAdmin = isAdmin;
		this.lastLogin = lastLogin;
	}

	public User(int userId, String firstName, String lastName, String email, String phoneNumber, String password,
			short isAdmin, SimpleDateFormat lastLogin, SimpleDateFormat createdAt) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.isAdmin = isAdmin;
		this.lastLogin = lastLogin;
		this.createdAt = createdAt;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(short isAdmin) {
		this.isAdmin = isAdmin;
	}

	public SimpleDateFormat getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(SimpleDateFormat lastLogin) {
		this.lastLogin = lastLogin;
	}

	public SimpleDateFormat getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(SimpleDateFormat createdAt) {
		this.createdAt = createdAt;
	}

}
