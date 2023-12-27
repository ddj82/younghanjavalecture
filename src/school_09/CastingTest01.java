package school_09;

public class CastingTest01 {

    public static void main(String[] args) {
        // 레퍼런스 student를 이용하면 name, dept에 접근 가능
        Student student = new Student("Duly"); //자료형 (대표)Student, Person
        System.out.println(student.name); //6. Duly 출력

        // Student 객체의 멤버 중 오직 Person 클래스의 멤버만 접근이 가능
        Person person = student; //업캐스팅 chacha -> pacha //묵시적 형변환 //자료형 (대표)Person, Student
        System.out.println(person.name); //Duly 출력
        person.name = "Gogildong";
        System.out.println(person.name); //Gogildong 출력

        //아래 문장은 컴파일 타임 오류
//		person.dept = "Computer Eng"; //외부접근이 안되서 오류
//		((Student)person).dept = "Computer Eng"; //명시적 형변환으로 외부접근가능, 원본은 그대로
//		System.out.println(person.dept); //외부접근이 안되서 오류
//		System.out.println(((Student)person).dept); //명시적 형변환으로 외부접근가능, 원본은 그대로
    }

}

class Person { //Super 부모 상위 기본
    String name;

    public Person(String name) { //부모 생성자
        this.name = name;
    }
}

class Student extends Person { //Sub 자식 하위 파생
    String dept;

    public Student(String name) { //자식 생성자
        super(name);
        /* 이놈이 없으면 이 자리에 super()가 숨어있음
         * 하지만 Person에는 기타생성자가 있기때문에 기본생성자가 있을수없다
         * 그래서 이놈이 없으면 오류
         * 오류가 안나려면 Person에 기본생성자를 기술해줘야함 (public Person(){})
         */
    }

}
