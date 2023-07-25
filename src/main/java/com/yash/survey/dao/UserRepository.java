package com.yash.survey.dao;

import org.springframework.data.repository.CrudRepository;

import com.yash.survey.entitty.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
