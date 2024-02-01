package school_18_jdbc.dbc4;

import java.sql.*;

public class MemberInsertPstmt4 {

	public static void main(String[] args) {
		try {
			Connection conn = DBConnec1.getConnection();
			String userid = "orange";
			String pwd = "3333";
			String email = "orange@java.com";
			String hp = "010-2222-4444";
			
			//String클래스의 format 메소드를 사용하여 보기좋게 작성
			String sql = "INSERT INTO TB_MEMBER (M_SEQ, M_USERID, M_PWD, M_EMAIL, M_HP, M_REGISTDATE, RDATE)"
					+ " VALUES (SEQ_TB_MEMBER.NEXTVAL, :USERID, :PWD, :EMAIL, :HP, "
					+ "TO_DATE(:RDATE, 'YYYY/MM/DD HH24:MI:SS'), "
					+ "TO_TIMESTAMP(:RDATE, 'YYYY/MM/DD HH24:MI:SS.FF9'))";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, pwd);
			pstmt.setString(3, email);
			pstmt.setString(4, hp);
			pstmt.setString(5, "2000/05/01 16:53:25");
			pstmt.setString(6, "2023/08/15 18:19:32.123456789");
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행 입력");
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				DBConnec1.close();
			} catch (SQLException e) {}
		}
	}

}
