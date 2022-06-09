package repository;

import java.util.List;

import org.hibernate.Session;

import utilities.HibernateUtil;

import models.Users;

public class UserDAO {
	public void insertUser(Users user) {
		Session ses = HibernateUtil.getSession(); //This will open our session object to establish a connection to our database
		ses.save(user);
		HibernateUtil.closeSession(); //This closes the session which will help prevent a memory leak issue
	} 
	
	//We are going to use HQL for this one
	public List<Users> getAllUsers(){
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


//	public Users getByUserName(String username) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
