package com.demo.demo.model;
// This Class represents the Month of a year. Each month has a number of batches.
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Month {
	
	@Id
	@GeneratedValue 
	private Long id;
	private String month;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Year year;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "month")
	private List<Batch> batches;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public List<Batch> getBatches() {
		return batches;
	}

	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}

	public Month() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
	
	

}
