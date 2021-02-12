package com.shoppingtest.controller;
import java.util.*;

import com.shoppingtest.model.CartContents;
import com.shoppingtest.objects.Grocery;
import com.shoppingtest.objects.ShoppingCartEntry;

public class ShoppingController {

	private CartContents cart = new CartContents();
	private List<Grocery> groceriesList ;
	
	public ShoppingController() {
		groceriesList = new ArrayList<Grocery>();
		init();
	}
	
	
	public void addToCart(ShoppingCartEntry entry) {
		cart.addEntries(entry);
	}
	
	public List<ShoppingCartEntry> getCartContent(){
		return cart.getItems();
	}
	
	public double getTotalPrice() {
		
		double total = 0;
		 
		for(ShoppingCartEntry entry : getCartContent()) {
			total += entry.getTotalPrice();
		}
		return total;
	}
	
	public void addGroceries(Grocery grocery) {
		groceriesList.add(grocery);
	}


	public List<Grocery> getGroceriesList() {
		return groceriesList;
	}
	
	
	public Grocery findGrocery(String name) {

		Grocery gro = null;
		for(Grocery gr : getGroceriesList()) {
			if(gr.getItemName().equalsIgnoreCase(name)) {
				gro = gr;
			}
		}
		if( gro!= null) {
			//System.out.println("Item exists : "+gro.toString());
			return gro;
		}
		else {System.out.println("Not on Stock");}
		return gro;
	}
	
	public void init() {
		addGroceries(new Grocery("Kiwi", 0.25, 20));
		addGroceries(new Grocery("Lemons", 0.35, 20));
		addGroceries(new Grocery("Tomatoes", 0.30, 20));
		addGroceries(new Grocery("Cucumber", 0.35, 20));
		addGroceries(new Grocery("Hook", 0.75, 20));
	}
	
}
