package program;

public class dichvu {
	
	private int id;
	private String tenDV;
	private float donGia;
	private String moTa;
	
	public dichvu() {
		
		
	}
	public dichvu(int id, String tendv, float gia, String mota) {
		this.id = id;
		this.tenDV = tendv;
		this.donGia = gia;
		this.moTa = mota;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenDV() {
		return tenDV;
	}
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
	
}
