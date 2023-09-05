package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> addBooks(List<Book> books){
		return bookRepository.saveAll(books);
	}

	public List<Book> displayBooks(){
		return bookRepository.findAll();
	}
	
	public Optional<Book> displayBookById(int id) {
		return bookRepository.findById(id);
	}
	
}
