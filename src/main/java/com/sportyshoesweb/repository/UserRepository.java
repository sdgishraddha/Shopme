package com.sportyshoesweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoesweb.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
