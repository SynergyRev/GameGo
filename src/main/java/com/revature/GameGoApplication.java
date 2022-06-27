package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.controllers.ProductController;
import com.revature.models.Categories;
import com.revature.models.Product;
import com.revature.models.Users;
import com.revature.repository.UserDAO;
import com.revature.services.ProductServices;
import com.revature.utilities.HibernateUtil;



@SpringBootApplication
public class GameGoApplication {

	public static void main(String[] args) {
		
//		try(Session ses = HibernateUtil.getSession()){
//			System.out.println("Connection Successful");
//			//Product game = new Product(Categories.Games, "NBA 2K", "2K19", 59.99);
//			//ProductServices ps = new ProductServices();
//			//Product product =ProductServices.getProductById(1);
//			//System.out.println(product);
//			//UserDAO ud = new UserDAO();
//			//Users u1 = new Users("Momo", "Traore", "MomoT1", "password","momotraore@yahoo.com", "New York");
//			//ud.insertUser(u1);
////			List <Product> p = ProductServices.getAllProducts();
////			System.out.println(p);
//			
//		}
//		catch (HibernateException e) {
//			System.out.println("Connection Failed");
//			e.printStackTrace();
//		}
		SpringApplication.run(GameGoApplication.class, args);
		System.out.println("Hello");
//		
//		String number = "2";
//		int num = Integer.parseInt(number);
//		System.out.println(num);
		
//		int[] number =  {1, 2, 4, 5, 6};
//		
//		for(int i =0; i<number.length; i++) {
//			String temp = Arrays.toString(number);
//			System.out.println(temp);
//		ArrayList<String> b = new ArrayList<String>();
//		b.add(temp);
//		b.add("ALY");
//		System.out.println(b);
			
//		}
		
//		
//	UserDAO ud = new UserDAO();
//
	

			
	}

}
