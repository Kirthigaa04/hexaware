package com.bookapp.client;

import com.book.model.Book;
import com.bookapp.dao.BookDaoimpl;
import com.bookapp.dao.IBookDao;

public class Client {
	public static void main(String [] args) {
		Book book=new Book("Java","Kevi","tech",2,200);
		IBookDao bookdao=new BookDaoimpl();
		bookdao.addBook(book);
	}

}
