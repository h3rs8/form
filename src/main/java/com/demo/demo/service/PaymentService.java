package com.demo.demo.service;

import org.springframework.stereotype.Service;

import com.demo.demo.model.Payment;
import com.demo.demo.model.User;

@Service
public class PaymentService {
	
	public Boolean completePayment(User user,Payment payment) {
		// Mock Function which does payment processing.
		return true;
	}

}
