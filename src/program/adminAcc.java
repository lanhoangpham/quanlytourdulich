package program;

public class adminAcc {
	private int msnv;
	private String tenDangnhap;
	private String mk;
	
	public adminAcc() {
		
	}
	public adminAcc(int msnv, String tendangnhap, String mk) {
		this.msnv = msnv;
		this.tenDangnhap = tendangnhap;
		this.mk = mk;
	}
	
	public int getMsnv() {
		return msnv;
	}
	public void setMsnv(int msnv) {
		this.msnv = msnv;
	}
	public String getTenDangnhap() {
		return tenDangnhap;
	}
	public void setTenDangnhap(String tenDangnhap) {
		this.tenDangnhap = tenDangnhap;
	}
	public String getMk() {
		return mk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
	
}
