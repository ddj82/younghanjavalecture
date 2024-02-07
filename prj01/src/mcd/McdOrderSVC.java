package mcd;

import static mcd.db.JdbcUtil.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;


public class McdOrderSVC {
	Connection con;
	
	
	public void getMcdOrderSVC(Scanner sc) {
		while (true) {
			System.out.println("[선택] 1.주문하기, 2.주문수정, 3.주문취소, 4.주문검색, 5.주문목록(관리자), 6.주문상태변경(관리자), 7.종료");
			int c = 0;
			c = sc.nextInt();
			switch (c) {
			case 1: { //o
				System.out.println("[선택] 1.회원주문 , 2.비회원주문");
				int m = sc.nextInt();
				if (m == 1) {
					//회원주문메소드
					//1.버거단품, 2.버거세트, 3.사이드, 4.커피, 5.음료, 6.주문확정, 7.돌아가기
					insertOrderM(sc);
				} else {
					//비회원주문메소드
					//1.버거단품, 2.버거세트, 3.사이드, 4.커피, 5.음료, 6.주문확정, 7.돌아가기
					insertOrder(sc);
				}
				break;
			}
			case 2: { //o
				System.out.println("===== 주문 수정 =====");
				System.out.println("[선택] 1.주문자정보수정, 2.주문상품수정, 3.종료");
				while (true) {
					int i = 0;
					i = sc.nextInt();
					switch (i) {
					case 1: {
						System.out.println("주문번호 입력 : ");
						String order_num = sc.next();
						updateOrderInfo(sc, order_num);
					break;
                      	}
                    case 2: {
                    	System.out.println("주문번호 입력 : ");
                    	String order_num = sc.next();
                    	modifyOrderItems(sc, order_num);
                    	
                      	}
                    break;
                    
                    case 3: {
                    	System.out.println("이전으로 돌아갑니다.");
                    	return;
                    }
                    
					}
					break;
				}
				break;
			}
			case 3: { //o
				System.out.println("[선택] 1.주문 취소, 2.돌아가기");
				int ch = sc.nextInt();
				if (ch == 1) {
                      System.out.println("주문을 취소합니다.");
                      deleteOrder(sc);
				} else {
                      System.out.println("이전으로 돌아갑니다.");
				}				
				break;
			}
			case 4: { //o
				searchOrder(sc);
				break;
			}
			case 5: { //o
				System.out.println("관리자 아이디/비번 입력");
				allOrderAd(sc);
				break;
			}
			case 6: { //o
				System.out.println("관리자 아이디/비번 입력");
				acceptOrderAd(sc);
				break;
			}
			case 7: { //
				System.out.println("메인으로 돌아갑니다.");
				return;
			}
			
			}
			
		}
	}
	
