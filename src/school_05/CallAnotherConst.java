package school_05;

class Person {
    String name;
    int age;

    Person() { //기본생성자
        this("이름 없음", 1);
    }

    Person(String name, int age) { //기타생성자
        this.name = name;
        this.age = age;
    }

    Person returnItSelf() { //리턴타입이 객체(객체의 자료형은 클래스명)인 메소드
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name); //이름 없음
        System.out.println(noName.age); //1

        Person p = noName.returnItSelf(); //메소드 호출문, 리턴값이 있는 메소드이므로 p = 리턴값
        System.out.println(p); //리턴값이 this이고 해당 메소드에서 this는 Person인스턴스의 주소값 출력
        System.out.println(noName); //noName도 Person인스턴스의 주소값 이므로 위와 동일한 주소값 출력
    }
}
