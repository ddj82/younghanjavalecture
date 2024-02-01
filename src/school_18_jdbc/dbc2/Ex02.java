package school_18_jdbc.dbc2;

import java.sql.*;

public class Ex02 {

	public static void main(String[] args) {
		User user = new User();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String sql = null;
		try {
			Class.forName(user.getDr());
			conn = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
			sql = "SELECT EMPNO, ENAME, E.DEPTNO, DNAME FROM EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO AND E.DEPTNO = 30";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			System.out.println("부서번호가 30번인 사원들");
			while (rs.next()) {
				System.out.printf("사번: %s,\t이름: %s,\t부서번호: %d,\t부서명: %s \n", 
						rs.getString("EMPNO"), rs.getString("ENAME"), rs.getInt("DEPTNO"), rs.getString("DNAME"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
