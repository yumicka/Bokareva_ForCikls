package tests_bokareva;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class jautajumi extends JFrame {
	private JPanel jautajums;

	public jautajumi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		jautajums = new JPanel();
		jautajums.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(jautajums);
		jautajums.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Help");
		lblNewLabel.setBounds(330, 10, 153, 169);
		jautajums.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(new Color(51, 153, 153));
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 26));
		btnNewButton.setBounds(309, 273, 162, 64);
		jautajums.add(btnNewButton);
	}
	
	 public static void Jautajums1() {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    jautajumi jaut1 = new jautajumi();
	                    jaut1.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	 }
}