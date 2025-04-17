package com.ordermanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ordermanagement.exception.UserNotFoundException;
import com.ordermanagement.model.Product;
import com.ordermanagement.model.User;
import com.ordermanagement.util.DbConnectionUtil;


public class orderProcessorImpl implements IorderManagementRep {
	static  Connection connection;

	@Override
	public void selectUser(User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		String sql = "select * from User";
	    Connection connection = null;
	    PreparedStatement statement = null;
	    try {
			statement=connection.prepareStatement(sql);
			
				statement.execute();
				int result = statement.executeUpdate();
				if (result == 0) {
					throw new UserNotFoundException("User with this ID not found");
					}
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

	//Creating user table
	@Override
	public void createUser(User user) {
		String sql="create table User (user_id int primary key ,user_name varchar(20),password varchar(20),role varchar(20))";
		connection= DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
	     
	     try {
			statement=connection.prepareStatement(sql);
			
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
    
	//Creating product table
	@Override
	public void createProduct(Product product) {
		String sql="create table Product (product_id int primary key,product_name varchar(20),description varchar(20),price float,quality_stock int,type varchar(20))";
		connection= DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
	     
	     try {
			statement=connection.prepareStatement(sql);
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
		
	//creating order table

	@Override
	public void createOrder(User user, Product products) {
		String sql="create table Order (order_id int primary key,user_id int, foreign key (user_id) references User(user_id),product_id int,foreign key (product_id) references Product(product_id))";
		connection= DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
	     
	     try {
			statement=connection.prepareStatement(sql);
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
		
	//inserting values to user table
	public void insertUser(User user) {
		String sql = "insert into user values(?,?,?,?)";
	    connection= DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1,1);
			statement.setString(2,"Kirthi");
			statement.setString(3,"kirthi123");
			statement.setString(4,"User");
			boolean result = statement.execute();
			System.out.println("Values Inserted " + !result);
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

	//canceling order

	@Override
	public void cancelOrder(int orderId) {
		String sql = "delete from  where orderId = ?";
		connection= DbConnectionUtil.getConnection();
	     PreparedStatement statement=null;
	     ResultSet rs = null;
	     try {
			statement = connection.prepareStatement(sql);
				statement.setInt(1, orderId);
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
					}}
	}
				
				
	     
		

		
		

//getting all product values
	@Override
	public List<Product> getAllProducts(){
		    Connection connection = DbConnectionUtil.getConnection();
		    String sql = "select * from product";
		    PreparedStatement statement = null;
		    ResultSet rs = null;
		    List<Product> products = new ArrayList<>();

		    try {
		        statement = connection.prepareStatement(sql);
		        rs = statement.executeQuery();

		        while (rs.next()) {
		            int productId = rs.getInt("product_id");
		            String productName= rs.getString("product_name");
		            String description = rs.getString("description");
		            double price = rs.getDouble("price");
		            int quantityInStock=rs.getInt("quality_stock");
		            String type = rs.getString("type");

		            Product product=new Product(productId,productName,description,price,quantityInStock,type);
		            products.add(product);
		            
		        }

		    } catch (SQLException e) {
		        e.printStackTrace(); 

		    } finally {
		        
		    	try {
					if (rs != null) rs.close();
					if (statement != null) statement.close();
					if (connection != null) connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		        

		    return products;
		}

@Override
public List<Product> getOrderByUser(User user) {
	// TODO Auto-generated method stub
	return null;
}}
		
