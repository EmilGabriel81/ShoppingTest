package com.shoppingtest.view;

import javax.swing.SwingUtilities;

public class Start {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("--------------------------------------------------------");
				new App();
				System.out.println("--------------------------------------------------------");
			}
		});

	}

}
