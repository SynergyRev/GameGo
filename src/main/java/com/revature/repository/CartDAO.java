package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;


import com.revature.models.Product;

import com.revature.utilities.HibernateUtil;

public class CartDAO {
	static ArrayList<Product> products;
	
	
	public static void insertUserItem(Product product) {
		products.add(product);
	}
	public static ArrayList<Product> getAllUserProducts(){
//		Session ses = HibernateUtil.getSession(); 
//		List<Product> products = product.getProduct();
//		HibernateUtil.closeSession(); 
		return products; 
	}
	public CartDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void  removeUserItems(Product product, int index){
		try (Session ses = HibernateUtil.getSession()){
			
			ArrayList<Product> temp  = getAllUserProducts();
			//temp = new ArrayList<>();
			products = temp;
			products.remove(index);
			//ses.save(product);
			HibernateUtil.closeSession(); //This closes the session which will help prevent a memory leak issue
			
			}catch(HibernateException e) {
				System.out.println(e);
				e.printStackTrace();
			}
	}
//	public void clearAllItems(Product ) {
//		try (Session ses = HibernateUtil.getSession()){
//			getAllUserProducts(cart).clear();
//			
//			ses.save(cart);
//			HibernateUtil.closeSession(); //This closes the session which will help prevent a memory leak issue
//			
//			}catch(HibernateException e) {
//				System.out.println(e);
//				e.printStackTrace();
//			}
//	}
}
