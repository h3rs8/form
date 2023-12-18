package com.demo.demo.model;

// This class represents the user. Each user is uniquely identified with their phone number.

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private Long phone;
	
	private String name;
	
	private Integer age;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Batch batch;

	public Long getId() {
		return phone;
	}

	public void setId(Long id) {
		this.phone = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public User(Long phone, String name, Integer age, Batch batch) {
		super();
		this.phone = phone;
		this.name = name;
		this.age = age;
		this.batch = batch;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + phone + ", name=" + name + ", age=" + age + ", batch=" + batch + "]";
	}
	
	
}
