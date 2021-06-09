package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
//	public static Connection con = null; 
//	private static ConnectDB instance = new ConnectDB();
//
//	public static ConnectDB getInstance() {
//		return instance;
//	}
//
//	public static void connect() throws SQLException {
//		String connectionUrl = "jdbc:sqlserver://localhost:1433;"
//				+ "databaseName=QLLD;user=sa;password=sapassword;sslProtocol=TLSv1";
//		con = DriverManager.getConnection(connectionUrl);
//	}
//
//	public void disconnect() {
//		if (con != null) {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public static Connection getConnection() {
//		return con;
//	}
//
//	public static ResultSet executeQuery(String sql) {
//		try {
//			connect();
//			Statement statement = con.createStatement();
//			ResultSet resultSet = statement.executeQuery(sql);
//			return resultSet;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//
//	public static Boolean executeNonQuery(String sql) {
//		try {
//			connect();
//			Statement statement = con.createStatement();
//			statement.executeUpdate(sql);
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
	public Connection getConnect() throws SQLException {
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=QLLD";
		String dbUser = "sa";
		String dbPass = "sapassword";
		Connection con = DriverManager.getConnection(dbURL, dbUser, dbPass);
		return con;  
	}


}
