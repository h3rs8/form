package com.demo.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.model.Month;
import com.demo.demo.model.Year;
import com.demo.demo.repo.YearRepo;

@Service
public class YearService{
	
	@Autowired
	YearRepo repo;
	public Year getYear(Long id) {
		
		Year year;
		// We fetch year from DB by Id.
		Optional<Year> yr = repo.findById(id);
		// Using .orElse of Optional class to return null in case year does not exist in the DB.
		if(!(yr.orElse(null)==null))	
			return yr.get() ;
			
	
		
		// Since year doesn't exist. We create it and save it to the database.
		year = new Year();
		year.setYear(id);
		repo.save(year);
		System.out.println("SAVED Year");
		return year;
		}		
		
	

}
