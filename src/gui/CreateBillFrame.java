package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateBillFrame {

	private JFrame frame;
	private JPanel panel;
	private JTextField idField, firstNameField, LastNameField;
	private JLabel idLabel, firstNameLabel, LastNameLabel;

	public CreateBillFrame() {

		frame = new JFrame();

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(400, 400, 20, 400));
		panel.setLayout(new GridLayout(0, 1));

		/**
		 * Labels
		 */
		idLabel = new JLabel();
		idLabel.setBounds(100, 100, 30, 30);
		idLabel.setText("ID: ");

		idField = new JTextField();
		idLabel.setBounds(200, 100, 80, 30);
		idField.setSize(80, 30);

		firstNameLabel = new JLabel();
		idLabel.setBounds(300, 100, 30, 30);
		firstNameLabel.setText("First Name: ");

		LastNameLabel = new JLabel();
		idLabel.setBounds(400, 100, 30, 30);
		LastNameLabel.setText("Last Name: ");

		/*
		 * Textfields
		 */

		// Addition of components
		panel.add(idLabel);
		panel.add(firstNameLabel);
		panel.add(LastNameLabel);
		panel.add(idField);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Patient Registration and Medical Billing");
		frame.pack();
		frame.setVisible(true);

	}

	public static void showCreateBillFrame() {
		new CreateBillFrame();
	}

	public static void main(String[] args) {
		showCreateBillFrame();
	}
}
