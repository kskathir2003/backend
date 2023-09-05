package com.example.demo.model;

public class LoginForm {

	private String customerEmail;
	private String customerPassword;
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public LoginForm(String customerEmail, String customerPassword) {
		super();
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
	}
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
