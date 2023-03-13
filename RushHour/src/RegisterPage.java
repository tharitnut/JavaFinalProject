import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordConfirm;
	private JTextField textFieldUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setTitle("Rush Hour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\NotBackground\\rushhour.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitleRegis = new JLabel("REGISTER");
		lblTitleRegis.setFont(new Font("Cooper Black", Font.BOLD, 99));
		lblTitleRegis.setForeground(new Color(173, 63, 63));
		lblTitleRegis.setBounds(415, 10, 661, 112);
		contentPane.add(lblTitleRegis);	
		
		JLabel lblEnterUser = new JLabel("Please enter Username");
		lblEnterUser.setForeground(new Color(173, 63, 63));
		lblEnterUser.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblEnterUser.setBounds(476, 110, 319, 29);
		contentPane.add(lblEnterUser);
		
		final JLabel lblTryUser = new JLabel("Please input the right format");
		lblTryUser.setForeground(new Color(173, 63, 63));
		lblTryUser.setFont(new Font("Monospaced", Font.BOLD, 14));
		lblTryUser.setBounds(817, 118, 259, 19);
		contentPane.add(lblTryUser);
		lblTryUser.setVisible(false);
		
		
		JLabel lblUserDetail = new JLabel("(6 - 12 Characters or Numbers Only)");
		lblUserDetail.setForeground(new Color(173, 63, 63));
		lblUserDetail.setFont(new Font("Monospaced", Font.BOLD, 16));
		lblUserDetail.setBounds(476, 132, 418, 29);
		contentPane.add(lblUserDetail);
		
		textFieldUser = new JTextField();
		textFieldUser.setBackground(new Color(241, 186, 92));
		textFieldUser.setBorder(null);
		textFieldUser.setCaretColor(Color.RED);
		textFieldUser.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		textFieldUser.setBounds(486, 171, 459, 48);
		contentPane.add(textFieldUser);
		textFieldUser.setColumns(10);
		
		JLabel lblEnterPass = new JLabel("Please enter Password");
		lblEnterPass.setForeground(new Color(173, 63, 63));
		lblEnterPass.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblEnterPass.setBounds(476, 244, 408, 29);
		contentPane.add(lblEnterPass);
		
		final JLabel lblTryPass = new JLabel("Please input the right format");
		lblTryPass.setForeground(new Color(173, 63, 63));
		lblTryPass.setFont(new Font("Monospaced", Font.BOLD, 14));
		lblTryPass.setBounds(817, 253, 259, 19);
		contentPane.add(lblTryPass);
		lblTryPass.setVisible(false);
		
		
		JLabel lblPassword = new JLabel("(At Least 7 Character, At Least 1 Uppercase, Lowercase and Number)");
		lblPassword.setForeground(new Color(173, 63, 63));
		lblPassword.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblPassword.setBounds(476, 269, 600, 29);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(241, 186, 92));
		passwordField.setBorder(null);
		passwordField.setCaretColor(Color.RED);
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		passwordField.setBounds(486, 308, 459, 48);
		contentPane.add(passwordField);
		
		JLabel lblConfirmPass = new JLabel("Confirm Password");
		lblConfirmPass.setForeground(new Color(173, 63, 63));
		lblConfirmPass.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblConfirmPass.setBounds(476, 384, 408, 48);
		contentPane.add(lblConfirmPass);
		
		passwordConfirm = new JPasswordField();
		passwordConfirm.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		passwordConfirm.setCaretColor(Color.RED);
		passwordConfirm.setBorder(null);
		passwordConfirm.setBackground(new Color(241, 186, 92));
		passwordConfirm.setBounds(486, 448, 459, 48);
		contentPane.add(passwordConfirm);
		
		
		
		
		JButton btnSent = new JButton("CONFIRM");
		
		btnSent.setBackground(new Color(255, 248, 229));
		btnSent.setForeground(Color.black);
		btnSent.setBorder(UIManager.getBorder("Menu.border"));
		btnSent.setFont(new Font("Gloucester MT Extra Condensed", Font.BOLD, 28));
		btnSent.setBounds(736, 540, 120, 48);
		contentPane.add(btnSent);
		btnSent.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textFieldUser.getText();
				String pass = passwordField.getText().trim();
				String passCon = passwordConfirm.getText().trim();
				CheckUser chkUser = new CheckUser();
				CheckPassword chkPass = new CheckPassword();
					if(!chkUser.chkUser(user)||textFieldUser.getText().equals("")) {
						lblTryUser.setVisible(true);
						textFieldUser.setText("");
					}	
					if(!chkPass.chkPass(pass)||passwordField.getText().equals("")) {
						lblTryPass.setVisible(true);
						passwordField.setText("");
						passwordConfirm.setText("");
					}
					if(!chkPass.chkPass(pass)||!chkPass.chkCon(passCon)) {
						passwordConfirm.setText("");
					}
				if(chkUser.chkUser(user)&&chkPass.chkPass(pass)&&chkPass.chkCon(passCon)) {
					lblTryUser.setVisible(false);
					lblTryPass.setVisible(false);
					Customer cs= new Customer();
					cs.setUser(textFieldUser.getText().trim());
					cs.setPass(pass);
					cs.register();
					LoginPage lgp = new LoginPage();
					lgp.setVisible(true);
					lgp.setLocationRelativeTo(null);
					lgp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					dispose();
				}
				
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
		btnCancel.setBounds(535, 540, 110, 48);
		contentPane.add(btnCancel);
		
		JLabel lblHaveAc = new JLabel("Have an account?");
		lblHaveAc.setFont(new Font("UD Digi Kyokasho N-B", Font.PLAIN, 25));
		lblHaveAc.setBounds(518, 598, 234, 60);
		contentPane.add(lblHaveAc);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginPage lgp = new LoginPage();
				lgp.setVisible(true);
				lgp.setLocationRelativeTo(null);
				lgp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		lblLogin.setForeground(new Color(173, 63, 63));
		lblLogin.setFont(new Font("UD Digi Kyokasho NP-B", Font.ITALIC, 30));
		lblLogin.setBounds(739, 603, 123, 48);
		contentPane.add(lblLogin);
		
		JLabel bg = new JLabel("");
		bg.setBounds(0, -26, 1100, 700);
		bg.setIcon(new ImageIcon("D:\\JavaProject\\Background\\regis.jpg"));
		contentPane.add(bg);
		
		
		
	}
	
	public void addPlaceholderStyle (JTextField textField) {
		Font font = textField.getFont();
		font = font.deriveFont(Font.ITALIC);
		textField.setFont(font);
		textField.setForeground(Color.red);
	}
	
	public void removePlaceholderStyle (JTextField textField) {
		Font font = textField.getFont();
		font = font.deriveFont(Font.PLAIN|Font.BOLD);
		textField.setFont(font);
		textField.setForeground(Color.black);
	}
	
	private void txtUserFocusGained(java.awt.event.FocusEvent evt) {
		if(textFieldUser.getText().equals("Please input the right format")) {
			textFieldUser.setText(null);
			textFieldUser.requestFocus();
			removePlaceholderStyle(textFieldUser);
		}
	}
	
	private void passwordFocusGained(java.awt.event.FocusEvent evt) {
		if(passwordField.getText().equals("Please input the right format")) {
			passwordField.setText(null);
			passwordField.requestFocus();
			passwordField.setEchoChar('●');
			removePlaceholderStyle(passwordField);
		}
	}
	
	private void passwordConfirmFocusGained(java.awt.event.FocusEvent evt) {
		if(passwordConfirm.getText().equals("Password doesn't match")) {
			passwordConfirm.setText(null);
			passwordConfirm.requestFocus();
			passwordConfirm.setEchoChar('●');
			removePlaceholderStyle(passwordConfirm);
		}
	}
}
