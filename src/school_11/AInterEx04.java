package school_11;

class A1 implements A {
    int a = 10; //pacha 외부접근(x) //chacha 외부접근(o)
    static final int CONS = 2; //pacha 외부접근(x) //chacha 외부접근(o)

    //public A1() {} 생략, super()는 없음 부모가 인터페이스여서 생성자가 없음

    @Override
    public void display(String s) { //pacha 외부접근(o)
        System.out.println("display 메소드 구현 " + s);
    }

    @Override
    public void imd() { //pacha 외부접근(o)
        System.out.println("imd메소드 제정의");
    }

    //Override 안됨 //pacha 외부접근(x) //chacha 외부접근(o)
    static int stmd(int c) {
        return CONS + c;
    }

    //Override 안됨 //pacha 외부접근(x) //chacha 외부접근(o)
    void pmd() {
        System.out.println("A1인터페이스 안의 pmd: " + CONS);
    }
}

public class AInterEx04 {
    public static void main(String[] args) {
        //인터페이스 타입의 객체는 인터페이스에서 선언된 상수와 메소드(오버라이드 포함)에만 겁근 가능

        A ob = new A1(); //pacha ob의 대표자료형-A , A1 //pacha pa-interface A cha-class A1
        ob.display("테스트1"); //오버라이드 된 자식 display메소드
        System.out.println("A의 상수 값은 " + ob.CONS); //pacha 이름같은 속성 부모껄로
//		System.out.println("A1의 a 값 출력 " + ob.a); //pacha 외부접근(x)
        System.out.println("A.CONS: " +A.CONS); //pacha 외부접근(o)
//		ob.pmd(); //이름같은 메소드라 오버라이드 되어야 하는데 부모꺼가 private이라 각각임, 각각이라 이름이 같아도 같은게 아님 그래서 오버라이드 안됨,
//				  //pacha라서 자식꺼 사용인데 각각으로 인식하고 이름이 같아도 같은게 아님 그래서 자식꺼도 가려짐, 오류

        //인터페이스의 static메소드는 객체명으로 접근 불가, 오버라이드 불가
//		System.out.println(ob.stmd(5)); //인터페이스명으로 접근 ob. -> A.

        A1 ob2 = new A1(); //chacha ob2의 대표자료형-A1
        ob2.display("테이스2");
        ob2.pmd(); //chacha
        ob2.dfmd("하하하");
        System.out.println("A의 상수 값은 " + ob2.CONS);
        System.out.println("A1.CONS: " + A.CONS); //chacha 외부접근(x)이지만 인터페이스. 으로 접근 스테틱 멤버 접근가능
        System.out.println("A1의 a 값 출력 " + ob2.a);
        System.out.println("ob2.stmd(8) 결과 : " + ob2.stmd(8));
        System.out.println("A.stmd(7) 결과 : " + A.stmd(7));
    }

}