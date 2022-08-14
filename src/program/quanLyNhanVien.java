package program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class quanLyNhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenNV;
	private JTextField txtCVPTNV;
	private JTextField txtSdtNV;
	private static JTable table;
	private JTextField txtmsnv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quanLyNhanVien frame = new quanLyNhanVien();
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
	public quanLyNhanVien() {
		setTitle("Quản lý nhân viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản lý nhân viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(273, 23, 243, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ tên nhân viên");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(40, 91, 142, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Công việc phụ trách");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(40, 143, 142, 32);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Số điên thoại");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(40, 192, 142, 32);
		contentPane.add(lblNewLabel_1_3);
		
		txtTenNV = new JTextField();
		txtTenNV.setBounds(192, 93, 298, 32);
		contentPane.add(txtTenNV);
		txtTenNV.setColumns(10);
		
		txtCVPTNV = new JTextField();
		txtCVPTNV.setColumns(10);
		txtCVPTNV.setBounds(192, 145, 298, 32);
		contentPane.add(txtCVPTNV);
		
		txtSdtNV = new JTextField();
		txtSdtNV.setColumns(10);
		txtSdtNV.setBounds(192, 194, 298, 32);
		contentPane.add(txtSdtNV);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nhanvien nv = new nhanvien();
				
				nv.setName(txtTenNV.getText());
				nv.setCongViecPhuTrach(txtCVPTNV.getText());
				nv.setSDT(txtSdtNV.getText());
				
				connect.updateNhanVien(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAllNhanVien());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(604, 192, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nhanvien nv = new nhanvien();
				nv.setName(txtTenNV.getText());
				
				List<nhanvien>listNhanvien = new ArrayList<>();
				
				listNhanvien = connect.findNhanVienByName(nv);
				
				showData(listNhanvien);
				
				
			}
		});
		btnFind.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFind.setBounds(604, 149, 89, 23);
		contentPane.add(btnFind);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nhanvien nv = new nhanvien();
				
				nv.setMSNV(Integer.parseInt(txtmsnv.getText()));
				
				connect.deleteNhanVien(nv);
				
				showData(connect.findAllNhanVien());
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(604, 109, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nhanvien nv = new nhanvien();
				
				nv.setName(txtTenNV.getText());
				nv.setCongViecPhuTrach(txtCVPTNV.getText());
				nv.setSDT(txtSdtNV.getText());
				
				connect.insertNhanVien(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAllNhanVien());
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(604, 69, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(130, 259, 457, 188);
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
				"MSNV", "H\u1ECD v\u00E0 t\u00EAn", "C\u00F4ng vi\u1EC7c ph\u1EE5 tr\u00E1ch", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setMinWidth(100);
		table.getColumnModel().getColumn(2).setMinWidth(100);
		table.getColumnModel().getColumn(3).setMinWidth(100);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		showData(connect.findAllNhanVien());
		
		JButton btnRefesh = new JButton("Refresh");
		btnRefesh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTenNV.setText("");
				txtCVPTNV.setText("");
				txtSdtNV.setText("");
			}
		});
		btnRefesh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRefesh.setBounds(604, 235, 89, 23);
		contentPane.add(btnRefesh);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 404, 22);
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
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit ");
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
		
		JMenu mnNewMenu_2 = new JMenu("Quản lý đói tượng dịch vụ");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Quản lý Tour\r\n");
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
		
		JLabel lblNewLabel_1_3_1 = new JLabel("MSNV");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(599, 280, 72, 32);
		contentPane.add(lblNewLabel_1_3_1);
		
		txtmsnv = new JTextField();
		txtmsnv.setColumns(10);
		txtmsnv.setBounds(654, 282, 89, 32);
		contentPane.add(txtmsnv);
	}
	
	public void showData(List<nhanvien>nhanvienl) {
		List<nhanvien>listNhanvien = new ArrayList<>();
		listNhanvien = nhanvienl;
		DefaultTableModel tableModel;
		table.getModel();
		tableModel = (DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		listNhanvien.forEach((nv)->{
			tableModel.addRow(new Object [] {
				nv.getMSNV(), 
				nv.getName(), 
				nv.getCongViecPhuTrach(),
				nv.getSDT()
			});
		});
	}
}