	public void insertOrderM(Scanner sc) { //1-1 회원주문메소드
		ArrayList<Integer> order_menuno = new ArrayList<Integer>();
		ArrayList<Integer> order_ea = new ArrayList<Integer>();
		System.out.print("주문자명: ");
		String order_nm = sc.next();
		
		System.out.print("닉네임: ");
		String order_nick = sc.next();
		
		System.out.print("연락처: ");
		String order_pn = sc.next();
		
		System.out.print("주소: ");
		sc.nextLine();
		String order_adr = sc.nextLine();
		
		System.out.print("요청사항(없으시면 숫자 '1'을 눌러주세요): ");
		String order_req = sc.nextLine();
		if (order_req.equals("1")) {
			order_req.replaceAll("1", "");
		}
		
		while (true) {
			System.out.println("[선택] 1.버거단품, 2.버거세트, 3.사이드, 4.음료, 5.주문확정, 6.돌아가기");
			String str = sc.next();
			if (str.equals("1")) {
				con = getConnection();
				Statement st = null;
				ResultSet rs = null;
				String sql = "SELECT MENU_NO, MENU_NM, MENU_PR  FROM MENU_INFO WHERE MENU_CAT = '버거'";
				try {
					st = con.createStatement();
					rs = st.executeQuery(sql);
					System.out.println("상품번호:   0 , 선택안함");
					while (rs.next()) {
						System.out.printf("상품번호: %3d , 상품명: %s, 가격: %d \n", rs.getInt("MENU_NO"), rs.getString("MENU_NM"), rs.getInt("MENU_PR"));
					}
					System.out.print("상품번호를 선택하세요. >> ");
					int mn = sc.nextInt();
					if (mn == 0) {
						continue;
					} else {
						order_menuno.add(mn);
					}
					System.out.print("수량을 입력하세요. >> ");
					order_ea.add(sc.nextInt());
					
					System.out.println("상품번호 : " + order_menuno + ", 상품수량 : " + order_ea); //지워야함
					rs.close();
					st.close();
					con.close();
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
					
			} else if (str.equals("2")) {
				con = getConnection();
				Statement st = null;
				ResultSet rs = null;
				String sql = "SELECT MENU_NO, MENU_NM, MENU_PR  FROM MENU_INFO WHERE MENU_CAT = '버거세트'";
				try {
					st = con.createStatement();
					rs = st.executeQuery(sql);
					System.out.println("상품번호:   0 , 선택안함");
					while (rs.next()) {
						System.out.printf("상품번호: %3d , 상품명: %s, 가격: %d \n", rs.getInt("MENU_NO"), rs.getString("MENU_NM"), rs.getInt("MENU_PR"));
					}
					System.out.print("상품번호를 선택하세요. >> ");
					int mn = sc.nextInt();
					if (mn == 0) {
						continue;
					} else {
						order_menuno.add(mn);
					}
					System.out.print("수량을 입력하세요. >> ");
					order_ea.add(sc.nextInt());
					
					System.out.println("상품번호 : " + order_menuno + ", 상품수량 : " + order_ea); //지워야함
					rs.close();
					st.close();
					con.close();
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			} else if (str.equals("3")) {
				con = getConnection();
				Statement st = null;
				ResultSet rs = null;
				String sql = "SELECT MENU_NO, MENU_NM, MENU_PR  FROM MENU_INFO WHERE MENU_CAT = '사이드'";
				try {
					st = con.createStatement();
					rs = st.executeQuery(sql);
					System.out.println("상품번호:   0 , 선택안함");
					while (rs.next()) {
						System.out.printf("상품번호: %3d , 상품명: %s, 가격: %d \n", rs.getInt("MENU_NO"), rs.getString("MENU_NM"), rs.getInt("MENU_PR"));
					}
					System.out.print("상품번호를 선택하세요. >> ");
					int mn = sc.nextInt();
					if (mn == 0) {
						continue;
					} else {
						order_menuno.add(mn);
					}
					System.out.print("수량을 입력하세요. >> ");
					order_ea.add(sc.nextInt());
					System.out.println("상품번호 : " + order_menuno + ", 상품수량 : " + order_ea); //지워야함
					rs.close();
					st.close();
					con.close();
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			} else if (str.equals("4")) {
				con = getConnection();
				Statement st = null;
				ResultSet rs = null;
				String sql = "SELECT MENU_NO, MENU_NM, MENU_PR  FROM MENU_INFO WHERE MENU_CAT = '음료'";
				try {
					st = con.createStatement();
					rs = st.executeQuery(sql);
					System.out.println("상품번호:   0 , 선택안함");
					while (rs.next()) {
						System.out.printf("상품번호: %3d , 상품명: %s, 가격: %d \n", rs.getInt("MENU_NO"), rs.getString("MENU_NM"), rs.getInt("MENU_PR"));
					}
					System.out.print("상품번호를 선택하세요. >> ");
					int mn = sc.nextInt();
					if (mn == 0) {
						continue;
					} else {
						order_menuno.add(mn);
					}
					System.out.print("수량을 입력하세요. >> ");
					order_ea.add(sc.nextInt());
					System.out.println("상품번호 : " + order_menuno + ", 상품수량 : " + order_ea); //지워야함
					rs.close();
					st.close();
					con.close();
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			} else if (str.equals("5")) {
				System.out.println("주문이 완료되었습니다.");
				con = getConnection();
				PreparedStatement ps = null;
				String sql = "INSERT INTO ORDER_LIST(ORDER_NUM, ORDER_PN, ORDER_ADR, ORDER_REQ, ORDER_NM, ORDER_NICK, ORDER_MENUNO, ORDER_EA, ORDER_TOT) "
						+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, "
						+ "(SELECT MENU_PR * ? FROM MENU_INFO WHERE MENU_NO = ?))";
				try {
					ps = con.prepareStatement(sql);
					if (order_menuno.size() > 0) {
						ResultSet rs = null;
						for (int i = 0; i < order_menuno.size(); i++) {
							ps.setInt(1, i);
							ps.setString(2, order_pn);
							ps.setString(3, order_adr);
							ps.setString(4, order_req);
							ps.setString(5, order_nm);
							ps.setString(6, order_nick);
							ps.setInt(7, order_menuno.get(i));
							ps.setInt(8, order_ea.get(i));
							ps.setInt(9, order_ea.get(i));
							ps.setInt(10, order_menuno.get(i));
							rs = ps.executeQuery();
						}
						ps = con.prepareStatement("UPDATE ORDER_LIST SET ORDER_NUM = TO_CHAR(SYSDATE,'YYYYMMDD')||TO_CHAR(SEQ_ORDER.NEXTVAL,'FM0000') "
								+ "WHERE ORDER_NUM = 0"); //서브쿼리
						ps.executeUpdate();
						ps.close();
						if (order_menuno.size() > 0) {
							ps = con.prepareStatement("UPDATE ORDER_LIST SET ORDER_NUM = "
									+ "(SELECT MAX(TO_NUMBER(ORDER_NUM)) FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "' AND ORDER_ADR = '" + order_adr + "') "
									+ "WHERE ORDER_NM = '" + order_nm + "'");
							ps.executeUpdate();
							ps.close();
						}
						ps = con.prepareStatement("SELECT ORDER_NUM FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "'");
						rs = ps.executeQuery();
						
						if (rs.next()) {
							System.out.println("주문번호 : " + rs.getString("ORDER_NUM"));
							sql = "UPDATE ORDER_LIST SET ORDER_STATUS = '주문접수완료(회원)' WHERE ORDER_NM = '" + order_nm + "'";
							ps = con.prepareStatement(sql);
							int os = ps.executeUpdate();
							if (os > 0) {
								System.out.println("====================================");
							}
							rs.close();
							ps.close();
							
							sql = "SELECT DISTINCT ORDER_BR, ORDER_DT, ORDER_MA FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "'";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println("주문서");
								System.out.println("지점명: " + rs.getString(1));
								System.out.println("주문일자: " + rs.getString(2) + "\n");
								System.out.println("담당자명: " + rs.getString(3) + "\n");
							}
							rs.close();
							ps.close();
							
							sql = "SELECT DISTINCT ORDER_NM, ORDER_PN, ORDER_ADR FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "'";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println("주문자: " + rs.getString(1));
								System.out.println("연락처: " + rs.getString(2));
								System.out.println("주소: " + rs.getString(3));
							}
							rs.close();
							ps.close();
							
							sql = "SELECT MENU_NM, SUM(ORDER_EA), SUM(ORDER_TOT) FROM ORDER_LIST O, MENU_INFO M "
									+ "WHERE MENU_NO = ORDER_MENUNO AND ORDER_NM = '" + order_nm + "' "
									+ "GROUP BY MENU_NM ORDER BY SUM(ORDER_TOT) DESC";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							System.out.println("주문내용:");
							while (rs.next()) {
								System.out.println(rs.getString(1) + " " + rs.getInt(2) + "개 " + rs.getInt(3) + "원");
							}
							rs.close();
							ps.close();
							
							sql = "SELECT SUM(ORDER_TOT) TOTAL FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "' "
									+ "AND ORDER_ADR = '" + order_adr + "' GROUP BY ORDER_NUM";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println();
								System.out.println("총 금액: " + rs.getInt("TOTAL"));
							}
							System.out.println("---------------------------------------");
							rs.close();
							ps.close();
							
							sql = "SELECT DISTINCT ORDER_REQ FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "'";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println("고객요청사항: " + rs.getString(1));
							}
							System.out.println("---------------------------------------");
							rs.close();
							ps.close();
							
							sql = "SELECT DISTINCT MENU_NM, MENU_WG, MENU_ML, MENU_K, MENU_SU, MENU_D, MENU_F, MENU_N, MENU_C "
									+ "FROM MENU_INFO M, ORDER_LIST O WHERE MENU_NO = ORDER_MENUNO AND ORDER_NM = '" + order_nm + "'";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							System.out.println("칼로리정보");
							while (rs.next()) {
								System.out.println(rs.getString("MENU_NM"));
								System.out.println("- 중량(g): " + rs.getInt("MENU_WG"));
								System.out.println("- 중량(ml): " + rs.getInt("MENU_ML"));
								System.out.println("- 열량(Kcal): " + rs.getDouble("MENU_K"));
								System.out.println("- 당(g): " + rs.getDouble("MENU_SU"));
								System.out.println("- 단백질(g): " + rs.getDouble("MENU_D"));
								System.out.println("- 포화지방(g): " + rs.getDouble("MENU_F"));
								System.out.println("- 나트륨(mg): " + rs.getDouble("MENU_N"));
								System.out.println("- 카페인(mg): " + rs.getDouble("MENU_C"));
								System.out.println();
							}
							rs.close();
							ps.close();
							
						} else {
							System.out.println("주문실패");
							rs.close();
							ps.close();
							con.close();
							return;
						}
						rs.close();
						ps.close();
						
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					close(ps);
					close(con);
				}
				
			} else if (str.equals("6")) {
				System.out.println("전 단계로 돌아갑니다.");
				return;
				
			}   
			
		}
	}
	
	public void insertOrder(Scanner sc) {//1-2 비회원주문메소드
		ArrayList<Integer> order_menuno = new ArrayList<Integer>();
		ArrayList<Integer> order_ea = new ArrayList<Integer>();
		System.out.print("주문자명: ");
		String order_nm = sc.next();
		
		System.out.print("연락처: ");
		String order_pn = sc.next();
		
		System.out.print("주소: ");
		sc.nextLine();
		String order_adr = sc.nextLine();
		
		System.out.print("요청사항(없으시면 숫자 '1'을 눌러주세요): ");
		String order_req = sc.nextLine();
		if (order_req.equals("1")) {
			order_req.replaceAll("1", "");
		}
		
		while (true) {
			System.out.println("[선택] 1.버거단품, 2.버거세트, 3.사이드, 4.음료, 5.주문확정, 6.돌아가기");
			String str = sc.next();
			if (str.equals("1")) {
				con = getConnection();
				Statement st = null;
				ResultSet rs = null;
				String sql = "SELECT MENU_NO, MENU_NM, MENU_PR  FROM MENU_INFO WHERE MENU_CAT = '버거'";
				try {
					st = con.createStatement();
					rs = st.executeQuery(sql);
					System.out.println("상품번호:   0 , 선택안함");
					while (rs.next()) {
						System.out.printf("상품번호: %3d , 상품명: %s, 가격: %d \n", rs.getInt("MENU_NO"), rs.getString("MENU_NM"), rs.getInt("MENU_PR"));
					}
					System.out.print("상품번호를 선택하세요. >> ");
					int mn = sc.nextInt();
					if (mn == 0) {
						continue;
					} else {
						order_menuno.add(mn);
					}
					System.out.print("수량을 입력하세요. >> ");
					order_ea.add(sc.nextInt());
					
					System.out.println("상품번호 : " + order_menuno + ", 상품수량 : " + order_ea); //지워야함
					rs.close();
					st.close();
					con.close();
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
					
			} else if (str.equals("2")) {
				con = getConnection();
				Statement st = null;
				ResultSet rs = null;
				String sql = "SELECT MENU_NO, MENU_NM, MENU_PR  FROM MENU_INFO WHERE MENU_CAT = '버거세트'";
				try {
					st = con.createStatement();
					rs = st.executeQuery(sql);
					System.out.println("상품번호:   0 , 선택안함");
					while (rs.next()) {
						System.out.printf("상품번호: %3d , 상품명: %s, 가격: %d \n", rs.getInt("MENU_NO"), rs.getString("MENU_NM"), rs.getInt("MENU_PR"));
					}
					System.out.print("상품번호를 선택하세요. >> ");
					int mn = sc.nextInt();
					if (mn == 0) {
						continue;
					} else {
						order_menuno.add(mn);
					}
					System.out.print("수량을 입력하세요. >> ");
					order_ea.add(sc.nextInt());
					
					System.out.println("상품번호 : " + order_menuno + ", 상품수량 : " + order_ea); //지워야함
					rs.close();
					st.close();
					con.close();
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			} else if (str.equals("3")) {
				con = getConnection();
				Statement st = null;
				ResultSet rs = null;
				String sql = "SELECT MENU_NO, MENU_NM, MENU_PR  FROM MENU_INFO WHERE MENU_CAT = '사이드'";
				try {
					st = con.createStatement();
					rs = st.executeQuery(sql);
					System.out.println("상품번호:   0 , 선택안함");
					while (rs.next()) {
						System.out.printf("상품번호: %3d , 상품명: %s, 가격: %d \n", rs.getInt("MENU_NO"), rs.getString("MENU_NM"), rs.getInt("MENU_PR"));
					}
					System.out.print("상품번호를 선택하세요. >> ");
					int mn = sc.nextInt();
					if (mn == 0) {
						continue;
					} else {
						order_menuno.add(mn);
					}
					System.out.print("수량을 입력하세요. >> ");
					order_ea.add(sc.nextInt());
					System.out.println("상품번호 : " + order_menuno + ", 상품수량 : " + order_ea); //지워야함
					rs.close();
					st.close();
					con.close();
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			} else if (str.equals("4")) {
				con = getConnection();
				Statement st = null;
				ResultSet rs = null;
				String sql = "SELECT MENU_NO, MENU_NM, MENU_PR  FROM MENU_INFO WHERE MENU_CAT = '음료'";
				try {
					st = con.createStatement();
					rs = st.executeQuery(sql);
					System.out.println("상품번호:   0 , 선택안함");
					while (rs.next()) {
						System.out.printf("상품번호: %3d , 상품명: %s, 가격: %d \n", rs.getInt("MENU_NO"), rs.getString("MENU_NM"), rs.getInt("MENU_PR"));
					}
					System.out.print("상품번호를 선택하세요. >> ");
					int mn = sc.nextInt();
					if (mn == 0) {
						continue;
					} else {
						order_menuno.add(mn);
					}
					System.out.print("수량을 입력하세요. >> ");
					order_ea.add(sc.nextInt());
					System.out.println("상품번호 : " + order_menuno + ", 상품수량 : " + order_ea); //지워야함
					rs.close();
					st.close();
					con.close();
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			} else if (str.equals("5")) {
				System.out.println("주문이 완료되었습니다.");
				con = getConnection();
				PreparedStatement ps = null;
				String sql = "INSERT INTO ORDER_LIST(ORDER_NUM, ORDER_PN, ORDER_ADR, ORDER_REQ, ORDER_NM, ORDER_MENUNO, ORDER_EA, ORDER_TOT) "
						+ "VALUES(?, ?, ?, ?, ?, ?, ?, "
						+ "(SELECT MENU_PR * ? FROM MENU_INFO WHERE MENU_NO = ?))";
				try {
					ps = con.prepareStatement(sql);
					if (order_menuno.size() > 0) {
						ResultSet rs = null;
						for (int i = 0; i < order_menuno.size(); i++) {
							ps.setInt(1, i);
							ps.setString(2, order_pn);
							ps.setString(3, order_adr);
							ps.setString(4, order_req);
							ps.setString(5, order_nm);
							ps.setInt(6, order_menuno.get(i));
							ps.setInt(7, order_ea.get(i));
							ps.setInt(8, order_ea.get(i));
							ps.setInt(9, order_menuno.get(i));
							rs = ps.executeQuery();
						}
						ps = con.prepareStatement("UPDATE ORDER_LIST SET ORDER_NUM = TO_CHAR(SYSDATE,'YYYYMMDD')||TO_CHAR(SEQ_ORDER.NEXTVAL,'FM0000') "
								+ "WHERE ORDER_NUM = 0"); 
						ps.executeUpdate();
						ps.close();
						if (order_menuno.size() > 0) {
							ps = con.prepareStatement("UPDATE ORDER_LIST SET ORDER_NUM = "
									+ "(SELECT MAX(TO_NUMBER(ORDER_NUM)) FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "' AND ORDER_ADR = '" + order_adr + "') "
									+ "WHERE ORDER_NM = '" + order_nm + "'");
							ps.executeUpdate();
							ps.close();
						}
						ps = con.prepareStatement("SELECT ORDER_NUM FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "'");
						rs = ps.executeQuery();
						
						if (rs.next()) {
							System.out.println("주문번호 : " + rs.getString("ORDER_NUM"));
							sql = "UPDATE ORDER_LIST SET ORDER_STATUS = '주문접수완료(비회원)' WHERE ORDER_NICK = '(비회원)'";
							ps = con.prepareStatement(sql);
							int os = ps.executeUpdate();
							if (os > 0) {
								System.out.println("====================================");
							}
							rs.close();
							ps.close();
							
							sql = "SELECT DISTINCT ORDER_BR, ORDER_DT, ORDER_MA FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "'";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println("주문서");
								System.out.println("지점명: " + rs.getString(1));
								System.out.println("주문일자: " + rs.getString(2) + "\n");
								System.out.println("담당자명: " + rs.getString(3) + "\n");
							}
							rs.close();
							ps.close();
							
							sql = "SELECT DISTINCT ORDER_NM, ORDER_PN, ORDER_ADR FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "'";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println("주문자: " + rs.getString(1));
								System.out.println("연락처: " + rs.getString(2));
								System.out.println("주소: " + rs.getString(3));
							}
							rs.close();
							ps.close();
							
							sql = "SELECT MENU_NM, SUM(ORDER_EA), SUM(ORDER_TOT) FROM ORDER_LIST O, MENU_INFO M "
									+ "WHERE MENU_NO = ORDER_MENUNO AND ORDER_NM = '" + order_nm + "' "
									+ "GROUP BY MENU_NM ORDER BY SUM(ORDER_TOT) DESC";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							System.out.println("주문내용:");
							while (rs.next()) {
								System.out.println(rs.getString(1) + " " + rs.getInt(2) + "개 " + rs.getInt(3) + "원");
							}
							rs.close();
							ps.close();
							
							sql = "SELECT SUM(ORDER_TOT) TOTAL FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "' "
									+ "AND ORDER_ADR = '" + order_adr + "' GROUP BY ORDER_NUM";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println();
								System.out.println("총 금액: " + rs.getInt("TOTAL"));
							}
							System.out.println("---------------------------------------");
							rs.close();
							ps.close();
							
							sql = "SELECT DISTINCT ORDER_REQ FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "'";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println("고객요청사항: " + rs.getString(1));
							}
							System.out.println("---------------------------------------");
							rs.close();
							ps.close();
							
							sql = "SELECT DISTINCT MENU_NM, MENU_WG, MENU_ML, MENU_K, MENU_SU, MENU_D, MENU_F, MENU_N, MENU_C "
									+ "FROM MENU_INFO M, ORDER_LIST O WHERE MENU_NO = ORDER_MENUNO AND ORDER_NM = '" + order_nm + "'";
							ps = con.prepareStatement(sql);
							rs = ps.executeQuery();
							System.out.println("칼로리정보");
							while (rs.next()) {
								System.out.println(rs.getString("MENU_NM"));
								System.out.println("- 중량(g): " + rs.getInt("MENU_WG"));
								System.out.println("- 중량(ml): " + rs.getInt("MENU_ML"));
								System.out.println("- 열량(Kcal): " + rs.getDouble("MENU_K"));
								System.out.println("- 당(g): " + rs.getDouble("MENU_SU"));
								System.out.println("- 단백질(g): " + rs.getDouble("MENU_D"));
								System.out.println("- 포화지방(g): " + rs.getDouble("MENU_F"));
								System.out.println("- 나트륨(mg): " + rs.getDouble("MENU_N"));
								System.out.println("- 카페인(mg): " + rs.getDouble("MENU_C"));
								System.out.println();
							}
							rs.close();
							ps.close();
						} else {
							System.out.println("주문실패");
							rs.close();
							ps.close();
							con.close();
							return;
						}
						rs.close();
						ps.close();
						
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					close(ps);
					close(con);
				}
				
			} else if (str.equals("6")) {
				System.out.println("전 단계로 돌아갑니다.");
				return;
				
			}   
			
		}
	}
	
	public boolean updateOrderInfo(Scanner sc, String order_num) { //2-1
        // 주문 정보를 조회하여 수정할 수 있도록 하는 부분 추가
        // (주문자명, 닉네임, 연락처, 주소, 요청사항 등의 수정)

        System.out.print("수정할 주문자명 : ");
        String order_nm = sc.next();

        System.out.print("수정할 닉네임 : ");
        String order_nick = sc.next();

        System.out.print("수정할 연락처 : ");
        int order_pn = sc.nextInt();

        sc.nextLine();
        System.out.print("수정할 주소 : ");
        String order_adr = sc.nextLine();

        System.out.print("수정할 요청사항 : ");
        String order_req = sc.nextLine();

        // 주문자 정보를 업데이트하는 SQL 작성
        String sql = "UPDATE ORDER_LIST SET ORDER_NM = ?, ORDER_NICK = ?, ORDER_PN = ?, ORDER_ADR = ?, ORDER_REQ = ? WHERE ORDER_NUM = ?";

        try {
                con = getConnection();
                PreparedStatement updateOrderInfoStmt = con.prepareStatement(sql);
                updateOrderInfoStmt.setString(1, order_nm);
                updateOrderInfoStmt.setString(2, order_nick);
                updateOrderInfoStmt.setInt(3, order_pn);
                updateOrderInfoStmt.setString(4, order_adr);
                updateOrderInfoStmt.setString(5, order_req);
                updateOrderInfoStmt.setString(6, order_num);

                int updateOrderInfoResult = updateOrderInfoStmt.executeUpdate();

                if (updateOrderInfoResult > 0) {
                        System.out.println("주문자 정보가 수정되었습니다.");
                        return true;
                } else {
                        System.out.println("수정이 실패하였습니다.");
                        return false;
                }

        } catch (SQLException e) {
                e.printStackTrace();
        } finally {
                close(con);
        }

        return false;
	}

	// 상품 정보 수정 메서드
	// 주문 정보 수정
	public void modifyOrderItems(Scanner sc, String order_num) { //2-2
		// (수량 변경, 상품 삭제 등)

		String sql = "SELECT M.MENU_NM, O.ORDER_MENUNO, M.MENU_PR, O.ORDER_EA "
				+ "FROM ORDER_LIST O INNER JOIN MENU_INFO M ON O.ORDER_MENUNO = M.MENU_NO WHERE O.ORDER_NUM = ?";
		try {
			con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, order_num);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String menu_nm = rs.getString("MENU_NM");
				int menu_pr = rs.getInt("MENU_PR");
				int order_ea = rs.getInt("ORDER_EA");
				System.out.println("주문정보: ");
				System.out.println("주문번호\t\t상품명\t\t가격\t개수");
				System.out.println(order_num + "\t" + menu_nm + "\t" + menu_pr + "\t" + order_ea);
				System.out.println("[선택] 1.수정, 2.삭제, 3.돌아가기, 4.종료");
				int modifyOption = sc.nextInt();

				switch (modifyOption) {
				case 1: {
					System.out.println("변경할 상품 수량을 숫자로 입력해주세요.");
					int newQuantity = sc.nextInt();
					sql = "UPDATE ORDER_LIST SET ORDER_EA = ? WHERE ORDER_NUM = ? and ORDER_MENUNO = "
							+ rs.getInt("ORDER_MENUNO");
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, newQuantity);
					pstmt.setString(2, order_num);
					int updateQuantityResult = pstmt.executeUpdate();

					if (updateQuantityResult > 0) {
						System.out.println("변경완료");
					} else {
						System.out.println("수량 변경에 실패하였습니다.");
					}
					break;
				}
				case 2: {
					String removeSQL = "DELETE FROM ORDER_LIST WHERE ORDER_NUM = ? and ORDER_MENUNO ="
							+ rs.getInt("ORDER_MENUNO");
					PreparedStatement removeItemStmt = con.prepareStatement(removeSQL);
					removeItemStmt.setString(1, order_num);

					int removeItemResult = removeItemStmt.executeUpdate();

					if (removeItemResult > 0) {
						System.out.println("삭제완료");
					} else {
						System.out.println("상품 삭제에 실패하였습니다.");
					}
					break;
				}
				case 3: {
					continue;
				}
				case 4: {
					return;
				}
				default: {
					System.out.println("올바르지 않은 선택입니다. 다시 선택해주세요.");
					continue;
				}
				}

			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void deleteOrder(Scanner sc) { //3
        con = getConnection();
        PreparedStatement ps = null;

        try {
                System.out.println("취소하실 주문 번호를 입력해주세요 : ");
                String od_no = sc.next();
                String sql = "DELETE FROM ORDER_LIST WHERE ORDER_NUM = " + od_no + "AND ORDER_STATUS LIKE '%접수%'";
                ps = con.prepareStatement(sql);
                int can = ps.executeUpdate();
                if (can > 0) {
                        System.out.println("주문이 취소되었습니다. 전단계로 되돌아갑니다."); // 주문 접수 전이면 취소 가능
                } else {
                        System.out.println("주문접수완료 상태이므로 취소가 불가합니다."); // 조리중이면 취소 불가
                        return;
                }
        } catch (Exception e) {
                e.printStackTrace();
        } finally {
                close(ps);
                close(con);
        }
	}
	
	public void searchOrder(Scanner sc) { //4
        System.out.println("검색할 주문 번호를 입력하세요.");
        System.out.println("주문 번호 :");
        String orderno = sc.next();
        getOrder(orderno);
	}
	
	public void getOrder(String order_num) {
		McdOlistVO McdOlistVO = null;
		con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Statement st = null;
		String sql = "SELECT * FROM ORDER_LIST WHERE ORDER_NUM = ?";
		try {

			ps = con.prepareStatement(sql);
			ps.setString(1, order_num);
			rs = ps.executeQuery();

			if (rs.next()) {
				String order_adr = rs.getString("order_adr");
				String order_nm = rs.getString("order_nm");
				String order_pn = rs.getString("order_pn");
				String order_req = rs.getString("order_req");
				String order_nick = rs.getString("order_nick");
				String order_status = rs.getString("order_status");
				String order_ma = rs.getString("order_ma");
				String order_br = rs.getString("order_br");
				Date order_dt = rs.getDate("order_dt");
				int order_menuno = rs.getInt("order_menuno");
				int order_ea = rs.getInt("order_ea");
				int order_tot = rs.getInt("order_tot");

				System.out.println("주문번호 : " + order_num);
				System.out.println();
				System.out.println("====================================");
				McdOlistVO = new McdOlistVO(order_num, order_pn, order_adr, order_req, order_nm, order_nick,
						order_status, order_ma, order_br, order_dt, order_menuno, order_ea, order_tot);
				System.out.println(McdOlistVO);
				System.out.println();

				rs.close();
				ps.close();
				sql = "SELECT DISTINCT ORDER_BR, ORDER_DT, ORDER_MA FROM ORDER_LIST WHERE ORDER_NM = '" + order_menuno
						+ "'";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println("주문서");
					System.out.println("지점명: " + rs.getString(1));
					System.out.println("주문일자: " + rs.getString(2) + "\n");
					System.out.println("담당자명: " + rs.getString(3) + "\n");
				}
				rs.close();
				ps.close();

				sql = "SELECT DISTINCT ORDER_NM, ORDER_PN, ORDER_ADR FROM ORDER_LIST WHERE ORDER_NM = '" + order_menuno
						+ "'";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println("주문자: " + rs.getString(1));
					System.out.println("연락처: " + rs.getString(2));
					System.out.println("주소: " + rs.getString(3));
				}
				rs.close();
				ps.close();

				sql = "SELECT MENU_NM, SUM(ORDER_EA), SUM(ORDER_TOT) FROM ORDER_LIST O, MENU_INFO M "
						+ "WHERE MENU_NO = ORDER_MENUNO AND ORDER_NM = '" + order_menuno + "' "
						+ "GROUP BY MENU_NM ORDER BY SUM(ORDER_TOT) DESC";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				System.out.println("주문내용:");
				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getInt(2) + "개 " + rs.getInt(3) + "원");
				}
				rs.close();
				ps.close();

				sql = "SELECT SUM(ORDER_TOT) TOTAL FROM ORDER_LIST WHERE ORDER_NM = '" + order_menuno + "' "
						+ "AND ORDER_ADR = '" + order_adr + "' GROUP BY ORDER_NUM";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println();
					System.out.println("총 금액: " + rs.getInt("TOTAL"));
				}
				System.out.println("---------------------------------------");
				rs.close();
				ps.close();

				sql = "SELECT DISTINCT ORDER_REQ FROM ORDER_LIST WHERE ORDER_NM = '" + order_nm + "'";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println("고객요청사항: " + rs.getString(1));
				}
				System.out.println("---------------------------------------");
				rs.close();
				ps.close();

				sql = "SELECT DISTINCT MENU_NM, MENU_WG, MENU_ML, MENU_K, MENU_SU, MENU_D, MENU_F, MENU_N, MENU_C "
						+ "FROM MENU_INFO M, ORDER_LIST O WHERE MENU_NO = ORDER_MENUNO AND ORDER_NM = '" + order_nm
						+ "'";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				System.out.println("칼로리정보");
				while (rs.next()) {
					System.out.println(rs.getString("MENU_NM"));
					System.out.println("- 중량(g): " + rs.getInt("MENU_WG"));
					System.out.println("- 중량(ml): " + rs.getInt("MENU_ML"));
					System.out.println("- 열량(Kcal): " + rs.getDouble("MENU_K"));
					System.out.println("- 당(g): " + rs.getDouble("MENU_SU"));
					System.out.println("- 단백질(g): " + rs.getDouble("MENU_D"));
					System.out.println("- 포화지방(g): " + rs.getDouble("MENU_F"));
					System.out.println("- 나트륨(mg): " + rs.getDouble("MENU_N"));
					System.out.println("- 카페인(mg): " + rs.getDouble("MENU_C"));
					System.out.println();
				}
				rs.close();
				ps.close();
			} else {
				System.out.println("주문실패");
				rs.close();
				ps.close();
				con.close();

			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			close(ps);
			close(con);
		}
	}


	
	
	public void allOrderAd(Scanner sc) { //5
		System.out.print("아이디: ");
		String adId = sc.next();
		System.out.print("비밀번호: ");
		int adPd = sc.nextInt();
		con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM ADMIN_M WHERE ADMIN_ID = ? AND ADMIN_PASSWD = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, adId);
			ps.setInt(2, adPd);
			int c = ps.executeUpdate();
			if (c > 0) {
				ps.close();
				//주문목록(관리자)
				sql = "SELECT * FROM ORDER_LIST";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				System.out.println("주문목록\n");
				while (rs.next()) {
                    System.out.println("[주문상태: " + rs.getString("order_status") + ", 주문번호: " + rs.getString("order_num")
                                    + ", 주문일자: " + rs.getString("order_dt") + ", 주문자명: " + rs.getString("order_nm") + ", 연락처: "
                                    + rs.getInt("order_pn") + ", 주소: " + rs.getString("order_adr") + ", 요청사항: "
                                    + rs.getString("order_req") + ", 주문담당자: " + rs.getString("order_ma") + ", 지점명: "
                                    + rs.getString("order_br") + "]");
				}
				
				close(rs);
			} else {
				System.out.println("관리자만 이용할 수 있는 메뉴입니다.");
				return;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(ps);
			close(con);
		}
	}
	
	public void acceptOrderAd(Scanner sc) { //6
		System.out.print("아이디: ");
		String adId = sc.next();
		System.out.print("비밀번호: ");
		int adPd = sc.nextInt();
		con = getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM ADMIN_M WHERE ADMIN_ID = ? AND ADMIN_PASSWD = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, adId);
			ps.setInt(2, adPd);
			int c = ps.executeUpdate();
			if (c > 0) {
				ps.close();
				//주문상태변경(관리자)
				System.out.println("주문상태 변경할 주문번호 입력하세요.");
			    System.out.print("주문번호 : ");
			    String order_num = sc.next();
			    System.out.println("[변경] 1.조리중(회원), 2.조리중(비회원), 3.주문접수완료(회원), 4.주문접수완료(비회원), 5.종료");
			    int status = sc.nextInt();
			    switch (status) {
	            case 1: { // 1.조리중(회원)
	            	sql = "UPDATE order_list SET order_status = '조리중(회원)' where order_num = ?";
	            	ps = con.prepareStatement(sql);
				    ps.setString(1, order_num);
				    ps.executeUpdate();
	            	System.out.println("주문번호 : " + order_num + ", 조리중(회원) 변경완료");
	            	break;
	            }
	            case 2: { // 2.조리중(비회원)
	            	sql = "UPDATE order_list SET order_status = '조리중(비회원)' where order_num = ?";
	            	ps = con.prepareStatement(sql);
				    ps.setString(1, order_num);
				    ps.executeUpdate();
	            	System.out.println("주문번호 : " + order_num + ", 조리중(비회원) 변경완료");
	            	break;
	            }
	            case 3: { // 3.주문접수완료(회원)
	            	sql = "UPDATE order_list SET order_status = '주문접수완료(회원)' where order_num = ?";
	            	ps = con.prepareStatement(sql);
				    ps.setString(1, order_num);
				    ps.executeUpdate();
	            	System.out.println("주문번호 : " + order_num + ", 주문접수완료(회원) 변경완료");
	            	break;
	            }
	            case 4: { // 4.주문접수완료(비회원)
	            	sql = "UPDATE order_list SET order_status = '주문접수완료(비회원)' where order_num = ?";
	            	ps = con.prepareStatement(sql);
				    ps.setString(1, order_num);
				    ps.executeUpdate();
	            	System.out.println("주문번호 : " + order_num + ", 주문접수완료(비회원) 변경완료");
	            	break;
	            }
	            case 5: { // 5.종료
	            	return;
	            }
	            default: {
	            	System.out.println("명령 입력이 잘못되었습니다. 다시 입력해주세요.");
	            }
	            }
				
			} else {
				System.out.println("관리자만 이용할 수 있는 메뉴입니다.");
				return;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(ps);
			close(con);
		}
	}
}
