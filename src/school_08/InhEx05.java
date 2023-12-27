package school_08;

class B1 {
    int x;
}

class B2 extends B1 {
    String x;
}

public class InhEx05 {

    public static void main(String[] args) {
        B2 b2 = new B2(); //차차케이스, 동일한 이름 속성-자식것만
        b2.x = "자바 상속 extends";

        System.out.println("b2.x : " + b2.x);
        B1 b1 = new B1();
        b1.x = 5000;
        System.out.println("b1.x : " + b1.x);
    }

}
