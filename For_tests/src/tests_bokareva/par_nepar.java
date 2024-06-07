package tests_bokareva;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
	
	public static void turpinat(int jautNum) {
		switch(bokareva_tests.jautNum) {
		case 1:
			jautajumi.Jautajums1();
			break;
			
		case 2:
			String nosaukums2 = ((Jautajums)bokareva_tests.jautajumiki.get(0)).getNosaukums();
			ArrayList<String> varianti2 = ((Jautajums)bokareva_tests.jautajumiki.get(0)).getVarianti();
			ArrayList<Boolean> atbildes2 = ((Jautajums)bokareva_tests.jautajumiki.get(0)).getAtbildes();
			Metode.Jautajums(nosaukums2, varianti2, atbildes2);
			break;
		case 3:
			String nosaukums3 = ((Jautajums)bokareva_tests.jautajumiki.get(1)).getNosaukums();
			ArrayList<String> varianti3 = ((Jautajums)bokareva_tests.jautajumiki.get(1)).getVarianti();
			ArrayList<Boolean> atbildes3 = ((Jautajums)bokareva_tests.jautajumiki.get(1)).getAtbildes();
			Metode.Jautajums(nosaukums3, varianti3, atbildes3);
			break;
			
		case 4:
			String nosaukums4 = ((Jautajums)bokareva_tests.jautajumiki.get(2)).getNosaukums();
			ArrayList<String> varianti4 = ((Jautajums)bokareva_tests.jautajumiki.get(2)).getVarianti();
			ArrayList<Boolean> atbildes4 = ((Jautajums)bokareva_tests.jautajumiki.get(2)).getAtbildes();
			Metode.Jautajums(nosaukums4, varianti4, atbildes4);
			break;
			
		case 5:
			String nosaukums5 = ((Jautajums)bokareva_tests.jautajumiki.get(3)).getNosaukums();
			ArrayList<String> varianti5 = ((Jautajums)bokareva_tests.jautajumiki.get(3)).getVarianti();
			ArrayList<Boolean> atbildes5 = ((Jautajums)bokareva_tests.jautajumiki.get(3)).getAtbildes();
			Metode.Jautajums(nosaukums5, varianti5, atbildes5);
			break;
			
		case 6:
			jautajums6.Jautajums6();
			break;
			
		case 7:
			String nosaukums7 = ((Jautajums)bokareva_tests.jautajumiki.get(4)).getNosaukums();
			ArrayList<String> varianti7 = ((Jautajums)bokareva_tests.jautajumiki.get(4)).getVarianti();
			ArrayList<Boolean> atbildes7 = ((Jautajums)bokareva_tests.jautajumiki.get(4)).getAtbildes();
			Metode.Jautajums(nosaukums7, varianti7, atbildes7);
			break;
			
		case 8:
			String nosaukums8 = ((Jautajums)bokareva_tests.jautajumiki.get(5)).getNosaukums();
			ArrayList<String> varianti8 = ((Jautajums)bokareva_tests.jautajumiki.get(5)).getVarianti();
			ArrayList<Boolean> atbildes8 = ((Jautajums)bokareva_tests.jautajumiki.get(5)).getAtbildes();
			Metode.Jautajums(nosaukums8, varianti8, atbildes8);
			break;
			
		case 9:
			String nosaukums9 = ((Jautajums)bokareva_tests.jautajumiki.get(6)).getNosaukums();
			ArrayList<String> varianti9 = ((Jautajums)bokareva_tests.jautajumiki.get(6)).getVarianti();
			ArrayList<Boolean> atbildes9 = ((Jautajums)bokareva_tests.jautajumiki.get(6)).getAtbildes();
			Metode.Jautajums(nosaukums9, varianti9, atbildes9);
			break;
			
		case 10:
			jautajums10.Jautajums10();
			break;
			
		default:
			rezultats.Rezultats();
			break;
		}
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
			pareizi.setIcon(new ImageIcon((getClass().getClassLoader().getResource("pareizais.png"))));
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
					turpinat(bokareva_tests.jautNum);
					}
				}
			});

			JLabel background = new JLabel("");
			background.setIcon(new ImageIcon((getClass().getClassLoader().getResource("back.jpg"))));
			background.setBounds(0, 0, 716, 443);
			ekrans.add(background);
			
		}else if(jautajumi.getRezult() == false) {
			//nepareizi
			JLabel nepar_bilde = new JLabel("");
			nepar_bilde.setIcon(new ImageIcon((getClass().getClassLoader().getResource("nepareizi2.png"))));
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
					turpinat(bokareva_tests.jautNum);
					}
				}
			});
			
			JLabel background = new JLabel("");
			background.setIcon(new ImageIcon((getClass().getClassLoader().getResource("back.jpg"))));
			background.setBounds(0, 0, 716, 443);
			ekrans.add(background);

		}	
	}
}
