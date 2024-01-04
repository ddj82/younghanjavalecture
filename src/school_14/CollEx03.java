package school_14;

import java.util.*;

public class CollEx03 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("사과"); //0 		//.add(2, "키위"); 후//0 									//.remove(1); 후//0
        list.add("수박"); //1 		//.add(2, "키위"); 후//1 									//.remove(1); 후//제거
//		list.add(2, "키위"); 			//.add(2, "키위"); 후//2 									//.remove(1); 후//1
        list.add("귤");  //2 		//.add(2, "키위"); 후//3 									//.remove(1); 후//2
        list.add("딸기"); //3 		//.add(2, "키위"); 후//4 	 //.set(4, "포도") 후//딸기 => 포도  //.remove(1); 후//3
        list.add("체리"); //4 		//.add(2, "키위"); 후//5 									//.remove(1); 후//4

        prn(list);

        System.out.println(">> 인덱스 2인 위치에 키위 삽입 <<");
        list.add(2, "키위"); //2
        prn(list);

        System.out.println(">> 인덱스 4인 위치의 데이터를 포도로 변경 <<");
        list.set(4, "포도"); //딸기 => 포도
        prn(list);

        System.out.println(">> 인덱스 1인 위치의 데이터를 제거 <<");
        list.remove(1); //후 방개수6 => 5
        prn(list);

        System.out.println(">> 사과 데이터를 찾아서 제거 <<");
        list.remove("사과"); //해당 요소가 2개이상 있으면 가장 앞에 있는 요소 1개만 삭제
        prn(list);

        System.out.println(">> 원하는 데이터를 찾아서 제거 <<");
        ArrayList<String> apple = new ArrayList<String>();
        apple.add("사과");
        apple.add("귤");
        list.removeAll(apple);
        prn(list);


    }

    static void prn(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println("\n");
    }

}