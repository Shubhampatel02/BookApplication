package com.example.BookApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookApplication.Entity.Book;
import com.example.BookApplication.repository.BookRepository;

@Service
public class BookService {
	
	
	@Autowired
	BookRepository bookrepository;
	public Book addbook(Book book) {
			Book save =	bookrepository.save(book);
			System.out.print(save);
			return save;
			
	}
	
}
