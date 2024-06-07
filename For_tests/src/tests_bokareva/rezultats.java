package tests_bokareva;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class rezultats extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel rezultats;

	public static void Rezultats() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rezultats frame = new rezultats();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public rezultats() {
		setTitle("Rezultāts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		rezultats = new JPanel();
		rezultats.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(rezultats);
		getContentPane().setLayout(null);
		rezultats.setLayout(null);
		
		
		JLabel teksts1 = new JLabel("Tests ir pabeigts!");
		teksts1.setForeground(new Color(255, 255, 255));
		teksts1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		teksts1.setBounds(238, 45, 245, 42);
		rezultats.add(teksts1);
		
		
		JLabel teksts2 = new JLabel("Jūsu rezultāts:");
		teksts2.setForeground(new Color(255, 255, 255));
		teksts2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		teksts2.setBounds(293, 97, 141, 36);
		rezultats.add(teksts2);
		
		String pnkt = Integer.toString(bokareva_tests.punkti);
		
		JLabel punkti = new JLabel(pnkt);
		punkti.setHorizontalAlignment(SwingConstants.CENTER);
		punkti.setForeground(new Color(144, 238, 144));
		punkti.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 23));
		punkti.setBounds(10, 131, 686, 42);
		rezultats.add(punkti);
		
		//nepareizi atbildes
		JLabel jautajumi = new JLabel("Nepareizi atbildēti jautājumi:");
		jautajumi.setForeground(new Color(255, 255, 255));
		jautajumi.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		jautajumi.setBounds(213, 167, 294, 41);
		rezultats.add(jautajumi);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		background.setBounds(-228, -16, 1200, 810);
		rezultats.add(background);
		
		String str = "";
		for(int i : bokareva_tests.nepar) {
			if(i != bokareva_tests.nepar.size()-1)
				str += i+", ";
			else
				str += i+".";
		}
	
		
		JLabel saraksts = new JLabel(str);
		saraksts.setHorizontalAlignment(SwingConstants.CENTER);
		saraksts.setBounds(10, 204, 686, 42);
		rezultats.add(saraksts);
		
		
		
	}

}
