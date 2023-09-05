package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderDetailsRepository;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	private OrderDetailsRepository orderDetailsRepository;
	
	public String placeOrder(Order order) {
		orderRepository.save(order);
		return "Order Placed Successfully";
	}
	
	public List<Order> showOrders(int customerId){
		return orderRepository.findByCustomerId(customerId);
	}
	
	public List<Order> showOrders(){
		return orderRepository.findAll();
	}
}
