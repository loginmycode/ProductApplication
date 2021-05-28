package com.learn.Book.BookServices;

import java.util.List;
import com.learn.Book.Model.Book;

public interface BookServices {

	public Book addBooks(Book book);
	public Book updateBookById(Book book);
	public List<Book> getAllBooks();
	public Book removeBook(int id) ;
	public Book getBookById(int id) ;
	
}
