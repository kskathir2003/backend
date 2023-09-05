package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookService;
import com.example.demo.model.Book;
import java.util.*;

@RestController
@RequestMapping("/book")
public class BookContoller {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("displaybooks")
	public List<Book> displayBooks(){
		return bookService.displayBooks();
	}
	
	@GetMapping("getbook")
	public Optional<Book> displayBook(@RequestParam int bookId) {
		return bookService.displayBookById(bookId);
	}
	
	@PostMapping("addbooks")
	public String addBooks(@RequestBody List<Book> books) {
		bookService.addBooks(books);
		return "Books added successfully";
	}
	
}
