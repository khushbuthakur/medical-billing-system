package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIApplication {
	
	private static JFrame m_mainFrame;
	private JLabel m_headerLabel;
	private JLabel m_statusLabel;
	private JPanel m_controlPanel;
	
	
	public GUIApplication() {
		prepareGUI();
		
	
	}
	
	private void prepareGUI() {
		m_mainFrame = new JFrame("Medical Bill Application");
		m_mainFrame.setSize(1000, 800);
		
		m_mainFrame.setLayout(new GridLayout(3, 1));
		m_mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		m_headerLabel = new JLabel("", JLabel.CENTER);
		m_statusLabel = new JLabel("", JLabel.CENTER);

		m_statusLabel.setSize(350, 100);

		m_controlPanel = new JPanel();
		m_controlPanel.setLayout(new FlowLayout());	// initial layout can be changed

		m_mainFrame.add(m_headerLabel);
		m_mainFrame.add(m_controlPanel);
		m_mainFrame.add(m_statusLabel);
		m_mainFrame.setVisible(true);
	}
	
	public static void demo() {
		GUIApplication gui = new GUIApplication();
		
		LoginPage.openLoginPage(m_mainFrame);
		
	}

}
