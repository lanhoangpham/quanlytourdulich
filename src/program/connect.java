package program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class connect {
	
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/quanlytourdulich?useSSL=false";
		String user = "root";
		String password = "123456";
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void main(String[] args) {
		login log = new login();
		log.show();
	}
	
	public static List<nhanvien>findAllNhanVien()
	{
		List<nhanvien>nhanvienList = new ArrayList<>();
		
		String query = "Select * from nhanvien";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				nhanvien st = new nhanvien(rs.getInt("msnv"), rs.getString("hoten_nv"),
						rs.getString("congviecphutrach"), rs.getString("sdt"));
				nhanvienList.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return nhanvienList;
	}
	
	public static void insertNhanVien (nhanvien nv) {
		String query = "insert into nhanvien (hoten_nv, congviecphutrach, sdt) values (?,?,?)";
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			
			pstmt.setString(1, nv.getName());
			pstmt.setString(2, nv.getCongViecPhuTrach());
			pstmt.setString(3, nv.getSDT());
			
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public static void deleteNhanVien(nhanvien nv) {
		
		String query = "delete from nhanvien where msnv ='"+nv.getMSNV()+"'";
		deleteAdminAcc(nv.getMSNV());
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static void updateNhanVien(nhanvien nv) {
		String query = "update nhanvien set hoten_nv = ?,congviecphutrach=?,sdt=? where hoten_nv='"+nv.getName()+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, nv.getName());
			pstmt.setString(2, nv.getCongViecPhuTrach() );
			pstmt.setString(3, nv.getSDT());
			
			//update
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static List<nhanvien>findNhanVienByName( nhanvien nv) {
		List<nhanvien>nhanvienl = new ArrayList<>();
		
		String query = "Select * from nhanvien where nhanvien.hoten_nv='"+nv.getName()+"'";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				nhanvien st = new nhanvien(rs.getInt("msnv"), rs.getString("hoten_nv"),
						rs.getString("congviecphutrach"), rs.getString("sdt"));
				nhanvienl.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return nhanvienl;
	}
	
	/*---------------------------------khach hang------------------------------*/
	
	public static List<khachhang>findKhachHangByName( khachhang kh) {
		List<khachhang>khachhangl = new ArrayList<>();
		
		String query = "Select * from khachhang where khachhang.hoten_kh='"+kh.getName()+"'";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				khachhang st = new khachhang(rs.getInt("mskh"), rs.getString("hoten_kh"),
						rs.getString("cccd"), rs.getString("diachi"), rs.getString("sdt"), rs.getString("ntns"));
				khachhangl.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return khachhangl; 
	}

	public static void insertKhachHang (khachhang kh) {
		String query = "insert into khachhang (hoten_kh, cccd, sdt, diachi, ntns) values (?,?,?,?,?)";
		 //
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);

//			pstmt.setInt(1, kh.getID());
			pstmt.setString(1, kh.getName());
			pstmt.setString(2, kh.getCCCD() );
			pstmt.setString(3, kh.getPhone());
			pstmt.setString(4, kh.getAddr());
			pstmt.setString(5, kh.getdob());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void deleteKhachHang(khachhang kh) {
		String query = "delete from khachhang where hoten_kh ='"+kh.getName()+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public static void updateKhachHang(khachhang kh) {
		String query = "update khachhang set hoten_kh = ?, cccd = ?, sdt = ?, diachi = ?, ntns = ? where hoten_kh = '"+kh.getName()+"'";		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, kh.getName());
			pstmt.setString(2, kh.getCCCD() );
			pstmt.setString(3, kh.getPhone());
			pstmt.setString(4, kh.getAddr());
			pstmt.setString(5, kh.getdob());
			
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static List<khachhang>findAllKhachHang(){
		List<khachhang>khachhangList = new ArrayList<>();
		
		String query = "Select * from khachhang";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				khachhang st = new khachhang(rs.getInt("mskh"), rs.getString("hoten_kh"),
						rs.getString("cccd"), rs.getString("sdt"),rs.getString("diachi"), rs.getString("ntns"));
				khachhangList.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return khachhangList;
		
	}
	
	/*-------------------------------------quan ly tour--------------------------------------*/ 
	/*
	 * public static List<khachhang>findKhachHangByName( khachhang kh) {
		List<khachhang>khachhangl = new ArrayList<>();
		
		String query = "Select * from khachhang where khachhang.hoten_kh='"+kh.getName()+"'";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				khachhang st = new khachhang(rs.getInt("mskh"), rs.getString("hoten_kh"),
						rs.getString("cccd"), rs.getString("diachi"), rs.getString("sdt"), rs.getString("ntns"));
				khachhangl.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return khachhangl; 
	}
	 * */
	
	public static List<tours>findTourID( tours t) {
		List<tours>toursL = new ArrayList<>();
		
		String query = "Select * from tours where tours.mstour='"+t.getID()+"'";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				new tours(rs.getInt("mstour"), rs.getString("diemDi"),
						rs.getString("diemDen"), rs.getInt("songuoithamgia"),rs.getString("danhsachdiemden"), rs.getInt("giatrennguoilon"), 
						rs.getInt("giatrentreem"));
				toursL.add(t);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return toursL; 
	}
	
	
	public static void insertTour (tours t) {
		String query = "insert into tours (diemDi, diemDen,songuoithamgia, danhsachdiemden, giatrennguoilon, giatrentreem) values (?,?,?,?,?,?)";
		 //
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);

//			pstmt.setInt(1, kh.getID());
			pstmt.setString(1, t.getDiemDi());
			pstmt.setString(2, t.getDiemDen() );
			pstmt.setInt(3, t.getSOLuongNGuoi());
			pstmt.setString(4, t.getDSDiemDen());
			pstmt.setInt(5, t.getGiaNguoiLon());
			pstmt.setInt(6, t.getGiaTreEm());;
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public static void deleteTour(tours t) {
		String query = "delete from tours where mstour ='"+t.getID()+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	
	public static void updateTour(tours t) {
		String query = "update tours set diemDi = ?,  diemDen= ?, songuoithamgia = ?, danhsachdiemden = ?, giatrennguoilon = ?, giatrentreem =  ?"
				+ " where mstour = '"+t.getID()+"'";		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			
			pstmt.setString(1, t.getDiemDi());
			pstmt.setString(2, t.getDiemDen() );
			pstmt.setInt(3, t.getSOLuongNGuoi());
			pstmt.setString(4, t.getDSDiemDen());
			pstmt.setInt(5, t.getGiaNguoiLon());
			pstmt.setInt(6, t.getGiaTreEm());
			
			
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public static List<tours>findAllTours(){
		List<tours>tousList = new ArrayList<>();
		
		String query = "select * from quanlytourdulich.tours";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			/*	nv.getDiemDi(), 
				nv.getDiemDen(), 
				nv.getSOLuongNGuoi(),
				nv.getDSDiemDen(),
				nv.getGiaNguoiLon(),
				nv.getGiaTreEm()*/
			while(rs.next()) {
				tours t = new tours(rs.getInt("mstour"), rs.getString("diemDi"),
						rs.getString("diemDen"), rs.getInt("songuoithamgia"),rs.getString("danhsachdiemden"), rs.getInt("giatrennguoilon"), 
						rs.getInt("giatrentreem"));
				
				tousList.add(t);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return tousList;
	}
	
	
	/*-----------------------------------------------quan ly dich vu-----------------------------------------*/
	
	public static void updateDichVu(dichvu t) {
		String query = "update dichvu set tenDV = ?,  donGia= ?, motaDV = ? where msdv = '"+t.getId()+"'";		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			
			pstmt.setString(1, t.getTenDV());
			pstmt.setFloat(2, t.getDonGia() );
			pstmt.setString(3, t.getMoTa());
			
			
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void deleteDichVu(dichvu t) {
		String query = "delete from dichvu where msdv ='"+t.getId()+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void insertDichVu (dichvu t) {
		String query = "insert into dichvu (tenDV, donGia,motaDV) values (?,?,?)";
		 //
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);

//			pstmt.setInt(1, kh.getID());
			pstmt.setString(1, t.getTenDV());
			pstmt.setFloat(2, t.getDonGia() );
			pstmt.setString(3, t.getMoTa());
			
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static List<dichvu>findAlldichvu(){
		List<dichvu>dichvuList = new ArrayList<>();
		
		String query = "select * from quanlytourdulich.dichvu";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			/*	nv.getDiemDi(), 
				nv.getDiemDen(), 
				nv.getSOLuongNGuoi(),
				nv.getDSDiemDen(),
				nv.getGiaNguoiLon(),
				nv.getGiaTreEm()*/
			while(rs.next()) {
				dichvu t = new dichvu(rs.getInt("msdv"), rs.getString("tenDV"),
						rs.getFloat("donGia"), rs.getString("motaDv"));
				
				dichvuList.add(t);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return dichvuList;
	}
	
	/*-----------------------------------------quan ly hop dong-----------------------------------*/
	public static void updatehopdong(hopdong t) {
		String query = "update hopdong set tenHD = ?, ngayKi =?,tongTienHD=?,phuongthucthanhtoan=?, qlchiutrachnghiem=?,dieukhoanHD=?, solanthanhtoan =?, msnv=?,mskh=? where mshd = '"+t.getId()+"'";		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			
			pstmt.setString(1, t.getTenHD());
			pstmt.setString(2, t.getNgayKi() );
			pstmt.setFloat(3, t.getTongTien());
			pstmt.setString(4, t.getPhuongthucthanhtoan());
			pstmt.setString(5, t.getQlchiutrachnghiem());
			pstmt.setString(6, t.getDieuKhoanHD());
			pstmt.setInt(7, t.getSolanthanhtoan());
			pstmt.setInt(8, t.getMsnv());
			pstmt.setInt(9, t.getMskh());
			
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void deleteHopDong(hopdong t) {
		String query = "delete from hopdong where mshd ='"+t.getId()+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void insertHopDong (hopdong t) {
		String query = "insert into hopdong (tenHD, ngayKi,tongTienHD,phuongthucthanhtoan, qlchiutrachnghiem,dieukhoanHD, solanthanhtoan , msnv,mskh ) values (?,?,?, ?,?,?,?,?,? )";
		 //
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);

//			pstmt.setInt(1, kh.getID());
			pstmt.setString(1, t.getTenHD());
			pstmt.setString(2, t.getNgayKi() );
			pstmt.setFloat(3, t.getTongTien());
			pstmt.setString(4, t.getPhuongthucthanhtoan());
			pstmt.setString(5, t.getQlchiutrachnghiem());
			pstmt.setString(6, t.getDieuKhoanHD());
			pstmt.setInt(7, t.getSolanthanhtoan());
			pstmt.setInt(8, t.getMsnv());
			pstmt.setInt(9, t.getMskh());
			
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	public static List<hopdong>findAllhopdong(){
		List<hopdong>hopdongList = new ArrayList<>();
		
		String query = "select * from quanlytourdulich.hopdong";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				hopdong t = new hopdong(rs.getInt("mshd"), rs.getString("tenHD"),
						rs.getString("ngayKi"), rs.getFloat("tongTienHD"),rs.getString("phuongthucthanhtoan"), rs.getString("qlchiutrachnghiem"),
						rs.getString("dieukhoanHD"), rs.getInt("solanthanhtoan"), rs.getInt("msnv"), rs.getInt("mskh"));
				
				hopdongList.add(t);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return hopdongList;
	}
	
	/*-------------------------------------------------------quản lý subtour-------------------------------------------------------*/
	public static void updatesubtour(subtour t) {
		String query = "update hopdong set tenST = ?, songuoilon =?,sotreem=?,ngaygioxuatphat=?, ngaygiove=?,tongtien=?, mtour =?, mshd=? where msst = '"+t.getMsst()+"'";		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			
			pstmt.setString(1, t.getTenST());
			pstmt.setInt(2, t.getSonguoilon() );
			pstmt.setFloat(3, t.getSotreem());
			pstmt.setString(4, t.getNgaygioxuatphat());
			pstmt.setString(5, t.getNgaygiove());
			pstmt.setFloat(6, t.getTongtien());
			pstmt.setInt(7, t.getMtour());
			pstmt.setInt(8, t.getMshd());
			
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void deletesubtour(subtour t) {
		String query = "delete from subtour where msst ='"+t.getMsst()+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void insertsubtour (subtour t) {
		String query = "insert into subtour (tenST,songuoilon,sotreem, ngaygioxuatphat,ngaygiove, tongtien , mtour,mshd ) values (?,?, ?,?,?,?,?,? )";
		 //
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);

//			pstmt.setInt(1, kh.getID());
			pstmt.setString(1, t.getTenST());
			pstmt.setInt(2, t.getSonguoilon() );
			pstmt.setFloat(3, t.getSotreem());
			pstmt.setString(4, t.getNgaygioxuatphat());
			pstmt.setString(5, t.getNgaygiove());
			pstmt.setFloat(6, t.getTongtien());
			pstmt.setInt(7, t.getMtour());
			pstmt.setInt(8, t.getMshd());
			
			
			
			
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static List<subtour>findAllsubtour(){
		List<subtour>subtourList = new ArrayList<>();
		
		String query = "select * from quanlytourdulich.subtour";
		
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				subtour t = new subtour(rs.getInt("msst"), rs.getString("tenST"),
						rs.getInt("songuoilon"), rs.getInt("sotreem"),rs.getString("ngaygioxuatphat"), rs.getString("ngaygiove"),
						rs.getFloat("tongtien"), rs.getInt("mtour"), rs.getInt("mshd"));
				
				subtourList.add(t);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return subtourList;
	}
	
	/*-----------------------------------------------đăng kí ----------------------------------------*/
	
	
	public static void insertTaiKhoan (adminAcc t) {
		String query = "insert into adminAcc (tendangnhap,matkhau,msnv) values (?,?, ? )";
		 //
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);


			pstmt.setString(1, t.getTenDangnhap());
			pstmt.setString(2, t.getMk() );
			pstmt.setInt(3, t.getMsnv());
			
			
			
			
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void deleteAdminAcc(int t) {
		String query = "delete from adminaccount where msnv ='"+t+"'";
		
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
