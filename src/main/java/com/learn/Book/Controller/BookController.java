package com.learn.Book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Book.BookDao.BookRepo;
import com.learn.Book.BookServices.BookServices;
import com.learn.Book.CustomException.BookDoesNotExist;
import com.learn.Book.Model.Book;

@RestController
public class BookController {

	@Autowired
	BookServices bookservice;
	
	@GetMapping("/")
	public String  testApp()
	{
		return "SuccessFully";
		
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<Book> addBooks(@RequestBody Book book)
	{
		return new ResponseEntity<Book>(bookservice.addBooks(book),HttpStatus.CREATED);
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable ("id") int id)
	{
		return new ResponseEntity<Book>(bookservice.getBookById(id),HttpStatus.FOUND);
	}
	
	@GetMapping(value="/getAll")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		return new ResponseEntity<List<Book>>(bookservice.getAllBooks(),HttpStatus.FOUND);
	}
	
	@PutMapping(value ="/update")
	public ResponseEntity<Book> updateBook(@RequestBody Book book)
	{
		return new  ResponseEntity<Book>(bookservice.updateBookById(book),HttpStatus.ACCEPTED);
	}

	@DeleteMapping(value ="/remove/{id}")
	public ResponseEntity<Book> removeBook(@PathVariable ("id") int id) 
	{
		return new ResponseEntity<Book>(bookservice.removeBook(id),HttpStatus.ACCEPTED);
	}
}
