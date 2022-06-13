package com.revature.repository;

import java.util.ArrayList;


import java.util.List;


import com.revature.models.Product;


public class CheckoutDAO {
	public double checkout(Product cart) {
		CartDAO cd = new CartDAO();
		List<Product> product = CartDAO.getAllUserProducts();
		product = new ArrayList<Product>();
		double amount = 0;
		double tax = .08;
		for (Product p : product) {
			double temp =  (p.getPrice() * tax);
			amount += temp;
		}
		//cd.clearAllItems(cart);
		return amount;
	}

}
