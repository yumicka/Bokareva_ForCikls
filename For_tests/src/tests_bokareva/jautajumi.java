package tests_bokareva;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jautajumi extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel jautajums;
	static boolean rezult = false;
	
	
	//nosaukumi
	
	 public static boolean setRezult(boolean vert) {
			rezult = vert;
			return rezult;
		}
		
		public static boolean getRezult() {
			return setRezult(rezult);
		}
	
	
	public jautajumi() {
		
		setTitle("Tests par For ciklu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		jautajums = new JPanel();
		jautajums.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jautajums);
		jautajums.setLayout(null);
			
		JLabel jautaj1 = new JLabel("1. Kas ir “for” cikls?");
		jautaj1.setForeground(new Color(255, 255, 255));
		jautaj1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		jautaj1.setBounds(263, 111, 271, 27);
		jautajums.add(jautaj1);
		
		
		ArrayList <Boolean> atbildes = new ArrayList<>();
		
		JCheckBox pirmais = new JCheckBox("1) Tā ir cikls, kurā darbība tiek atkārtota noteiktu reižu skaitu");
		pirmais.setForeground(Color.BLACK);
		pirmais.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		pirmais.setOpaque(false);
		pirmais.setHorizontalAlignment(SwingConstants.LEFT);
		pirmais.setBounds(25, 173, 627, 21);
		jautajums.add(pirmais);
		
		
		JCheckBox otrais = new JCheckBox("2) Tā ir sazarojums, kas pārbauda vērtību un atkarībā no\r\ntās veic kādu darbību.");
		otrais.setForeground(Color.BLACK);
		otrais.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		otrais.setOpaque(false);
		otrais.setBounds(25, 197, 675, 35);
		jautajums.add(otrais);
		
	
		JCheckBox tresais = new JCheckBox("3) Tas ir cikls, kuram ir nepieciešama sākuma un beigu vērtība, kā arī pēc");
		tresais.setForeground(Color.BLACK);
		tresais.setBackground(new Color(240, 240, 240));
		tresais.setHorizontalAlignment(SwingConstants.LEFT);
		tresais.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		tresais.setOpaque(false);
		tresais.setBounds(25, 236, 665, 21);
		jautajums.add(tresais);
		JLabel turpinajums = new JLabel("katras darbības izpildāms solis.");
		turpinajums.setForeground(Color.BLACK);
		turpinajums.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		turpinajums.setBounds(67, 258, 271, 27);
		jautajums.add(turpinajums);
	
		
		JCheckBox ceturtais = new JCheckBox("4) Tas ir koda bloks, kas veic darbību, līdz brīdim, kad ir izpildīts dotais nosacījums.");
		ceturtais.setForeground(Color.BLACK);
		ceturtais.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		ceturtais.setOpaque(false);
		ceturtais.setBounds(25, 287, 715, 21);
		jautajums.add(ceturtais);
		
		JButton atb1 = new JButton("Atbildēt");
		atb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pirmais.isSelected()) {
					atbildes.add(true);
				}else {
					atbildes.add(false);
				}
				
				if(otrais.isSelected()) {
					atbildes.add(true);
				}else {
					atbildes.add(false);
				}
				
				if(tresais.isSelected()) {
					atbildes.add(true);
				}else {
					atbildes.add(false);
				}
				
				if(ceturtais.isSelected()) {
					atbildes.add(true);
				}else {
					atbildes.add(false);
				}
				
				if(atbildes.get(0) == true && atbildes.get(2) == true && atbildes.get(1) == false && atbildes.get(3) == false) {
					setVisible(false);
					setRezult(true);
					par_nepar.Pareizais();
					bokareva_tests.punkti += 2;
		
				}else {
					setVisible(false);
					setRezult(false);
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
		
		atb1.setForeground(new Color(0, 128, 128));
		atb1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb1.setBounds(299, 338, 158, 41);
		jautajums.add(atb1);
		
		JLabel fons = new JLabel("");
		fons.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		fons.setBounds(-3, 0, 787, 466);
		jautajums.add(fons);
		
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