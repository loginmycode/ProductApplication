package com.learn.Book.BookServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.Book.BookDao.BookRepo;
import com.learn.Book.Model.Book;

@Service
public class BookServiceImp implements BookServices {

	@Autowired
	BookRepo bookrepo;
	@Override
	public Book addBooks(Book book) {
		
		return bookrepo.addBooks(book);
	}

	@Override
	public Book updateBookById(Book book) {
	
		return bookrepo.updateBookById(book);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookrepo.getAllBooks();
	}

	@Override
	public Book removeBook(int id){
		
		return bookrepo.removeBook(id);
	}

	@Override
	public Book getBookById(int id)  // TODO Auto-generated method stub
	{
		Book bk=bookrepo.getBookById(id);
			return bk;
	
	}

}
