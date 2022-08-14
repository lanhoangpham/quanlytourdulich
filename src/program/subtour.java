package program;

public class subtour {
	private int msst;
	private String tenST;
	private int songuoilon;
	private int sotreem;
	private String ngaygioxuatphat;
	private String ngaygiove;
	private float tongtien;
	private int mtour;
	private int mshd;
	
	public subtour() {
		
	}
	
	public subtour(int msst, String tenST, int songuoilon,int sotreem,String ngaygioxuatphat, String ngaygiove, float tongtien, int mtour ,int mshd ) {
		this.msst = msst;
		this.tenST = tenST;
		this.songuoilon = songuoilon;
		this.sotreem = sotreem;
		this.ngaygioxuatphat = ngaygioxuatphat;
		this.ngaygiove = ngaygiove;
		this.tongtien = tongtien;
		this.mtour = mtour;
		this.mshd = mshd;
	}
	public int getMsst( ) {
		return msst;
	}
	public void setMsst(int msst) {
		this.msst = msst;
	}
	public String getTenST() {
		return tenST;
	}
	public void setTenST(String tenST) {
		this.tenST = tenST;
	}
	public int getSonguoilon() {
		return songuoilon;
	}
	public void setSonguoilon(int songuoilon) {
		this.songuoilon = songuoilon;
	}
	public int getSotreem() {
		return sotreem;
	}
	public void setSotreem(int sotreem) {
		this.sotreem = sotreem;
	}
	public String getNgaygioxuatphat() {
		return ngaygioxuatphat;
	}
	public void setNgaygioxuatphat(String ngaygioxuatphat) {
		this.ngaygioxuatphat = ngaygioxuatphat;
	}
	public String getNgaygiove() {
		return ngaygiove;
	}
	public void setNgaygiove(String ngaygiove) {
		this.ngaygiove = ngaygiove;
	}
	public float getTongtien() {
		return tongtien;
	}
	public void setTongtien(float tongtien) {
		this.tongtien = tongtien;
	}
	public int getMtour() {
		return mtour;
	}
	public void setMtour(int mtour) {
		this.mtour = mtour;
	}
	public int getMshd() {
		return mshd;
	}
	public void setMshd(int mshd) {
		this.mshd = mshd;
	}
	
	
	
}
