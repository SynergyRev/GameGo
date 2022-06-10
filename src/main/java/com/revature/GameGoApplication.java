package com.revature;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import models.Users;
import repository.UserDAO;
import utilities.HibernateUtil;

@SpringBootApplication
public class GameGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameGoApplication.class, args);
		System.out.println("Hello");
		
		
		
	UserDAO ud = new UserDAO();

		Users u1 = new Users("Momo", "Traore", "MomoT1", "password","momotraore@yahoo.com", "New York");
//		Users u2 = new Users("Aly", "Traore", "AlyT1", "password","alytraore@yahoo.com", "New York");
//		////Users u3 = new Users();
//		////Users u4 = new Users();
////		
	ud.insertUser(u1);
////		ud.insertUser(u2);
//		////ud.insertUser(u3);
//		////ud.insertUser(u4);
		
			
	}

}
