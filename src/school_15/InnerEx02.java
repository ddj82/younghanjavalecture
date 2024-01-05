package school_15;

public class InnerEx02 {

    private int data = 30; //멤버변수

    void display() { //일반메소드
        class Local { //지역 내부클래스 //내부클래스 선언문
            void msg() { //지역 내부클래스의 내부메소드
                System.out.println(data); //30
                display2();
            }
        }

        Local l = new Local();
        l.msg();
    } //메소드 종료되면서 클래스Local는 사라짐

    class InetanceInner { //인스턴스 내부클래스
        int iv = 100;
        void myMethod() {
            display();
//			msg();
            System.out.println("InetanceInner 클래스의 메소드 data : " + data + ", iv: " + iv);
        }
    }

    void display2() { //멤버 일반메소드
        System.out.println("display2() 메소드 호출");
    }

    public static void main(String[] args) {
        InnerEx02 obj = new InnerEx02();
        obj.display();
        InnerEx02.InetanceInner obj1 = obj.new InetanceInner();
        obj1.myMethod();
    }

}