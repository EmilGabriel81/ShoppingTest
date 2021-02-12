package com.shoppingtest.objects;

public class ShoppingCartEntry {

	double price;
	int quantity;
	String name;
	
	public ShoppingCartEntry(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	
	/*
	 * 
	 * 
	 */
	
	public double getTotalPrice() {
		return (double) (price*quantity);
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "ShoppingCartEntry [price=" + price + ", quantity=" + quantity + ", name=" + name + "]";
	}
	
	
}
