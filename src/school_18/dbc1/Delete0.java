package school_18.dbc1;

import java.sql.*;

public class Delete0 {

	public static void main(String[] args) {
		try {
//			User user = new User();
//			Class.forName(user.getDr());
//			Connection conn = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@LOCALHOST:1521:XE", "TEST", "1111");
			
			Statement st = conn.createStatement();
			int c = st.executeUpdate("DELETE FROM DEPT WHERE DEPTNO = 60");
			System.out.println("처리한 행 수 : " + c);
			
			if (c > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			st.close();
			
			PreparedStatement ps = conn.prepareStatement("DELETE FROM DEPT WHERE DEPTNO = ?");
			ps.setInt(1, 60);
			int c1 = ps.executeUpdate();
			System.out.println("처리한 행 수 : " + c1);
			
			if (c1 > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			ps.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
