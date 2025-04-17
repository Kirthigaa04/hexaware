package com.bookapp.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.book.model.Book;
import com.bookapp.util.DbConnectionUtil;
public class BookDaoimpl implements IBookDao {
	static  Connection connection;


	@Override
	public void addBook(Book book) {
		String sql="insert into book values(?,?,?,?,?)";
		connection=DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
		
		
		try {
			statement=connection.prepareStatement(sql);
			statement.setString(1,book.getTitle());
			statement.setInt(2,book.getBookId());
			statement.setString(3,book.getAuthor());
			statement.setString(4,book.getCategory());
			statement.setDouble(5,book.getPrice());
			statement.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					statement.close();
					connection.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		return ;
		}
		@Override
	public void updateBook(int bookId, double price) {
		String sql="update Book set bookId=?,price=?";
		connection=DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
		
	     try {
			statement=connection.prepareStatement(sql);
			 statement.setString(1,book.getBookId());
			 statement.setDouble(2,book.getPrice());
			 statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
	     
		
	}

	@Override
	public Book getById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		connection=DbConnectionUtil.getConnection();
		String sql="select * from book";
	     PreparedStatement statement=null;
	     List<Book> books=new ArrayList<Book>();
	     
	     try {
			statement=connection.prepareStatement(sql);
			 ResultSet rs=statement.executeQuery();
			 while (rs.next()) {
				 String title=rs.getString("title");
				 int bookId=rs.getInt("book_id");
				 String author=rs.getString("author");
				 String categoty=rs.getString("category");
				 double price=rs.getDouble("price");
				 Book book=new Book(title,bookId,author,price,category);
				 books.add(book);
				 
				 		
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Book nbook:books) {
			
			
		}
		return null;
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	

}