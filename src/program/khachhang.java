package program;

public class khachhang {
	private int id;
	private String name;
	private String dob;
	private String cccd;
	private String addr;
	private String phone;
	
	//ham tao
	public khachhang() {
		
	}
	public khachhang(int id, String name, String dob,String cccd, String addr, String phone) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.cccd = cccd;
		this.addr = addr;
		this.phone = phone;
	}
	//cac phuong thuc set gia tri cho doi tuong
	public void setName ( String name) {
		this.name = name;
	}
	public void setdob (String dob) {
		this.dob = dob;
	}
	public void setCCCD ( String CCCD) {
		this.cccd = CCCD;
	}
	public void setAddr ( String addr) {
		this.addr = addr;
	}
	public void setPhone (String phone) {
		this.phone = phone;
	}
	public void setID (int id) {
		this.id = id;
	}
	
	// cac phuong thuc lay gia tri cua doi tuong
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getdob() {
		return dob;
	}
	public String getCCCD() {
		return cccd;
	}
	public String getAddr () {
		return addr;
	}
	public String getPhone() {
		return phone;
	}
	
}
