/*package tests_bokareva;

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

public class jautajums3 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel jautajums3;
	
	public static void Jautajums3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jautajums3 frame = new jautajums3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public jautajums3() {
		String nosaukums = "3) Kuros variantos for cikla sintakse ir uzrakstīta NEpareizi?";
		ArrayList<String> varianti = new ArrayList<String>();
		varianti.add("1) for(; ;){}");
		varianti.add("2) for(i-0; i<n; i--){}");
		varianti.add("3) for(i=0; i<n; i--){}");
		varianti.add("4) for(i=0; i-n; i--){}");
		ArrayList<Boolean> pareizi = new ArrayList<Boolean>();
		pareizi.add(true);
		pareizi.add(false);
		pareizi.add(true);
		pareizi.add(false);
		Metode.Jautajums(nosaukums, varianti, pareizi);
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		jautajums3 = new JPanel();
		jautajums3.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jautajums3);
		jautajums3.setLayout(null);
		
		JLabel jautajums3_2 = new JLabel("3) Kuros variantos for cikla sintakse ir uzrakstīta NEpareizi?");
		jautajums3_2.setForeground(new Color(255, 255, 255));
		jautajums3_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		jautajums3_2.setBounds(21, 114, 675, 30);
		jautajums3.add(jautajums3_2);
		
		JCheckBox var1 = new JCheckBox("1) for(; ;){}");
		var1.setForeground(new Color(0, 0, 0));
		var1.setOpaque(false);
		var1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		var1.setBounds(77, 168, 329, 35);
		jautajums3.add(var1);
		
		JCheckBox var2 = new JCheckBox("2) for(i-0; i<n; i--){}");
		var2.setForeground(new Color(0, 0, 0));
		var2.setOpaque(false);
		var2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		var2.setBounds(77, 205, 329, 35);
		jautajums3.add(var2);
		
		JCheckBox var3 = new JCheckBox("3) for(i=0; i<n; i--){}");
		var3.setForeground(new Color(0, 0, 0));
		var3.setOpaque(false);
		var3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		var3.setBounds(77, 242, 329, 35);
		jautajums3.add(var3);
		
		JCheckBox var4 = new JCheckBox("4) for(i=0; i-n; i--){}");
		var4.setForeground(new Color(0, 0, 0));
		var4.setOpaque(false);
		var4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		var4.setBounds(77, 279, 329, 35);
		jautajums3.add(var4);
		
		JButton atb = new JButton("Iesniegt");
		ArrayList<Boolean> atbildes = new ArrayList<>();
		atb.addActionListener(new ActionListener() {
			
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
				
				if(atbildes.get(0) == true && atbildes.get(1) == false && atbildes.get(2) == true && atbildes.get(3) == false) {
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
		atb.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		atb.setForeground(new Color(0, 128, 128));
		atb.setBounds(276, 338, 176, 42);
		jautajums3.add(atb);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		background.setBounds(0, 0, 716, 443);
		jautajums3.add(background);
		
	}

}*/
