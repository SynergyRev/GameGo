package com.revature.services;

import com.revature.models.Users;
import com.revature.repository.CheckoutDAO;

public class CheckoutServices {
	CheckoutDAO cd = new CheckoutDAO();
	public void CheckoutDAO(Users user) {
		cd.checkout(user);
	}
}
