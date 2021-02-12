package com.shoppingtest.objects;

public class Grocery {
	
	private String itemName;
	private double itemPrice;
	private int itemQuantity;

	public Grocery () {
		
	}
	
	public Grocery(String itemName,double itemPrice, int itemQuantity){
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	@Override
	public String toString() {
		return "Grocery Name = " + itemName + ", Price = " + itemPrice + ", Quantity = " + itemQuantity;
	}
	
	

}
