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
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class bokareva_tests extends JFrame {
	private static final long serialVersionUID = 1L;
	public static ArrayList<Integer> nepar = new ArrayList<>();
	public static int punkti = 0;
	private JPanel SakumaEkrans;
	public static int jautNum = 1;
	public static ArrayList<Object> jautajumiki = new ArrayList<Object>();


	
	
	
	
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
		
		//nokaukumi
		String nosaukums3 = "3) Kuros variantos for cikla sintakse ir uzrakstīta NEpareizi?";
		String nosaukums4 = "4) Atzīmējiet For cikla veidus:";
		
		
		//atbildes
		ArrayList<String> varianti3 = new ArrayList<String>();
		varianti3.add("1) for(; ;){}");
		varianti3.add("2) for(i-0; i<n; i--){}");
		varianti3.add("3) for(i=0; i<n; i--){}");
		varianti3.add("4) for(i=0; i-n; i--){}");
		
		ArrayList<String> varianti4 = new ArrayList<String>();
		varianti4.add("1) do-for");
		varianti4.add("2) for-each");
		varianti4.add("3) for cikls ciklā");
		varianti4.add("4) Bezgalīgs for cikls");
		
		//true-false
		ArrayList<Boolean> pareizi3 = new ArrayList<Boolean>();
		pareizi3.add(true);
		pareizi3.add(false);
		pareizi3.add(true);
		pareizi3.add(false);
		
		ArrayList<Boolean> pareizi4 = new ArrayList<Boolean>();
		pareizi4.add(false);
		pareizi4.add(true);
		pareizi4.add(true);
		pareizi4.add(true);
		
		//objekti
		jautajumiki.add(new Jautajums(nosaukums3, varianti3, pareizi3));
		jautajumiki.add(new Jautajums(nosaukums4, varianti4, pareizi4));
		}
		

	
	
	public bokareva_tests() {
		setTitle("Tests par For ciklu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		SakumaEkrans = new JPanel();
		SakumaEkrans.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(SakumaEkrans);
		SakumaEkrans.setLayout(null);
		
		JLabel sveiki = new JLabel("Sveiki!");
		sveiki.setForeground(new Color(255, 255, 255));
		sveiki.setFont(new Font("Segoe UI Black", Font.PLAIN, 45));
		sveiki.setBounds(300, 30, 322, 134);
		SakumaEkrans.add(sveiki);
		
		JLabel teksts1 = new JLabel("Tests par tēmu “Cikls ar skaitītāju programmēšanas valoda Java\".");
		teksts1.setForeground(new Color(255, 255, 255));
		teksts1.setVerticalAlignment(SwingConstants.TOP);
		teksts1.setHorizontalAlignment(SwingConstants.CENTER);
		teksts1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		teksts1.setBounds(92, 141, 553, 36);
		SakumaEkrans.add(teksts1);
		
		JLabel teksts2 = new JLabel("Katram jautājumam jūs varat izvēlēties 2 vai 3 pareizo atbilžu variantus.");
		teksts2.setForeground(new Color(255, 255, 255));
		teksts2.setVerticalAlignment(SwingConstants.TOP);
		teksts2.setHorizontalAlignment(SwingConstants.CENTER);
		teksts2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		teksts2.setBounds(62, 163, 614, 62);
		SakumaEkrans.add(teksts2);
		
		JLabel teksts3 = new JLabel("Veiksmi!");
		teksts3.setForeground(new Color(255, 255, 255));
		teksts3.setVerticalAlignment(SwingConstants.TOP);
		teksts3.setHorizontalAlignment(SwingConstants.CENTER);
		teksts3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		teksts3.setBounds(92, 197, 553, 62);
		SakumaEkrans.add(teksts3);
		
		JButton sakt = new JButton("Startēt");		
		sakt.setForeground(new Color(51, 153, 153));
		sakt.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 25));
		sakt.setBounds(281, 246, 171, 56);
		SakumaEkrans.add(sakt);
		
		//uzsākt testu
		sakt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				jautajumi.Jautajums1();
			}
		});
		
		
		JLabel background = new JLabel("");
		background.setBackground(new Color(153, 180, 209));
		background.setIcon(new ImageIcon("C:\\Users\\nikag\\OneDrive\\Рабочий стол\\Eksamens_Bokareva\\For_tests\\bildes\\back.jpg"));
		background.setBounds(0, -12, 706, 466);
		SakumaEkrans.add(background);
		
			
	}
}
