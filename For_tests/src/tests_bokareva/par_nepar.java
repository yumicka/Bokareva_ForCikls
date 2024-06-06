package tests_bokareva;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class par_nepar extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel ekrans;
	public static void Pareizais() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					par_nepar frame = new par_nepar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//frame
	public par_nepar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		ekrans = new JPanel();
		ekrans.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ekrans);
		ekrans.setLayout(null);
		
		if(jautajumi.getRezult() == true) {	
			//pareizi
			JLabel teksts = new JLabel("Atbilde ir pareiza!");
			teksts.setForeground(new Color(255, 255, 255));
			teksts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
			teksts.setBounds(265, 118, 262, 63);
			ekrans.add(teksts);
			
			JLabel pareizi = new JLabel("");
			pareizi.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\pareizais.png"));
			pareizi.setBounds(32, 136, 224, 246);
			ekrans.add(pareizi);
			
			JLabel punkti = new JLabel("+2 punkti");
			punkti.setForeground(new Color(152, 251, 152));
			punkti.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
			punkti.setBounds(265, 221, 196, 49);
			ekrans.add(punkti);
			
			JButton OkPoga = new JButton("OK");
			OkPoga.setForeground(new Color(0, 100, 0));
			OkPoga.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
			OkPoga.setBounds(311, 302, 113, 41);
			ekrans.add(OkPoga);
			
			OkPoga.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(bokareva_tests.jautNum <= 10) {
					bokareva_tests.jautNum++;
					setVisible(false);
					switch(bokareva_tests.jautNum) {
					case 1:
						jautajumi.Jautajums1();
						break;
						
					case 2:
						jautajums1.Jautajums2();
						break;
					case 3:
						jautajums3.Jautajums3();
						break;
						
					case 4:
						jautajums4.Jautajums4();
						break;
						
					case 5:
						jautajumi5.Jautajums5();
						break;
					}
					}
				}
			});

			JLabel background = new JLabel("");
			background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
			background.setBounds(0, 0, 716, 443);
			ekrans.add(background);
			
		}else if(jautajumi.getRezult() == false) {
			
			JLabel nepar_bilde = new JLabel("");
			nepar_bilde.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\nepareizi2.png"));
			nepar_bilde.setBounds(64, 208, 183, 190);
			ekrans.add(nepar_bilde);

			JLabel nepareizi = new JLabel("Atbilde ir nepareiza!");
			nepareizi.setForeground(new Color(255, 255, 255));
			nepareizi.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
			nepareizi.setBounds(265, 118, 262, 63);
			ekrans.add(nepareizi);
			
			JLabel punkti = new JLabel("-1 punkti");
			punkti.setForeground(new Color(255, 0, 0));
			punkti.setFont(new Font("Segoe UI Symbol", Font.BOLD, 40));
			punkti.setBounds(265, 221, 196, 49);
			ekrans.add(punkti);
			
			JButton OkPoga = new JButton("OK");
			OkPoga.setForeground(new Color(255, 0, 0));
			OkPoga.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
			OkPoga.setBounds(311, 302, 113, 41);
			ekrans.add(OkPoga);
			OkPoga.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					if(bokareva_tests.jautNum <= 10) {
					bokareva_tests.jautNum++;
					System.out.print(bokareva_tests.jautNum);
					switch(bokareva_tests.jautNum) {
					case 1:
						jautajumi.Jautajums1();
						break;
						
					case 2:
						jautajums1.Jautajums2();
						break;
						
					case 3:
						jautajums3.Jautajums3();
						break;
						
					case 4:
						jautajums4.Jautajums4();
						break;
						
					case 5:
						jautajumi5.Jautajums5();
						break;
					}
					}
				}
			});
			
			JLabel background = new JLabel("");
			background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
			background.setBounds(0, 0, 716, 443);
			ekrans.add(background);

		}	
	}
}
