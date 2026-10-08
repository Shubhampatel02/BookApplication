package com.example.BookApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookApplication.Entity.Book;
import com.example.BookApplication.service.BookService;

@RestController
@RequestMapping("/book/v1")
public class BookController {
	
	private final BookService bookservice;
	@Autowired
	public BookController(BookService bookservice) {
		this.bookservice=bookservice;
	}
	
	@PostMapping("/addBook")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book savedBook = bookservice.addbook(book);
		return ResponseEntity.ok(savedBook);
	}
	
	@GetMapping("/getBook/{bookName}")
	public ResponseEntity<Book> getBookByname(@PathVariable("bookName") String name){
		Book book=bookservice.getBookByname(name);
		return ResponseEntity.ok(book);
	}
	@DeleteMapping("/deleteBook")
	public ResponseEntity<String> DeleteBook(@RequestBody Book book) {
		bookservice.deletebook(book);
		return ResponseEntity.ok("deletion successful");
	}
}
