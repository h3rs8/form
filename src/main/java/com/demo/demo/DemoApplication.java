package com.demo.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.demo.demo.model.Batch;
import com.demo.demo.model.User;
import com.demo.demo.repo.BatchRepo;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	BatchRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	
	public void run(String... args) throws Exception {
		
	}
	
//		System.out.println("application running");
//System.out.println("runing");
//		
//		Batch batch1 = new Batch();
//		
//		batch1.setId(1L);
//		batch1.setName("6to7");
//		batch1.setUsers(new ArrayList<User>());
//		
//		Batch batch2 = new Batch();
//		
//		batch2.setId(2L);
//		batch2.setName("7to8");
//		batch2.setUsers(new ArrayList<User>());
//		
//		Batch batch3 = new Batch();
//		
//		batch3.setId(3L);
//		batch3.setName("8to9");
//		batch3.setUsers(new ArrayList<User>());
//		
//		Batch batch4 = new Batch();
//		
//		batch4.setId(4L);
//		batch4.setName("5to6");
//		batch4.setUsers(new ArrayList<User>());
//		
//		
//		repo.save(batch1);
//		repo.save(batch2);
//		repo.save(batch3);
//		repo.save(batch4);
//		
//		
//		
//		
//	}
	
	

}
