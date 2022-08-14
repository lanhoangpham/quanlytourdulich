package program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
//import java.sql.Statement;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField edtUsername;
	private JPasswordField edtPassword;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label2;
	private JLabel label1;
	private JButton loginbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Đăng nhập");
		getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 71, 207, 33);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 132, 207, 33);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 80, 115, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMtKhu.setBounds(12, 141, 115, 14);
		getContentPane().add(lblMtKhu);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.setBounds(184, 195, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Đăng nhập");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setBounds(164, 11, 133, 39);
		getContentPane().add(lblNewLabel_1);
		setTitle("Đăng nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		edtUsername = new JTextField();
		edtUsername.setBounds(115, 60, 179, 33);
		contentPane.add(edtUsername);
		edtUsername.setColumns(10);
		
		edtPassword = new JPasswordField();
		edtPassword.setBounds(115, 111, 179, 33);
		contentPane.add(edtPassword);
		
		JButton loginbtn;
		loginbtn = new JButton("Đăng nhập");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = edtUsername.getText();
				String pass = edtPassword.getText();
				try {
					Connection connection = connect.getConnection();
					PreparedStatement st = connection.prepareStatement("Select tendangnhap, matkhau from adminaccount where tendangnhap=? and matkhau=?");
					st.setString(1, username);
                    st.setString(2, pass);
                    
                    ResultSet rs = st.executeQuery();
                    
                    if ( rs.next()) {
                    	
                    	//close login page
                    	dispose();
                    	
                    	homepage hpage = new homepage();
                    	
                    	hpage.show();
                    }
                    else {
                    	JOptionPane.showMessageDialog(loginbtn, "Sai tài khoản");
                    	edtPassword.setText("");
                    	edtUsername.setText("");
                    }
                    		
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				

			}
		});
		loginbtn.setBounds(150, 172, 109, 23);
		contentPane.add(loginbtn);
		
		JLabel label1;
		label1 = new JLabel("Tên đăng nhập");
		
		label1.setBounds(24, 69, 81, 14);
		contentPane.add(label1);
		
		JLabel label2;
		label2 = new JLabel("Mật khẩu");
		label2.setBounds(34, 120, 81, 14);
		contentPane.add(label2);
		
		JLabel lblngNhp = new JLabel("Đăng nhập");
		lblngNhp.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblngNhp.setBounds(149, 11, 176, 37);
		contentPane.add(lblngNhp);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Hệ thống");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Đăng kí");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				dangki lg = new dangki();
				lg.show();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
	}
}
