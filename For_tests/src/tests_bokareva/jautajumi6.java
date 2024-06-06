package tests_bokareva;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class jautajumi6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jautajums6;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jautajumi6 frame = new jautajumi6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public jautajumi6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		jautajums6 = new JPanel();
		jautajums6.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jautajums6);
		jautajums6.setLayout(null);
		
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		background.setBounds(0, 0, 719, 456);
		jautajums6.add(background);
	}

}
