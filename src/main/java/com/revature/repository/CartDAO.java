package com.revature.repository;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.models.Cart;
import com.revature.models.Product;

import com.revature.utilities.HibernateUtil;

public class CartDAO {
	public static List<Product> getAllUserProducts(Cart cart){
		Session ses = HibernateUtil.getSession(); 
		List<Product> products = cart.getProduct();
		HibernateUtil.closeSession(); 
		return products; 
	}
	public CartDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void  removeUserItems(Cart cart, int index){
		try (Session ses = HibernateUtil.getSession()){
			List<Product> products  = getAllUserProducts(cart);
			products = new ArrayList<Product>();
			products.remove(index);
			ses.save(cart);
			HibernateUtil.closeSession(); //This closes the session which will help prevent a memory leak issue
			
			}catch(HibernateException e) {
				System.out.println(e);
				e.printStackTrace();
			}
	}
	public void clearAllItems(Cart cart) {
		try (Session ses = HibernateUtil.getSession()){
			getAllUserProducts(cart).clear();
			
			ses.save(cart);
			HibernateUtil.closeSession(); //This closes the session which will help prevent a memory leak issue
			
			}catch(HibernateException e) {
				System.out.println(e);
				e.printStackTrace();
			}
	}

}
