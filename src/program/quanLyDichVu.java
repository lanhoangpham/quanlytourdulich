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

public class quanLyDichVu extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenDv;
	private JTextField txtDonGiaDV;
	private JTextField txtMotaDV;
	private JTextField txtmsdv;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quanLyDichVu frame = new quanLyDichVu();
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
	public quanLyDichVu() {
		setTitle("Quản lý dịch vụ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 339, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Hệ thống");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Đăng xuất");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
            	
            	login lg = new login();
            	
            	lg.show();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_2);
		
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
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Quản lý hợp đồng");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly hop dong
            	quanLyHopDong qlhd = new quanLyHopDong();
            	
            	qlhd.show();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Quản lý đối tượng dịch vụ");
		menuBar.add(mnNewMenu_2);
		
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
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Quản lý subtour");
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
		
		JLabel lblNewLabel = new JLabel("Quản lý dịch vụ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(246, 33, 220, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên dịch vụ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(33, 83, 81, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Đơn giá");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(33, 133, 81, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mô tả dich vụ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(33, 186, 135, 32);
		contentPane.add(lblNewLabel_1_2);
		
		txtTenDv = new JTextField();
		txtTenDv.setColumns(10);
		txtTenDv.setBounds(135, 88, 298, 32);
		contentPane.add(txtTenDv);
		
		txtDonGiaDV = new JTextField();
		txtDonGiaDV.setColumns(10);
		txtDonGiaDV.setBounds(135, 141, 298, 32);
		contentPane.add(txtDonGiaDV);
		
		txtMotaDV = new JTextField();
		txtMotaDV.setColumns(10);
		txtMotaDV.setBounds(135, 194, 298, 32);
		contentPane.add(txtMotaDV);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dichvu nv = new dichvu();
				
				nv.setTenDV(txtTenDv.getText());
				nv.setDonGia(Float.parseFloat(txtDonGiaDV.getText()));
				nv.setMoTa(txtMotaDV.getText());
				
				connect.insertDichVu(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAlldichvu());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(484, 89, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dichvu nv = new dichvu();
				
				nv.setId(Integer.parseInt(txtmsdv.getText()));
				
				connect.deleteDichVu(nv);
				
				showData(connect.findAlldichvu());
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(589, 89, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dichvu nv = new dichvu();
				
				nv.setId(Integer.parseInt(txtmsdv.getText()));
				nv.setTenDV(txtTenDv.getText());
				nv.setDonGia(Float.parseFloat(txtDonGiaDV.getText()));
				nv.setMoTa(txtMotaDV.getText());
				
				connect.updateDichVu(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAlldichvu());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(484, 139, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRefesh = new JButton("Refresh");
		btnRefesh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRefesh.setBounds(589, 139, 89, 23);
		contentPane.add(btnRefesh);
		
		txtmsdv = new JTextField();
		txtmsdv.setColumns(10);
		txtmsdv.setBounds(589, 188, 89, 32);
		contentPane.add(txtmsdv);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("MSDV");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(492, 186, 81, 32);
		contentPane.add(lblNewLabel_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 249, 645, 214);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"MSDV", " T\u00EAn d\u1ECBch v\u1EE5", "\u0110\u01A1n gi\u00E1", " M\u00F4 t\u1EA3 d\u1ECBch v\u1EE5"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(0).setMinWidth(7);
		scrollPane.setViewportView(table);
		showData(connect.findAlldichvu());
	}
	
	public void showData(List<dichvu>dichvul) {
		List<dichvu>listdichvu = new ArrayList<>();
		listdichvu = dichvul;
		DefaultTableModel tableModel;
		table.getModel();
		tableModel = (DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		listdichvu.forEach((nv)->{
			tableModel.addRow(new Object [] {
				nv.getId(), 
				nv.getTenDV(), 
				nv.getDonGia(),
				nv.getMoTa()
			});
		});
	}
}
