package com.example.BookApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookApplication.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
		
}
