package school_18_jdbc.dbc6;

import java.util.*;

public class LoginMain {

	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		LoginSVC loginSVC = new LoginSVC();
		int add = 0;
		String x = null;
		
		do {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("로그인은 1번, 회원가입은 2번, 회원탈퇴는 3번, 프로그램 종료는 4번을 눌러주세요.");
			System.out.print(": ");
			add = sc.nextInt();
			switch (add) {
			case 1: {
				System.out.println("로그인 화면");
				System.out.println("아이디와 비밀번호를 입력하세요.");
				
				System.out.print("아이디 : ");
				String id = sc.next().toLowerCase();
				
				System.out.print("비밀번호 : ");
				String passwd = sc.next().toLowerCase();
				
				User user = loginSVC.login(id, passwd);
				if (user != null) {
					System.out.println(user.getId() + " 님이 로그인 되었습니다.");
					System.out.println(user);
//					isStop = true;
					break;
				} else {
					continue;
				}
				
				
			}
			case 2: {
				System.out.println("회원가입 진행은 1번, 로그인 화면은 2번을 눌러주세요.");
				System.out.print(": ");
				int add1 = sc.nextInt();
				if (add1 == 1) {
				System.out.print("가입하실 아이디를 입력하세요: ");
				String id = sc.next().toLowerCase();
				
				System.out.print("사용하실 비밀번호를 입력하세요: ");
				String passwd = sc.next().toLowerCase();
				
				System.out.print("이름을 입력하세요: ");
				String name = sc.next();
				
//				System.out.print("나이를 입력하세요: ");
//				int age = sc.nextInt();
//				
//				System.out.print("주소를 입력하세요: ");
//				String addr = sc.next();
//				
//				System.out.print("이메일을 입력하세요: ");
//				String email = sc.next();
				
				int age = 0;
				String addr = null;
				String email = null;
				
				User user = loginSVC.insertMember(id, passwd, name, age, addr, email);
				System.out.println(user.getId() + " 님 회원가입 되었습니다.");
				System.out.println(user);
//				isStop = true;
				break;
				} else if (x != null) {
					System.out.println("잘못 입력하였습니다.");
					x = null;
					add = 2;
				} else {
					continue;
				}
			}
			
			case 3: {
				System.out.println("회원탈퇴 진행은 1번, 로그인 화면은 2번을 눌러주세요.");
				System.out.print(": ");
				int add2 = sc.nextInt();
				if (add2 == 1) {
					System.out.print("탈퇴하실 아이디를 입력하세요: ");
					String id = sc.next().toLowerCase();
					
					System.out.print("비밀번호를 입력하세요: ");
					String passwd = sc.next().toLowerCase();
					
					User user = loginSVC.deleteMember(id, passwd);
					if (user != null) {
						System.out.println(user.getId() + " 님 회원탈퇴 되었습니다.");
					} else {
						continue;
					}
//					isStop = true;
					break;
					} else {
						continue;
					}
			}
			case 4: {
				System.out.println("프로그램을 종료합니다.");
				isStop = true; 
				break;
			} default: {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			}
			} while (!isStop);
			
			
	}

}
