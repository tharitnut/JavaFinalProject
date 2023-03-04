import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\Not Background\\rushhour.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("PICK UP YOUR MEAT!!");
		lblTitle.setForeground(new Color(182, 35, 15));
		lblTitle.setFont(new Font("Cooper Black", Font.PLAIN, 70));
		lblTitle.setBounds(128, 49, 829, 54);
		contentPane.add(lblTitle);
		
		JLabel lbl1bg = new JLabel("");
		lbl1bg.setIcon(new ImageIcon("D:\\JavaProject\\Not Background\\pork.jpg"));
		lbl1bg.setBounds(80, 129, 184, 176);
		contentPane.add(lbl1bg);
		
		JLabel lbl2bg = new JLabel("");
		lbl2bg.setIcon(new ImageIcon("D:\\JavaProject\\Not Background\\crispyP.jpg"));
		lbl2bg.setBounds(325, 129, 184, 183);
		contentPane.add(lbl2bg);

		JLabel lbl3bg = new JLabel("");
		lbl3bg.setIcon(new ImageIcon("D:\\JavaProject\\Not Background\\beef.jpg"));
		lbl3bg.setBounds(565, 129, 184, 176);
		contentPane.add(lbl3bg);
		
		JLabel lbl4bg = new JLabel("");
		lbl4bg.setIcon(new ImageIcon("D:\\JavaProject\\Not Background\\chicken.jpg"));
		lbl4bg.setBounds(813, 129, 184, 176);
		contentPane.add(lbl4bg);
		
		JLabel lbl5bg = new JLabel("");
		lbl5bg.setIcon(new ImageIcon("D:\\JavaProject\\Not Background\\shrimp.jpg"));
		lbl5bg.setBounds(92, 401, 184, 176);
		contentPane.add(lbl5bg);
		
		JLabel lbl6bg = new JLabel("");
		lbl6bg.setIcon(new ImageIcon("D:\\JavaProject\\Not Background\\squid.jpg"));
		lbl6bg.setBounds(333, 401, 176, 172);
		contentPane.add(lbl6bg);
		
		JLabel lbl7bg = new JLabel("");
		lbl7bg.setIcon(new ImageIcon("D:\\JavaProject\\Not Background\\fish.jpg"));
		lbl7bg.setBounds(565, 386, 184, 194);
		contentPane.add(lbl7bg);
		
		JLabel lbl8bg = new JLabel("");
		lbl8bg.setIcon(new ImageIcon("D:\\JavaProject\\Not Background\\seafood.jpg"));
		lbl8bg.setBounds(814, 392, 194, 188);
		contentPane.add(lbl8bg);
		
		JLabel lblChoice1 = new JLabel("หมู");
		lblChoice1.setForeground(new Color(255, 248, 229));
		lblChoice1.setFont(new Font("TH K2D July8", Font.BOLD, 42));
		lblChoice1.setBounds(154, 308, 53, 54);
		contentPane.add(lblChoice1);

		JLabel lblChoice2 = new JLabel("หมูกรอบ");
		lblChoice2.setForeground(new Color(255, 248, 229));
		lblChoice2.setFont(new Font("TH K2D July8", Font.BOLD, 42));
		lblChoice2.setBounds(360, 308, 132, 54);
		contentPane.add(lblChoice2);
		
		JLabel lblChoice3 = new JLabel("เนื้อ");
		lblChoice3.setForeground(new Color(255, 248, 229));
		lblChoice3.setFont(new Font("TH K2D July8", Font.BOLD, 42));
		lblChoice3.setBounds(631, 308, 53, 54);
		contentPane.add(lblChoice3);
		
		JLabel lblChoice4 = new JLabel("ไก่");
		lblChoice4.setForeground(new Color(255, 248, 229));
		lblChoice4.setFont(new Font("TH K2D July8", Font.BOLD, 42));
		lblChoice4.setBounds(885, 308, 46, 54);
		contentPane.add(lblChoice4);
		
		JLabel lblChoice5 = new JLabel("กุ้ง");
		lblChoice5.setForeground(new Color(255, 248, 229));
		lblChoice5.setFont(new Font("TH K2D July8", Font.BOLD, 42));
		lblChoice5.setBounds(165, 576, 53, 54);
		contentPane.add(lblChoice5);
		
		JLabel lblChoice6 = new JLabel("ปลาหมึก");
		lblChoice6.setForeground(new Color(255, 248, 229));
		lblChoice6.setFont(new Font("TH K2D July8", Font.BOLD, 42));
		lblChoice6.setBounds(365, 576, 122, 54);
		contentPane.add(lblChoice6);
		
		JLabel lblChoice7 = new JLabel("ปลา");
		lblChoice7.setForeground(new Color(255, 248, 229));
		lblChoice7.setFont(new Font("TH K2D July8", Font.BOLD, 42));
		lblChoice7.setBounds(631, 576, 69, 54);
		contentPane.add(lblChoice7);
		
		JLabel lblChoice8 = new JLabel("ทะเลรวม");
		lblChoice8.setForeground(new Color(255, 248, 229));
		lblChoice8.setFont(new Font("TH K2D July8", Font.BOLD, 42));
		lblChoice8.setBounds(850, 576, 132, 54);
		contentPane.add(lblChoice8);

		JLabel lblPrice1 = new JLabel("45฿");
		lblPrice1.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice1.setForeground(new Color(243, 190, 98));
		lblPrice1.setBounds(154, 337, 80, 54);
		contentPane.add(lblPrice1);
		
		JLabel lblPrice2 = new JLabel("50฿");
		lblPrice2.setForeground(new Color(243, 190, 98));
		lblPrice2.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice2.setBounds(393, 337, 80, 54);
		contentPane.add(lblPrice2);
		
		JLabel lblPrice3 = new JLabel("50฿");
		lblPrice3.setForeground(new Color(243, 190, 98));
		lblPrice3.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice3.setBounds(633, 337, 74, 54);
		contentPane.add(lblPrice3);
		
		JLabel lblPrice4 = new JLabel("45฿");
		lblPrice4.setForeground(new Color(243, 190, 98));
		lblPrice4.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice4.setBounds(882, 337, 75, 54);
		contentPane.add(lblPrice4);
		
		JLabel lblPrice5 = new JLabel("50฿");
		lblPrice5.setForeground(new Color(243, 190, 98));
		lblPrice5.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice5.setBounds(154, 607, 80, 54);
		contentPane.add(lblPrice5);
		
		JLabel lblPrice6 = new JLabel("50฿");
		lblPrice6.setForeground(new Color(243, 190, 98));
		lblPrice6.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice6.setBounds(400, 607, 80, 54);
		contentPane.add(lblPrice6);
		
		JLabel lblPrice7 = new JLabel("45฿");
		lblPrice7.setForeground(new Color(243, 190, 98));
		lblPrice7.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice7.setBounds(640, 607, 74, 54);
		contentPane.add(lblPrice7);
		
		JLabel lblPrice8 = new JLabel("50฿");
		lblPrice8.setForeground(new Color(243, 190, 98));
		lblPrice8.setFont(new Font("TH Mali Grade 6", Font.BOLD, 45));
		lblPrice8.setBounds(885, 607, 72, 54);
		contentPane.add(lblPrice8);
		
		JLabel bg = new JLabel("");
		bg.setBounds(-7, -8, 1100, 700);
		bg.setIcon(new ImageIcon("D:\\JavaProject\\Background\\meatSelect.jpg"));
		contentPane.add(bg);

		
	}
}
