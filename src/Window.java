import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;

public class Window {

	private JFrame frame;
	private final ButtonGroup grpFirstSelect = new ButtonGroup();
	private final ButtonGroup grpSecondSelect = new ButtonGroup();
	private static final Color PRE = new Color(240, 230, 140), DOM = new Color(255, 127, 80), SOR = new Color(0, 0, 255), RES = new Color(50, 205, 50), INS = new Color(135, 206, 250);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1250, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][]", "[][][][][][][][]"));
		
		JRadioButton rbMain1 = new JRadioButton("Precision");
		rbMain1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain1.setBackground(PRE);
		rbMain1.setForeground(Color.BLACK);
		grpFirstSelect.add(rbMain1);
		frame.getContentPane().add(rbMain1, "cell 1 1");
		
		JRadioButton rbMain2 = new JRadioButton("Domination");
		rbMain2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain2.setBackground(DOM);
		grpFirstSelect.add(rbMain2);
		frame.getContentPane().add(rbMain2, "cell 2 1");
		
		JRadioButton rbMain3 = new JRadioButton("Sorcery");
		rbMain3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain3.setForeground(new Color(255, 255, 255));
		rbMain3.setBackground(SOR);
		grpFirstSelect.add(rbMain3);
		frame.getContentPane().add(rbMain3, "cell 3 1");
		
		JRadioButton rbMain4 = new JRadioButton("Resolve");
		rbMain4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain4.setBackground(RES);
		grpFirstSelect.add(rbMain4);
		frame.getContentPane().add(rbMain4, "cell 4 1");
		
		JRadioButton rbMain5 = new JRadioButton("Inspiration");
		rbMain5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain5.setBackground(INS);
		grpFirstSelect.add(rbMain5);
		frame.getContentPane().add(rbMain5, "cell 5 1");
		
		JRadioButton rbSub1 = new JRadioButton("");
		rbSub1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSecondSelect.add(rbSub1);
		frame.getContentPane().add(rbSub1, "cell 7 1");
		
		JRadioButton rbSub2 = new JRadioButton("");
		rbSub2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSecondSelect.add(rbSub2);
		frame.getContentPane().add(rbSub2, "cell 8 1");
		
		JRadioButton rbSub3 = new JRadioButton("");
		rbSub3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSecondSelect.add(rbSub3);
		frame.getContentPane().add(rbSub3, "cell 9 1");
		
		JRadioButton rbSub4 = new JRadioButton("");
		rbSub4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSecondSelect.add(rbSub4);
		frame.getContentPane().add(rbSub4, "cell 10 1");
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_14, "cell 7 2");
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_15, "cell 8 2");
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_16, "cell 9 2");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton, "cell 1 3");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_1, "cell 2 3");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_2, "cell 3 3");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_3, "cell 4 3");
		
		JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_17, "cell 7 3");
		
		JRadioButton rdbtnNewRadioButton_18 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_18, "cell 8 3");
		
		JRadioButton rdbtnNewRadioButton_19 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_19, "cell 9 3");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_4, "cell 1 4");
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_5, "cell 2 4");
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_6, "cell 3 4");
		
		JRadioButton rdbtnNewRadioButton_20 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_20, "cell 7 4");
		
		JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_21, "cell 8 4");
		
		JRadioButton rdbtnNewRadioButton_22 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_22, "cell 9 4");
		
		JRadioButton rdbtnNewRadioButton_23 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_23, "cell 10 4");
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_7, "cell 1 5");
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_8, "cell 2 5");
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_9, "cell 3 5");
		
		JRadioButton rdbtnNewRadioButton_24 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_24, "cell 7 5");
		
		JRadioButton rdbtnNewRadioButton_25 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_25, "cell 8 5");
		
		JRadioButton rdbtnNewRadioButton_26 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_26, "cell 9 5");
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_10, "cell 1 6");
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_11, "cell 2 6");
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_12, "cell 3 6");
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_13, "cell 4 6");
		
		JRadioButton rdbtnNewRadioButton_29 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_29, "cell 7 6");
		
		JRadioButton rdbtnNewRadioButton_28 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_28, "cell 8 6");
		
		JRadioButton rdbtnNewRadioButton_27 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_27, "cell 9 6");
		
		JRadioButton rdbtnNewRadioButton_30 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_30, "cell 7 7");
		
		JRadioButton rdbtnNewRadioButton_31 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_31, "cell 8 7");
		
		JRadioButton rdbtnNewRadioButton_32 = new JRadioButton("New radio button");
		frame.getContentPane().add(rdbtnNewRadioButton_32, "cell 9 7");
	}
	
	private void Precision(ButtonGroup grp) {
		grp.getSelection();
	}

}
