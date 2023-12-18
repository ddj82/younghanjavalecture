package school_04;

public class ExTest {
    static void add(int a, int b) {
        System.out.println(a + b);
    }
    static void mul(int a, int b) {
        System.out.println(a * b);
    }
    static int div(int a, int b) {
        return (a / b);
    }
    static int mod(int a, int b) {
        return (a % b);
    }

    public static void main(String[] args) {
        add(5, 7);
        mul(5, 3);
        div(30, 3);
        int a4 = mod(19, 3);

        System.out.println(div(30, 3) + "\n" + a4);
    }
}
