package com.revature.repository;

import java.util.ArrayList;


import java.util.List;


import com.revature.models.Product;
import com.revature.services.CartServices;


public class CheckoutDAO {
	public double checkout(CartServices cart) {
		
		List<Product> product = cart.getAllUserProducts();
		
		double amount = 0;
		double tax = .08;
		for (Product p : product) {
			double temp =  (p.getPrice() * tax);
			amount += temp;
		}
		cart.clearAllItems();
		return amount;
	}

}
