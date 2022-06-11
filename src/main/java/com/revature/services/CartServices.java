package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Users;
import com.revature.repository.CartDAO;
import com.revature.repository.UserDAO;
@Service
public class CartServices {
	
	
		
		
		private static CartDAO cd;
		@Autowired
		public CartServices(CartDAO cart) {
			this.cd=  cart; 
					
		}
		public void getAllUserProducts(Users user) {
			cd.getAllUserProducts(user);
		}
		public void clearAllItems(Users user) {
			cd.clearAllItems(user);
		}
		public void removeUserItems(Users user, int index) {
			cd.removeUserItems(user, index);;
		}
}
