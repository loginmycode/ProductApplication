package com.learn.Book.BookDao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.learn.Book.Model.Book;


public interface BookRepo {

	public Book addBooks(Book book);
	public Book updateBookById(Book book);
	public List<Book> getAllBooks();
	public Book removeBook(int id);
	public Book getBookById(int id);
	
	
}
