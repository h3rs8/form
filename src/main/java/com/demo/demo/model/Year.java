package com.demo.demo.model;
// This Class represents a single year. Each year contains 12 months.
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Year {

	@Id
	private Long year;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "year")
	List<Month> months;

	public Year() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Year(Long year, List<Month> months) {
		super();
		this.year = year;
		this.months = months;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}
	
	
	
}
