package com.demo.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.model.Batch;
import com.demo.demo.model.Month;
import com.demo.demo.model.User;
import com.demo.demo.repo.BatchRepo;
import com.demo.demo.repo.MonthRepo;

@Service
public class BatchService {
	@Autowired
	BatchRepo repo;
	@Autowired
	MonthRepo mrepo;
	
	@SuppressWarnings("deprecation")
	public Batch getBatch(Long id) {
		return repo.getById(id);
	}
	
	public Batch updateBatch(Batch batch) {
		repo.save(batch);
		return batch;
	}
	// This functions returns list of batches in a month. In case the list is empty, it is populated with the four batches as provided in the document.
	public List<Batch> getBatchesofMonth(Month month) {
		List<Batch> batches = repo.findByMonth(month);
		if(!batches.isEmpty())
			return batches;
		
		Batch batch1 = new Batch();
		
		
		batch1.setName("6to7");
		batch1.setUsers(new ArrayList<User>());
		batch1.setMonth(month);
		batches.add(batch1);
		
		Batch batch2 = new Batch();
		
		
		batch2.setName("7to8");
		batch2.setUsers(new ArrayList<User>());
		batch2.setMonth(month);
		batches.add(batch2);
		
		Batch batch3 = new Batch();
		
		
		batch3.setName("8to9");
		batch3.setUsers(new ArrayList<User>());
		batch3.setMonth(month);
		batches.add(batch3);
		
		Batch batch4 = new Batch();
		
		
		batch4.setName("5to6");
		batch4.setUsers(new ArrayList<User>());
		batch4.setMonth(month);
		batches.add(batch4);
		
		
		repo.save(batch1);
		repo.save(batch2);
		repo.save(batch3);
		repo.save(batch4);
		
		month.setBatches(batches);
		mrepo.save(month);
		return batches;
	}
}
