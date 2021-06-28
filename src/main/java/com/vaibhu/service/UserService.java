package com.vaibhu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vaibhu.entities.User;
@Service
public interface UserService {
	User addUser(User user);

	User getUserById(int userId);

	void updateUser(User user);

	void deleteUserById(int userId);

	List<User> getAllUsers();

}
