package school_14;

import java.util.*;

public class CollEx09 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>(); //객체생성 //[]
        //HashSet 생성
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(1); //덮어써진다 //add()는 4번이지만 사이즈는 3
        System.out.println("0번: " + set);

        set.remove(2);
        System.out.println("0-1번: " + set);

		System.out.println("set.size(): " +set.size());

//		List<Integer> ls = Arrays.asList(2, 1, 3);
//		for (int a : ls) {
//			System.out.println("ls: " + a);
//		}
//		ㄴ asList() 예시

		set = new HashSet<Integer>(Arrays.asList(2, 1, 3)); //asList() => 순서가있는 객체(List)를 만드는데 매개변수(2, 1, 3)이 순서로 만들어달라는 메소드.
		//List와 Set은 서로 주고받고 가능 //List => Set (순서가 있던걸 없애버림) //Set => List (순서가 정해짐)
		System.out.println("1번: " + set);
		System.out.println(set);
		Iterator<Integer> iter = set.iterator(); //인덱스가 없어서 순서는 없지만 List처럼 일렬로 나열된 형태
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();

		Set<Integer> linkedSet1 = new LinkedHashSet<Integer>(Arrays.asList(3, 1, 2));
//		Set<Integer> linkedSet1 = new LinkedHashSet<Integer>(Arrays.asList(2, 1, 3));
		System.out.println("2번: " + linkedSet1); //전체출력 [1, 2, 3]

		Iterator<Integer> iter1 = linkedSet1.iterator(); //Iterator 사용
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		System.out.println();

    }

}
