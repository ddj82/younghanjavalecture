package school_14;

import java.util.*;

public class CollEx04 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        //ArrayList<Student>자료형으로 리스트기차 만듬.
        //이 리스트기차 주소값(&10)주고 list 가리킴
        //public Student(String name, int ban, int no)
        list.add(new Student("자바왕", 1, 1)); //Student("자바왕", 1, 1)인스턴스 주소값(&100) //0 //주소값(&10)list 리스트기차 0번방에 투입
        list.add(new Student("자바짱", 1, 2)); //Student("자바짱", 1, 2)인스턴스 주소값(&200) //1 //주소값(&10)list 리스트기차 1번방에 투입
        list.add(new Student("홍길동", 2, 1)); //Student("홍길동", 2, 1)인스턴스 주소값(&300) //2 //주소값(&10)list 리스트기차 2번방에 투입
        list.add(new Student("전우치", 2, 2)); //Student("전우치", 2, 2)인스턴스 주소값(&400) //3 //주소값(&10)list 리스트기차 3번방에 투입
        //ArrayList<Student>자료형 리스트기차 방개수 = 4 (list.size())

        Iterator<Student> it = list.iterator();
        //list 리스트기차의 요소들을 덩어리로
        //주소값(&100) 주소값(&200) 주소값(&300) 주소값(&400)

        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name + " " + s.ban + "반 " + s.no + "번");
        }
    }
}
