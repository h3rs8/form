package com.demo.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.model.Month;
import com.demo.demo.model.Year;
import com.demo.demo.repo.MonthRepo;
import com.demo.demo.repo.YearRepo;


@Service
public class MonthService {
	@Autowired
	MonthRepo mrepo;
	@Autowired
	YearRepo yrepo;
	// This function provides list of months in the year provided.
	public List<Month> getMonthsofYear(Year year) {
			// Fetching months by year.
			List<Month> list = new ArrayList<>(mrepo.findByYear(year));
			System.out.println("The size is :"+list.size());
			// In case size the list is empty:
			if(list.size()==0) {
				// We create a new list and add 12 months into it. And save the entities to the database.
				List<Month> newlist = new ArrayList<>();
				
				for(int i = 0;i<12;i++) {
					Month m = new Month();
					m.setYear(year);
					mrepo.save(m);
					newlist.add(m);
				}
				year.setMonths(newlist);
				yrepo.save(year);	
				return newlist;
				
				}
			
			return list;
		
}}
		
	


