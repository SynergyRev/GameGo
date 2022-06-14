package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.models.OrderHistory;
import com.revature.models.Product;
import com.revature.services.CartServices;
import com.revature.utilities.HibernateUtil;

public class CartDAO {
	private static List<Product> products;
	
	
	public void insertUserItem(Product product) {
		products.add(product);
	}
	public static List<Product> getAllUserProducts(){ 
		return products; 
	}
	public CartDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void  removeUserItems( int index){
			products.remove(index);
			
	}
	public void clearAllItems( ) {
		products.clear();
	}
	OrderHistory history;
	
public double checkout(List<Product> cart, int productId, int userId) {
		
		List<Product> product = cart;
		ArrayList<Product> p = new ArrayList<Product>(product);
		double amount = 0;
		double tax = .08;
		for (Product pr : product) {
			history.setProductId(pr.getId());
			history.setUserId(userId);
			double temp =  (pr.getPrice() * tax);
			amount += temp;
		}
		cart.clear();
		return amount;
	}

}
