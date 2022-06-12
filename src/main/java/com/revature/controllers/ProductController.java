package com.revature.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revature.models.Product;
import com.revature.services.ProductService;

@Controller
@RequestMapping(value="/productcontroller")
@CrossOrigin
public class ProductController {
	private ProductService ps;
	public ProductController(ProductService product) {
		ps = product;
	}
	@PostMapping
	public static ResponseEntity<Product> insertProduct(@RequestBody Product product){
		System.out.println(product.getId());
		
		if(product.getgName() == null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(product);
		}else {
			ProductService.insertProduct(product);
			return ResponseEntity.status(HttpStatus.CREATED).body(product);
		}
		
		
	}

}
