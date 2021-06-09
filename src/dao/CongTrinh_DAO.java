//package dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//import connectDB.ConnectDB;
//import entity.BangDia;
//import entity.ChitietPhieuThue;
//import entity.CongTrinh;
//import entity.KhachHang;
//
//public class CongTrinh_DAO {
//	public ArrayList<CongTrinh> getAllCongTrinh() {
//		ArrayList<CongTrinh> dsCT = new ArrayList<CongTrinh>();
//		try {
//			ConnectDB.getInstance();
//			Connection con = ConnectDB.getConnection();
//
//			String sql = "SELECT * FROM tbl_CongTrinh;";
//			Statement statement = con.createStatement();
//			ResultSet resultSet = statement.executeQuery(sql);
//			while (resultSet.next()) {
//				String maCongTrinh = resultSet.getString(1);
//				String tenCongTrinh = resultSet.getString(2);
//				String diaDiem = resultSet.getString(3);
//				String ngayCapPhep = resultSet.getString(4);
//				String ngayKhoiCong = resultSet.getString(5);
//				String ngayHoanThanh = resultSet.getString(6);
//				boolean trangThai = resultSet.getBoolean(7);
//				CongTrinh congTrinh = new CongTrinh(maCongTrinh, tenCongTrinh, diaDiem, ngayCapPhep, ngayKhoiCong,
//						ngayHoanThanh, trangThai);
//				dsCT.add(congTrinh);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return dsCT;
//	}
//
//	public ArrayList<CongTrinh> getCongTrinhTheoMaCT(String id) {
//		ArrayList<CongTrinh> dsCT = new ArrayList<CongTrinh>();
//		ConnectDB.getInstance();
//		Connection con = ConnectDB.getConnection();
//		PreparedStatement statement = null;
//		try {
//			String sql = "SELECT * FROM tbl_CongTrinh WHERE [maCongTrinh] = ?";
//			statement = con.prepareStatement(sql);
//			statement.setString(1, id);
//
//			ResultSet resultSet = statement.executeQuery();
//			while (resultSet.next()) {
//				String maCongTrinh = resultSet.getString(1);
//				String tenCongTrinh = resultSet.getString(2);
//				String diaDiem = resultSet.getString(3);
//				String ngayCapPhep = resultSet.getString(4);
//				String ngayKhoiCong = resultSet.getString(5);
//				String ngayHoanThanh = resultSet.getString(6);
//				boolean trangThai = resultSet.getBoolean(7);
//				CongTrinh congTrinh = new CongTrinh(maCongTrinh, tenCongTrinh, diaDiem, ngayCapPhep, ngayKhoiCong,
//						ngayHoanThanh, trangThai);
//				dsCT.add(congTrinh);
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
//		return dsCT;
//	}
//
//	public boolean createCT(CongTrinh congTrinh) {
//		ConnectDB.getInstance();
//		Connection con = ConnectDB.getConnection();
//		PreparedStatement statement = null;
//		int n = 0;
//
//		try {
//			statement = con.prepareStatement("INSERT INTO" + "tbl_CongTrinh VALUES(?, ?, ?, ?, ?, ?, ?)");
//			statement.setString(1, pt.getMaPhieu());
//			statement.setString(2, pt.getNgayThue());
//			statement.setString(3, pt.getNgayTra());
//			statement.setInt(4, pt.getSoLuongDia());
//			statement.setDouble(5, pt.getTienDatCoc());
//			statement.setDouble(6, pt.getTongGia());
//			statement.setInt(7, pt.getSoLuongNgayThue());
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
//
//	public boolean update(ChitietPhieuThue pt) {
//		ConnectDB.getInstance();
//		Connection con = ConnectDB.getConnection();
//		PreparedStatement stmt = null;
//		int n = 0;
//		/*
//		 * public ChitietPhieuThue(String maPhieu, String ngayThue, String ngayTra, int
//		 * soLuongDia, double tienDatCoc, double tongGia, int soLuongNgayThue, KhachHang
//		 * kh, BangDia bd
//		 */
//		try {
//			stmt = con.prepareStatement(
//					"update ChiTietPhieuThue set [ngayThue]=?,[ngayTra]=?,[soLuongDia]=?,[tienDatCoc]=?,[tongGia]=?,[soLuongNgayThue]=?,[maKH]=?,[maBangDia]=? where maPhieu=?");
//
//			stmt.setString(1, pt.getNgayThue());
//			stmt.setString(2, pt.getNgayTra());
//			stmt.setInt(3, pt.getSoLuongDia());
//			stmt.setDouble(4, pt.getTienDatCoc());
//			stmt.setDouble(5, pt.getTongGia());
//			stmt.setInt(6, pt.getSoLuongNgayThue());
//			stmt.setString(7, pt.getKh().getMaKH());
//			stmt.setString(8, pt.getBd().getMaBangDia());
//			stmt.setString(9, pt.getMaPhieu());
//			n = stmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				stmt.close();
//			} catch (SQLException e2) {
//				e2.printStackTrace();
//			}
//		}
//		return n > 0;
//	}
//
//	public boolean delete(String id) {
//		ArrayList<ChitietPhieuThue> dspt = new ArrayList<ChitietPhieuThue>();
//		ConnectDB.getInstance();
//		Connection con = ConnectDB.getConnection();
//		PreparedStatement statement = null;
//		int n = 0;
//		try {
//			String sql = "Delete from ChiTietPhieuThue where [maPhieu] = ?";
//			statement = con.prepareStatement(sql);
//			statement.setString(1, id);
//
//			// ResultSet rs=statement.executeQuery();
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
//
//}
