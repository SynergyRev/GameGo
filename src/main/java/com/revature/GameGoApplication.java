package com.revature;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.models.Categories;
import com.revature.models.Product;
import com.revature.models.Users;
import com.revature.repository.UserDAO;
import com.revature.services.ProductServices;
import com.revature.utilities.HibernateUtil;

@SpringBootApplication
public class GameGoApplication {

	public static void main(String[] args) {
		
		try(Session ses = HibernateUtil.getSession()){
			System.out.println("Connection Successful");
			Product game = new Product(Categories.Games, "COD", "MW2", 59.99);
			//ProductServices ps = new ProductServices();
			ProductServices.insertProduct(game);
			//UserDAO ud = new UserDAO();
			//Users u1 = new Users("Momo", "Traore", "MomoT1", "password","momotraore@yahoo.com", "New York");
			//ud.insertUser(u1);
			
		}
		catch (HibernateException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
		SpringApplication.run(GameGoApplication.class, args);
		System.out.println("Hello");
		
		
		
	
//
	

			
	}

}
