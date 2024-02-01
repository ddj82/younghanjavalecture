package school_18_jdbc.dbc5;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Score {
	
	public int insertDate() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql, hak, name;
		int kor, eng, mat;
		Scanner br = new Scanner(System.in);
		
		try {
			System.out.print("학번?");
			hak = br.nextLine();
			
			System.out.print("이름?");
			name = br.nextLine();
			
			System.out.print("국어점수?");
			kor = Integer.parseInt(br.nextLine());
			
			System.out.print("영어점수?");
			eng = Integer.parseInt(br.nextLine());
			
			System.out.print("수학점수?");
			mat = Integer.parseInt(br.nextLine());
			
			sql = "INSERT INTO SCORE (HAK, NAME, KOR, ENG, MAT) "
					+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hak);
			pstmt.setString(2, name);
			pstmt.setInt(3, kor);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, mat);
			result = pstmt.executeUpdate();
			pstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
	
	public void selectAll() {
		Statement stmt = null;
		ResultSet rs = null;
		String sql, hak, name, str;
		int kor, eng, mat, tot, avg;
		Connection conn = DBConn.getConnection();
		try {
			sql = "SELECT HAK, NAME, KOR, ENG, MAT, "
					+ "(KOR + ENG + MAT) AS TOT, "
					+ "(KOR + ENG + MAT) / 3 AS AVG "
					+ "FROM SCORE ORDER BY HAK";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				hak = rs.getString(1);
				name = rs.getString("NAME");
				kor = rs.getInt(3);
				eng = rs.getInt(4);
				mat = rs.getInt(5);
				tot = rs.getInt(6);
				avg = rs.getInt(7);
				str = String.format("%-10s %-15s %5d %5d %5d %5d %5d", 
						hak, name, kor, eng, mat, tot, avg);
				System.out.println(str);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void selectName() {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = DBConn.getConnection();
		String sql, str, searchName, hak, name;
		int kor, eng, mat, tot, avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("검색할 이름?");
			searchName = br.readLine();
			sql = "SELECT HAK, NAME, KOR, ENG, MAT, "
					+ "(KOR + ENG + MAT) AS TOT, "
					+ "(KOR + ENG + MAT) / 3 AS AVG "
					+ "FROM SCORE WHERE UPPER(NAME) LIKE UPPER('" + searchName + "%')";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				hak = rs.getString(1);
				name = rs.getString("NAME");
				kor = rs.getInt(3);
				eng = rs.getInt(4);
				mat = rs.getInt(5);
				tot = rs.getInt(6);
				avg = rs.getInt(7);
				str = String.format("%-10s %-10s %5d %5d %5d %5d %5d", 
						hak, name, kor, eng, mat, tot, avg);
				System.out.println(str);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {}
	}
	
	public int deleteDate() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql,hak;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("삭제할 학번?");
			hak = br.readLine();
			sql = "DELETE FROM SCORE WHERE HAK = '" + hak + "'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			stmt.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		
		return result;
	}
	
	public int updateDate() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql, hak, name;
		int kor, eng, mat;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("수정할 학생의 학번?");
			hak = br.readLine();
			
			System.out.print("이름?");
			name = br.readLine();
			
			System.out.print("국어점수?");
			kor = Integer.parseInt(br.readLine());
			
			System.out.print("영어점수?");
			eng = Integer.parseInt(br.readLine());
			
			System.out.print("수학점수?");
			mat = Integer.parseInt(br.readLine());
			
			sql = "UPDATE SCORE SET "
					+ "NAME = '" + name + "', "
					+ "KOR = " + kor + ", "
					+ "ENG = " + eng + ", "
					+ "MAT = " + mat + " "
					+ "WHERE HAK = '" + hak + "'";
			System.out.println(sql);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			stmt.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		return result;
	}
}
