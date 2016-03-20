package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FirstFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
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
	public FirstFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("button");
		
		btnNewButton.setIcon(new ImageIcon(FirstFrame.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		
		final JButton btnNewButton_1 = new JButton("New");
		contentPane.add(btnNewButton_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("Klawisz2");
		contentPane.add(btnNewButton_2, BorderLayout.WEST);
		
		final JLabel lblMyLabel = new JLabel("");
		lblMyLabel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				btnNewButton_1.setText("Piszesz");
			}
		});
		contentPane.add(lblMyLabel, BorderLayout.NORTH);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Select");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				btnNewButton_1.setText("Checked"+arg0.getStateChange());
			}
		});
		contentPane.add(chckbxNewCheckBox, BorderLayout.EAST);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMyLabel.setText("Klawisz Wcisniêto");
			}
		});
	}

}
