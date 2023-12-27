package school_08;

class C1 {
    static int x;
    static int y;

    //20231227_추가
    static void md() {
        System.out.println("C1의 md()호출");
    }

    //20231227_추가
    static void md1() {
        System.out.println("C1의 md1()호출");
    }
}

//클래스 변수도 상속됨
class C2 extends C1 {
    static String x;

    //20231227_추가
    static void md() {
        System.out.println("C2의 md()호출");
    }
}

public class InhEx06 {
    public static void main(String[] args) {
        C2.x = "알기쉽게 해설한 자바"; //모두 static영역에 들어있기때문에 C2.으로 호출하면 chacha케이스 속성
        //C1 클래스에서 선언된 int x는 가려짐
        C2.y = 20000; //static영역에 들어있기때문에 C2.으로 호출하면 chacha케이스 속성
        C1.x = 30000; //모두 static영역에 들어있기때문에 C1.으로 호출하면 papa케이스 속성
        System.out.println("C2.x : " + C2.x);
        System.out.println("C2.y : " + C2.y);
        System.out.println("C1.x : " + C1.x);

        //20231227_추가
        C1.md(); //모두 static영역에 들어있기때문에 C1.으로 호출하면 papa케이스 속성
        C2.md(); //static영역에 들어있기때문에 C2.으로 호출하면 chacha케이스 속성

        C1 c = new C2(); //pacha
        c.md(); //호출한 메소드가 부모자식 같은 메소드이고 static메소드이면 대표자료형 메소드를 호출

        C2 cc = new C2(); //chacha
        cc.md(); //호출한 메소드가 부모자식 같은 메소드이고 static메소드이면 대표자료형 메소드를 호출
        cc.md1(); //호출한 메소드가 부모 메소드에만 있고 static메소드이면 부모 메소드 호출 //대표자료형이 자식이지만 부모에 있기때문
    }

}
