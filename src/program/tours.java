package program;

public class tours {
	private int id;
	private String diemDi;
	private String diemDen;
	private int songuoithamgia;
	private String danhsachdiemden;
	private int gianguoilon;
	private int giatreem;
	
	public tours() {
		
	}
	public tours(int id, String diemDi,String diemDen,int songuoithamgia,String danhsachdiemden,int gianguoilon, int giatreem ) {
		this.id = id;
		this.diemDen = diemDen;
		this.diemDi = diemDi;
		this.songuoithamgia = songuoithamgia;
		this.danhsachdiemden = danhsachdiemden;
		this.gianguoilon = gianguoilon;
		this.giatreem = giatreem;
	}
	//set
	public void setID(int id) {
		this.id = id;
	}
	public void setDiemDi (String diemdi) {
		this.diemDi = diemdi;
	}
	public void setDiemDen (String diemDen ) {
		this.diemDen = diemDen;
	}
	public void setsonguoithamgia(int songuoithamgia) {
		this.songuoithamgia = songuoithamgia;
	}
	public void setDanhSachDiemDen ( String danhsachdiemden) {
		this.danhsachdiemden = danhsachdiemden;
	}
	public void setgianguoilon(int gianguoilon) {
		this.gianguoilon = gianguoilon;
	}
	public void setGiatreem(int giatreem) {
		this.giatreem = giatreem;
	}
	//get
	public int getID () {
		return id;
	}
	public String getDiemDi() {
		return diemDi;
	}
	public String getDiemDen () {
		return diemDen;
	}
	public int getSOLuongNGuoi() {
		return songuoithamgia;
	}
	public String getDSDiemDen () {
		return danhsachdiemden;
	}
	public int getGiaNguoiLon() {
		return gianguoilon;
	}
	public int getGiaTreEm () {
		return giatreem;
	}
	
	
}
