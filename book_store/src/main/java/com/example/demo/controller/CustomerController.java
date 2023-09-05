package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.LoginForm;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("signup")
	public String signUp(@RequestBody Customer customer) {
		return customerService.signUp(customer);
	}
	
	@GetMapping("login")
	public String verifyLogin(@RequestBody LoginForm loginForm) {
		String password = customerService.getCustomerPassword(loginForm.getCustomerEmail());
			if(loginForm.getCustomerPassword().equals(password)) {
				return "Login Successful";
			}
		return "Invalid Credentials";
	}
}
