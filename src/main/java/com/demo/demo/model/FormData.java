package com.demo.demo.model;
// This class represents the data (RequestBody) being sent from the frontend via API call.

public class FormData {
	private Long phone;
	private String name;
	private Long batchid;
	private Integer age;
	private String upiid;
	private Float amount;
	
	
	
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public String getUpiid() {
		return upiid;
	}
	public void setUpiid(String upiid) {
		this.upiid = upiid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getBatchid() {
		return batchid;
	}
	public void setBatchid(Long batchid) {
		this.batchid = batchid;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public FormData(Long phone, String name, Long batchid, Integer age, String upiid) {
		super();
		this.phone = phone;
		this.name = name;
		this.batchid = batchid;
		this.age = age;
		this.upiid = upiid;
	}
	public FormData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FormData [name=" + name + ", batchid=" + batchid + ", age=" + age + ", upiid=" + upiid + "]";
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	
}
