package school_18_jdbc.dbc5;

import java.sql.*;

public class DBConn { //싱글톤(싱글레톤) 패턴
	private static Connection dbConn;
	
	private DBConn() {}

	public static Connection getConnection() {
		if (dbConn == null) {
			try {
				String url = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
				String user = "TEST";
				String pwd = "1111";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbConn = DriverManager.getConnection(url, user, pwd);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		return dbConn;
	}

	public static Connection getConnection(String url, String user, String pwd) {
		if (dbConn == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbConn = DriverManager.getConnection(url, user, pwd);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		return dbConn;
	}
	
	public static void close() {
		if (dbConn != null) {
			try {
				if (!dbConn.isClosed()) {
					dbConn.close();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		dbConn = null;
	}
	
}
