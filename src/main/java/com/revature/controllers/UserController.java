package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revature.models.Users;
import com.revature.repository.UserDAO;
import com.revature.services.AuthenticationServices;
import com.revature.services.UserServices;
@Controller
@RequestMapping(value="/usercontroller")
@CrossOrigin
public class UserController {
	UserDAO ud = new UserDAO();
	UserServices us = new UserServices(ud);
	@Autowired
	public UserController(UserServices service) {
		this.us= service;
	}
	@GetMapping("/getallusers")
	public ResponseEntity<List<Users>> getALLUsers(){
		List<Users> users = UserDAO.getAllUsers();
		 ResponseEntity.status(HttpStatus.CREATED).body(users);
		 return ResponseEntity.status(200).body(users);
}
	@GetMapping("/getuserbyid")
	public ResponseEntity<Users> getUserByID(@RequestBody int id){
		Users u = new Users();
		u = UserServices.getUserById(id);
		 ResponseEntity.status(HttpStatus.CREATED).body(u);
		 return ResponseEntity.status(200).body(u);
}
	@GetMapping("/getuserbyusername")
	public ResponseEntity<Users> getUserByUsername(@RequestBody Users username){
		Users u = new Users();
		u = UserServices.getByUsersName(username.getUserName());
		 ResponseEntity.status(HttpStatus.CREATED).body(u);
		 return ResponseEntity.status(201).body(u);
}
}