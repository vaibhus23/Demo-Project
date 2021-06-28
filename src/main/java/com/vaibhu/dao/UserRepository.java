package com.vaibhu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaibhu.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
