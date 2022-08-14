package program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class dangki extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenDN;
	private JTextField txtMK;
	private JTextField txtmsnv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dangki frame = new dangki();
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
	public dangki() {
		setTitle("Đăng kí tài khoản nhân viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblngK = new JLabel("Đăng kí");
		lblngK.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblngK.setBounds(185, 11, 220, 29);
		contentPane.add(lblngK);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên đăng nhập");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(50, 56, 79, 22);
		contentPane.add(lblNewLabel_1_1);
		
		txtTenDN = new JTextField();
		txtTenDN.setColumns(10);
		txtTenDN.setBounds(164, 51, 159, 27);
		contentPane.add(txtTenDN);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mật khẩu");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(50, 98, 79, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtMK = new JTextField();
		txtMK.setColumns(10);
		txtMK.setBounds(164, 96, 159, 27);
		contentPane.add(txtMK);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("MSNV");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(50, 148, 79, 22);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtmsnv = new JTextField();
		txtmsnv.setColumns(10);
		txtmsnv.setBounds(164, 149, 159, 27);
		contentPane.add(txtmsnv);
		
		JButton btnNewButton_3 = new JButton("Đăng kí");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminAcc nv = new adminAcc();
				
				nv.setMsnv(Integer.parseInt(txtmsnv.getText()));
				nv.setTenDangnhap(txtTenDN.getText());
				nv.setMk(txtMK.getText());
				
				connect.insertTaiKhoan(nv);
				
				JOptionPane.showMessageDialog(null, "Đăng kí thành công!");
				
//				showData(connect.findAlldichvu());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(203, 205, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 71, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Hệ thống");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
            	
            	login lg = new login();
            	
            	lg.show();
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Đăng nhập");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				login lg = new login();
				
				lg.show();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
	}
}
