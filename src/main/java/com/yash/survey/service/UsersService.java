package com.yash.survey.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.survey.dao.UserRepository;
import com.yash.survey.entitty.User;

@Service
public class UsersService {
	@Autowired  
	
	
	UserRepository usersRepository;
	
	
	
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<User> getAllUsers()   
	{  
	List<User> users = new ArrayList<User>();  
	usersRepository.findAll().forEach(users1 -> users.add(users1));  
	return users;  
	}  
	
	
	//getting a specific record by using the method findById() of CrudRepository  
	public User getUsersById(int id)   
	{  
	return usersRepository.findById(id).get();  
	}  
	
	
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(User user)   
	{  
	   usersRepository.save(user);  
	}  
	
	
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	usersRepository.deleteById(id);  
	}  
	
	
	//updating a record  
	public void update(User user, int userid)   
	{  
	usersRepository.save(user);  
	}  
}  

