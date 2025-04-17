package com.ordermanagement.dao;

import java.util.List;

import com.ordermanagement.exception.UserNotFoundException;
import com.ordermanagement.model.Product;
import com.ordermanagement.model.User;

public interface IorderManagementRep {
	void createUser(User user);
    void createProduct( Product product);
    void createOrder(User user, Product product);
    void cancelOrder(int orderId);
    List<Product> getAllProducts();
    List<Product> getOrderByUser(User user);
	void insertUser(User user);
	void selectUser(User user) throws UserNotFoundException;

}
