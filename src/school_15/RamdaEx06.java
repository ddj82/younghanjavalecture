package school_15;

interface Ramda6 {
    void test(int a, int b);
}

public class RamdaEx06 {

    public static void main(String[] args) {
        Ramda6 a = (x,y) -> System.out.println("덧셈: "  + (x + y));
        Ramda6 b = (x,y) -> System.out.println("뺄셈: " + (x - y));
        Ramda6 c = (x,y) -> System.out.println("곱셈: " + (x * y));
        Ramda6 d = (x,y) -> System.out.println("나눗셈(몫): " + (x / y));
        Ramda6 e = (x,y) -> System.out.println("나눗셈(나머지): " + (x % y));
        a.test(3, 3);
        b.test(4, 3);
        c.test(5, 3);
        d.test(6, 3);
        e.test(7, 3);
        System.out.println();


        Ramda6 all = (x,y) -> {
            int aa = x + y;
            int bb = x - y;
            int cc = x * y;
            int dd = x / y;
            int ee = x % y;
            System.out.println("덧셈: "  + aa);
            System.out.println("뺄셈: " + bb);
            System.out.println("곱셈: " + cc);
            System.out.println("나눗셈(몫): " + dd);
            System.out.println("나눗셈(나머지): " + ee);
        };
        all.test(10, 5);
        System.out.println();


        Ramda6 all1 = (x,y) -> System.out.println("덧셈: "  + (x + y));
        all1.test(6, 2);
        all1 = (x,y) -> System.out.println("뺄셈: " + (x - y));
        all1.test(6, 2);
        all1 = (x,y) -> System.out.println("곱셈: " + (x * y));
        all1.test(6, 2);
        all1 = (x,y) -> System.out.println("나눗셈(몫): " + (x / y));
        all1.test(6, 2);
        all1 = (x,y) -> System.out.println("나눗셈(나머지): " + (x % y));
        all1.test(6, 2);

    }
}