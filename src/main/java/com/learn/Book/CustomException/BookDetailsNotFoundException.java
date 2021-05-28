package com.learn.Book.CustomException;

public class BookDetailsNotFoundException extends Exception {

	public BookDetailsNotFoundException(String msg)
	{
		super(msg);
	}
}
