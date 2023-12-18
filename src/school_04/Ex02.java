package school_04;

public class Ex02 {
    static void sum(int a, int b) {
        int c = a + b;
        System.out.println("a + b = " + c);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        sum(a, b); // sum(10, 20);
        sum(4, 5);
        /* 메소드 호출시 지켜야 할 사항
         * 메소드의 이름
         * 메소드의 매개변수 개수
         * 메손드의 매개변수 자료형
         * 메소드의 매개변수 나열순서(선언된 자료형 순서대로, 자료형 개수만큼)
         */
    }
}
