package models;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Game {
	private int id;
	private Products product;
	private String gName;
	private String Description;
	private Double price;
	private Double ratings;
	
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Game(int id, Products product, String gName, String description, Double price, Double ratings) {
		super();
		this.id = id;
		this.product = product;
		this.gName = gName;
		Description = description;
		this.price = price;
		this.ratings = ratings;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
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
	public Double getRatings() {
		return ratings;
	}
	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Description, gName, id, price, product, ratings);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(Description, other.Description) && Objects.equals(gName, other.gName) && id == other.id
				&& Objects.equals(price, other.price) && product == other.product
				&& Objects.equals(ratings, other.ratings);
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", product=" + product + ", gName=" + gName + ", Description=" + Description
				+ ", price=" + price + ", ratings=" + ratings + "]";
	}
	

}
