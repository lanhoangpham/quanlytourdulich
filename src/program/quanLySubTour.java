package program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class quanLySubTour extends JFrame {

	private JPanel contentPane;
	private JTextField txtmsst;
	private JTextField txtTenST;
	private JTextField txtsonguoilon;
	private JTextField txtSotreEm;
	private JTextField txtTroVe;
	private JTextField txtxuatphat;
	private JTextField txtmstour;
	private JTextField txtmshd;
	private JTextField txttongtien;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quanLySubTour frame = new quanLySubTour();
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
	public quanLySubTour() {
		setTitle("Quản lý SubTour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQunLSubtour = new JLabel("Quản lý subtour");
		lblQunLSubtour.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblQunLSubtour.setBounds(423, 22, 220, 29);
		contentPane.add(lblQunLSubtour);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 322, 22);
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
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Quản lý subtour");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly sub tour
            	quanLySubTour qlsubtour = new quanLySubTour();
            	
            	qlsubtour.show();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Quản lý dịch vụ");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly dich vu
            	quanLyDichVu qldv = new quanLyDichVu();
            	
            	qldv.show();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JLabel lblNewLabel_1 = new JLabel("MSST");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(730, 178, 79, 22);
		contentPane.add(lblNewLabel_1);
		
		txtmsst = new JTextField();
		txtmsst.setColumns(10);
		txtmsst.setBounds(800, 176, 66, 27);
		contentPane.add(txtmsst);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên subtour");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(30, 79, 79, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Số người lớn");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_2.setBounds(30, 155, 79, 22);
		contentPane.add(lblNewLabel_1_2);
		
		txtTenST = new JTextField();
		txtTenST.setColumns(10);
		txtTenST.setBounds(128, 77, 159, 27);
		contentPane.add(txtTenST);
		
		txtsonguoilon = new JTextField();
		txtsonguoilon.setColumns(10);
		txtsonguoilon.setBounds(128, 153, 159, 27);
		contentPane.add(txtsonguoilon);
		
		txtSotreEm = new JTextField();
		txtSotreEm.setColumns(10);
		txtSotreEm.setBounds(128, 191, 159, 27);
		contentPane.add(txtSotreEm);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Số trẻ em");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_2_1.setBounds(30, 193, 79, 22);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Thời gian xuất phát");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_3.setBounds(328, 77, 93, 22);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Thời gian về");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_4.setBounds(342, 115, 79, 22);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("MS Tour");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_5.setBounds(342, 153, 79, 22);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("MSHD");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_6.setBounds(30, 112, 79, 22);
		contentPane.add(lblNewLabel_1_6);
		
		txtTroVe = new JTextField();
		txtTroVe.setColumns(10);
		txtTroVe.setBounds(457, 112, 159, 27);
		contentPane.add(txtTroVe);
		
		txtxuatphat = new JTextField();
		txtxuatphat.setColumns(10);
		txtxuatphat.setBounds(457, 74, 159, 27);
		contentPane.add(txtxuatphat);
		
		txtmstour = new JTextField();
		txtmstour.setColumns(10);
		txtmstour.setBounds(457, 153, 159, 27);
		contentPane.add(txtmstour);
		
		txtmshd = new JTextField();
		txtmshd.setColumns(10);
		txtmshd.setBounds(128, 115, 159, 27);
		contentPane.add(txtmshd);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subtour nv = new subtour();
				
				
				nv.setTenST(txtTenST.getText());
				nv.setSonguoilon(Integer.parseInt(txtsonguoilon.getText()));
				nv.setSotreem(Integer.parseInt(txtSotreEm.getText()));
				nv.setNgaygioxuatphat(txtxuatphat.getText());
				nv.setNgaygiove(txtTroVe.getText());
				nv.setTongtien(Float.parseFloat(txttongtien.getText()));
				nv.setMtour(Integer.parseInt(txtmstour.getText()));
				nv.setMshd(Integer.parseInt(txtmshd.getText()));
				
			
				
				connect.insertsubtour(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAllsubtour());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(701, 78, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Tổng tiền");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_2_1_1.setBounds(342, 197, 79, 22);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		txttongtien = new JTextField();
		txttongtien.setColumns(10);
		txttongtien.setBounds(457, 194, 159, 27);
		contentPane.add(txttongtien);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subtour nv = new subtour();
				
				nv.setMsst(Integer.parseInt(txtmsst.getText()));
				
				connect.deletesubtour(nv);
				
				showData(connect.findAllsubtour());
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(817, 79, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subtour nv = new subtour();
				
				nv.setMsst(Integer.parseInt(txtmsst.getText()));
				
				nv.setTenST(txtTenST.getText());
				nv.setSonguoilon(Integer.parseInt(txtsonguoilon.getText()));
				nv.setSotreem(Integer.parseInt(txtSotreEm.getText()));
				nv.setNgaygioxuatphat(txtxuatphat.getText());
				nv.setNgaygiove(txtTroVe.getText());
				nv.setTongtien(Float.parseFloat(txttongtien.getText()));
				nv.setMtour(Integer.parseInt(txtmstour.getText()));
				nv.setMshd(Integer.parseInt(txtmshd.getText()));
				
				
				
				connect.updatesubtour(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAllsubtour());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(701, 117, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRefesh = new JButton("Refresh");
		btnRefesh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRefesh.setBounds(817, 116, 89, 23);
		contentPane.add(btnRefesh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 249, 924, 303);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"MSST", "T\u00EAn subtour", "S\u1ED1 ng\u01B0\u1EDDi l\u1EDBn", "S\u1ED1 tr\u1EBB em", "Xu\u1EA5t ph\u00E1t", "Tr\u1EDD v\u1EC1", "T\u1ED5ng ti\u1EC1n", "M\u00E3 tour", "MSHD"
			}
		));
		scrollPane.setViewportView(table);
		showData(connect.findAllsubtour());
	}
	
	public void showData(List<subtour>subtourl) {
		List<subtour>listsubtour = new ArrayList<>();
		listsubtour = subtourl;
		DefaultTableModel tableModel;
		table.getModel();
		tableModel = (DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		listsubtour.forEach((nv)->{
			tableModel.addRow(new Object [] {
				nv.getMsst(), 
				nv.getTenST(), 
				nv.getSonguoilon(),
				nv.getSotreem(),
				nv.getNgaygioxuatphat(),
				nv.getNgaygiove(),
				nv.getTongtien(),
				nv.getMtour(),
				nv.getMshd(),
				
			});
		});
	}
}
