package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Categories product;
	@Column(nullable = false, unique=true)
	private String gName;
	private String Description;
	@Column(nullable = false)
	private Double price;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, Categories product, String gName, String description, Double price) {
		super();
		this.id = id;
		this.product = product;
		this.gName = gName;
		Description = description;
		this.price = price;
		
	}
	public Product(Categories product, String gName, String description, Double price) {
		super();
		this.product = product;
		this.gName = gName;
		Description = description;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categories getProduct() {
		return product;
	}
	public void setProduct(Categories product) {
		this.product = product;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(Description, gName, id, price, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(Description, other.Description) && Objects.equals(gName, other.gName) && id == other.id
				&& Objects.equals(price, other.price) && product == other.product;
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", product=" + product + ", gName=" + gName + ", Description=" + Description
				+ ", price=" + price + "]";
	}
	

}
