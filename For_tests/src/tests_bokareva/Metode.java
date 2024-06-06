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

public class Metode extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JPanel jautajumuLogs;
	public static void Jautajums(String jautajums, ArrayList<String> varianti, ArrayList<Boolean> atbildes) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metode frame = new Metode(jautajums, varianti, atbildes);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Metode(String jautajums, ArrayList<String> varianti, ArrayList<Boolean> atbildes) {
		setTitle("Tests par For ciklu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		jautajumuLogs = new JPanel();
		jautajumuLogs.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jautajumuLogs);
		jautajumuLogs.setLayout(null);
		
		JLabel nosaukums = new JLabel(jautajums);
		nosaukums.setForeground(new Color(255, 255, 255));
		nosaukums.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		nosaukums.setBounds(113, 84, 517, 46);
		jautajumuLogs.add(nosaukums);
		
		JCheckBox atb1 = new JCheckBox(varianti.get(0));
		atb1.setForeground(new Color(0, 0, 0));
		atb1.setOpaque(false);
		atb1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb1.setBounds(77, 168, 329, 35);
		jautajumuLogs.add(atb1);
		
		JCheckBox atb2 = new JCheckBox(varianti.get(1));
		atb2.setForeground(new Color(0, 0, 0));
		atb2.setOpaque(false);
		atb2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb2.setBounds(77, 205, 329, 35);
		jautajumuLogs.add(atb2);
		
		JCheckBox atb3 = new JCheckBox(varianti.get(2));
		atb3.setForeground(new Color(0, 0, 0));
		atb3.setOpaque(false);
		atb3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb3.setBounds(77, 242, 329, 35);
		jautajumuLogs.add(atb3);
		
		JCheckBox atb4 = new JCheckBox(varianti.get(3));
		atb4.setForeground(new Color(0, 0, 0));
		atb4.setOpaque(false);
		atb4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb4.setBounds(77, 279, 329, 35);
		jautajumuLogs.add(atb4);
		
		
		//poga
		ArrayList<Boolean> izveles = new ArrayList<>();
		JButton atb = new JButton("Atbildēt");
		atb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(atb1.isSelected()) {
					izveles.add(true);
				}else {
					izveles.add(false);
				}
				
				if(atb2.isSelected()) {
					izveles.add(true);
				}else {
					izveles.add(false);
				}
				
				if(atb3.isSelected()) {
					izveles.add(true);
				}else {
					izveles.add(false);
				}
				
				if(atb4.isSelected()) {
					izveles.add(true);
				}else {
					izveles.add(false);
				}
				
				if(izveles.equals(atbildes)){
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
		atb.setForeground(new Color(0, 128, 128));
		atb.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb.setBounds(261, 331, 188, 43);
		jautajumuLogs.add(atb);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		background.setBounds(-228, -16, 1200, 810);
		jautajumuLogs.add(background);
	}

}
