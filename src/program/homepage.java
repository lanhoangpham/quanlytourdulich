package program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setTitle("Homepage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 328, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Hệ thồng");
		menuBar.add(mnNewMenu);
		
		JMenuItem logoutbtn = new JMenuItem("Đăng xuất");
		logoutbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	login lg = new login();
            	
            	lg.show();
			}
		});
		mnNewMenu.add(logoutbtn);
		
		JMenuItem exitHomepage = new JMenuItem("Exit");
		mnNewMenu.add(exitHomepage);
		
		JMenu mnQunL = new JMenu("Quản lý hệ thống");
		menuBar.add(mnQunL);
		
		JMenuItem quanLyNhanVienDirect = new JMenuItem("Quản lý nhân viên");
		quanLyNhanVienDirect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly nhan vien
            	quanLyNhanVien qlnv = new quanLyNhanVien();
            	
            	qlnv.show();
			}
		});
		mnQunL.add(quanLyNhanVienDirect);
		
		JMenuItem quanLyKhachHangDirect = new JMenuItem("Quản lý khách hàng");
		quanLyKhachHangDirect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close home page
            	dispose();
            	
            	//open quanlykhachang
            	quanLyKhachHang qlkh = new quanLyKhachHang();
            	
            	qlkh.show();
			}
		});
		mnQunL.add(quanLyKhachHangDirect);
		
		JMenuItem quanLyHopDongDirect = new JMenuItem("Quản lý hợp đồng");
		quanLyHopDongDirect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly hop dong
            	quanLyHopDong qlhd = new quanLyHopDong();
            	
            	qlhd.show();
			}
		});
		mnQunL.add(quanLyHopDongDirect);
		
		JMenu mnNewMenu_1 = new JMenu("Quản lý đối tượng dịch vụ");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem quanLyTourDirect = new JMenuItem("Quản lý Tour");
		quanLyTourDirect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly tour
            	quanLyTour qltour = new quanLyTour();
            	
            	qltour.show();
			}
		});
		mnNewMenu_1.add(quanLyTourDirect);
		
		JMenuItem quanLySubTourDirect = new JMenuItem("Quản lý Subtour");
		quanLySubTourDirect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly sub tour
            	quanLySubTour qlsubtour = new quanLySubTour();
            	
            	qlsubtour.show();
			}
		});
		mnNewMenu_1.add(quanLySubTourDirect);
		
		JMenuItem quanLyDichVuDirect = new JMenuItem("Quản lý dịch vụ");
		quanLyDichVuDirect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close homepage
            	dispose();
            	
            	//open quan ly dich vu
            	quanLyDichVu qldv = new quanLyDichVu();
            	
            	qldv.show();
			}
		});
		mnNewMenu_1.add(quanLyDichVuDirect);
	}
}
