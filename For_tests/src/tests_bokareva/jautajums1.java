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

public class jautajums1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jautajums2;
	
	public static void Jautajums2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jautajums1 frame = new jautajums1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public jautajums1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		jautajums2 = new JPanel();
		jautajums2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jautajums2);
		jautajums2.setLayout(null);
		
		JLabel jautajums = new JLabel("2) Kad tiek izmantots for cikls?");
		jautajums.setForeground(new Color(255, 255, 255));
		jautajums.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		jautajums.setBounds(199, 72, 362, 54);
		jautajums2.add(jautajums);
		
		JCheckBox var1 = new JCheckBox("1) Lai optimizētu programmu.");
		var1.setForeground(new Color(0, 0, 0));
		var1.setOpaque(false);
		var1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		var1.setBounds(77, 161, 329, 35);
		jautajums2.add(var1);
		
		JCheckBox var2 = new JCheckBox("2) Kad nepieciešams realizēt šķirošanas algoritmus");
		var2.setForeground(new Color(0, 0, 0));
		var2.setOpaque(false);
		var2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		var2.setBounds(77, 198, 521, 35);
		jautajums2.add(var2);
		
		JCheckBox var3 = new JCheckBox("3) Kad nav zināms, cik reizes darbība tiks veikta");
		var3.setForeground(new Color(0, 0, 0));
		var3.setOpaque(false);
		var3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		var3.setBounds(77, 235, 540, 35);
		jautajums2.add(var3);
		
		JCheckBox var4 = new JCheckBox("4) Lai attēlotu visus masīva elementus");
		var4.setForeground(new Color(0, 0, 0));
		var4.setOpaque(false);
		var4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		var4.setBounds(77, 272, 484, 35);
		jautajums2.add(var4);
		
		JButton Iesniegt = new JButton("Iesniegt");
		ArrayList<Boolean> atbildes = new ArrayList<>();
		Iesniegt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(var1.isSelected()) {
					atbildes.add(true);
				}else {
					atbildes.add(false);
				}
				
				if(var2.isSelected()) {
					atbildes.add(true);
				}else {
					atbildes.add(false);
				}
				
				if(var3.isSelected()) {
					atbildes.add(true);
				}else {
					atbildes.add(false);
				}
				
				if(var4.isSelected()) {
					atbildes.add(true);
				}else {
					atbildes.add(false);
				}
				
				if(atbildes.get(0) == true && atbildes.get(1) == true && atbildes.get(2) == false && atbildes.get(3) == true) {
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

		
		Iesniegt.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		Iesniegt.setForeground(new Color(0, 128, 128));
		Iesniegt.setBounds(276, 338, 176, 42);
		jautajums2.add(Iesniegt);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		background.setBounds(0, 0, 716, 443);
		jautajums2.add(background);
		
		
		

	}
}
