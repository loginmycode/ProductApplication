package com.learn.Book.CustomException;

public class BookDoesNotExist extends Exception {

	public BookDoesNotExist(String msg)
	{
		super(msg);
	}
}
