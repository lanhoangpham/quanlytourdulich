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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class quanLyTour extends JFrame {

	private JPanel contentPane;
	private JTextField txtDiemdiTour;
	private JTextField txtDiemDenTour;
	private JTextField txtSoNguoiTour;
	private JTextField txtDSDiemDenTour;
	private JTextField txtGiaNguoiLonTour;
	private JTextField txtGiaTreEmTour;
	private static JTable table;
	private JTextField txtMSTour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quanLyTour frame = new quanLyTour();
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
	public quanLyTour() {
		setTitle("Quản lý Tour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 515);
		contentPane = 
				new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản lý tours");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(275, 33, 176, 37);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 349, 22);
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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit ");
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
		
		JLabel lblNewLabel_1 = new JLabel("Điểm đi");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 69, 63, 32);
		contentPane.add(lblNewLabel_1);
		
		txtDiemdiTour = new JTextField();
		txtDiemdiTour.setColumns(10);
		txtDiemdiTour.setBounds(103, 75, 181, 25);
		contentPane.add(txtDiemdiTour);
		
		JLabel lblNewLabel_1_1 = new JLabel("Điểm đến");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(30, 112, 63, 32);
		contentPane.add(lblNewLabel_1_1);
		
		txtDiemDenTour = new JTextField();
		txtDiemDenTour.setColumns(10);
		txtDiemDenTour.setBounds(103, 118, 181, 25);
		contentPane.add(txtDiemDenTour);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Số người tham gia");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(325, 69, 114, 32);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtSoNguoiTour = new JTextField();
		txtSoNguoiTour.setColumns(10);
		txtSoNguoiTour.setBounds(449, 75, 181, 25);
		contentPane.add(txtSoNguoiTour);
		
		txtDSDiemDenTour = new JTextField();
		txtDSDiemDenTour.setColumns(10);
		txtDSDiemDenTour.setBounds(449, 118, 181, 25);
		contentPane.add(txtDSDiemDenTour);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Danh sách điểm đến");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(314, 112, 125, 32);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Giá người lớn");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3.setBounds(10, 162, 83, 32);
		contentPane.add(lblNewLabel_1_1_3);
		
		txtGiaNguoiLonTour = new JTextField();
		txtGiaNguoiLonTour.setColumns(10);
		txtGiaNguoiLonTour.setBounds(103, 168, 181, 25);
		contentPane.add(txtGiaNguoiLonTour);
		
		txtGiaTreEmTour = new JTextField();
		txtGiaTreEmTour.setColumns(10);
		txtGiaTreEmTour.setBounds(449, 170, 181, 25);
		contentPane.add(txtGiaTreEmTour);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Giá trẻ em");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1.setBounds(349, 162, 90, 32);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 247, 636, 166);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 Tour", "\u0110i\u1EC3m \u0111i", "\u0110i\u1EC3m \u0111\u1EBFn", "S\u1ED1 ng\u01B0\u1EDDi", "C\u00E1c \u0111i\u1EC3m \u0111\u1EBFn", "Gi\u00E1 tr\u1EBB ng\u01B0\u1EDDi l\u1EDBn", "Gi\u00E1 tr\u1EBB em"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setPreferredWidth(25);
		table.getColumnModel().getColumn(1).setMinWidth(25);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(2).setMinWidth(40);
		table.getColumnModel().getColumn(3).setPreferredWidth(15);
		table.getColumnModel().getColumn(3).setMinWidth(8);
		table.getColumnModel().getColumn(4).setMinWidth(6);
		table.getColumnModel().getColumn(5).setPreferredWidth(40);
		table.getColumnModel().getColumn(5).setMinWidth(40);
		table.getColumnModel().getColumn(6).setPreferredWidth(40);
		table.getColumnModel().getColumn(6).setMinWidth(40);
		scrollPane.setViewportView(table);
		
		showData(connect.findAllTours());
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tours nv = new tours();
				
				nv.setDiemDi(txtDiemdiTour.getText());
				nv.setDiemDen(txtDiemDenTour.getText());
				nv.setsonguoithamgia(Integer.parseInt(txtSoNguoiTour.getText()));
				nv.setDanhSachDiemDen(txtDSDiemDenTour.getText());
				nv.setgianguoilon(Integer.parseInt(txtGiaNguoiLonTour.getText()));
				nv.setGiatreem(Integer.parseInt(txtGiaTreEmTour.getText()));
				
				
				connect.insertTour(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAllTours());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(25, 424, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tours nv = new tours();
				
				nv.setID(Integer.parseInt(txtMSTour.getText()));
				
				connect.deleteTour(nv);
				
				showData(connect.findAllTours());
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(137, 425, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tours nv = new tours();
				
				nv.setID(Integer.parseInt(txtMSTour.getText()));
				nv.setDiemDi(txtDiemdiTour.getText());
				nv.setDiemDen(txtDiemDenTour.getText());
				nv.setsonguoithamgia(Integer.parseInt(txtSoNguoiTour.getText()));
				nv.setDanhSachDiemDen(txtDSDiemDenTour.getText());
				nv.setgianguoilon(Integer.parseInt(txtGiaNguoiLonTour.getText()));
				nv.setGiatreem(Integer.parseInt(txtGiaTreEmTour.getText()));
				
				connect.updateTour(nv);
				
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				
				showData(connect.findAllTours());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(275, 424, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRefesh = new JButton("Refresh");
		btnRefesh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRefesh.setBounds(286, 213, 84, 23);
		contentPane.add(btnRefesh);
		
		txtMSTour = new JTextField();
		txtMSTour.setColumns(10);
		txtMSTour.setBounds(553, 424, 90, 25);
		contentPane.add(txtMSTour);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("MS Tour");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_4.setBounds(480, 418, 63, 32);
		contentPane.add(lblNewLabel_1_1_4);
		
		
	}

	public void showData(List<tours>tourL) {
		List<tours>listTours = new ArrayList<>();
		listTours = tourL;
		DefaultTableModel tableModel;
		table.getModel();
		tableModel = (DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		listTours.forEach((nv)->{
			tableModel.addRow(new Object [] {
				nv.getID(),
				nv.getDiemDi(), 
				nv.getDiemDen(), 
				nv.getSOLuongNGuoi(),
				nv.getDSDiemDen(),
				nv.getGiaNguoiLon(),
				nv.getGiaTreEm()
			});
		});
	}
	
}
