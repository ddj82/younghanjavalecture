package school_18.dbc1;

import java.sql.*;

public class Test {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		User user = new User();
		try {
			Class.forName(user.getDr());
			conn = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
			st = conn.createStatement();
			rs = st.executeQuery("select * from emp where deptno = 10");
			while(rs.next()) {
				System.out.printf("사번 : %d, 이름 : %s, 부서번호 : %d, 직책 : %s \n", rs.getInt("empno"), rs.getString("ename"), rs.getInt("deptno"), rs.getString("job"));
			}
			
			rs = st.executeQuery("select * from emp where deptno = 20");
			while(rs.next()) {
				System.out.printf("사번 : %d, 이름 : %s, 부서번호 : %d, 직책 : %s \n", rs.getInt("empno"), rs.getString("ename"), rs.getInt("deptno"), rs.getString("job"));
			}
			
			rs.close();
			st.close();
			conn.close();			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
