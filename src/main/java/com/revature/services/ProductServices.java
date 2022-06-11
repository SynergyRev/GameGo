package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Product;
import com.revature.models.Users;
import com.revature.repository.ProductDAO;
import com.revature.repository.UserDAO;

@Service
public class ProductServices {
	private static ProductDAO pd;

	@Autowired
	public ProductServices() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public ProductServices(Product product) {
//		pd.getByProductName(product.getgName());
//				
//	}
	
	





public static Product getProductById(int id) {
	return pd.getProductById(id);	
}

public List<Product> getAllUsers() {
	return ProductDAO.getAllProducts();
}
public static Product getByProductName(String name) {
	return pd.getByProductName(name);
}
public static void insertProduct(Product product) {
	 ProductDAO.insertProduct(product);
	
}
}
