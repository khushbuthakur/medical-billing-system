package gui;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class LoginPage {

	public LoginPage() {

	}

	public static void openLoginPage(JFrame mainFrame) {

		Component[] comp = mainFrame.getComponents();
		for (Component c : comp) {
			System.out.println(c.getName());
		}
	}

}
