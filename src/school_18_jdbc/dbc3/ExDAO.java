package school_18_jdbc.dbc3;

import java.sql.*;
import java.util.*;

public class ExDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
	String userid = "TEST";
	String passwd = "1111";
	
	public ExDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<ExDTO> select() { 
		//ExDTO는 레코드단위(줄단위)로 데이터를 가져오는데 모든 레코드(줄)을 담기 위해 ArrayList를 <ExDTO>자료형으로 만듬
		ArrayList<ExDTO> list = new ArrayList<ExDTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			
			String query = "SELECT DEPTNO, DNAME, LOC FROM DEPT";
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				ExDTO dto = new ExDTO();
				dto.setDeptno(rs.getInt("DEPTNO"));
				dto.setDname(rs.getString("DNAME"));
				dto.setLoc(rs.getString("LOC"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public void insert(int deptno, String dname, String loc) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "INSERT INTO DEPT (DEPTNO, DNAME, LOC) " + " VALUES (?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, loc);
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println("INSERT 성공");
			} else {
				System.out.println("INSERT 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void update(int deptno, String dname, String loc) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "UPDATE DEPT SET DNAME = ?, LOC = ? WHERE DEPTNO = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dname);
			ps.setString(2, loc);
			ps.setInt(3, deptno);
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println("UPDATE 성공");
			} else {
				System.out.println("UPDATE 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteDno(int deptno) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "delete from dept where deptno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println("DELETE 성공");
			} else {
				System.out.println("DELETE 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteDnm(String dname) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "delete from dept where dname = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dname);
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println("DELETE 성공");
			} else {
				System.out.println("DELETE 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteLoc(String loc) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "delete from dept where loc = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, loc);
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println("DELETE 성공");
			} else {
				System.out.println("DELETE 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public ExDTO selectOne(int deptno) {
		ExDTO dto = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Connection con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select * from dept where deptno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			rs = ps.executeQuery();
			while (rs.next()) {
				dto = new ExDTO();
				dto.setDeptno(rs.getInt("DEPTNO"));
				dto.setDname(rs.getString("DNAME"));
				dto.setLoc(rs.getString("LOC"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return dto;
	}
	
}
