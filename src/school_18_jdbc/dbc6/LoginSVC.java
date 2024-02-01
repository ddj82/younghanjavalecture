package school_18_jdbc.dbc6;

import java.sql.*;

public class LoginSVC {
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//로그인, 나의 정보 실행
	public User login(String id, String passwd) {
		User user = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connect();
			stmt = con.createStatement();
			String sql = "SELECT * FROM MEMBER WHERE ID = '" + id + "' AND PASSWD = '" + passwd + "'";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				user = new User(rs.getString("ID"), rs.getString("PASSWD"), rs.getString("NAME"), 
						rs.getInt("AGE"), rs.getString("ADDR"), rs.getString("EMAIL"));
				return user;
			} else {
				System.out.println("해당 회원이 존재하지 않습니다.");
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}
	
//	public User memberSearch(String id, String name) {
//		User user = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {
//			connect();
//			stmt = con.createStatement();
//			String sql = "SELECT * FROM MEMBER WHERE ID = '" + id + "' AND NAME = '" + name + "'";
//			rs = stmt.executeQuery(sql);
//			if (rs.next()) {
//				user = new User(rs.getString("id"), rs.getString("name"));
//				return user;
//				} else {
//				System.out.println("해당 회원이 존재하지 않습니다.");
//				return user;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				stmt.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return user;
//	}
	
	public User insertMember(String id, String passwd, String name, int age, String addr, String email) {
		User user = null;
		PreparedStatement ps = null;
		int c = 0;
		try {
			connect();
			String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, passwd);
			ps.setString(3, name);
			ps.setInt(4, age);
			ps.setString(5, addr);
			ps.setString(6, email);
			c = ps.executeUpdate();
			
			
			if (c > 0) {
				System.out.println("회원가입 성공!");
			} else {
				System.out.println("회원가입 실패ㅠ");
			}
			user = new User(id, passwd, name, age, addr, email);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return user;
	}
	
	public User deleteMember(String id, String passwd) {
		User user = null;
		PreparedStatement ps = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect();
			stmt = con.createStatement();
			String sql = "SELECT * FROM MEMBER WHERE ID = '" + id + "' AND PASSWD = '" + passwd + "'";
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				sql = "DELETE FROM MEMBER WHERE ID = ? AND PASSWD = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				ps.setString(2, passwd);
				int n = ps.executeUpdate();
				user = new User(rs.getString("ID"), rs.getString("PASSWD"));
				ps.close();
				return user;
				} else {
				System.out.println("해당 회원이 존재하지 않습니다.");
				return user;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return user;
	}
	
}
