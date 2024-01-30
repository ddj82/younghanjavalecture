package school_18.dbc1;

import java.sql.*;

public class InsertTest {
	private Connection con;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	public static void main(String[] args) {
		new InsertTest(1, "Tom", 100);
		new InsertTest(2, "Javaking", 500);
	}
	
	public InsertTest (int empno, String ename, double sal) {
		try {
			User user = new User();
			Class.forName(user.getDr());
			con = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
			System.out.println("DB 연결 성공");
			
			//insert into emp(empno, ename, sal) values(9999, '홍길동', 5000)
			String sql = "insert into emp(empno, ename, sal) values(" + empno + ", '" + ename + "', " + sal + ")";
			st = con.createStatement();
			int result = st.executeUpdate(sql);
			// update, insert, delete는 executeUpdate() 메소드 사용
			System.out.println("처리된 레코드 개수 : " + result);
//			st.close();
			
			sql = "insert into emp(empno, ename, sal) values(?, ?, ?)";
			pst = con.prepareStatement(sql);
			pst.setInt(1, empno);
			pst.setString(2, ename);
			pst.setDouble(3, sal);
			pst.executeUpdate();
//			pst.close();
			
			
			sql = "select * from emp where ename like ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, "%S");
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("empno") + ", " + rs.getString("ename"));
			}
			
			st.close();
			rs.close();
			pst.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e + "=> 드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e + "=> sql 예외");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e + "=> 일반 예외");
			e.printStackTrace();
		}
	}

}
