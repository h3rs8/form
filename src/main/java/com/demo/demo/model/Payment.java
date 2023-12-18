package com.demo.demo.model;
// This class contains the payment details.
public class Payment {
	
	private String upiid;
	
	private Float amount;
	
	

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(String upiid) {
		super();
		this.upiid = upiid;
	}

	public String getUpiid() {
		return upiid;
	}

	public void setUpiid(String upiid) {
		this.upiid = upiid;
	}
	
}
