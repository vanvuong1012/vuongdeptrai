package entity;

public class NhanVien {

	private String maNhanVien;
	private String tenNhanVien;
	private String ngaySinh;
	private boolean gioiTinh;
	private String soCMND;
	private ChucVu chucVu;
	private String diaChi;
	private String soDT;
	private PhongBan phongBan;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String maNhanVien) {
		super();
		this.maNhanVien = maNhanVien;
	}

	public NhanVien(String maNhanVien, String tenNhanVien, String ngaySinh, boolean gioiTinh, String soCMND,
			ChucVu chucVu, String diaChi, String soDT, PhongBan phongBan) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soCMND = soCMND;
		this.chucVu = chucVu;
		this.diaChi = diaChi;
		this.soDT = soDT;
		this.phongBan = phongBan;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public ChucVu getChucVu() {
		return chucVu;
	}

	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public PhongBan getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s,%b;%s;%s;%s;%s;%s", getMaNhanVien(), getTenNhanVien(), getNgaySinh(), isGioiTinh(), getSoCMND(), getChucVu().getTenChucVu(), getDiaChi(), getSoDT(), getPhongBan().getMaPhongBan() );
	}
	
	

}
