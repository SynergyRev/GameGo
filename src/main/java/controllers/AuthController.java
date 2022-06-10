package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Users;
import services.AuthenticationServices;

@Controller
@Repository
@RequestMapping(value="/authcontroller")
@CrossOrigin
public class AuthController {
	private AuthenticationServices as;
	
	@Autowired
	public AuthController(AuthenticationServices service) {
		this.as = service;
	}
	@PostMapping
	public ResponseEntity<Users> insertUser(@RequestBody Users user){
		System.out.println(user.getPassword());
		
		if(user.getUserName() == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(user);
		}else {
			as.insertUser(user);
			return ResponseEntity.status(HttpStatus.CREATED).body(user);
		}
		
		
	}

}
