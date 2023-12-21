package school_06;

class Method { //일반클래스 Method
    int a = 10, b = 20; //멤버변수, 인스턴스변수
    //기본생성자 숨어있음 public Method() {}
    int add() { //매개변수가 없는 일반 메소드, 멤버메소드, 인스턴스메소드
        return a + b; //호출한 놈에게 리턴값 a + b 줌
    }
    static int add(int x, int y) { //매개변수가 int, int 2개인 공유 클래스 메소드, 정적 메소드, 스태틱 메소드
        return x + y; //호출한 놈에게 리턴값 x + y 줌
    }
}

public class MethodEx { //메인클래스 MethodEx
    public static void main(String[] args) { //클래스 메소드, 정적 메소드, 스태틱 메소드, 메인메소드
        System.out.println(Method.add(20, 30)); //리턴값 50 출력
        //Method.add(20, 30) => 클래스 메소드 호출문, 정적 메소드 호출문, 스태틱 메소드 호출문

        Method myMethod = new Method(); //객체생성문 //공간할당, 주소값할당, 끝
        System.out.println(myMethod.add()); //리턴값 30 출력
        //myMethod.add() => 메소드 호출문, 멤버메소드 호출문, 인스턴스메소드 호출문
    }
}
