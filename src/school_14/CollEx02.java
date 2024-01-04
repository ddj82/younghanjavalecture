package school_14;

import java.util.*;

public class CollEx02 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("사과"); //0
        list.add("바나나"); //1
        list.add("귤"); //2
        list.add("오렌지"); //3
        list.add("바나나"); //4
//		list.add(1, "바나나"); //4
        //add메소드는 오버로딩 돼있음
        //add(인덱스번호, 요소)로 쓰면 해당 인덱스번호에 요소가 들어가고 인덱스번호가 밀린다.

        System.out.println("list의 요소 : " + list);
        System.out.println("요소의 개수 : " + list.size());

        System.out.println(">> Iterator 객체로 요소 얻기 <<");
//		Iterator elements = list.iterator(); //jdk 1.5이전(java5버전) //이렇게 쓰려면
        Iterator<String> elements = list.iterator();
        while (elements.hasNext()) {
//			String str = (String) elements.next(); //jdk 1.5이전(java5버전) //이렇게 다운캐스팅 해줘야함 //제네릭타입을 안쓰면 요소 덩어리들을 Object자료형으로 인식
            String str = elements.next();
            System.out.print(str + "\t");
        }
        System.out.println("\n");

        System.out.println(">> get메소드로 요소 얻기 <<"); //인덱스번호로 요소 얻기
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }

}
