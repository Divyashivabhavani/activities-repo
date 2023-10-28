package com.npci.beans;

public class Customer_Table {
	
	private int customer_id;
	private String firstname;
	private String lastname;
	private String emailId;
	private String password;
	private Long phone;
	private String pan_ref_id;
	public Customer_Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getPan_ref_id() {
		return pan_ref_id;
	}
	public void setPan_ref_id(String pan_ref_id) {
		this.pan_ref_id = pan_ref_id;
	}
	
	

}
