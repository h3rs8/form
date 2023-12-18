package com.demo.demo.controller;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.model.Batch;
import com.demo.demo.model.FormData;
import com.demo.demo.model.Payment;
import com.demo.demo.model.User;
import com.demo.demo.model.Year;
import com.demo.demo.service.BatchService;
import com.demo.demo.service.MonthService;
import com.demo.demo.service.PaymentService;
import com.demo.demo.service.UserService;
import com.demo.demo.service.YearService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class FormController {
	@Autowired
	UserService uservice;
	@Autowired
	BatchService bservice;
	@Autowired
	PaymentService pservice;
	@Autowired
	YearService yservice;
	
	@Autowired 
	MonthService mservice;
	
	
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody FormData data) throws Exception {
		// Doing basic validation
		if(data.getAge()==null || data.getAge()<18 || data.getAge()>65 || data.getBatchid()==null || data.getName().trim().isEmpty() || String.valueOf(data.getPhone()).length()>10  || String.valueOf(data.getPhone()).length()<10)
			return new ResponseEntity<User>(HttpStatus.PRECONDITION_FAILED);
		
		
		
		// Getting the current Year as Long and Month in range(0,11).
		
		
		Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        String formattedYear = dateFormat.format(currentDate);
        long yearAsLong = Long.parseLong(formattedYear);
		
        Month currentMonth = Month.values()[java.time.LocalDate.now().getMonthValue() - 1];
        System.out.println("Month: " + currentMonth);
        int monthValue = currentMonth.getValue() - 1;
        System.out.println("Month (0 to 11): " + monthValue);
        
        // Getting year object of the current year.
		Year year = yservice.getYear(yearAsLong);
		
		// Getting the list of months in the year object
		List<com.demo.demo.model.Month> mlist = mservice.getMonthsofYear(year);
		
		// Getting the current Month's Object from the list we fetched above.
		com.demo.demo.model.Month monthobj = mlist.get(monthValue);
		
		// Getting the list of batches in the current month.
		List<Batch> batchlist = bservice.getBatchesofMonth(monthobj);
		
		// Getting the batch that the user wants to register in from the list fetched above.
		Batch batch = batchlist.get(data.getBatchid().intValue());
		
		
		// Creating the user object with the details input by the user.
		
		User user = new User();
		user.setAge(data.getAge());
		user.setName(data.getName());
		user.setPhone(data.getPhone());
		
		// Creating the payment object with the details input by the user.
		Payment payment = new Payment();
		payment.setUpiid(data.getUpiid());
		payment.setAmount(data.getAmount());
		
		// Calling the dummy Payment function with payment and user details.
		if(!pservice.completePayment(user,payment))
			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		
		// Setting the batch in the user object
		user.setBatch(batch);
		// Adding user to the database
		uservice.addUser(user);
		// Adding user to the desired batch.
		batch.getUsers().add(user);
		bservice.updateBatch(batch);
		
		
		
		return new ResponseEntity<User>(HttpStatus.ACCEPTED);
		
		
		
		
	}
}
