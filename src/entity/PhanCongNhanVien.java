package entity;

public class PhanCongNhanVien {
	
	private NhanVien maNhanVien;
	private CongTrinh maCongTrinh;
	private String tenCongViec;
	private String ngayBatDau;
	private String ngayKetThuc;
	
	public PhanCongNhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhanCongNhanVien(NhanVien maNhanVien) {
		super();
		this.maNhanVien = maNhanVien;
	}

	public PhanCongNhanVien(NhanVien maNhanVien, CongTrinh maCongTrinh, String tenCongViec, String ngayBatDau,
			String ngayKetThuc) {
		super();
		this.maNhanVien = maNhanVien;
		this.maCongTrinh = maCongTrinh;
		this.tenCongViec = tenCongViec;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
	}

	public NhanVien getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(NhanVien maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public CongTrinh getMaCongTrinh() {
		return maCongTrinh;
	}

	public void setMaCongTrinh(CongTrinh maCongTrinh) {
		this.maCongTrinh = maCongTrinh;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}

	public String getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(String ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public String getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(String ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	
	
}
