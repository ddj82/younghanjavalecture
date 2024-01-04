package school_14;

import java.util.*;

public class CollEx06 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>(); //map 호출하면 [] 출력
        map.put("castello", "1234");
        map.put("java", "1111");
        map.put("lang", "1234");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = s.nextLine().trim();

            System.out.print("password : ");
            String password = s.nextLine().trim();
            System.out.println();

//			map.containsKey(id) => map에 접근해서 map에 있는 Key중에 (id)이 포함되어 있는가의 boolean값 리턴
            if (!map.containsKey(id)) {
//			!(map.containsKey(id))의 리턴 boolean값의 !는 반대
//			!(map.containsKey(id) = true)라면 앞에 !로 false 됨
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            } else {
                if (!map.get(id).equals(password)) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                } else {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            }
        }
    }
}