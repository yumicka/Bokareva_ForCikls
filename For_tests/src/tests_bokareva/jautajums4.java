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

public class jautajums4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jautajums4;

	public static void Jautajums4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jautajums4 frame = new jautajums4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public jautajums4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		jautajums4 = new JPanel();
		jautajums4.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jautajums4);
		jautajums4.setLayout(null);
		
		JLabel jaut4 = new JLabel("4) Atzīmējiet For cikla veidus:");
		jaut4.setForeground(new Color(255, 255, 255));
		jaut4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		jaut4.setBounds(178, 89, 362, 34);
		jautajums4.add(jaut4);
		
		
		JCheckBox pirm = new JCheckBox("1) do-for");
		pirm.setForeground(new Color(0, 0, 0));
		pirm.setOpaque(false);
		pirm.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		pirm.setBounds(77, 168, 329, 35);
		jautajums4.add(pirm);
		
		JCheckBox otr = new JCheckBox("2) for-each");
		otr.setForeground(new Color(0, 0, 0));
		otr.setOpaque(false);
		otr.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		otr.setBounds(77, 205, 329, 35);
		jautajums4.add(otr);
		
		JCheckBox tres = new JCheckBox("3) for cikls ciklā");
		tres.setForeground(new Color(0, 0, 0));
		tres.setOpaque(false);
		tres.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		tres.setBounds(77, 242, 329, 35);
		jautajums4.add(tres);
		
		JCheckBox cetur = new JCheckBox("4) Bezgalīgs for cikls");
		cetur.setForeground(new Color(0, 0, 0));
		cetur.setOpaque(false);
		cetur.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		cetur.setBounds(77, 279, 329, 35);
		jautajums4.add(cetur);
		
		ArrayList<Boolean> izveles = new ArrayList<>();
		JButton atb = new JButton("Atbildēt");
		atb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pirm.isSelected()) {
					izveles.add(true);
				}else {
					izveles.add(false);
				}
				
				if(otr.isSelected()) {
					izveles.add(true);
				}else {
					izveles.add(false);
				}
				
				if(tres.isSelected()) {
					izveles.add(true);
				}else {
					izveles.add(false);
				}
				
				if(cetur.isSelected()) {
					izveles.add(true);
				}else {
					izveles.add(false);
				}
				
				if(izveles.get(0) == false && izveles.get(1) == true && izveles.get(2) == true && izveles.get(3) == true) {
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
		atb.setBounds(434, 221, 188, 43);
		jautajums4.add(atb);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		background.setBounds(-228, -16, 1200, 810);
		jautajums4.add(background);
	}

}
