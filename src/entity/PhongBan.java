package entity;

public class PhongBan {
	private String maPhongBan;
	private String tenPhongBan;
	
	public PhongBan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhongBan(String maPhongBan) {
		super();
		this.maPhongBan = maPhongBan;
	}

	public PhongBan(String maPhongBan, String tenPhongBan) {
		super();
		this.maPhongBan = maPhongBan;
		this.tenPhongBan = tenPhongBan;
	}

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	
}
