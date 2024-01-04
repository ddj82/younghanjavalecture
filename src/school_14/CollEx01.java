package school_14;

import java.util.*;

public class CollEx01 {

    public static void main(String[] args) {
        //리스트 생성
        ArrayList<String> arrList = new ArrayList<String>(); //String[] sList = new String[4]
        //ArrayList arrList = new ArrayList(); 처럼 제네릭타입을 안쓰면 해당 리스트의 요소들을 Object자료형으로 인식함
//		ArrayList<String> arrList = new ArrayList<>(); 둘다 가능

        //리스트에 요소의 저장
        arrList.add("넷"); //String[0] = "넷"
        arrList.add("둘"); //String[1] = "둘"
        arrList.add("셋"); //String[2] = "셋"
        arrList.add("하나"); //String[3] = "하나"

        System.out.println("arrList1: " + arrList);

        //리스트 요소의 출력
        for (String s : arrList) {
            System.out.println(s);
        }

        System.out.println("arrList1의 크기: " + arrList.size()); //sList.length

//		arrList.remove(1); //arrList.remove(1번인덱스) => arrList리스트의 1번인덱스요소방을 삭제해라.
        arrList.clear(); //arrList.clear() => arrList리스트의 모든 방을 삭제해라. 여기서 arrList리스트의 공간(new)은 남아있다.
        System.out.println("arrList2: " + arrList);
        System.out.println("arrList2의 크기: " + arrList.size()); //sList.length


        List<String> lst = new ArrayList<String>();
        lst.add("alpha");
        lst.add("beta");
        lst.add("charlie");
        System.out.println("lst객체: " + lst);

        Iterator<String> iter = lst.iterator();//Iterator => 반복자 //StringTokenizer처럼 lst.iterator()에서 해당 lst리스트의 요소들을 덩어리로, 원본훼손 x
        //Iterator => 반복자 //반복자는 일렬로 나열된 형태에서만 사용할 수 있음.
//		Iterator iter = lst.iterator(); //제네릭타입을 안쓰면 덩어리들을 Object자료형으로 인식함
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }

        for (String str : lst) {
            System.out.println(str);
        }

    }
}