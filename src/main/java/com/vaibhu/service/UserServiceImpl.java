package com.vaibhu.service;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.vaibhu.dao.UserRepository;
import com.vaibhu.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return repository.findById(userId).get();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		repository.findById(user.getUserId())
				.orElseThrow(() -> new NoSuchElementException("No Element found"));
		repository.save(user);
	}

	@Override
	public void deleteUserById(int userId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(userId);
		} catch (DataAccessException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
