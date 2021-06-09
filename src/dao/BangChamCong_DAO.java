package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.BangChamCong;
import entity.CongTrinh;
import entity.NhanVien;

public class BangChamCong_DAO {
	public ArrayList<BangChamCong> getAllBCC() {
		ArrayList<BangChamCong> dsBCC = new ArrayList<BangChamCong>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();

			String sql = "SELECT * FROM tbl_BangChamCong";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				String maBChamCong = resultSet.getString(1);
				CongTrinh congTrinh = new CongTrinh(resultSet.getString(2));
				NhanVien nhanVien = new NhanVien(resultSet.getString(3));
				String tenNhanVien = resultSet.getString(4);
				String chucVu = resultSet.getString(5);
				float soNgayCong = resultSet.getFloat(6);
				BangChamCong bangChamCong = new BangChamCong(maBChamCong, congTrinh, nhanVien, tenNhanVien, chucVu,
						soNgayCong);
				dsBCC.add(bangChamCong);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsBCC;
	}

	public ArrayList<BangChamCong> getPBCCTheoMaCT(String id) {
		ArrayList<BangChamCong> dsBCC = new ArrayList<BangChamCong>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		try {
			String sql = "SELECT * FROM tbl_BangChamCong WHERE [maCongTrinh] = ?";
			statement = con.prepareStatement(sql);
			statement.setString(1, id);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				String maBChamCong = resultSet.getString(1);
				CongTrinh congTrinh = new CongTrinh(resultSet.getString(2));
				NhanVien nhanVien = new NhanVien(resultSet.getString(3));
				String tenNhanVien = resultSet.getString(4);
				String chucVu = resultSet.getString(5);
				float soNgayCong = resultSet.getFloat(6);
				BangChamCong bangCC = new BangChamCong(maBChamCong, congTrinh, nhanVien, tenNhanVien, chucVu,
						soNgayCong);
				dsBCC.add(bangCC);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return dsBCC;
	}

	public boolean addBChamCong(BangChamCong bangChamCong) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n = 0;
		try {
			statement = con.prepareStatement("INSERT INTO" + "tbl_BangChamCong VALUES(?, ?, ?, ?, ?, ?)");
			statement.setString(1, bangChamCong.getMaBChamCong());
			statement.setString(2, bangChamCong.getCongTrinh().getMaCongTrinh());
			statement.setString(3, bangChamCong.getNhanVien().getMaNhanVien());
			statement.setString(4, bangChamCong.getTenNhanVien());
			statement.setString(5, bangChamCong.getChucVu());
			statement.setFloat(6, bangChamCong.getSoNgayCong());
			n = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return n > 0;
	}

	public boolean updateBCC(BangChamCong bangChamCong) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n = 0;
		try {
			statement = con.prepareStatement(
					"UPDATE tbl_BangChamCong [maCongTrinh]=?, [maNhanVien]=?, [tenNhanVien]=?, [chucVu]=?, [soNgayCong]=? WHERE maBChamCong=?");

			statement.setString(1, bangChamCong.getCongTrinh().getMaCongTrinh());
			statement.setString(2, bangChamCong.getNhanVien().getMaNhanVien());
			statement.setString(3, bangChamCong.getTenNhanVien());
			statement.setString(4, bangChamCong.getChucVu());
			statement.setFloat(5, bangChamCong.getSoNgayCong());
			n = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return n > 0;
	}

	public boolean deleteBCC(String id) {
//		ArrayList<BangChamCong> dsBCC = new ArrayList<BangChamCong>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n = 0;
		try {
			String sql = "DELETE FROM tbl_BangChamCong WHERE [maBChamCong] = ?";
			statement = con.prepareStatement(sql);
			statement.setString(1, id);
			n = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return n > 0;
	}

}
