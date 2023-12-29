package school_11;

class C1 implements A { //인터페이스A의 자식1클래스C1

    @Override
    public void display(String s) { //"안녕하세요? "
        System.out.println("클래스 C1 객체 이용 : " + s);
    }

    @Override
    public void imd() {
        System.out.println("imd메소드 재정의");
    }
}


class C2 implements A {//인터페이스A의 자식2클래스C2

    @Override
    public void display(String s) { //"알기쉽게 해설한 자바."
        System.out.println("클래스 C2 객체 이용 : " + s);
    }

    @Override
    public void imd() {
        System.out.println("imd메소드 재정의");
    }
}


class C3 implements A {//인터페이스A의 자식3클래스C3

    @Override
    public void display(String s) { //"자바를 자바봅시다."
        System.out.println("클래스 C3 객체 이용 : " + s);
    }

    @Override
    public void imd() {
        System.out.println("imd메소드 재정의");
    }

    @Override
    public void dfmd(String str) {
        int a = 5;
        System.out.println("C3클래스 안의 dfmd메소드의 str변수 값: " + str + "와 CONS의 값: " + CONS + "와 a의 값: " + a);
    }

    public void dfmd() {
        System.out.println("dfmd()메소드 오버로딩");
    }

    static public int stmd(int a) {
        return CONS + a;
    }


}


public class AInterEx05 {
    public static void main(String[] args) {
        A memo; //객체선언 //대표자료형-A
        memo = new C1(); //객체생성 //C1으로 //pacha //대표자료형-A, C1
        memo.display("안녕하세요? ");

        memo = new C2(); //객체생성 //C2으로 //pacha //대표자료형-A, C2
        memo.display("알기쉽게 해설한 자바.");

        memo = new C3(); //객체생성 //C3으로 //pacha //대표자료형-A, C3
        memo.display("자바를 자바봅시다.");

        memo.dfmd("\"안녕 자바\"");

        System.out.println(A.stmd(5) + C3.stmd(1));
//		System.out.println(A.stmd(2) + memo.stmd(1)); //에러이유 memo의 대표자료형이 A이고 인터페이스는 static메소드를 클래스명으로 접근불가
    }
}