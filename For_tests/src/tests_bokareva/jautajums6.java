package tests_bokareva;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class jautajums6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jautajums6;
	public static void Jautajums6() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jautajums6 frame = new jautajums6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public jautajums6() {
		setTitle("Tests par For ciklu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		jautajums6 = new JPanel();
		jautajums6.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jautajums6);
		jautajums6.setLayout(null);
		
		JLabel teksts1 = new JLabel("6) Kādi elementi tiek parādīti ekrānā");
		teksts1.setForeground(new Color(255, 255, 255));
		teksts1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		teksts1.setBounds(148, 41, 435, 34);
		jautajums6.add(teksts1);
		
		JLabel teksts2 = new JLabel("pēc programmas palaišanas?");
		teksts2.setForeground(new Color(255, 255, 255));
		teksts2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		teksts2.setBounds(191, 70, 335, 40);
		jautajums6.add(teksts2);
		
		JLabel bilde = new JLabel("");
		bilde.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\kods.png"));
		bilde.setBounds(202, 113, 318, 129);
		jautajums6.add(bilde);
		
		JCheckBox atb1 = new JCheckBox("1");
		atb1.setForeground(new Color(0, 0, 0));
		atb1.setOpaque(false);
		atb1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb1.setBounds(212, 248, 53, 35);
		jautajums6.add(atb1);
		
		JCheckBox atb2 = new JCheckBox("5");
		atb2.setForeground(new Color(0, 0, 0));
		atb2.setOpaque(false);
		atb2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb2.setBounds(283, 248, 44, 35);
		jautajums6.add(atb2);
		
		JCheckBox atb3 = new JCheckBox("9");
		atb3.setForeground(new Color(0, 0, 0));
		atb3.setOpaque(false);
		atb3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb3.setBounds(360, 248, 53, 35);
		jautajums6.add(atb3);
		
		JCheckBox atb4 = new JCheckBox("13");
		atb4.setForeground(new Color(0, 0, 0));
		atb4.setOpaque(false);
		atb4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb4.setBounds(439, 248, 53, 35);
		jautajums6.add(atb4);
		
		
		ArrayList<Boolean> izvele = new ArrayList<Boolean>();
		ArrayList<Boolean> pareiz = new ArrayList<Boolean>();
		
		pareiz.add(true);
		pareiz.add(true);
		pareiz.add(true);
		pareiz.add(false);
		JButton pogaAtb = new JButton("Atbildēt");
		pogaAtb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(atb1.isSelected()) {
					izvele.add(true);
				}else {
					izvele.add(false);
				}
				
				if(atb2.isSelected()) {
					izvele.add(true);
				}else {
					izvele.add(false);
				}
				
				if(atb3.isSelected()) {
					izvele.add(true);
				}else {
					izvele.add(false);
				}
				
				if(atb4.isSelected()) {
					izvele.add(true);
				}else {
					izvele.add(false);
				}
				
				if(izvele.equals(pareiz)) {
					setVisible(false);
					jautajumi.setRezult(true);
					par_nepar.Pareizais();
					bokareva_tests.punkti += 2;
		
				}else {
					setVisible(false);
					jautajumi.setRezult(false);
					par_nepar.Pareizais();
					if(bokareva_tests.punkti != 0)
						bokareva_tests.punkti-=1;
					else
						bokareva_tests.punkti=0;
				}
			}
			
		});
		pogaAtb.setForeground(new Color(0, 128, 128));
		pogaAtb.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		pogaAtb.setBounds(276, 318, 175, 45);
		jautajums6.add(pogaAtb);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		background.setBounds(-228, -16, 1200, 810);
		jautajums6.add(background);
		
		
		
		
	}
}
