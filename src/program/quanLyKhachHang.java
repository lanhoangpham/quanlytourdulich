package program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class quanLyKhachHang extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenKh;
	private JTextField txtPhoneKh;
	private JTextField txtDOBKh;
	private JTextField txtCCCDkh;
	private JTextField txtAddrKh;
	private static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quanLyKhachHang frame = new quanLyKhachHang();
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
	public quanLyKhachHang() {
		setTitle("Quản lý khách hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 326, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Hệ thống");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Đăng xuất");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	login lg = new login();
            	
            	lg.show();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Quản lý hệ thống");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Quản lý nhân viên");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly nhan vien
            	quanLyNhanVien qlnv = new quanLyNhanVien();
            	
            	qlnv.show();
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Quản lý khách hàng");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close home page
            	dispose();
            	
            	//open quanlykhachang
            	quanLyKhachHang qlkh = new quanLyKhachHang();
            	
            	qlkh.show();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Quản lý hợp đồng");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly hop dong
            	quanLyHopDong qlhd = new quanLyHopDong();
            	
            	qlhd.show();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Quản lý đối tượng dịch vụ");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Quản lý Tour");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly tour
            	quanLyTour qltour = new quanLyTour();
            	
            	qltour.show();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Quản lý SubTour");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly sub tour
            	quanLySubTour qlsubtour = new quanLySubTour();
            	
            	qlsubtour.show();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Quản lý dịch vụ");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly dich vu
            	quanLyDichVu qldv = new quanLyDichVu();
            	
            	qldv.show();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JLabel lblNewLabel = new JLabel("Quản lý khách hàng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(230, 21, 256, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ và tên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(31, 67, 109, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Số điện thoại");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(20, 107, 109, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ngày sinh");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(31, 147, 109, 22);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("CCCD");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(363, 67, 109, 22);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Địa chỉ");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(373, 107, 109, 22);
		contentPane.add(lblNewLabel_1_4);
		
		txtTenKh = new JTextField();
		txtTenKh.setBounds(112, 64, 214, 32);
		contentPane.add(txtTenKh);
		txtTenKh.setColumns(10);
		
		txtPhoneKh = new JTextField();
		txtPhoneKh.setColumns(10);
		txtPhoneKh.setBounds(112, 104, 214, 32);
		contentPane.add(txtPhoneKh);
		
		txtDOBKh = new JTextField();
		txtDOBKh.setColumns(10);
		txtDOBKh.setBounds(112, 144, 214, 32);
		contentPane.add(txtDOBKh);
		
		txtCCCDkh = new JTextField();
		txtCCCDkh.setColumns(10);
		txtCCCDkh.setBounds(435, 64, 214, 32);
		contentPane.add(txtCCCDkh);
		
		txtAddrKh = new JTextField();
		txtAddrKh.setColumns(10);
		txtAddrKh.setBounds(435, 104, 214, 32);
		contentPane.add(txtAddrKh);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khachhang kh = new khachhang();
				
//				kh.setID(Integer.parseInt(txtMSKH.getText()));
				kh.setName(txtTenKh.getText());
				kh.setCCCD(txtCCCDkh.getText());
				kh.setPhone(txtPhoneKh.getText());
				kh.setAddr(txtAddrKh.getText());
				kh.setdob(txtDOBKh.getText());
				
				
				
				connect.insertKhachHang(kh);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAllKhachHang());

			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(560, 218, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khachhang kh = new khachhang();
				
				kh.setName(txtTenKh.getText());
				
				connect.deleteKhachHang(kh);
				
				showData(connect.findAllKhachHang());
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(560, 252, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khachhang kh= new khachhang();
				
				kh.setName(txtTenKh.getText());
				
				List<khachhang>listKhachhang = new ArrayList<>();
				
				listKhachhang = connect.findKhachHangByName(kh);
				
				showData(listKhachhang);
			}
		});
		btnFind.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFind.setBounds(560, 286, 89, 23);
		contentPane.add(btnFind);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khachhang kh= new khachhang();
				
				kh.setName(txtTenKh.getText());
				kh.setCCCD(txtCCCDkh.getText());
				kh.setAddr(txtAddrKh.getText());
				kh.setPhone(txtPhoneKh.getText());
				kh.setdob(txtDOBKh.getText());
				
				connect.updateKhachHang(kh);
				
				JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
				
				showData(connect.findAllKhachHang());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(560, 320, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRefesh = new JButton("Refresh");
		btnRefesh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTenKh.setText("");
				txtCCCDkh.setText("");
				txtAddrKh.setText("");
				txtDOBKh.setText("");
				txtPhoneKh.setText("");
			}
		});
		btnRefesh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRefesh.setBounds(560, 354, 89, 23);
		contentPane.add(btnRefesh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 199, 518, 178);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"MSKH", "H\u1ECD t\u00EAn ", "CCCD", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "\u0110\u1ECBa ch\u1EC9", "Ng\u00E0y sinh"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setMinWidth(100);
		table.getColumnModel().getColumn(2).setMinWidth(70);
		table.getColumnModel().getColumn(3).setMinWidth(60);
		scrollPane.setViewportView(table);
		
		showData(connect.findAllKhachHang());
		
	}
	
	public void showData(List<khachhang>khachhangl) {
		List<khachhang>listkhachhang = new ArrayList<>();
		listkhachhang = khachhangl;
		DefaultTableModel tableModel;
		table.getModel();
		tableModel = (DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		listkhachhang.forEach((kh)->{
			tableModel.addRow(new Object [] {
				kh.getID(), 
				kh.getName(), 
				kh.getCCCD(),
				kh.getPhone(),
				kh.getAddr(),
				kh.getdob()
			});
		});
	}
}
