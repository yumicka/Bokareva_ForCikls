package tests_bokareva;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;

public class jautajums10 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jautajums10;

	public static void Jautajums10() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jautajums10 frame = new jautajums10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public jautajums10() {
		setTitle("Tests par For ciklu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		jautajums10 = new JPanel();
		jautajums10.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jautajums10);
		getContentPane().setLayout(null);
		jautajums10.setLayout(null);
		
		JLabel jaut = new JLabel("10) Kuras masīva rindas apstrādā cikls ciklā ārējā daļa");
		jaut.setForeground(new Color(255, 255, 255));
		jaut.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		jaut.setBounds(55, 62, 610, 34);
		jautajums10.add(jaut);
		
		JLabel jaut1 = new JLabel("un cikls ciklā iekšējā daļa?");
		jaut1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		jaut1.setForeground(new Color(255, 255, 255));
		jaut1.setBounds(204, 94, 310, 39);
		jautajums10.add(jaut1);
		
		JCheckBox atb1 = new JCheckBox("Ārēja dāļa apstrada masīva kolonnus");
		atb1.setForeground(new Color(0, 0, 0));
		atb1.setOpaque(false);
		atb1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb1.setBounds(77, 168, 579, 35);
		jautajums10.add(atb1);
		
		JCheckBox atb2 = new JCheckBox("Ārēja dāļa apstrada masīva rindus");
		atb2.setForeground(new Color(0, 0, 0));
		atb2.setOpaque(false);
		atb2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb2.setBounds(77, 205, 590, 35);
		jautajums10.add(atb2);
		
		JCheckBox atb3 = new JCheckBox("Iekšējā dāļa apstrada masīva kolonnus");
		atb3.setForeground(new Color(0, 0, 0));
		atb3.setOpaque(false);
		atb3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb3.setBounds(77, 242, 579, 35);
		jautajums10.add(atb3);
		
		JCheckBox atb4 = new JCheckBox("Iekšējā dāļa apstrada masīva rindus");
		atb4.setForeground(new Color(0, 0, 0));
		atb4.setOpaque(false);
		atb4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb4.setBounds(77, 279, 579, 35);
		jautajums10.add(atb4);
		
		ArrayList<Boolean> izvele = new ArrayList<Boolean>();
		ArrayList<Boolean> pareiz = new ArrayList<Boolean>();
		
		pareiz.add(false);
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
					if(bokareva_tests.punkti != 0) {
						bokareva_tests.punkti-=1;
						bokareva_tests.nepar.add(bokareva_tests.jautNum);
					}else{
						bokareva_tests.punkti=0;
						bokareva_tests.nepar.add(bokareva_tests.jautNum);
					}
				}
			}
		});
	pogaAtb.setForeground(new Color(0, 128, 128));
	pogaAtb.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
	pogaAtb.setBounds(269, 334, 175, 45);
	jautajums10.add(pogaAtb);
	
	JLabel background = new JLabel("");
	background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
	background.setBounds(-228, -16, 1200, 810);
	jautajums10.add(background);
	
	}	
}
