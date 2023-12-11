package operator;

import java.sql.SQLOutput;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산"); //모두 참 이여야 true
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산"); //둘 중 하나라도 참 이면 true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산"); //논리적 부정
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
