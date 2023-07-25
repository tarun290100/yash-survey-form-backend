package com.yash.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.survey.entitty.User;
import com.yash.survey.service.UsersService;



@RestController
public class UserController {
	
	@Autowired  
	UsersService usersService;  
	
	   
	@GetMapping("/user")  
	private List<User> getAllUsers()   
	{   
	return usersService.getAllUsers();  
	}  
	
	
	@GetMapping("/user/{userid}")  
	private User getUser(@PathVariable("userid") int userid)   
	{  
	return usersService.getUsersById(userid);  
	}  
	
	@DeleteMapping("/user/{userid}")  
	private void deleteUser(@PathVariable("userid") int userid)   
	{  
	usersService.delete(userid);  
	}  
	
 
	@PostMapping("/user")  
	private int saveUser(@RequestBody User user)   
	{  
	usersService.saveOrUpdate(user);  
	return user.getId();  
	}  
	 
	@PutMapping("/user")  
	private User update(@RequestBody User user)   
	{  
	usersService.saveOrUpdate(user);  
	return user;  
	}  
	}  