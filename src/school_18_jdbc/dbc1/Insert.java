package school_18_jdbc.dbc1;

import java.sql.*;

public class Insert {

	public static void main(String[] args) {
		try {
//			User user = new User();
//			Class.forName(user.getDr());
//			Connection conn = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
//			PreparedStatement ps = conn.prepareStatement("");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@LOCALHOST:1521:XE", "TEST", "1111");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO DEPT VALUES(?, ?, ?)");
			ps.setInt(1, 60);
			ps.setString(2, "test2");
			ps.setString(3, "anyang");
			int cnt = ps.executeUpdate();
			
			System.out.println("처리한 행 수 : " + cnt);
			if (cnt > 0) {
				System.out.println("정상적으로 처리되었습니다.");
				//보통 commit을 함 
			} else {
				System.out.println("처리하지 못하였습니다.");
				//보통 rollback을 함
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
