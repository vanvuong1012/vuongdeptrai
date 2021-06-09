package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ChucVu;

public class ChucVu_DAO {
	public ArrayList<ChucVu> getAllChucVu() {
		ArrayList<ChucVu> dsCV = new ArrayList<ChucVu>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "SELECT * FROM tbl_ChucVu;";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				String maChucVu = resultSet.getString(1);
				String tenChucVu = resultSet.getString(2);
				ChucVu chucVu = new ChucVu(maChucVu, tenChucVu);
				dsCV.add(chucVu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsCV;
	}

	public ArrayList<ChucVu> getTheoMaChucVu(String id) {
		ArrayList<ChucVu> dsCV = new ArrayList<ChucVu>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		try {
			String sql = "SELECT * FROM tbl_ChucVu WHERE [maChucVu] = ?;";
			statement = con.prepareStatement(sql);
			statement.setString(1, id);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				String maChucVu = resultSet.getString(1);
				String tenChucVu = resultSet.getString(2);

				ChucVu chucVu = new ChucVu(maChucVu, tenChucVu);
				dsCV.add(chucVu);
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
		return dsCV;
	}

	public ArrayList<ChucVu> getBCCTheoMaCC(String id) {
		ArrayList<ChucVu> dsCV = new ArrayList<ChucVu>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		try {
			String sql = "SELECT * FROM tbl_ChucVu WHERE [maChucVu] = ?";
			statement = con.prepareStatement(sql);
			statement.setString(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				String maChucVu = resultSet.getString(1);
				String tenChucVu = resultSet.getString(2);

				ChucVu chucVu = new ChucVu(maChucVu, tenChucVu);
				dsCV.add(chucVu);
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

		return dsCV;
	}

	public boolean addChucVu(ChucVu chucVu) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n = 0;
		try {
			statement = con.prepareStatement("INSERT INTO " + " tbl_ChucVu VALUES(?, ?)");
			statement.setString(1, chucVu.getMaChucVu());
			statement.setString(2, chucVu.getTenChucVu());
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

	public boolean updateChucVu(ChucVu chucVu) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n = 0;
		try {
			statement = con.prepareStatement("UPDATE tbl_ChucVu SET [tenChucVu]=? WHERE maChucVu=?");

			statement.setString(1, chucVu.getTenChucVu());
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

	public boolean deleteChucVu(String id) {
//		ArrayList<ChucVu> dsCV = new ArrayList<ChucVu>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n = 0;
		try {
			String sql = "DELETE FROM tbl_ChucVu WHERE [maChucVu] = ?";
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
