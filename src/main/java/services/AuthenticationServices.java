package services;

import java.sql.SQLException;

import models.Users;
import repository.UserDAO;


public class AuthenticationServices {
	
UserDAO userDAO = new UserDAO();
	
	public  int login(String username, String password) {
		Users user;
		try {
			user = userDAO.getByUserName(username);
			if(user != null && password.equals(user.getPassword())) {
				
				System.out.println("Logged In Successfully");
				return 1;
				
			} else {	
				System.out.println("User Does Not Exist!");
				return 0;
			}
		}catch(Exception e) {
			System.out.println("Login Unsuccessful");
			e.printStackTrace();// Helpful debuging tool
		}
		
		// If the try-catch does not run, a null object is return and login is deemed unsuccessful
		return 0;
		
	}
	public void insertUser(Users user) {
		userDAO.insertUser(user);
	}




}
