package school_14;

import java.util.*;

public class CollEx05 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
//		HashMap<key꺼 제네릭타입, value꺼 제네릭타입> map = new HashMap<key꺼 제네릭타입, value꺼 제네릭타입>();
        map.put("one", "하나");
        map.put("two", "둘");
        map.put("three", "셋");
        map.put("four", "넷");
        map.put("five", "다섯");
//		map.put(key꺼 = 인덱스역할, value꺼 = 값역할); 그래서 쌍임
//		Map구조는 건물구조


        Set<String> keys = map.keySet();
//		map.keySet() => 맵(키,값)으로 이루어져있고 map을 가리키는곳에 접근해서 key들만 일렬로 세팅해라 //인덱스가 없어서 순서는 없음
        Iterator<String> iter = keys.iterator();
//		Iterator => 반복자 //반복자는 일렬로 나열된 형태에서만 사용할 수 있음.

        while (iter.hasNext()) {
            String key = iter.next();
            System.out.printf("key : %s\t value : %s\n", key, map.get(key));
        }

        Collection<String> value = map.values();
//		map.values() => 맵(키,값)으로 이루어져있고 map을 가리키는곳에 접근해서 values들만 일렬로 세팅해라
        iter = value.iterator();
//		Iterator => 반복자 //반복자는 일렬로 나열된 형태에서만 사용할 수 있음.
        while (iter.hasNext()) {
            System.out.printf("value : %s\n", iter.next());
        }

//		Set<String> keys = map.keySet();
//		for(String s : keys) {
//			System.out.printf("key : %s , value : %s \n", s, map.get(s));
//		}
//		Collection<String> value = map.values();
//		for(String s : keys) {
//			System.out.printf("value : %s \n", s, s);
//		}
    }

}