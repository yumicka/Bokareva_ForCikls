package tests_bokareva;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class bokareva_tests extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bokareva_tests frame = new bokareva_tests();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bokareva_tests() {
		setTitle("Tests par For ciklu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sveiki = new JLabel("Sveiki!");
		sveiki.setForeground(new Color(255, 255, 255));
		sveiki.setFont(new Font("Segoe UI Black", Font.PLAIN, 45));
		sveiki.setBounds(300, 30, 322, 134);
		contentPane.add(sveiki);
		
		JLabel lblNewLabel_1 = new JLabel("Tests par tēmu “Cikls ar skaitītāju programmēšanas valoda Java\".");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(92, 141, 553, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Katram jautājumam jūs varat izvēlēties 2 vai 3 pareizo atbilžu variantus.");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(61, 174, 614, 62);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Veiksmi!");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(92, 209, 553, 62);
		contentPane.add(lblNewLabel_3);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		lblNewLabel.setBounds(0, -12, 706, 466);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
}
