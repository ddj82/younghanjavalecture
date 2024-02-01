package school_18_jdbc.dbc1;
import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		new SelectTest();
	}
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public SelectTest() {
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			User user = new User();
			con = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String username = "test";
//			String password = "1111";
//			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("DB 연결 성공");
			
			String sql = "select * from emp";
			st = con.createStatement();
			rs = st.executeQuery(sql);
//			ResultSet 특징
//			- 1개의 결과 테이블을 저장(오라클의 cursor객체와 유사)
//			- 연결지향성 : DB와 연결하고 있는 동안만 데이터의 값을 저장
//			- forward only(next()) : 한쪽 방향으로만 이동
//				next()를 실행하지 않으면 예외 발생.
//			- 결과값을 저장 할 수 있다.
//			- 저장 된 값을 한 행 단위로 불러 올 수 있다.
//			- 한 행에서 값을 가져올 때는 타입을 지정해서 불러 올 수 있다.
			
			while(rs.next()) {
				for (int i = 1; i <= 7; i++) {
					System.out.printf("%10s \t", rs.getString(i));
				}
				System.out.println(rs.getString(8));
			}
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e + " => 드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e + " => SQL 예외");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e + " => 일반 예외");
			e.printStackTrace();
		}
	}

}
