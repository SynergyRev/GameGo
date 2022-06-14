package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;


import com.revature.models.Product;

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
}
