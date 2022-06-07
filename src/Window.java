import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Enumeration;

import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import net.miginfocom.swing.MigLayout;

public class Window {

	private static final Color PRE = new Color(240, 230, 140), DOM = new Color(255, 127, 80),
			SOR = new Color(0, 0, 255), RES = new Color(50, 205, 50), INS = new Color(135, 206, 250);

	private JFrame frame;
	private final ButtonGroup grpFirstSelect = new ButtonGroup();
	private final ButtonGroup grpSecondSelect = new ButtonGroup();
	private final ButtonGroup grpMain1 = new ButtonGroup();
	private final ButtonGroup grpMain2 = new ButtonGroup();
	private final ButtonGroup grpMain3 = new ButtonGroup();
	private final ButtonGroup grpMain4 = new ButtonGroup();
	private final ButtonGroup grpSub1 = new ButtonGroup();
	private final ButtonGroup grpSub2 = new ButtonGroup();
	private final ButtonGroup grpSub3 = new ButtonGroup();
	private final ButtonGroup grpSub4 = new ButtonGroup();
	private final ButtonGroup grpSub5 = new ButtonGroup();
	private final ButtonGroup grpSub6 = new ButtonGroup();

	private int[] select = new int[12];

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
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][]", "[][][][][][][][][][]"));

		JRadioButton rbMain1 = new JRadioButton("Precision");
		rbMain1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain1.setBackground(PRE);
		rbMain1.setForeground(Color.BLACK);
		grpFirstSelect.add(rbMain1);
		frame.getContentPane().add(rbMain1, "cell 1 1,alignx center,aligny center");

		JRadioButton rbMain2 = new JRadioButton("Domination");
		rbMain2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain2.setBackground(DOM);
		grpFirstSelect.add(rbMain2);
		frame.getContentPane().add(rbMain2, "cell 2 1,alignx center,aligny center");

		JRadioButton rbMain3 = new JRadioButton("Sorcery");
		rbMain3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain3.setForeground(new Color(255, 255, 255));
		rbMain3.setBackground(SOR);
		grpFirstSelect.add(rbMain3);
		frame.getContentPane().add(rbMain3, "cell 3 1,alignx center,aligny center");

		JRadioButton rbMain4 = new JRadioButton("Resolve");
		rbMain4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain4.setBackground(RES);
		grpFirstSelect.add(rbMain4);
		frame.getContentPane().add(rbMain4, "cell 4 1,alignx center,aligny center");

		JRadioButton rbMain5 = new JRadioButton("Inspiration");
		rbMain5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rbMain5.setBackground(INS);
		grpFirstSelect.add(rbMain5);
		frame.getContentPane().add(rbMain5, "cell 5 1,alignx center,aligny center");

		JRadioButton rbSub1 = new JRadioButton("");
		rbSub1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSecondSelect.add(rbSub1);
		frame.getContentPane().add(rbSub1, "cell 7 1,alignx center,aligny center");

		JRadioButton rbSub2 = new JRadioButton("");
		rbSub2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSecondSelect.add(rbSub2);
		frame.getContentPane().add(rbSub2, "cell 8 1,alignx center,aligny center");

		JRadioButton rbSub3 = new JRadioButton("");
		rbSub3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSecondSelect.add(rbSub3);
		frame.getContentPane().add(rbSub3, "cell 9 1,alignx center,aligny center");

		JRadioButton rbSub4 = new JRadioButton("");
		rbSub4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSecondSelect.add(rbSub4);
		frame.getContentPane().add(rbSub4, "cell 10 1,alignx center,aligny center");

		JRadioButton rbMain1A = new JRadioButton("");
		rbMain1A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain1.add(rbMain1A);
		frame.getContentPane().add(rbMain1A, "cell 1 3,alignx center,aligny center");

		JRadioButton rbMain1B = new JRadioButton("");
		rbMain1B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain1.add(rbMain1B);
		frame.getContentPane().add(rbMain1B, "cell 2 3,alignx center,aligny center");

		JRadioButton rbMain1C = new JRadioButton("");
		rbMain1C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain1.add(rbMain1C);
		frame.getContentPane().add(rbMain1C, "cell 3 3,alignx center,aligny center");

		JRadioButton rbMain1D = new JRadioButton("");
		rbMain1D.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain1.add(rbMain1D);
		frame.getContentPane().add(rbMain1D, "cell 4 3,alignx center,aligny center");

		JRadioButton rbSub1A = new JRadioButton("");
		rbSub1A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub1.add(rbSub1A);
		frame.getContentPane().add(rbSub1A, "cell 7 3,alignx center,aligny center");

		JRadioButton rbSub1B = new JRadioButton("");
		rbSub1B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub1.add(rbSub1B);
		frame.getContentPane().add(rbSub1B, "cell 8 3,alignx center,aligny center");

		JRadioButton rbSub1C = new JRadioButton("");
		rbSub1C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub1.add(rbSub1C);
		frame.getContentPane().add(rbSub1C, "cell 9 3,alignx center,aligny center");

		JRadioButton rbMain2A = new JRadioButton("");
		rbMain2A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain2.add(rbMain2A);
		frame.getContentPane().add(rbMain2A, "cell 1 4,alignx center,aligny center");

		JRadioButton rbMain2B = new JRadioButton("");
		rbMain2B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain2.add(rbMain2B);
		frame.getContentPane().add(rbMain2B, "cell 2 4,alignx center,aligny center");

		JRadioButton rbMain2C = new JRadioButton("");
		rbMain2C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain2.add(rbMain2C);
		frame.getContentPane().add(rbMain2C, "cell 3 4,alignx center,aligny center");

		JRadioButton rbSub2A = new JRadioButton("");
		rbSub2A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub2.add(rbSub2A);
		frame.getContentPane().add(rbSub2A, "cell 7 4,alignx center,aligny center");

		JRadioButton rbSub2B = new JRadioButton("");
		rbSub2B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub2.add(rbSub2B);
		frame.getContentPane().add(rbSub2B, "cell 8 4,alignx center,aligny center");

		JRadioButton rbSub2C = new JRadioButton("");
		rbSub2C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub2.add(rbSub2C);
		frame.getContentPane().add(rbSub2C, "cell 9 4,alignx center,aligny center");

		JRadioButton rbMain3A = new JRadioButton("");
		rbMain3A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain3.add(rbMain3A);
		frame.getContentPane().add(rbMain3A, "cell 1 5,alignx center,aligny center");

		JRadioButton rbMain3B = new JRadioButton("");
		rbMain3B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain3.add(rbMain3B);
		frame.getContentPane().add(rbMain3B, "cell 2 5,alignx center,aligny center");

		JRadioButton rbMain3C = new JRadioButton("");
		rbMain3C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain3.add(rbMain3C);
		frame.getContentPane().add(rbMain3C, "cell 3 5,alignx center,aligny center");

		JRadioButton rbSub3A = new JRadioButton("");
		rbSub3A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub3.add(rbSub3A);
		frame.getContentPane().add(rbSub3A, "cell 7 5,alignx center,aligny center");

		JRadioButton rbSub3B = new JRadioButton("");
		rbSub3B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub3.add(rbSub3B);
		frame.getContentPane().add(rbSub3B, "cell 8 5,alignx center,aligny center");

		JRadioButton rbSub3C = new JRadioButton("");
		rbSub3C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub3.add(rbSub3C);
		frame.getContentPane().add(rbSub3C, "cell 9 5,alignx center,aligny center");

		JRadioButton rbSub3D = new JRadioButton("");
		rbSub3D.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub3.add(rbSub3D);
		frame.getContentPane().add(rbSub3D, "cell 10 5,alignx center,aligny center");

		JRadioButton rbMain4A = new JRadioButton("");
		rbMain4A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain4.add(rbMain4A);
		frame.getContentPane().add(rbMain4A, "cell 1 6,alignx center,aligny center");

		JRadioButton rbMain4B = new JRadioButton("");
		rbMain4B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain4.add(rbMain4B);
		frame.getContentPane().add(rbMain4B, "cell 2 6,alignx center,aligny center");

		JRadioButton rbMain4C = new JRadioButton("");
		rbMain4C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain4.add(rbMain4C);
		frame.getContentPane().add(rbMain4C, "cell 3 6,alignx center,aligny center");

		JRadioButton rbMain4D = new JRadioButton("");
		rbMain4D.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpMain4.add(rbMain4D);
		frame.getContentPane().add(rbMain4D, "cell 4 6,alignx center,aligny center");

		JRadioButton rbSub4A = new JRadioButton("");
		rbSub4A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub4.add(rbSub4A);
		frame.getContentPane().add(rbSub4A, "cell 7 6,alignx center,aligny center");

		JRadioButton rbSub4B = new JRadioButton("");
		rbSub4B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub4.add(rbSub4B);
		frame.getContentPane().add(rbSub4B, "cell 8 6,alignx center,aligny center");

		JRadioButton rbSub4C = new JRadioButton("");
		rbSub4C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub4.add(rbSub4C);
		frame.getContentPane().add(rbSub4C, "cell 9 6,alignx center,aligny center");

		JRadioButton rbSub5A = new JRadioButton("");
		rbSub5A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub5.add(rbSub5A);
		frame.getContentPane().add(rbSub5A, "cell 7 7,alignx center,aligny center");

		JRadioButton rbSub5B = new JRadioButton("");
		rbSub5B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub5.add(rbSub5B);
		frame.getContentPane().add(rbSub5B, "cell 8 7,alignx center,aligny center");

		JRadioButton rbSub5C = new JRadioButton("");
		rbSub5C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub5.add(rbSub5C);
		frame.getContentPane().add(rbSub5C, "cell 9 7,alignx center,aligny center");

		JRadioButton rbSub6A = new JRadioButton("");
		rbSub6A.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub6.add(rbSub6A);
		frame.getContentPane().add(rbSub6A, "cell 7 8,alignx center,aligny center");

		JRadioButton rbSub6B = new JRadioButton("");
		rbSub6B.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub6.add(rbSub6B);
		frame.getContentPane().add(rbSub6B, "cell 8 8,alignx center,aligny center");

		JRadioButton rbSub6C = new JRadioButton("");
		rbSub6C.setFont(new Font("Times New Roman", Font.BOLD, 20));
		grpSub6.add(rbSub6C);
		frame.getContentPane().add(rbSub6C, "cell 9 8,alignx center,aligny center");

		JButton btnSubmit = new JButton();
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSubmit.setAction(new AbstractAction("Submit") {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				select[0] = traverse(grpFirstSelect);
				select[1] = traverse(grpMain1);
				select[2] = traverse(grpMain2);
				select[3] = traverse(grpMain3);
				select[4] = traverse(grpMain4);
				select[5] = traverse(grpSecondSelect);
				select[6] = traverse(grpSub1);
				select[7] = traverse(grpSub2);
				select[8] = traverse(grpSub3);
				select[9] = traverse(grpSub4);
				select[10] = traverse(grpSub5);
				select[11] = traverse(grpSub6);

			}
		});

		frame.getContentPane().add(btnSubmit, "cell 2 9,alignx center,aligny center");
	}

	private int traverse(ButtonGroup g) {
		int x = 0;
		Enumeration<AbstractButton> enumeration = g.getElements();
		while (enumeration.hasMoreElements()) {
			if (enumeration.nextElement().isSelected())
				break;
			x++;
		}
		return x;
	}
}
