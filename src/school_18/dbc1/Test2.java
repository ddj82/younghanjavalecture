package school_18.dbc1;

import java.sql.*;

public class Test2 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		User user = new User();
		try {
			Class.forName(user.getDr());
			conn = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
			ps = conn.prepareStatement("SELECT * FROM EMP WHERE DEPTNO = ?");
			ps.setInt(1, 10);
			rs = ps.executeQuery();
//			System.out.println(rs.next());
//			System.out.printf("사번 : %d, 이름 : %s, 부서번호 : %d, 직책 : %s \n", rs.getInt("empno"), rs.getString("ename"), rs.getInt("deptno"), rs.getString("job"));
			while(rs.next()) {
				System.out.printf("사번 : %d, 이름 : %s, 부서번호 : %d, 직책 : %s \n", rs.getInt("empno"), rs.getString("ename"), rs.getInt("deptno"), rs.getString("job"));
			}
			
//			ps.setInt(1, 20);
//			rs = ps.executeQuery();	
//			while(rs.next()) {
//				System.out.printf("사번 : %d, 이름 : %s, 부서번호 : %d, 직책 : %s \n", rs.getInt("empno"), rs.getString("ename"), rs.getInt("deptno"), rs.getString("job"));
//			}
			
			rs.close();
			ps.close();
			conn.close();			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
