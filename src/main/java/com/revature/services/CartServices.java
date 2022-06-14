package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.Product;
import com.revature.models.Users;
import com.revature.repository.CartDAO;
import com.revature.repository.ProductDAO;

public class CartServices {
	private static CartDAO cd;
	ArrayList<Product> cartList = new ArrayList<Product>();
	private static ProductDAO pd;
	public CartServices(CartDAO cart) {
		this.cd= cart; 
				
	}
	public List<Product> getAllUserProducts() {
		 
		return CartDAO.getAllUserProducts();
	}
	public void clearAllItems() {
		cd.clearAllItems();
	}
	public void removeUserItems( int index) {
		cd.removeUserItems(index);;
	}
	public void insertProduct(Product product) {
		cd.insertUserItem(product);
	}
	public CartServices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Product> addingToCart(Product p){
		if (pd.getByProductName(p.getgName()) != null) {
		cartList.add(p);
		System.out.println(cartList);
		return cartList;
		}
		else {
			return cartList;
		}
	}
}
