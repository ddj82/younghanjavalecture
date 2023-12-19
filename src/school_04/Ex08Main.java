package school_04;

public class Ex08Main {
    public static void main(String[] args) {
        Ex08Class e8c = new Ex08Class();
        double result;

        e8c.test();
        e8c.test(5, 10);
        result = e8c.test(100);
        System.out.println("e8c.test(100)의 결과 : " + result);
        result = e8c.test(4.2);
        System.out.println("e8c.test(4.2)의 결과 : " + result);

    }
}


class Ex08Class {
    void test() {
        System.out.println("매개변수 없음");
    }

    void test (int a, int b) {
        System.out.println("매개변수 int " + a + "와 int " + b);
    }

    double test(double a) {
        System.out.println("매개변수 double " + a);
        return a * 2;
    }
}
