package com.learn.Book.BookDao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.learn.Book.Model.Book;

@Repository
public class BookRepoImp implements BookRepo {

	HashMap<Integer, Book> list= new HashMap<Integer,Book>();
	@Override
	public Book addBooks(Book book) {
		
	Book bk=	list.put(book.getId(), book);
	return book;
		
	}

	@Override
	public Book updateBookById(Book book) {
		
		Book bk =list.put(book.getId(), book);
		return bk;
	}

	@Override
	public List<Book> getAllBooks() {
		Collection<Book> values = list.values();
		ArrayList<Book> list1=new ArrayList<Book>(values);
		return list1;
	}

	@Override
	public Book removeBook(int id) {
		
		Book book =list.remove(id);
		return book;
	}

	@Override
	public Book getBookById(int id) {
		
		return list.get(id);
		
		
	}

}
