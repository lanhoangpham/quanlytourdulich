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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class quanLyHopDong extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenHD;
	private JTextField txtNgayKi;
	private JTextField txtmsnv;
	private JTextField txtmskh;
	private JTextField txtpttt;
	private JTextField txtqlki;
	private JTextField txtdieukhoan;
	private JTextField txtsolanthanhtoan;
	private JTextField txttongtien;
	private JTextField txtmshd;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quanLyHopDong frame = new quanLyHopDong();
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
	public quanLyHopDong() {
		setTitle("Quản lý hợp đồng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1107, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 334, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Hệ thống");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Đăng xuất");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	login lg = new login();
            	
            	lg.show();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Quản lý hệ thống");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Quản lý nhân viên");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly nhan vien
            	quanLyNhanVien qlnv = new quanLyNhanVien();
            	
            	qlnv.show();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Quản lý khách hàng");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close home page
            	dispose();
            	
            	//open quanlykhachang
            	quanLyKhachHang qlkh = new quanLyKhachHang();
            	
            	qlkh.show();
			}
			
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Quản lý hợp đồng");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly hop dong
            	quanLyHopDong qlhd = new quanLyHopDong();
            	
            	qlhd.show();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnQunLi = new JMenu("Quản lý đối tượng dịch vụ");
		menuBar.add(mnQunLi);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Quản lý tour");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly tour
            	quanLyTour qltour = new quanLyTour();
            	
            	qltour.show();
			}
		});
		mnQunLi.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Quản lý Subtour");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly sub tour
            	quanLySubTour qlsubtour = new quanLySubTour();
            	
            	qlsubtour.show();
			}
		});
		mnQunLi.add(mntmNewMenuItem_6);
		
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
		mnQunLi.add(mntmNewMenuItem_7);
		
		JLabel lblQunLHp = new JLabel("Quản lý hợp đồng");
		lblQunLHp.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblQunLHp.setBounds(477, 26, 220, 29);
		contentPane.add(lblQunLHp);
		
		JLabel lblNewLabel_1 = new JLabel("Tên hợp đồng");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(22, 75, 79, 22);
		contentPane.add(lblNewLabel_1);
		
		txtTenHD = new JTextField();
		txtTenHD.setColumns(10);
		txtTenHD.setBounds(123, 73, 159, 27);
		contentPane.add(txtTenHD);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày kí");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(37, 118, 64, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("MSNV");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_2.setBounds(37, 161, 64, 22);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("MSKH");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3.setBounds(37, 207, 64, 22);
		contentPane.add(lblNewLabel_1_3);
		
		txtNgayKi = new JTextField();
		txtNgayKi.setColumns(10);
		txtNgayKi.setBounds(123, 119, 159, 27);
		contentPane.add(txtNgayKi);
		
		txtmsnv = new JTextField();
		txtmsnv.setColumns(10);
		txtmsnv.setBounds(123, 162, 159, 27);
		contentPane.add(txtmsnv);
		
		txtmskh = new JTextField();
		txtmskh.setColumns(10);
		txtmskh.setBounds(123, 207, 159, 27);
		contentPane.add(txtmskh);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Phương thức thanh toán");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3_1.setBounds(298, 73, 132, 22);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Quản lý chịu trách nghiệm");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3_2.setBounds(298, 122, 146, 22);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Điều khoản hợp đồng");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3_3.setBounds(298, 165, 132, 22);
		contentPane.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Số lần thanh toán");
		lblNewLabel_1_3_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3_4.setBounds(298, 211, 132, 22);
		contentPane.add(lblNewLabel_1_3_4);
		
		txtpttt = new JTextField();
		txtpttt.setColumns(10);
		txtpttt.setBounds(467, 73, 159, 27);
		contentPane.add(txtpttt);
		
		txtqlki = new JTextField();
		txtqlki.setColumns(10);
		txtqlki.setBounds(467, 116, 159, 27);
		contentPane.add(txtqlki);
		
		txtdieukhoan = new JTextField();
		txtdieukhoan.setColumns(10);
		txtdieukhoan.setBounds(467, 159, 159, 27);
		contentPane.add(txtdieukhoan);
		
		txtsolanthanhtoan = new JTextField();
		txtsolanthanhtoan.setColumns(10);
		txtsolanthanhtoan.setBounds(467, 205, 159, 27);
		contentPane.add(txtsolanthanhtoan);
		
		txttongtien = new JTextField();
		txttongtien.setColumns(10);
		txttongtien.setBounds(771, 73, 173, 27);
		contentPane.add(txttongtien);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Tổng tiền");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3_1_1.setBounds(697, 75, 64, 22);
		contentPane.add(lblNewLabel_1_3_1_1);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hopdong nv = new hopdong();
				
				nv.setTenHD(txtTenHD.getText());
				nv.setNgayKi(txtNgayKi.getText());
				nv.setTongTien(Float.parseFloat(txttongtien.getText()));
				nv.setPhuongthucthanhtoan(txtpttt.getText());
				nv.setQlchiutrachnghiem(txtqlki.getText());
				nv.setDieuKhoanHD(txtdieukhoan.getText());
				nv.setSolanthanhtoan(Integer.parseInt(txtsolanthanhtoan.getText()));
				nv.setMsnv(Integer.parseInt(txtmsnv.getText()));
				nv.setMskh(Integer.parseInt(txtmskh.getText()));
				
				
				connect.insertHopDong(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAllhopdong());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(756, 117, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hopdong nv = new hopdong();
				
				nv.setId(Integer.parseInt(txtmshd.getText()));
				
				connect.deleteHopDong(nv);
				
				showData(connect.findAllhopdong());
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(855, 117, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hopdong nv = new hopdong();
				
				nv.setId(Integer.parseInt(txtmshd.getText()));
				
				nv.setTenHD(txtTenHD.getText());
				nv.setNgayKi(txtNgayKi.getText());
				nv.setTongTien(Float.parseFloat(txttongtien.getText()));
				nv.setPhuongthucthanhtoan(txtpttt.getText());
				nv.setQlchiutrachnghiem(txtqlki.getText());
				nv.setDieuKhoanHD(txtdieukhoan.getText());
				nv.setSolanthanhtoan(Integer.parseInt(txtsolanthanhtoan.getText()));
				nv.setMsnv(Integer.parseInt(txtmsnv.getText()));
				nv.setMskh(Integer.parseInt(txtmskh.getText()));
				
				
				connect.updatehopdong(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAllhopdong());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(756, 160, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRefesh = new JButton("Refresh");
		btnRefesh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRefesh.setBounds(855, 160, 89, 23);
		contentPane.add(btnRefesh);
		
		JLabel lblNewLabel_1_3_4_1 = new JLabel("MSHD");
		lblNewLabel_1_3_4_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3_4_1.setBounds(788, 207, 43, 22);
		contentPane.add(lblNewLabel_1_3_4_1);
		
		txtmshd = new JTextField();
		txtmshd.setColumns(10);
		txtmshd.setBounds(841, 205, 103, 27);
		contentPane.add(txtmshd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 284, 1015, 333);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"MSHD", "T\u00EAn H\u1EE3p \u0111\u1ED3ng", "Ng\u00E0y k\u00ED", "T\u1ED5ng ti\u1EC1n", "Ph\u01B0\u01A1ng th\u1EE9c thanh to\u00E1n", "Qu\u1EA3n l\u00FD k\u00ED", "\u0110i\u1EC1u kho\u1EA3n", "S\u1ED1 l\u1EA7n thanh to\u00E1n", "MSNV", "MSKH"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setPreferredWidth(15);
		table.getColumnModel().getColumn(2).setPreferredWidth(15);
		table.getColumnModel().getColumn(3).setPreferredWidth(15);
		table.getColumnModel().getColumn(4).setPreferredWidth(30);
		table.getColumnModel().getColumn(4).setMinWidth(30);
		table.getColumnModel().getColumn(5).setPreferredWidth(20);
		table.getColumnModel().getColumn(5).setMinWidth(20);
		table.getColumnModel().getColumn(6).setPreferredWidth(15);
		table.getColumnModel().getColumn(7).setPreferredWidth(15);
		table.getColumnModel().getColumn(8).setPreferredWidth(15);
		table.getColumnModel().getColumn(9).setPreferredWidth(15);
		scrollPane.setViewportView(table);
		
		showData(connect.findAllhopdong());
	}
	
	public void showData(List<hopdong>hopdongl) {
		List<hopdong>listhopdong = new ArrayList<>();
		listhopdong = hopdongl;
		DefaultTableModel tableModel;
		table.getModel();
		tableModel = (DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		listhopdong.forEach((nv)->{
			tableModel.addRow(new Object [] {
				nv.getId(), 
				nv.getTenHD(), 
				nv.getNgayKi(),
				nv.getTongTien(),
				nv.getPhuongthucthanhtoan(),
				nv.getQlchiutrachnghiem(),
				nv.getDieuKhoanHD(),
				nv.getSolanthanhtoan(),
				nv.getMsnv(),
				nv.getMskh()
			});
		});
	}

}
