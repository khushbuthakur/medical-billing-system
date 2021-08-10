/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

import facade.DataFacade;
import model.Person;

public class LoginScreen extends javax.swing.JPanel {

	/**
	 * Creates new form LoginScreen
	 */
	JSplitPane splitPanel;
	DataFacade dataFacade;

	LoginScreen(JSplitPane splitPanel) {
		initComponents();
		this.splitPanel = splitPanel;
		dataFacade = new DataFacade();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		lblUserName = new javax.swing.JLabel();
		txtUserName = new javax.swing.JTextField();
		lblPassword = new javax.swing.JLabel();
		txtPassword = new javax.swing.JPasswordField();
		buttonLogin = new javax.swing.JButton();

		lblUserName.setText("User Name");

		lblPassword.setText("Password");

		buttonLogin.setText("Login");
		buttonLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonLoginActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(249, 249, 249)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 229,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 229,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 229,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGap(55, 55, 55).addComponent(buttonLogin,
								javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(242, Short.MAX_VALUE)));

		layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { lblPassword, lblUserName, txtPassword, txtUserName });

		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(67, 67, 67).addComponent(lblUserName)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(lblPassword)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(26, 26, 26).addComponent(buttonLogin).addContainerGap(57, Short.MAX_VALUE)));
	}// </editor-fold>

	private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {

		String userName = txtUserName.getText();
		char[] password = txtPassword.getPassword();

		if (userName.equals("") || password.length == 0) {
			JOptionPane.showMessageDialog(this, "Please enter valid data", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			String lastName = new String(password);
			// LOGIC identify user

			if (userName.equals("admin") && lastName.equals("admin")) {
				Dashboard d = new Dashboard(splitPanel, null, dataFacade);
				splitPanel.setBottomComponent(d);	
			} else {

				Person p = dataFacade.verifyUser(userName, lastName);

				if (p != null) {

					/**
					 * patient admin
					 */

					Dashboard d = new Dashboard(splitPanel, p, dataFacade);
					splitPanel.setBottomComponent(d);
				} else {
					JOptionPane.showMessageDialog(this, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}

	// Variables declaration - do not modify
	private javax.swing.JButton buttonLogin;
	private javax.swing.JLabel lblPassword;
	private javax.swing.JLabel lblUserName;
	private javax.swing.JPasswordField txtPassword;
	private javax.swing.JTextField txtUserName;
	// End of variables declaration
}
