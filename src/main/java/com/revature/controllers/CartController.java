package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revature.models.OrderHistory;
import com.revature.models.Product;
import com.revature.models.Users;
import com.revature.repository.CartDAO;
import com.revature.repository.UserDAO;
import com.revature.services.CartServices;
import com.revature.services.ProductServices;
@Controller
@RequestMapping(value="/cartcontroller")
@CrossOrigin
public class CartController {
	static ProductServices ps = new ProductServices();
	static CartServices cs = new CartServices();
	static ArrayList<Product> p = new ArrayList<Product>();
	@GetMapping("/getallcartitems")
	public ResponseEntity<List<Product>> getAllCartItems(){
		//List<Product> products = cs.getAllUserProducts();
		 ResponseEntity.status(HttpStatus.CREATED).body(p);
		 return ResponseEntity.status(200).body(p);
}
	@PostMapping("/insertproducttocart")
	public static ResponseEntity<Product> insertProduct(@RequestBody int id){
		//System.out.println(product.getId());
	
		if(id == 0) {
			System.out.println("--------------------------------");
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
			
		}else {
			
			
		Product product =	ps.getProductById(id);
		System.out.print(product);
			p = cs.addingToCart(product);
			return ResponseEntity.status(HttpStatus.OK).body(product);
		}	
	
	}

	@PostMapping("/checkout")
	public static ResponseEntity<String> checkout(@RequestBody int productId, int userId ){
		if((productId !=0) && (userId !=0)) {
		return ResponseEntity.status(HttpStatus.OK).body("Checkout complete");
		}
			
		return null;
		
	}
}
