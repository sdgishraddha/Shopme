package com.Shopme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shopme.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
