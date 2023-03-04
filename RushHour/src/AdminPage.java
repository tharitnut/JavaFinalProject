
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setTitle("Rush Hour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaProject\\Not Background\\rushhour.jpg"));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("ORDER HISTORY");
		lblTitle.setForeground(new Color(182, 35, 15));
		lblTitle.setFont(new Font("Cooper Black", Font.PLAIN, 70));
		lblTitle.setBounds(168, 73, 829, 54);
		contentPane.add(lblTitle);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 173, 938, 315);
		getContentPane().add(scrollPane);
		JTable table = new JTable();
		table.setFont(new Font("TH Chakra Petch", Font.BOLD, 30));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ORDER", "Unit", "Price"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(146);
		scrollPane.setViewportView(table);
		table.getTableHeader().setFont(new Font("Monospaced", Font.BOLD, 35));
		table.getTableHeader().setForeground(Color.WHITE);
		table.getTableHeader().setBackground(new Color(182, 35, 15));
		table.setForeground(Color.black);
		table.setRowHeight(85);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);

		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBorder(new CompoundBorder());
		btnLogout.setBackground(new Color(255, 179, 33));
		btnLogout.setForeground(new Color(255, 248, 229));
		btnLogout.setFont(new Font("Cooper Black", Font.PLAIN, 40));
		btnLogout.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
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
		btnLogout.setBounds(795, 542, 197, 60);
		contentPane.add(btnLogout);

		JLabel bg = new JLabel("");
		bg.setBounds(-7, -8, 1100, 700);
		bg.setIcon(new ImageIcon("D:\\JavaProject\\Background\\admin.jpg"));
		contentPane.add(bg);
	}
}
