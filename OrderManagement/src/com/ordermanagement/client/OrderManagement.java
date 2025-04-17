package com.ordermanagement.client;

import java.util.ArrayList;
import java.util.List;

import com.ordermanagement.dao.IorderManagementRep;
import com.ordermanagement.dao.orderProcessorImpl;
import com.ordermanagement.exception.ProductNotFoundException;
import com.ordermanagement.exception.UserNotFoundException;
import com.ordermanagement.model.Product;
import com.ordermanagement.model.User;

public class OrderManagement {
	public static void main(String [] args)  {
		
		IorderManagementRep ordermanagement=new orderProcessorImpl();
		User user=new User(1,"Kirthi","kirthiii@004","User");
		 //ordermanagement.createUser(user);
		Product product=new Product(101,"Laptop","Gaming",20000000.0,30,"Electronics");
		//ordermanagement.createProduct(product);
		

			List<Product> products = ordermanagement.getAllProducts();
			for(Product nproduct:products) {
				System.out.println(nproduct);
		

		
	    //ordermanagement.insertUser(user);
		
		//ordermanagement.cancelOrder(6);
		
		//ordermanagement.createOrder(user,product); 
		//try {
		//ordermanagement.selectUser(user);
		//}catch(UserNotFoundException e) {
		//	System.out.println(e.getMessage());
		}
			}
		}

