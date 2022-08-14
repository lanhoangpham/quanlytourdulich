package program;

public class hopdong {
	private int id;
	private String tenHD;
	private String ngayKi;
	private float tongTien;
	private String phuongthucthanhtoan;
	private String qlchiutrachnghiem;
	private String dieuKhoanHD;
	private int solanthanhtoan;
	private	int msnv;
	private int mskh;
	
	public hopdong () {
		
	}
	public hopdong(int id, String tenHD, String ngayKi, float tongTien, String phuongthucthanhtoan, String qlchiutrachnghiem, String dieuKhoanHD,
			int solanthanhtoan,int msnv,int mskh ) {
		this.id = id;
		this.tenHD = tenHD;
		this.ngayKi = ngayKi;
		this.tongTien = tongTien;
		this.phuongthucthanhtoan = phuongthucthanhtoan;
		this.qlchiutrachnghiem = qlchiutrachnghiem;
		this.dieuKhoanHD = dieuKhoanHD;
		this.solanthanhtoan = solanthanhtoan;
		this.msnv = msnv;
		this.mskh = mskh;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenHD() {
		return tenHD;
	}
	public void setTenHD(String tenHD) {
		this.tenHD = tenHD;
	}
	public String getNgayKi() {
		return ngayKi;
	}
	public void setNgayKi(String ngayKi) {
		this.ngayKi = ngayKi;
	}
	public float getTongTien() {
		return tongTien;
	}
	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}
	public String getPhuongthucthanhtoan() {
		return phuongthucthanhtoan;
	}
	public void setPhuongthucthanhtoan(String phuongthucthanhtoan) {
		this.phuongthucthanhtoan = phuongthucthanhtoan;
	}
	public String getQlchiutrachnghiem() {
		return qlchiutrachnghiem;
	}
	public void setQlchiutrachnghiem(String qlchiutrachnghiem) {
		this.qlchiutrachnghiem = qlchiutrachnghiem;
	}
	public String getDieuKhoanHD() {
		return dieuKhoanHD;
	}
	public void setDieuKhoanHD(String dieuKhoanHD) {
		this.dieuKhoanHD = dieuKhoanHD;
	}
	public int getSolanthanhtoan() {
		return solanthanhtoan;
	}
	public void setSolanthanhtoan(int solanthanhtoan) {
		this.solanthanhtoan = solanthanhtoan;
	}
	public int getMsnv() {
		return msnv;
	}
	public void setMsnv(int msnv) {
		this.msnv = msnv;
	}
	public int getMskh() {
		return mskh;
	}
	public void setMskh(int mskh) {
		this.mskh = mskh;
	}
	
	
	
}
