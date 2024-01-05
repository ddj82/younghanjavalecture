package school_15;

//일반클래스
class Outer {
    int date = 0; //멤버변수
    static int data1 = 50; //멤버static변수

    void myMethod() {
        System.out.println("Outer 클래스의 메소드 date : " + date);
    }

    //Outer의 내부클래스1 - Outer의 멤버 이너클래스
    class InstanceInner {
        int iv = 100; //멤버변수

        void myMethod() {
            System.out.println("InstanceInner 클래스의 메소드 date : " + date + ", iv: " + iv);
        }
    }

    //Outer의 내부클래스2 - Outer의 정적 이너클래스
    static class StaticInner {
        int iv = 200; //멤버변수
        static int cv = 300; //멤버static변수

        void myMethod() {
            System.out.println("StaticInner 클래스의 메소드 date1 : " + data1);
//			System.out.println("StaticInner 클래스의 메소드 date : " + data);
//			클래스 외부 데이터인 경우는 static만 올 수 있다.
            System.out.println("StaticInner 클래스의 iv : " + iv + ", cv: " + cv);
        }
    }
}

public class InnerEx01 {

    public static void main(String[] args) {
        Outer outer  = new Outer();

        //내부클래스 객체생성
        Outer.InstanceInner instanceInner = outer.new InstanceInner();
        System.out.println("instanceInner.iv : " + instanceInner.iv);

        System.out.println();
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
        Outer.StaticInner.cv = 50;
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);

        Outer.StaticInner ststicInner = new Outer.StaticInner();
        Outer.StaticInner ststicInner1 = new Outer.StaticInner();
//		System.out.println("ststicInner.iv : " + ststicInner.iv);
//		System.out.println("ststicInner.cv : " + ststicInner.cv);
//		System.out.println();
//
//		outer.myMethod();
//		instanceInner.myMethod();
        ststicInner.myMethod();

        ststicInner.iv = 50;
        ststicInner1.cv = 999;
        System.out.println("ststicInner.iv : " + ststicInner.iv); //50
        System.out.println("ststicInner1.iv : " + ststicInner1.iv); //50
        System.out.println("ststicInner.cv : " + ststicInner.cv); //999
        System.out.println("ststicInner1.cv : " + ststicInner1.cv); //999
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv); //999
    }

}