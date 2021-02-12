package com.shoppingtest.scraps;

import com.shoppingtest.model.CartContents;

public class Order {
	private CartContents cart;
	private double salesTax;
	
	public Order(CartContents cart , double salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
		
	}

//	public double totalPrice() {
//		return cart.getTotalPrice() * (1.0f+salesTax);
//	}
}
