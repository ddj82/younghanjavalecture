package school_18_jdbc.dbc2;

import java.sql.*;

public class Ex01 {

	public static void main(String[] args) {
		User user = new User();
		String driver = user.getDr();
		String url = user.getUrl();
		String userid = user.getUser();
		String passwd = user.getPwd();
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
//		String userid = "TEST";
//		String passwd = "1111";
		String sql = null;
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userid, passwd);
			sql = "UPDATE DEPT SET DNAME = ?, LOC = ? WHERE DEPTNO = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "인사");
			ps.setString(2, "서울");
			ps.setInt(3, 60);
			int c = ps.executeUpdate();
			
			if(c > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
