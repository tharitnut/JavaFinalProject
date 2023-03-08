import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.awt.ComponentOrientation;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPage extends JFrame {

	private JPanel contentPane;
	// Font BukhariScript;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
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
	public FirstPage() {

		/*
		 * try { BukhariScript = Font.createFont(Font.TRUETYPE_FONT, new
		 * File("Bukhari Script.ttf")).deriveFont(30f); GraphicsEnvironment ge =
		 * GraphicsEnvironment.getLocalGraphicsEnvironment();
		 * ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new
		 * File("Bukhari Script.ttf"))); } catch(IOException | FontFormatException e){ }
		 */

		setTitle("Rush Hour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\NotBackground\\rushhour.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Rush = new JLabel(" RUSH");
		Rush.setForeground(new Color(173, 63, 63));
		Rush.setBounds(157, -32, 340, 239);
		Rush.setFont(new Font("Bukhari Script", Font.PLAIN, 99));
		contentPane.add(Rush);

		JLabel Hour = new JLabel(" HOUR");
		Hour.setForeground(new Color(173, 63, 63));
		Hour.setFont(new Font("Bukhari Script", Font.PLAIN, 99));
		Hour.setBounds(608, -32, 340, 239);
		contentPane.add(Hour);

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBorder(new CompoundBorder());
		btnLogin.setBackground(new Color(255, 179, 33));
		btnLogin.setForeground(new Color(255, 248, 229));
		btnLogin.setFont(new Font("Cooper Black", Font.PLAIN, 58));
		btnLogin.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginPage lgp = new LoginPage();
				lgp.setVisible(true);
				lgp.setLocationRelativeTo(null);
				lgp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnLogin.setBounds(443, 217, 229, 76);
		contentPane.add(btnLogin);

		JButton btnReg = new JButton("REGISTER");
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPage rgp = new RegisterPage();
				rgp.setVisible(true);
				rgp.setLocationRelativeTo(null);
				rgp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnReg.setForeground(new Color(255, 248, 229));
		btnReg.setFont(new Font("Cooper Black", Font.PLAIN, 50));
		btnReg.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnReg.setBorder(new CompoundBorder());
		btnReg.setBackground(new Color(255, 179, 33));
		btnReg.setBounds(412, 360, 291, 65);
		contentPane.add(btnReg);

		JButton btnGuest = new JButton("GUEST");
		btnGuest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChooseMain cm = new ChooseMain();
				cm.setVisible(true);
				cm.setLocationRelativeTo(null);
				cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnGuest.setForeground(new Color(255, 248, 229));
		btnGuest.setFont(new Font("Cooper Black", Font.PLAIN, 58));
		btnGuest.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnGuest.setBorder(new CompoundBorder());
		btnGuest.setBackground(new Color(255, 179, 33));
		btnGuest.setBounds(443, 491, 229, 69);
		contentPane.add(btnGuest);

		JLabel lblLoginbg = new JLabel("");
		lblLoginbg.setIcon(new ImageIcon("D:\\JavaProject\\NotBackground\\buttton.jpg"));
		lblLoginbg.setBounds(382, 189, 352, 146);
		contentPane.add(lblLoginbg);

		JLabel lblRegisbg = new JLabel("");
		lblRegisbg.setIcon(new ImageIcon("D:\\JavaProject\\NotBackground\\buttton.jpg"));
		lblRegisbg.setBounds(382, 331, 352, 146);
		contentPane.add(lblRegisbg);

		JLabel lblGstbg = new JLabel("");
		lblGstbg.setIcon(new ImageIcon("D:\\\\JavaProject\\\\NotBackground\\\\buttton.jpg"));
		lblGstbg.setBounds(382, 476, 352, 116);
		contentPane.add(lblGstbg);

		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(new Color(255, 248, 229));
		btnExit.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		btnExit.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnExit.setBorder(new CompoundBorder());
		btnExit.setBackground(new Color(255, 179, 33));
		btnExit.setBounds(895, 601, 146, 44);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnExit);

		JLabel bg = new JLabel("");
		bg.setBounds(0, -26, 1100, 700);
		bg.setIcon(new ImageIcon("D:\\JavaProject\\Background\\firstPage.jpg"));
		contentPane.add(bg);

	}
}
