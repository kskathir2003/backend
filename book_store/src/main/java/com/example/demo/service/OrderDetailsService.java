package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.OrderDetail;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.OrderDetailsRepository;

@Service
public class OrderDetailsService {

	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getBooksByOrderId(int orderId){
		List<OrderDetail> orderDetails = orderDetailsRepository.findByOrderId(orderId);
		List<Book> books = new ArrayList<>();
		for (int i = 0; i < orderDetails.size(); i++) {
		    List<Book> bookList = bookRepository.findByBookId(orderDetails.get(i).getBookId());
		    books.addAll(bookList);
		    return bookList;
		}

		return books;
	}
}
