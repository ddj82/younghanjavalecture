package school_08;

class One1 {
    int d1;
    int s;

    One1() {
        System.out.println("One의 디폴트 생성자");
    }

    One1(int s1) {
        System.out.println("One의 생성자");
        s = s1;
        d1 = s * s;
    }
}

class Two1 extends One1 {
    int d2;
    int t;

    Two1() {
        this(10, 20);
        System.out.println("Two의 디폴트 생성자");
    }

    Two1(int s1, int t1) {
        //super(); // 자식의 생성자 중 마지막으로 실행되는 생성자의 맨 처음 명령에 숨어있음.
        System.out.println("Two의 생성자");
        t = t1;
        d2 = t * t;
    }
}

public class Super02_1 {

    public static void main(String[] args) {
        Two1 super1 = new Two1();
        System.out.println("10의 제곱 : " + super1.d1);
        System.out.println("20의 제곱 : " + super1.d2);
    }

}