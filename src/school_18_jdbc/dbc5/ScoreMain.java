package school_18_jdbc.dbc5;

import java.util.*;

public class ScoreMain {

	public static void main(String[] args) {
		String ch;
		Score ob = new Score();
		Scanner sc = new Scanner(System.in);
		
		try {
			paLavel:
			while (true) {
				System.out.print("1.입력 2.수정 3.삭제 4.이름검색 5.전체출력 6.종료 => ");
				ch = sc.nextLine(); //공백이 가능한 한 줄 명령을 받음
				
				switch (ch.replace(" ", "")) { //.replace(" ", "") -> (a, b) 중 a를 b로 바꾸는 String메소드
				case "1": case "입력": {
					if (ob.insertDate() != 0) {
						System.out.println("입력 성공!");
					}
					break;
				}
				case "2": case "수정": {
					if (ob.updateDate() != 0) {
						System.out.println("수정 성공!");
					} else {
						System.out.println("수정 실패!");
					}
					break;
				}
				case "3": case "삭제": {
					if (ob.deleteDate() != 0) {
						System.out.println("삭제 성공!");
					} else {
						System.out.println("삭제 실패!");
					}
					break;
				}
				case "4": case "이름검색": {
					ob.selectName();
					break;
				}
				case "5": case "전체출력": {
					ob.selectAll();
					break;
				}
				case "6": {
					System.out.println("종료되었습니다.");
					DBConn.close();
//					System.exit(0); //프로그램 강제 종료, 대신에 return문을 사용하는 것을 권장
//					return;
					break paLavel;
				} default: {
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
