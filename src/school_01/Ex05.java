package school_01;

public class Ex05 {
    public static void main(String[] args) {
        // 혼합대입연산자
        int a = 10;
        int b = a;

        System.out.println(b); // b = 10

        b += a; //b = b + a
        System.out.println(b); // b = 20

        b -= a; // b = b - a
        System.out.println(b); // b = 10

        b *= a; // b = b * a
        System.out.println(b); // b = 100

        b /= a; // b = b / a
        System.out.println(b); // b = 10

        b %= a; // b = b % a
        System.out.println(b); // b = 0
    }
}
