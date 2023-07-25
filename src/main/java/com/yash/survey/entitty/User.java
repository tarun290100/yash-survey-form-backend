package com.yash.survey.entitty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String name;
    private String city;
	private String role;
	private String que1;
	private String que2;
	private String que3;
	
	public User(int id, String name, String city, String role,String que1,String que2,String que3) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.role = role;
		this.que1=que1;
		this.que2=que2;
		this.que3=que3;
		
	}
	public String getQue1() {
		return que1;
	}

	public void setQue1(String que1) {
		this.que1 = que1;
	}

	public String getQue2() {
		return que2;
	}

	public void setQue2(String que2) {
		this.que2 = que2;
	}

	public String getQue3() {
		return que3;
	}

	public void setQue3(String que3) {
		this.que3 = que3;
	}
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String status) {
		this.role = status;
	}

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", status=" + role + "]";
	}

	
    
}