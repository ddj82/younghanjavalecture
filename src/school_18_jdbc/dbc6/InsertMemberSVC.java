package school_18_jdbc.dbc6;

import java.sql.*;

public class InsertMemberSVC {
	Connection con;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void connect() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "TEST", "1111");
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
