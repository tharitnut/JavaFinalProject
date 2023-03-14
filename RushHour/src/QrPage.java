
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QrPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QrPage frame = new QrPage();
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
	public QrPage() {
		setTitle("Rush Hour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\NotBackground\\rushhour.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\JavaProject\\NotBackground\\QrCode.png"));
		lblNewLabel.setBounds(293, 130, 500, 469);
		contentPane.add(lblNewLabel);

		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FirstPage main = new FirstPage();
				main.setVisible(true);
				main.setLocationRelativeTo(null);
				main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
		});
		btnLogout.setBorderPainted(false);
		btnLogout.setForeground(new Color(255, 248, 229));
		btnLogout.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		btnLogout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		btnLogout.setBorder(new CompoundBorder());
		btnLogout.setBackground(new Color(182, 35, 15));
		btnLogout.setBounds(768, 60, 197, 60);
		contentPane.add(btnLogout);

		JLabel bg = new JLabel("");
		bg.setBounds(-7, -18, 1100, 700);
		bg.setIcon(new ImageIcon("D:\\JavaProject\\Background\\Qr.jpg"));
		contentPane.add(bg);
	}

}
