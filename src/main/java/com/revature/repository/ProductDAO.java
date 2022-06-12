package com.revature.repository;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.revature.models.Product;
import com.revature.models.Users;
import com.revature.utilities.HibernateUtil;

public class ProductDAO {
	@ElementCollection
	static List<Product> p;
	@PersistenceContext
	public static void insertProduct(Product product) {
		try (Session ses = HibernateUtil.getSession()){
		ses.save(product);
		HibernateUtil.closeSession(); //This closes the session which will help prevent a memory leak issue
		
		}catch(HibernateException e) {
			System.out.println(e);
			e.printStackTrace();
			
		
		}
	} 
	//We are going to use HQL for this one
	@PersistenceContext
		public static List<Product> getAllProducts(){
			Session ses = HibernateUtil.getSession(); //This opens the session
			p = ses.createQuery("FROM Product").list(); //This is HQL which will get all items from the user Table
			HibernateUtil.closeSession(); //This closes the session
			return p; //This returns the list
		}
		
		public static Product getProductById(int id) {
			Session ses = HibernateUtil.getSession(); //opens the session
			Product product = ses.get(Product.class, id); //This will select all users by ID (This should result in only one user, but id is a PK which is unique)
			HibernateUtil.closeSession(); //closes the session
			return product; //returns the user
		}
		public static List <Product> getByProductName(String name) {
			Session ses = HibernateUtil.getSession(); //This opens the session
			TypedQuery<Product> query = ses.createQuery("FROM Product WHERE gname = "+ name, Product.class);
			
			List<Product> products = query.getResultList();
			HibernateUtil.closeSession();
			return products;
				
		}
}
