package com.springbootrestful.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbootrestful.entites.User;
import com.springbootrestful.exceptions.UserNotFoundException;
import com.springbootrestful.repository.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	//get all users method
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//Create user method
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	//Get user by id
	public Optional<User> getUserById(long id){
		Optional<User> user = userRepository.findById(id);
		return user;
	}
	
	//Update userById
	public User updateuserByid(Long id, User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	//Delete user by id
	public void deleteUserById(Long id) {
		if(userRepository.findById(id).isPresent()) {
			userRepository.deleteById(id);
		}
	}
	
	//GetUserByName
	public User getUserByName(String username) {
		return userRepository.findByUsername(username);
		 
	}
}
