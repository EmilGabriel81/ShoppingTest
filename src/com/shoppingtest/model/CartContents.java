package com.shoppingtest.model;

import java.util.ArrayList;
import java.util.List;

import com.shoppingtest.objects.ShoppingCartEntry;

public class CartContents {

	List<ShoppingCartEntry> items;

	public CartContents() {
		items = new ArrayList<ShoppingCartEntry>();
	}

	public void addEntries(ShoppingCartEntry entry) {
		items.add(entry);
		System.out.println("Items in the Cart : " + items.size());
	}

	public List<ShoppingCartEntry> getItems() {
		return items;
	}

	public double getTotalPrice() {

		double totalPrice = 0;

		for (ShoppingCartEntry item : items) {

			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
}
