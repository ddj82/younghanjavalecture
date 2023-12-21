package school_05;

class ThisTest {
    int x, y;

    public ThisTest() { //기본생성자
        this(10, 10);
    }

    public ThisTest(int x) { //int형 매개변수 1개인 기타생성자
        this(x, 10);
    }

    public ThisTest(int x, int y) { //int형 매개변수 2개인 기타생성자
        this.x = x;
        this.y = y;
    }

    public void setX(int x) { //메소드
        this.x = x;
    }

    public void showPoint() { //메소드
        System.out.println(x + ", " + y);
    }
}

public class ThisMain {
    public static void main(String[] args) {
        ThisTest t01 = new ThisTest(10, 20);
        t01.showPoint();

        ThisTest t02 = new ThisTest(30);
        t02.showPoint();

        ThisTest t03 = new ThisTest();
        t03.showPoint();
    }
}
