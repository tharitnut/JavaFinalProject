import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class ChooseMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseMain frame = new ChooseMain();
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
	public ChooseMain() {
		setTitle("Rush Hour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\NotBackground\\rushhour.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("PICK UP YOUR MEAT!!");
		lblTitle.setForeground(new Color(182, 35, 15));
		lblTitle.setFont(new Font("Cooper Black", Font.PLAIN, 70));
		lblTitle.setBounds(128, 38, 829, 54);
		contentPane.add(lblTitle);
		
		final JRadioButton rdbtnPork = new JRadioButton("Pork");
		rdbtnPork.setContentAreaFilled(false);
		rdbtnPork.setBorder(null);
		rdbtnPork.setForeground(new Color(243, 190, 98));
		rdbtnPork.setIconTextGap(10);
		rdbtnPork.setFont(new Font("Dialog", Font.BOLD, 24));
		rdbtnPork.setBounds(137, 262, 99, 61);
		contentPane.add(rdbtnPork);
		
		
		final JRadioButton rdbtnCrispyPork = new JRadioButton("CrispyPork");
		rdbtnCrispyPork.setContentAreaFilled(false);
		rdbtnCrispyPork.setBorder(null);
		rdbtnCrispyPork.setForeground(new Color(243, 190, 98));
		rdbtnCrispyPork.setIconTextGap(10);
		rdbtnCrispyPork.setFont(new Font("Dialog", Font.BOLD, 16));
		rdbtnCrispyPork.setBounds(359, 282, 114, 21);
		contentPane.add(rdbtnCrispyPork);
		
		final JRadioButton rdbtnBeef = new JRadioButton("Beef");
		rdbtnBeef.setContentAreaFilled(false);
		rdbtnBeef.setBorder(null);
		rdbtnBeef.setForeground(new Color(243, 190, 98));
		rdbtnBeef.setIconTextGap(10);
		rdbtnBeef.setFont(new Font("Dialog", Font.BOLD, 24));
		rdbtnBeef.setBounds(617, 282, 89, 21);
		contentPane.add(rdbtnBeef);
		
		final JRadioButton rdbtnChicken = new JRadioButton("Chicken");
		rdbtnChicken.setContentAreaFilled(false);
		rdbtnChicken.setBorder(null);
		rdbtnChicken.setForeground(new Color(243, 190, 98));
		rdbtnChicken.setIconTextGap(10);
		rdbtnChicken.setFont(new Font("Dialog", Font.BOLD, 20));
		rdbtnChicken.setBounds(850, 283, 103, 21);
		contentPane.add(rdbtnChicken);
		
		final JRadioButton rdbtnShrimp = new JRadioButton("Shrimp");
		rdbtnShrimp.setContentAreaFilled(false);
		rdbtnShrimp.setBorder(null);
		rdbtnShrimp.setForeground(new Color(243, 190, 98));
		rdbtnShrimp.setIconTextGap(10);
		rdbtnShrimp.setFont(new Font("Dialog", Font.BOLD, 20));
		rdbtnShrimp.setBounds(128, 559, 103, 21);
		contentPane.add(rdbtnShrimp);
		
		final JRadioButton rdbtnSquid = new JRadioButton("Squid");
		rdbtnSquid.setContentAreaFilled(false);
		rdbtnSquid.setBorder(null);
		rdbtnSquid.setForeground(new Color(243, 190, 98));
		rdbtnSquid.setIconTextGap(10);
		rdbtnSquid.setFont(new Font("Dialog", Font.BOLD, 20));
		rdbtnSquid.setBounds(376, 559, 89, 21);
		contentPane.add(rdbtnSquid);
		
		final JRadioButton rdbtnFish = new JRadioButton("Fish");
		rdbtnFish.setContentAreaFilled(false);
		rdbtnFish.setBorder(null);
		rdbtnFish.setForeground(new Color(243, 190, 98));
		rdbtnFish.setIconTextGap(10);
		rdbtnFish.setFont(new Font("Dialog", Font.BOLD, 24));
		rdbtnFish.setBounds(617, 559, 89, 21);
		contentPane.add(rdbtnFish);
		
		final JRadioButton rdbtnSeafood = new JRadioButton("Seafood");
		rdbtnSeafood.setContentAreaFilled(false);
		rdbtnSeafood.setBorder(null);
		rdbtnSeafood.setForeground(new Color(243, 190, 98));
		rdbtnSeafood.setIconTextGap(10);
		rdbtnSeafood.setFont(new Font("Dialog", Font.BOLD, 20));
		rdbtnSeafood.setBounds(850, 559, 103, 21);
		contentPane.add(rdbtnSeafood);
		
		ButtonGroup groupMeat = new ButtonGroup();
		groupMeat.add(rdbtnPork);
		groupMeat.add(rdbtnCrispyPork);
		groupMeat.add(rdbtnBeef);
		groupMeat.add(rdbtnChicken);
		groupMeat.add(rdbtnShrimp);
		groupMeat.add(rdbtnSquid);
		groupMeat.add(rdbtnFish);
		groupMeat.add(rdbtnSeafood);
		
		JLabel lblPrice1 = new JLabel("45฿");
		lblPrice1.setFont(new Font("Dialog", Font.BOLD, 40));
		lblPrice1.setForeground(new Color(243, 190, 98));
		lblPrice1.setBounds(145, 235, 72, 54);
		contentPane.add(lblPrice1);
		
		JLabel lblPrice2 = new JLabel("50฿");
		lblPrice2.setForeground(new Color(243, 190, 98));
		lblPrice2.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice2.setBounds(382, 235, 80, 54);
		contentPane.add(lblPrice2);
		
		JLabel lblPrice3 = new JLabel("50฿");
		lblPrice3.setForeground(new Color(243, 190, 98));
		lblPrice3.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice3.setBounds(625, 235, 74, 54);
		contentPane.add(lblPrice3);
		
		JLabel lblPrice4 = new JLabel("45฿");
		lblPrice4.setForeground(new Color(243, 190, 98));
		lblPrice4.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice4.setBounds(865, 235, 75, 54);
		contentPane.add(lblPrice4);
		
		JLabel lblPrice5 = new JLabel("50฿");
		lblPrice5.setForeground(new Color(243, 190, 98));
		lblPrice5.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice5.setBounds(138, 510, 80, 54);
		contentPane.add(lblPrice5);
		
		JLabel lblPrice6 = new JLabel("50฿");
		lblPrice6.setForeground(new Color(243, 190, 98));
		lblPrice6.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice6.setBounds(382, 510, 80, 54);
		contentPane.add(lblPrice6);
		
		JLabel lblPrice7 = new JLabel("45฿");
		lblPrice7.setForeground(new Color(243, 190, 98));
		lblPrice7.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice7.setBounds(626, 510, 74, 54);
		contentPane.add(lblPrice7);
		
		JLabel lblPrice8 = new JLabel("50฿");
		lblPrice8.setForeground(new Color(243, 190, 98));
		lblPrice8.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice8.setBounds(865, 510, 72, 54);
		contentPane.add(lblPrice8);
		
		JButton btnNext = new JButton("NEXT");
		final Menu menu = new Menu();
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnPork.isSelected()) {
					menu.selectMeat(1);
				}
				else if(rdbtnCrispyPork.isSelected()) {
					menu.selectMeat(2);
				}
				else if(rdbtnBeef.isSelected()) {
					menu.selectMeat(3);
				}
				else if(rdbtnChicken.isSelected()) {
					menu.selectMeat(4);
				}
				else if(rdbtnShrimp.isSelected()) {
					menu.selectMeat(5);
				}
				else if(rdbtnSquid.isSelected()) {
					menu.selectMeat(6);
				}
				else if(rdbtnFish.isSelected()) {
					menu.selectMeat(7);
					}
				else if(rdbtnSeafood.isSelected()) {
					menu.selectMeat(8);
				}
				menu.randomMenu();
				ChooseOption cp = new ChooseOption();
				cp.setVisible(true);
				cp.setLocationRelativeTo(null);
				cp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();

			}
		});
		
		btnNext.setForeground(Color.BLACK);
		btnNext.setFont(new Font("Gloucester MT Extra Condensed", Font.BOLD, 30));
		btnNext.setBorder(UIManager.getBorder("Menu.border"));
		btnNext.setBackground(new Color(255, 248, 229));
		btnNext.setBounds(899, 601, 122, 54);
		contentPane.add(btnNext);
		
		JLabel bg = new JLabel("");
		bg.setBounds(-7, -8, 1100, 700);
		bg.setIcon(new ImageIcon("D:\\JavaProject\\Background\\meatSelect.png"));
		contentPane.add(bg);
		
		
	}

}
