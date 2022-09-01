package com.springbootrestful.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.springbootrestful.entites.User;
import com.springbootrestful.exceptions.UserNotFoundException;
import com.springbootrestful.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//get all users method
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	//Create user
	//RequestBody
	//@Postmapping
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	//get user by id
	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable ("id") Long id){
		return userService.getUserById(id);
		
	}
	
	//Update user by id
	@PutMapping("/users/{id}")
	public User updateUserById(@PathVariable("id") Long id, @RequestBody User user) {
		return userService.updateuserByid(id, user);
	}
	
	//Delete user by id
	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable("id") long id) {
		userService.deleteUserById(id);
	}
	
	//Get user by username
	@GetMapping("/user/{username}")
	public User getUserByUsername(@PathVariable("username") String username) {
		return userService.getUserByName(username);
	}
	
}
