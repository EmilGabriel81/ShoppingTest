package com.shoppingtest.view;

import java.util.Scanner;

import javax.swing.SwingUtilities;

import com.shoppingtest.controller.ShoppingController;
import com.shoppingtest.model.CartContents;
import com.shoppingtest.objects.Grocery;
import com.shoppingtest.objects.ShoppingCartEntry;

public class App {

	private Grocery grocery;
	private CartContents cart;
	private ShoppingController controller;

	public App() {

		grocery = new Grocery();
		cart = new CartContents();
		controller = new ShoppingController();
		initApp();

	}

//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//
//			@Override
//			public void run() {
//				MainStarter starter = new MainStarter();
//				CartContents cart = new CartContents();
//				starter.init();
//
//				if (starter.findGrocery("Hook") != null) {
//					Grocery grocer = starter.findGrocery("Hook");
//					ShoppingCartEntry entryN = new ShoppingCartEntry(grocer.getItemName(), grocer.getItemPrice(), 5);
//					System.out.println("Total Price on entry 1: " + entryN.getTotalPrice()+" $"+  " on "
//							+ entryN.getQuantity() + " Products");
//					cart.addEntries(entryN);
//					System.out.println("Total price on the order : " + cart.getTotalPrice());
//
//					System.out.println(entryN.toString());
//				}
//				;// if true
//				System.out.println("--------------------------------------------------------");
//				if (starter.findGrocery("Kiwi") != null) {
//					Grocery grocer = starter.findGrocery("Kiwi");
//					ShoppingCartEntry entryN = new ShoppingCartEntry(grocer.getItemName(), grocer.getItemPrice(), 2);
//					System.out.println("Total Price on entry 2: " + entryN.getTotalPrice() + " &"+" on "
//							+ entryN.getQuantity() + " Products");
//					cart.addEntries(entryN);
//					System.out.println("Total price on the order : " + cart.getTotalPrice());
//
//					System.out.println(entryN.toString());
//				}
//				;// if true

	// dau accept
	/**
	 * if no ---> no action if yes --> itemul din backend devine 20 ---> 15 if yes
	 * --> itemul din backend devine 20 ---> 18 if onStock if== 0 onStock = false
	 * Money in the house += cart.getTotalprice
	 */

//				System.out.println("--------------------------------------------------------");
//				initApp();
//			}
//		});
//
//	}

	private void initApp() {

		Scanner scan = new Scanner(System.in);
		boolean running = true;

		while (running) {

			System.out.println(" Enter an Option :\n 1 ) Check products in store " + "\n 2 ) Find a product"
					+ "\n 3 ) Buy a product " + "\n 4 ) Check total price per item in cart " + "\n 5 ) Get cart details"
					+ "\n 6 ) Remaining items in store"
					+ "\n 0 ) Quit \n");
			int yourOption = scan.nextInt();
			scan.nextLine();
			switch (yourOption) {
			case 0:
				running = false;
				System.out.println("Ok, Fuck Off!");
				break;
			case 1:
				System.out.println(" Products in store : \n");
				for (Grocery gr : controller.getGroceriesList()) {
					System.out.println(gr.toString() + " \n ");
				}
				break;
			case 2:
				System.out.println("Enter the name : \n");
				String product = scan.nextLine();
				if (controller.findGrocery(product) != null) {
					System.out.println(controller.findGrocery(product).toString() + "\n");
				}
				break;
			case 3:
				System.out.println("Enter the product you want to buy : \n");
				String name = scan.nextLine();
				System.out.println("Enter the quantity you want to buy : \n");
				int quantity = scan.nextInt();
				scan.nextLine();
				Grocery grocery = controller.findGrocery(name);
				if (grocery != null) {
					ShoppingCartEntry entry = new ShoppingCartEntry(grocery.getItemName(), grocery.getItemPrice(),
							quantity);
					grocery.setItemQuantity(grocery.getItemQuantity() - quantity);
					controller.addToCart(entry);
				}
				break;
			case 4:
				System.out.println("Enter the name : ");
				name = scan.nextLine();
				for (ShoppingCartEntry en : controller.getCartContent()) {
					if (en.getName().equalsIgnoreCase(name)) {
						int left = 20 - en.getQuantity();
						System.out.println("Total price for " + en.getName() + " is " + en.getTotalPrice() + " \n "
								+ "Items left in the store " + left + " \n");
					}
				}

				break;
			case 5:
				for (ShoppingCartEntry en : controller.getCartContent()) {
					System.out.println(en.getName() + " -> " + en.getQuantity() + "--------------------"
							+ en.getTotalPrice() + " \n ");
				}
				double totalTaxes = controller.getTotalPrice()*1.09;
				double taxes = totalTaxes - controller.getTotalPrice();
				System.out.println("Total Price -------------------- "+controller.getTotalPrice());
				System.out.println("Total Price plus Taxes-------------------- "+totalTaxes);
				System.out.println("Tota Taxes-------------------- "+taxes+" \n");
				break;
			case 6:
				for(Grocery gr : controller.getGroceriesList()) {
					System.out.println(gr.getItemName()+"-------------------- "+gr.getItemQuantity()+" pcs");
				}
				break;
			default:
				break;
			}
		}

	}

}
