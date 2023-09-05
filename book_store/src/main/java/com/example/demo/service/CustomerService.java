package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public String signUp(Customer customer) {
		customerRepository.save(customer);
		return "Sign Up Successfull";
	}
	
	public String getCustomerPassword(String customerEmail) {
		 Customer customer  = customerRepository.findByCustomerEmail(customerEmail);
		 System.out.println(customerEmail);
		 System.out.println(customer.getCustomerPassword());
		 return customer.getCustomerPassword();
	}
		
}
