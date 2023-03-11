

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class ChooseOption extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseOption frame = new ChooseOption();
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
	public ChooseOption() {
		setTitle("Rush Hour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\NotBackground\\rushhour.jpg"));setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\rushh.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltaste = new JLabel("YOUR TASTE");
		lbltaste.setForeground(new Color(182, 35, 15));
		lbltaste.setFont(new Font("Cooper Black", Font.PLAIN, 70));
		lbltaste.setBounds(277, 46, 531, 54);
		contentPane.add(lbltaste);
		
		JLabel lblSpicy = new JLabel("SPICY LEVEL");
		lblSpicy.setForeground(new Color(173, 63, 63));
		lblSpicy.setFont(new Font("Monospaced", Font.BOLD, 46));
		lblSpicy.setBounds(114, 132, 343, 71);
		contentPane.add(lblSpicy);
		
		JRadioButton rdbtnExtra = new JRadioButton("Extra Spicy");
		rdbtnExtra.setContentAreaFilled(false);
		rdbtnExtra.setBorder(null);
		rdbtnExtra.setForeground(new Color(173, 63, 63));
		rdbtnExtra.setIconTextGap(20);
		rdbtnExtra.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		rdbtnExtra.setBounds(102, 209, 272, 36);
		contentPane.add(rdbtnExtra);

		JRadioButton rdbtnSpicy = new JRadioButton("Spicy");
		rdbtnSpicy.setIconTextGap(20);
		rdbtnSpicy.setForeground(new Color(173, 63, 63));
		rdbtnSpicy.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		rdbtnSpicy.setContentAreaFilled(false);
		rdbtnSpicy.setBorder(null);
		rdbtnSpicy.setBounds(102, 262, 272, 36);
		contentPane.add(rdbtnSpicy);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setIconTextGap(20);
		rdbtnMedium.setForeground(new Color(173, 63, 63));
		rdbtnMedium.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		rdbtnMedium.setContentAreaFilled(false);
		rdbtnMedium.setBorder(null);
		rdbtnMedium.setBounds(102, 309, 272, 36);
		contentPane.add(rdbtnMedium);
		
		JRadioButton rdbtnMild = new JRadioButton("Mild");
		rdbtnMild.setIconTextGap(20);
		rdbtnMild.setForeground(new Color(173, 63, 63));
		rdbtnMild.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		rdbtnMild.setContentAreaFilled(false);
		rdbtnMild.setBorder(null);
		rdbtnMild.setBounds(102, 360, 272, 36);
		contentPane.add(rdbtnMild);
		
		JRadioButton rdbtnNo = new JRadioButton("No Spicy");
		rdbtnNo.setIconTextGap(20);
		rdbtnNo.setForeground(new Color(173, 63, 63));
		rdbtnNo.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		rdbtnNo.setContentAreaFilled(false);
		rdbtnNo.setBorder(null);
		rdbtnNo.setBounds(102, 406, 272, 36);
		contentPane.add(rdbtnNo);
		
		ButtonGroup groupSpicy = new ButtonGroup();
		groupSpicy.add(rdbtnExtra);
		groupSpicy.add(rdbtnSpicy);
		groupSpicy.add(rdbtnMedium);
		groupSpicy.add(rdbtnMild);
		groupSpicy.add(rdbtnNo);
		
		JLabel lblVegetable = new JLabel("VEGETABLES");
		lblVegetable.setForeground(new Color(173, 63, 63));
		lblVegetable.setFont(new Font("Monospaced", Font.BOLD, 46));
		lblVegetable.setBounds(114, 462, 343, 71);
		contentPane.add(lblVegetable);
		
		JRadioButton rdbtnWithout = new JRadioButton("Without Vegetables");
		rdbtnWithout.setIconTextGap(20);
		rdbtnWithout.setForeground(new Color(173, 63, 63));
		rdbtnWithout.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		rdbtnWithout.setContentAreaFilled(false);
		rdbtnWithout.setBorder(null);
		rdbtnWithout.setBounds(103, 543, 343, 36);
		contentPane.add(rdbtnWithout);
		
		JRadioButton rdbtnWith = new JRadioButton("With Vegetables");
		rdbtnWith.setIconTextGap(20);
		rdbtnWith.setForeground(new Color(173, 63, 63));
		rdbtnWith.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		rdbtnWith.setContentAreaFilled(false);
		rdbtnWith.setBorder(null);
		rdbtnWith.setBounds(103, 593, 272, 36);
		contentPane.add(rdbtnWith);
		
		ButtonGroup groupVegetable = new ButtonGroup();
		groupVegetable.add(rdbtnWithout);
		groupVegetable.add(rdbtnWith);
		
		JLabel lblEgg = new JLabel("ไข่ดาว(10฿)");
		lblEgg.setForeground(new Color(173, 63, 63));
		lblEgg.setFont(new Font("TH Kodchasal", Font.BOLD, 55));
		lblEgg.setBounds(609, 133, 343, 71);
		contentPane.add(lblEgg);
		
		JRadioButton rdbtn1 = new JRadioButton("ไข่ดาวสุก");
		rdbtn1.setIconTextGap(20);
		rdbtn1.setForeground(new Color(173, 63, 63));
		rdbtn1.setFont(new Font("TH Mali Grade 6", Font.BOLD, 44));
		rdbtn1.setContentAreaFilled(false);
		rdbtn1.setBorder(null);
		rdbtn1.setBounds(576, 206, 272, 36);
		contentPane.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("ยางมะตูม");
		rdbtn2.setIconTextGap(20);
		rdbtn2.setForeground(new Color(173, 63, 63));
		rdbtn2.setFont(new Font("TH Mali Grade 6", Font.BOLD, 44));
		rdbtn2.setContentAreaFilled(false);
		rdbtn2.setBorder(null);
		rdbtn2.setBounds(576, 251, 272, 47);
		contentPane.add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("ไม่เพิ่มไข่ดาว");
		rdbtn3.setIconTextGap(20);
		rdbtn3.setForeground(new Color(173, 63, 63));
		rdbtn3.setFont(new Font("TH Mali Grade 6", Font.BOLD, 44));
		rdbtn3.setContentAreaFilled(false);
		rdbtn3.setBorder(null);
		rdbtn3.setBounds(576, 302, 272, 36);
		contentPane.add(rdbtn3);
		
		ButtonGroup groupEgg = new ButtonGroup();
		groupEgg.add(rdbtn1);
		groupEgg.add(rdbtn2);
		groupEgg.add(rdbtn3);
		
		JLabel lblAdditional = new JLabel("Additional");
		lblAdditional.setForeground(new Color(173, 63, 63));
		lblAdditional.setFont(new Font("Monospaced", Font.BOLD, 46));
		lblAdditional.setBounds(491, 337, 343, 71);
		contentPane.add(lblAdditional);
		
		textField = new JTextField();
		textField.setFont(new Font("TH Kodchasal", Font.PLAIN, 30));
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBackground(new Color(248, 240, 224));
		textField.setBounds(495, 439, 508, 144);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OrderPage op = new OrderPage();
				op.setVisible(true);
				op.setLocationRelativeTo(null);
				op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();

			}
		});
		btnNext.setForeground(Color.BLACK);
		btnNext.setFont(new Font("Gloucester MT Extra Condensed", Font.BOLD, 30));
		btnNext.setBorder(UIManager.getBorder("Menu.border"));
		btnNext.setBackground(new Color(255, 248, 229));
		btnNext.setBounds(842, 608, 122, 54);
		contentPane.add(btnNext);
		
		JLabel bg = new JLabel("");
		bg.setFont(new Font("TH Kodchasal", Font.PLAIN, 30));
		bg.setBounds(-7, -8, 1100, 700);
		bg.setIcon(new ImageIcon("D:\\JavaProject\\Background\\optionSelect.jpg"));
		contentPane.add(bg);

	}
}
