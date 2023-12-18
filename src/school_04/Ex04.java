package school_04;

public class Ex04 {
    static void prn(int x, int y, int z) {
        System.out.println("매개변수3개");
        System.out.println(x + "\t" + y + "\t" + z);
    }
    static void prn(int x, int y) {
        System.out.println("매개변수1개");
        System.out.println(x + "\t" + y);
    }
    static void prn(int x) {
        System.out.println("매개변수2개");
        System.out.println(x);
    }

    public static void main(String[] args) {
        prn(10, 20, 30);
        prn(40, 50);
        prn(60);
    }
}
