package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ChucVu;
import entity.NhanVien;
import entity.PhongBan;

public class NhanVien_DAO {

	public ArrayList<NhanVien> getallNhanVien() {
		ConnectDB database = new ConnectDB();

		ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
		try {

			//			ConnectDB.getInstance();
			//			Connection con = ConnectDB.getConnection();
			Connection con = database.getConnect();
			String sql = "SELECT * FROM tbl_NhanVien;";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				String maNhanVien = resultSet.getString(1);
				String tenNhanVien = resultSet.getString(2);
				String ngaySinh = resultSet.getString(3);
				boolean gioiTinh = resultSet.getBoolean(4);
				String soCMND = resultSet.getString(5);
				ChucVu chucVu = new ChucVu(resultSet.getString(6));
				String diaChi = resultSet.getString(7);
				String soDT = resultSet.getString(8);
				PhongBan maPhongBan = new PhongBan(resultSet.getString(9));
				NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, ngaySinh, gioiTinh, soCMND, chucVu, diaChi,
						soDT, maPhongBan);
				dsNV.add(nhanVien);
				
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return dsNV;
		
	}

	//	public ArrayList<NhanVien> getNVTheoMaNV(String id) {
	//		ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
	//		ConnectDB.getInstance();
	//		Connection con = ConnectDB.getConnection();
	//		PreparedStatement statement = null;
	//		try {
	//			String sql = "SELECT * FROM tbl_NhanVien WHERE [maNhanVien] = ?";
	//			statement = con.prepareStatement(sql);
	//			statement.setString(1, id);
	//
	//			ResultSet resultSet = statement.executeQuery();
	//
	//			while (resultSet.next()) {
	//				String maNhanVien = resultSet.getString(1);
	//				String tenNhanVien = resultSet.getString(2);
	//				String ngaySinh = resultSet.getString(3);
	//				boolean gioiTinh = resultSet.getBoolean(4);
	//				String soCMND = resultSet.getString(5);
	//				ChucVu chucVu = new ChucVu(resultSet.getString(6));
	//				String diaChi = resultSet.getString(7);
	//				String soDT = resultSet.getString(8);
	//				PhongBan maPhongBan = new PhongBan(resultSet.getString(9));
	//				NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, ngaySinh, gioiTinh, soCMND, chucVu, diaChi,
	//						soDT, maPhongBan);
	//				dsNV.add(nhanVien);
	//			}
	//
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		} finally {
	//			try {
	//				statement.close();
	//			} catch (SQLException e2) {
	//				e2.printStackTrace();
	//			}
	//		}
	//
	//		return dsNV;
	//	}

	//	public boolean addNhanVien(NhanVien nhanVien) {
	//		ConnectDB.getInstance();
	//		Connection con = ConnectDB.getConnection();
	//		PreparedStatement statement = null;
	//		int n = 0;
	//
	//		try {
	//			statement = con.prepareStatement("INSERT INTO" + " tbl_NhanVien VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
	//			statement.setString(1, nhanVien.getMaNhanVien());
	//			statement.setString(2, nhanVien.getTenNhanVien());
	//			statement.setString(3, nhanVien.getNgaySinh());
	//			statement.setBoolean(4, nhanVien.isGioiTinh());
	//			statement.setString(5, nhanVien.getSoCMND());
	//			statement.setString(6, nhanVien.getChucVu().getTenChucVu());
	//			statement.setString(7, nhanVien.getDiaChi());
	//			statement.setString(8, nhanVien.getSoDT());
	//			statement.setString(9, nhanVien.getPhongBan().getMaPhongBan());
	//			n = statement.executeUpdate();
	//
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		} finally {
	//			try {
	//				statement.close();
	//			} catch (SQLException e2) {
	//				e2.printStackTrace();
	//			}
	//		}
	//		return n > 0;
	//	}

	//	public boolean updateNhanVien(NhanVien nhanVien) {
	//		ConnectDB.getInstance();
	//		Connection con = ConnectDB.getConnection();
	//		PreparedStatement statement = null;
	//		int n = 0;
	//		try {
	//			statement = con.prepareStatement("UPDATE tbl_NhanVien SET tenNhanVien=?, ngaySinh=?, gioiTinh=?, "
	//					+ "soCMND=?, chucVu=?, diaChi=?, soDT=?, maPhongBan=? WHERE maNhanVien=?");
	//			statement.setString(1, nhanVien.getTenNhanVien());
	//			statement.setString(2, nhanVien.getNgaySinh());
	//			statement.setBoolean(3, nhanVien.isGioiTinh());
	//			statement.setString(4, nhanVien.getSoCMND());
	//			statement.setString(5, nhanVien.getChucVu().getTenChucVu());
	//			statement.setString(6, nhanVien.getDiaChi());
	//			statement.setString(7, nhanVien.getSoDT());
	//			statement.setString(8, nhanVien.getPhongBan().getMaPhongBan());
	//			statement.setString(9, nhanVien.getMaNhanVien());
	//			n = statement.executeUpdate();
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		} finally {
	//			try {
	//				statement.close();
	//			} catch (SQLException e2) {
	//				e2.printStackTrace();
	//			}
	//		}
	//		return n > 0;
	//	}
	//
	//	public boolean deleteNhanVien(String id) {
	////		ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
	//		ConnectDB.getInstance();
	//		Connection con = ConnectDB.getConnection();
	//		PreparedStatement statement = null;
	//		int n = 0;
	//		try {
	//			String sql = "DELETE FROM tbl_NhanVien WHRER [maNhanVien] = ?";
	//			statement = con.prepareStatement(sql);
	//			statement.setString(1, id);
	//			n = statement.executeUpdate();
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//		} finally {
	//			try {
	//				statement.close();
	//			} catch (SQLException e2) {
	//				e2.printStackTrace();
	//			}
	//		}
	//		return n > 0;
	//	}

}
