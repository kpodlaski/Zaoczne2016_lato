package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JList;

public class FlowFrame extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowFrame frame = new FlowFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FlowFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton btnNewButton = new JButton("New buttonz textem tutaj");
		btnNewButton.setSize(40, 150);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1);
		JButton btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4);
		JButton btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2);
		JButton btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3);
		JPanel panel = new JPanel();
		panel.setSize(300,300);
		panel.setMinimumSize(new Dimension(300,300));
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		passwordField = new JPasswordField();
		panel.add(passwordField, BorderLayout.NORTH);
		JList list = new JList();
		panel.add(list, BorderLayout.SOUTH);
	}

}
