package program;

public class nhanvien {
	private int msnv;
	private String tennv;
	private String congviecphutrach;
	private String sdt;
	
	//khởi tạo giá trị
	public nhanvien() {
	}
	public nhanvien(int msnv, String hoten_nv, String congviecphutrach, String sdt) {
		this.msnv = msnv;
		this.congviecphutrach = congviecphutrach;
		this.tennv = hoten_nv;
		this.sdt = sdt;
	}
	
	//các phương thúc set
	public void setName (String name ) {
		this.tennv = name;
	}
	
	public void setCongViecPhuTrach(String cvpt) {
		this.congviecphutrach = cvpt;
	}
	
	public void setSDT (String sdt) {
		this.sdt = sdt;
	}
	
	public void setMSNV (int msnv) {
		this.msnv = msnv;
	}
	
	//các phương thức get
	public String getName () {
		return tennv;
	}
	public String getCongViecPhuTrach() {
		return congviecphutrach;
	}
	public String getSDT() {
		return sdt;
	}
	public int getMSNV () {
		return msnv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
