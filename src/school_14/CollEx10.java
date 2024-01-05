package school_14;

import java.util.*;

public class CollEx10 {

    public static void main(String[] args) {
        Set<Student> stSet = new HashSet<Student>(); //객체생성 //[] //주소지&10
        Student st = new Student("홍길동", 1, 1); //객체생성 //기타생성자호출 //주소지&20
        stSet.add(new Student("홍길동", 1, 1)); //add(객체생성 //기타생성자호출 //주소지&30)
        stSet.add(new Student("전우치", 2, 1)); //add(객체생성 //기타생성자호출 //주소지&40)
        stSet.add(st); //주소지&20 //주소지&30와 내용은 같지만 다른 주소지라서 가능
        stSet.add(st); //중복은 덮어써짐

        System.out.println("stSet.size(): " + stSet.size());
        Iterator<Student> it = stSet.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name + "님은 " + s.ban + "반, " + s.no + "번 입니다.");
        }
        System.out.println("\n--------------------\n");

        //객체를 넣을땐 지울때 불러줄 이름이 필요하다
        //new로 넣게 되면 지울 수 없음
        //st처럼 객체를 생성하고 주소값을 가리키고 있어야만 요소를 지울 수 있음
        stSet.remove(st);

        it = stSet.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name + "님은 " + s.ban + "반, " + s.no + "번 입니다.");
        }

    }

}