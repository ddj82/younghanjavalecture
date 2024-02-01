package school_18_jdbc.dbc4;

import java.sql.*;

public class MemberList3 {

	public static void main(String[] args) {
		try {
			Connection conn = DBConnec1.getConnection();
			String sql = "SELECT * FROM TB_MEMBER ORDER BY M_SEQ DESC";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println("번호\t아이디\t비밀번호\t이메일\t\t핸드폰번호\t\t가입일자\t\t\t포인트");
			System.out.println("-------------------------------------------------------------------------------------");
			
			while (rs.next()) {
				for (int i = 1; i <= 7; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DBConnec1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
