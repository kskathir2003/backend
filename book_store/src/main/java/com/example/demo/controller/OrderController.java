package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrderDetailsService;
import com.example.demo.service.OrderService;
import com.example.demo.model.Book;
import com.example.demo.model.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderDetailsService orderDetailsService;
	
	@GetMapping("showorders")
	public List<Order> showOrders(@RequestBody int customerId){
		return orderService.showOrders(customerId);
	}
	
	@PostMapping("addorder")
	public String addorder(@RequestBody Order order)
	{
		return orderService.placeOrder(order);
	}
	
	@GetMapping("showallorders")
	public List<Order> addorder()
	{
		return orderService.showOrders();
	}
	
	@GetMapping("showordersdetails")
	public List<Book> displayOrderedBooks(@RequestParam int orderId){
		return orderDetailsService.getBooksByOrderId(orderId);
	}
}
