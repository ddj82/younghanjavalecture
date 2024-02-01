package school_18_jdbc.dbc6;

import java.sql.*;

public class TransactionTest {
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
			
			//자동커밋여부 제어
			con.setAutoCommit(false);
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert() {
		connect();
		Statement st = null;
		boolean isOrderSuccess = false;
		try {
			st = con.createStatement();
			String sql = "INSERT INTO PAY VALUES ('aaa', '001', 1000)";
			st.executeUpdate(sql);
			sql = "INSERT INTO PAY VALUES ('bbb', '001', 1000)";
			st.executeUpdate(sql);
			sql = "INSERT INTO ORDERLIST VALUES ('001', 'p2014001')";
			st.executeUpdate(sql);
			isOrderSuccess = true;
		} catch (SQLException se) {
			System.out.println("추가 실패");
			se.printStackTrace();
		} finally {
			if (isOrderSuccess) {
				try {
					con.commit();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					con.rollback();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				st.close();
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TransactionTest tt = new TransactionTest(); 
		tt.insert();
	}
	
	
}
