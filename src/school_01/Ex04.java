package school_01;

public class Ex04 {
    public static void main(String[] args) {
        int a = 10, b = 10;

        int c = a;
        System.out.println("a : " + a + ", c : " + c);

        c = ++a + b;
        System.out.println("a : " + a + ", c : " + c);

        c = a++ + b;
        System.out.println("a : " + a + ", c : " + c);

    }
}
