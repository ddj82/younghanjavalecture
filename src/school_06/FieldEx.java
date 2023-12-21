package school_06;

class Field {
    static int classVar = 10; //클래스 변수 선언
    int instanceVar = 20; //인스턴스 변수 선언 = 멤버변수

    //기본생성자 숨어있음
    void method() { //메소드
            int soemthing = 10; //지역변수
            System.out.println(soemthing);
    }
}

public class FieldEx {
    public static void main(String[] args) { //클래스 메소드. 스태틱 메소드, 정적 메소드, 메인 메소드
        int var = 30; //지역변수 선언
        System.out.println(var + "\n"); //지역변수 참조 // 1. 30 출력

        Field myField1 = new Field(); //인스턴스 생성 //공간할당,주소값저장,끝
        Field myField2 = new Field();; //인스턴스 생성 //공간할당,주소값저장,끝

        System.out.println(Field.classVar); //클래스 변수 참조 // 2. 10 출력
        System.out.println(myField1.classVar); // 3. 10 출력
        System.out.println(myField2.classVar + "\n"); // 4. 10 출력

        myField1.classVar = 100; //클래스 변수의 값을 변경

        System.out.println(Field.classVar); //클래스 변수 참조 // 5. 100 출력
        System.out.println(myField1.classVar); // 6. 100 출력
        System.out.println(myField1.classVar + "\n"); // 7. 100 출력

        System.out.println(myField1.instanceVar); //인스턴스 변수 참조 // 8. 20 출력
        System.out.println(myField2.instanceVar); // 9. 20 출력

        myField1.instanceVar = 200; //인스턴스 변수의 값을 변경

        System.out.println(myField1.instanceVar); //인스턴스 변수 참조 // 10. 200 출력
        System.out.println(myField2.instanceVar); // 11. 20 출력
        myField1.method(); // 12. 10 출력

    }
}
