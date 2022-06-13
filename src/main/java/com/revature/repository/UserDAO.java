package com.revature.repository;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.models.Users;
import com.revature.utilities.HibernateUtil;

@Repository
public class UserDAO {
//	private Users user;
//	@Autowired
//	public UserDAO(Users user) {
//		this.user =user;
//	}
	
	@PersistenceContext
	public int insertUser(Users user) {
		try (Session ses = HibernateUtil.getSession()){
		ses.save(user);
		HibernateUtil.closeSession(); //This closes the session which will help prevent a memory leak issue
		return 0;
		}catch(HibernateException e) {
			System.out.println(e);
			e.printStackTrace();
			return 0;
		
		}
	} 
	
	//We are going to use HQL for this one
	public static List<Users> getAllUsers(){
		Session ses = HibernateUtil.getSession(); //This opens the session
		List<Users> userList = ses.createQuery("FROM Users").list(); //This is HQL which will get all items from the user Table
		HibernateUtil.closeSession(); //This closes the session
		return userList; //This returns the list
	}
	
	public Users getUsersById(int id) {
		Session ses = HibernateUtil.getSession(); //opens the session
		Users user = ses.get(Users.class, id); //This will select all users by ID (This should result in only one user, but id is a PK which is unique)
		HibernateUtil.closeSession(); //closes the session
		return user; //returns the user
	}
	public Users getByUserName(String userName) {
		Session ses = HibernateUtil.getSession(); //This opens the session
		Users user = ses.get(Users.class, userName);
		HibernateUtil.closeSession();
		
		return user;
		
	}
	



}
