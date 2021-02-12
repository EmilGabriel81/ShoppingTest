package com.shoppingtest.scraps;

import java.io.IOException;

import javax.sound.midi.ControllerEventListener;

import com.shoppingtest.controller.ShoppingController;
import com.shoppingtest.objects.Grocery;

public class MainStarter {
	
	private ShoppingController controller;
	

	public MainStarter() {
		controller =  new ShoppingController();
	}

		// CartContents cart = new CartContents();

		// Grocery item01 = new Grocery("Kiwi", 0.25, 20);

		
		

//		ShoppingCartEntry entry01 = new ShoppingCartEntry("Apple",0.25, 2);
//		ShoppingCartEntry entry02 = new ShoppingCartEntry("Pears",0.25, 3);
//		ShoppingCartEntry entry03 = new ShoppingCartEntry("Oranges",0.20, 2);
//		ShoppingCartEntry entry04 = new ShoppingCartEntry("Bananas",0.30, 2);
//		ShoppingCartEntry entry05 = new ShoppingCartEntry("Avocados",0.25, 3);
//		ShoppingCartEntry entry06 = new ShoppingCartEntry("Mango",0.50, 2);
		// ShoppingCartEntry entry07 = new
		// ShoppingCartEntry(item01.getItemName(),item01.getItemPrice(), 2);
		// item01.setItemQuantity(item01.getItemQuantity()-2);

//		controller.addToCart(entry01);
//		controller.addToCart(entry02);
//		controller.addToCart(entry03);
//		controller.addToCart(entry04);
//		controller.addToCart(entry05);
//		controller.addToCart(entry06);
//		controller.addToCart(entry07);

//		System.out.println("|----------------------------------------------------|");
//		
//		System.out.println("\t"+"Entry in Cart for : "+entry07.getName()+"\n"+"\n"+
//						   " Price is : "+ entry07.getPrice()+"\n"+
//				           " Total quantity ordered : "+entry07.getQuantity()+"\n"+
//				           " Total price is : " +entry07.getTotalPrice()+"\n");
//				           
//		
//		System.out.println("|----------------------------------------------------|");
//		
//		System.out.println("Item nr "+item01.getItemName()+" quantity left in store is : "+item01.getItemQuantity());
//		System.out.println("Item nr 1 price is : " +entry02.getTotalPrice());
//		System.out.println("Total price of the Shopping Cart "+controller.getTotalPrice());

//		Order order = new Order(cart,0.9);
//		System.out.println(order.totalPrice());
	

	public Grocery findGrocery(String name) {

		Grocery gro = null;
		for(Grocery gr : controller.getGroceriesList()) {
			if(gr.getItemName().equalsIgnoreCase(name)) {
				gro = gr;
			}
		}
		if( gro!= null) {
			System.out.println("Item exists : "+gro.toString());
			return gro;
		}
		else {System.out.println("Something is wrong");}
		return gro;
	}
	
	public void addGrocery(Grocery grocery) {
		controller.addGroceries(grocery);
	}
	
	
	public void init() {
		controller.addGroceries(new Grocery("Kiwi", 0.25, 20));
		controller.addGroceries(new Grocery("lemons", 0.35, 20));
		controller.addGroceries(new Grocery("Tomatoes", 0.30, 20));
		controller.addGroceries(new Grocery("Cucumber", 0.35, 20));
		controller.addGroceries(new Grocery("Hook", 0.75, 20));
	}
}
