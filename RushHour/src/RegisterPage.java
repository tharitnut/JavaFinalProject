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
		lblEnterUser.setBounds(476, 113, 408, 48);
		contentPane.add(lblEnterUser);
		
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
		lblEnterPass.setBounds(476, 244, 408, 48);
		contentPane.add(lblEnterPass);
		
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
		btnSent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginPage lgp = new LoginPage();
				lgp.setVisible(true);
				lgp.setLocationRelativeTo(null);
				lgp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnSent.setBackground(new Color(255, 248, 229));
		btnSent.setForeground(Color.black);
		btnSent.setBorder(UIManager.getBorder("Menu.border"));
		btnSent.setFont(new Font("Gloucester MT Extra Condensed", Font.BOLD, 28));
		btnSent.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean chkUser = false;
				boolean chkPass = false;
				boolean passCon = false;
				String pass = String.copyValueOf(passwordField.getPassword());
				while(chkUser||chkPass||passCon) {
					String user = textFieldUser.getText().trim();
					while(user.length()<6||user.length()>12) {
						textFieldUser = new JTextField();
					}
					user = user.toLowerCase();
					chkUser = true;
					for(int i =0;i<user.length();i++) {
						if((user.charAt(i)<'a'||user.charAt(i)>'z')||(user.charAt(i)<'0'||user.charAt(i)>'9')) {
							chkUser=false;
						}
					}
					pass = pass.trim();
					int upperCount = 0, lowerCount = 0, numCount = 0;
					while(pass.length()<8||upperCount<1||lowerCount<1||numCount<1) {
						
					}
					chkPass = true;
					for(int i = 0 ;i<pass.length();i++) {
						upperCount = 0;
						lowerCount = 0;
						numCount = 0;
						if (user.charAt(i) >= 'A' && user.charAt(i) <= 'Z') upperCount++;
						if (user.charAt(i) >= 'a' && user.charAt(i) <= 'z') lowerCount++;
						if (user.charAt(i) >= '0' && user.charAt(i) <= '9') numCount++;
						if(upperCount<1||lowerCount<1||numCount<1) {
							chkPass=false;
						}
					}
					String passConfirm = String.copyValueOf(passwordConfirm.getPassword());
					if(pass.equals(passConfirm)) {
						passCon=true;
					}
				}
				Customer cs= new Customer();
				cs.setUser(textFieldUser.getText().trim());
				cs.setPass(pass);
				cs.register();
				FirstPage main = new FirstPage();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
				main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnSent.setBounds(736, 540, 120, 48);
		contentPane.add(btnSent);
		
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
	
	public boolean userChk() {
		boolean chk = true;
		String user = textFieldUser.getText();
		while(user.length()<6||user.length()>12) {
			textFieldUser = new JTextField();
		}
		user = user.toLowerCase();
		for(int i =0;i<user.length();i++) {
			if((user.charAt(i)<='a'||user.charAt(i)>='z')||(user.charAt(i)<='0'||user.charAt(i)>='9')) {
				chk=false;
			}
		}
		return chk;
	}
	
	public boolean passConfirm(java.awt.event.ActionEvent evt) {
		boolean chk = false;
		String pass = passwordField.getPassword().toString().trim();
		String passConfirm = passwordConfirm.getPassword().toString().trim();
		if(pass.equals(passConfirm)) {
			chk=true;
		}
		return chk;
	}
	
	
}
