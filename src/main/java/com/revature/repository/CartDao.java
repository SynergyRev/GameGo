package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.models.Product;
import com.revature.models.Users;
import com.revature.utilities.HibernateUtil;

public class CartDao {
//	public static List<Product> getAllUserProducts(Users user){
//		Session ses = HibernateUtil.getSession(); 
//		List<Product> products = user.getProduct();
//		HibernateUtil.closeSession(); 
//		return products; 
//	}
//	public CartDao() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public void  removeUserItems(Users user, int index){
//		try (Session ses = HibernateUtil.getSession()){
//			List<Product> products  = getAllUserProducts(user);
//			products = new ArrayList<Product>();
//			products.remove(index);
//			ses.save(user);
//			HibernateUtil.closeSession(); //This closes the session which will help prevent a memory leak issue
//			
//			}catch(HibernateException e) {
//				System.out.println(e);
//				e.printStackTrace();
//			}
//	}
//	public void clearAllItems(Users user) {
//		try (Session ses = HibernateUtil.getSession()){
//			getAllUserProducts(user).clear();
//			
//			ses.save(user);
//			HibernateUtil.closeSession(); //This closes the session which will help prevent a memory leak issue
//			
//			}catch(HibernateException e) {
//				System.out.println(e);
//				e.printStackTrace();
//			}
//	}

}
