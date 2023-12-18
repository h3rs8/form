package com.demo.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo.model.Batch;
import com.demo.demo.model.Month;
import com.demo.demo.model.Year;
@Repository
public interface BatchRepo extends JpaRepository<Batch, Long> {
	List<Batch> findByMonth(Month month);
}
