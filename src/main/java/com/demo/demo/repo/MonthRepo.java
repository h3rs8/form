package com.demo.demo.repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.model.Month;
import com.demo.demo.model.Year;


public interface MonthRepo extends JpaRepository<Month, String>{
	List<Month> findByYear(Year year);
}
