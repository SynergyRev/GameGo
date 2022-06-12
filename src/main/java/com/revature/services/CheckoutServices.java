package com.revature.services;

import org.springframework.stereotype.Service;

import com.revature.models.Users;
import com.revature.repository.CheckoutDAO;

@Service
public class CheckoutServices {
	CheckoutDAO cd = new CheckoutDAO();
	public void CheckoutDAO(Users user) {
		cd.checkout(user);
	}

}
