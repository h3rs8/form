package com.demo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.model.Year;

public interface YearRepo extends JpaRepository<Year, Long> {

}
