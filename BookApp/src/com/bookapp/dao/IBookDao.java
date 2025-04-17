package com.bookapp.dao;

import com.book.model.Book;
import java.util.List;

public interface IBookDao {
	void addBook(Book book);
	void updateBook(int bookId,double price);
	
	Book getById(int bookId);
	List<Book> getAllBooks();
	List<Book> getByAuthor(String author);
	
	
	

}
