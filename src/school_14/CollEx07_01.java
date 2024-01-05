package school_14;

import java.util.*;
import java.util.Map.Entry;

public class CollEx07_01 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>(); //객체생성만, //[]
        hm.put(0, "하늘");
        hm.put(1, "바람");
        hm.put(2, "가지");
        hm.put(3, "태양");

        System.out.println(hm + "\n");
        System.out.println("hm.get(3): " + hm.get(3));
        System.out.println("hm.get(3): " + hm.get("3")); //없는 키값엔 에러가 아니라 없어요의 null 출력

        for (int i = 0; i < hm.size(); i++) {
            System.out.println("[" + i + "]번의 값: "  + hm.get(i));
        }

        for (int key : hm.keySet()) {
            System.out.println("key : " + key + ", value : "  + hm.get(key));
        }
        // entrySet()메소드는 key, value를 볼 수 있게 해준다.
        for (Entry<Integer, String> s : hm.entrySet()) {
            System.out.println(s.getKey() + ", " + s.getValue());
        }
    }

}