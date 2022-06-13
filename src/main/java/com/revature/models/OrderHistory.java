package com.revature.models;

import java.util.List;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name = "OrderList")
public class OrderHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private Users user;
	private Product product;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public OrderHistory(int orderId, Users user, Product product) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.product = product;
	}
	@Override
	public int hashCode() {
		return Objects.hash(orderId, product, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderHistory other = (OrderHistory) obj;
		return orderId == other.orderId && Objects.equals(product, other.product) && Objects.equals(user, other.user);
	}
	@Override
	public String toString() {
		return "OrderHistory [orderId=" + orderId + ", user=" + user + ", product=" + product + "]";
	}
	
	



	
	
	

}
