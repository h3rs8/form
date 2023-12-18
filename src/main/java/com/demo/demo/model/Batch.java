package com.demo.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


// Represents a Single Batch in of a month.
@Entity
public class Batch {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "batch")
	private List<User> Users;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Month month;
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<User> getUsers() {
		return Users;
	}


	public void setUsers(List<User> users) {
		Users = users;
	}


	public Batch(Long id, String name, List<User> users) {
		super();
		this.id = id;
		this.name = name;
		Users = users;
	}


	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Batch [id=" + id + ", name=" + name + ", Users=" + Users + "]";
	}


	public Month getMonth() {
		return month;
	}


	public void setMonth(Month month) {
		this.month = month;
	}
	
	
	
	
}
