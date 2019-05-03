package com.Harsha.spring.service;

import java.util.List;

import com.Harsha.spring.model.Book;

public interface BookService {
	 
	//to save a book
	long save(Book book);
	
	//to get single book
	Book get(long id);
	
	//to get all the books
	List<Book> list();
	
	//to update
	void update(long id, Book book);
	
	//to delete
	void delete(long id);

}
