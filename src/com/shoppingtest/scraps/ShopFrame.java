package com.shoppingtest.scraps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ShopFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopFrame window = new ShopFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShopFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("MV Boli", Font.BOLD, 15));
		panel.setBounds(0, 90, 320, 463);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("MV Boli", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 55, 83, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Amount");
		lblNewLabel_2.setFont(new Font("MV Boli", Font.BOLD, 16));
		lblNewLabel_2.setBounds(12, 95, 83, 16);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(160, 52, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 92, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 782, 89);
		panel_2.setLayout(null);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Order");
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
		lblNewLabel.setBounds(311, 27, 178, 22);
		panel_2.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(319, 90, 463, 463);
		panel_1.setLayout(null);
		frame.getContentPane().add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		JTable table = new JTable();
		scrollPane.add(table);
		scrollPane.setBounds(12, 13, 439, 437);
		scrollPane.setLayout(null);
		panel_1.add(scrollPane);
	}
}
