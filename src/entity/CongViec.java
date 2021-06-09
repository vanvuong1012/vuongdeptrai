package entity;

public class CongViec {

	private String maCongViec;
	private String tenCongViec;
	
	public CongViec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CongViec(String maCongViec) {
		super();
		this.maCongViec = maCongViec;
	}

	public CongViec(String maCongViec, String tenCongViec) {
		super();
		this.maCongViec = maCongViec;
		this.tenCongViec = tenCongViec;
	}

	public String getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(String maCongViec) {
		this.maCongViec = maCongViec;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}
	
}
