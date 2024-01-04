package school_14;

import java.util.*;
import java.util.Map.Entry; //Entry가 Map의 이너 인터페이스라서 생략불가.

public class CollEx07 {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>(); //map 호출하면 [] 출력
        // key, value로 입력이 가능
        hm.put("hello", 123);
        hm.put("world", 345);
        // key, null로 할 수 있고 value도 null로 할 수 있다.
        hm.put(null, 555);
        hm.put("nullkey", null);
        System.out.println(hm + "\n");
        System.out.println(hm.toString() + "\n"); //위와 같은 값.

        for (String key : hm.keySet()) {
            System.out.println("key : "  + key + ", value : " + hm.get(key));
        }
        // entrySet메소드는 key, value를 볼 수 있게 해준다.
        for (Entry<String, Integer> s : hm.entrySet()) {
            System.out.println(s.getKey() + ", " + s.getValue());
        }

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(); //Map은 순서가 없는데 LinkedHashMap는 순서가 있는 것 처럼 .put한 순서로 저장해 줌.
        lhm.put("hello", 123);
        lhm.put("world", 345);
        // key, null로 할 수 있고 value도 null로 할 수 있다.
        lhm.put(null, 555);
        lhm.put("nullkey", null);
//		lhm.put("world", 777);
//		key값은 중복이 안되지만 .put(K, V) 작성은 됨 //대신 앞에 작성 된 .put(K, V)의 value값이 늦게 작성된 value값으로 덮어써진다.
        System.out.println(lhm + "\n");

        for (String key : lhm.keySet()) {
            System.out.println("key : "  + key + ", value : " + lhm.get(key));
        }
        // entrySet메소드는 key, value를 볼 수 있게 해준다.
        for (Entry<String, Integer> s : lhm.entrySet()) {
            System.out.println(s.getKey() + ", " + s.getValue());
        }

    }

}