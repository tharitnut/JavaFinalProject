

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrderPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderPage frame = new OrderPage();
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
	public OrderPage() {
		setTitle("Rush Hour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\NotBackground\\rushhour.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOrder_1 = new JLabel("ORDER");
		lblOrder_1.setForeground(new Color(182, 35, 15));
		lblOrder_1.setFont(new Font("Cooper Black", Font.PLAIN, 70));
		lblOrder_1.setBounds(416, 160, 275, 54);
		contentPane.add(lblOrder_1);

		JLabel lblOrder = new JLabel("ORDER");
		lblOrder.setForeground(Color.BLACK);
		lblOrder.setFont(new Font("Cooper Black", Font.PLAIN, 70));
		lblOrder.setBounds(410, 160, 275, 54);
		contentPane.add(lblOrder);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Sitka Text", Font.BOLD, 37));
		lblMenu.setBounds(189, 242, 116, 84);
		contentPane.add(lblMenu);
		
		JLabel lblAdditional = new JLabel("Additional");
		lblAdditional.setFont(new Font("Sitka Text", Font.BOLD, 37));
		lblAdditional.setBounds(189, 336, 201, 84);
		contentPane.add(lblAdditional);
		
		JLabel lblGotMenu = new JLabel("คะน้าหมูกรอบ");
		lblGotMenu.setForeground(Color.RED);
		lblGotMenu.setFont(new Font("TH Kodchasal", Font.BOLD, 40));
		lblGotMenu.setBounds(416, 236, 363, 84);
		contentPane.add(lblGotMenu);
		
		JLabel lblGotAdd = new JLabel("ขอหมูกรอบนอกนุ่มใน");
		lblGotAdd.setForeground(Color.RED);
		lblGotAdd.setFont(new Font("TH Kodchasal", Font.BOLD, 40));
		lblGotAdd.setBounds(416, 330, 363, 84);
		contentPane.add(lblGotAdd);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Sitka Text", Font.BOLD, 37));
		lblPrice.setBounds(416, 419, 125, 84);
		contentPane.add(lblPrice);
		
		JLabel lblGotAdd_1 = new JLabel("50฿");
		lblGotAdd_1.setForeground(Color.RED);
		lblGotAdd_1.setFont(new Font("TH Kodchasal", Font.BOLD, 40));
		lblGotAdd_1.setBounds(536, 413, 74, 84);
		contentPane.add(lblGotAdd_1);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				QrPage qr = new QrPage();
				qr.setVisible(true);
				qr.setLocationRelativeTo(null);
				qr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnOrder.setForeground(new Color(255, 248, 229));
		btnOrder.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		btnOrder.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnOrder.setBorder(new CompoundBorder());
		btnOrder.setBackground(new Color(255, 179, 33));
		btnOrder.setBounds(592, 514, 197, 60);
		contentPane.add(btnOrder);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FirstPage main = new FirstPage();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
				main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnCancel.setForeground(new Color(255, 248, 229));
		btnCancel.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		btnCancel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnCancel.setBorder(new CompoundBorder());
		btnCancel.setBackground(new Color(255, 179, 33));
		btnCancel.setBounds(296, 513, 197, 60);
		contentPane.add(btnCancel);
		
		JLabel bg = new JLabel("");
		bg.setBounds(-7, -18, 1100, 700);
		bg.setIcon(new ImageIcon("D:\\JavaProject\\Background\\order.jpg"));
		contentPane.add(bg);

	}
}
