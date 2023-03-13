import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setTitle("Rush Hour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\NotBackground\\rushhour.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblError = new JLabel("No user found. Please try again or register.");
		lblError.setForeground(new Color(173, 63, 63));
		lblError.setBackground(new Color(255, 255, 255));
		lblError.setFont(new Font("Monospaced", Font.BOLD, 28));
		lblError.setBounds(335, 145, 751, 60);
		contentPane.add(lblError);
		lblError.setVisible(false);
		
		JLabel lblTitleLogin = new JLabel("LOGIN");
		lblTitleLogin.setFont(new Font("Cooper Black", Font.BOLD, 99));
		lblTitleLogin.setForeground(new Color(173, 63, 63));
		lblTitleLogin.setBounds(524, 48, 397, 112);
		contentPane.add(lblTitleLogin);		

		JLabel lblEnterUser = new JLabel("Please enter Username");
		lblEnterUser.setForeground(new Color(173, 63, 63));
		lblEnterUser.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblEnterUser.setBounds(479, 196, 408, 48);
		contentPane.add(lblEnterUser);

		final JTextField txtField = new JTextField();
		txtField.setBackground(new Color(241, 186, 92));
		txtField.setCaretColor(Color.RED);
		txtField.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		txtField.setBounds(479, 254, 498, 60);
		contentPane.add(txtField);
		
		final JLabel lblEnterPass = new JLabel("Please enter Password");
		lblEnterPass.setForeground(new Color(173, 63, 63));
		lblEnterPass.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblEnterPass.setBounds(479, 341, 408, 48);
		contentPane.add(lblEnterPass);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(241, 186, 92));
		passwordField.setBorder(null);
		passwordField.setCaretColor(Color.RED);
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		passwordField.setBounds(479, 399, 498, 60);
		contentPane.add(passwordField);
		
		
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(255, 248, 229));
		btnLogin.setForeground(Color.black);
		btnLogin.setBorder(UIManager.getBorder("Menu.border"));
		btnLogin.setFont(new Font("Gloucester MT Extra Condensed", Font.BOLD, 30));
		btnLogin.setBounds(772, 513, 122, 54);
		contentPane.add(btnLogin);
		btnLogin.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer cs = new Customer();
				try {
					if(!cs.isRegister(txtField.getText(),passwordField.getText())) {
						System.out.println("kuy");
						lblError.setVisible(true);
						txtField.setText("");
						passwordField.setText("");
					}
					else {
						ChooseMain cm = new ChooseMain();
						cm.setVisible(true);
						cm.setLocationRelativeTo(null);
						cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dispose();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				cs.setRegis(true);
			}
		});
		
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
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Gloucester MT Extra Condensed", Font.BOLD, 30));
		btnCancel.setBorder(UIManager.getBorder("Menu.border"));
		btnCancel.setBackground(new Color(255, 248, 229));
		btnCancel.setBounds(555, 513, 122, 54);
		contentPane.add(btnCancel);
		
		JLabel lblDontHaveAn = new JLabel("Don't have an account?");
		lblDontHaveAn.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 25));
		lblDontHaveAn.setBounds(468, 584, 350, 60);
		contentPane.add(lblDontHaveAn);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterPage rgp = new RegisterPage();
				rgp.setVisible(true);
				rgp.setLocationRelativeTo(null);
				rgp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		lblRegister.setForeground(new Color(173, 63, 63));
		lblRegister.setFont(new Font("UD Digi Kyokasho NP-B", Font.ITALIC, 30));
		lblRegister.setBounds(772, 589, 170, 48);
		contentPane.add(lblRegister);
		
		JLabel bg = new JLabel("");
		bg.setBounds(0, -26, 1100, 700);
		bg.setIcon(new ImageIcon("D:\\JavaProject\\Background\\login.jpg"));
		contentPane.add(bg);	
		
		
	}
}
