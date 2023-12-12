package school;

public class Ex10 {
    public static void main(String[] args) {
//        //논리곱 연산 : 모두 참(true)인 경우만 true
//        System.out.println(true && true); //true
//        System.out.println(true && false); //false
//        System.out.println(false && true); //false
//        System.out.println(false && false); //false
//        // x && y 에서 x가 false이면 논리곱 연산은 y까지 읽지 않음

//        //논리합 연산 : 모두 거짓(false)인 경우만 false
//        System.out.println(true || true); //true
//        System.out.println(true || false); //true
//        System.out.println(false || true); //true
//        System.out.println(false || false); //false
//        // x || y 에서 x가 true이면 논리합 연산은 y까지 읽지 않음

        //논리연산 논리곱 &&
//        int value1 = 3;
//        System.out.println("논리연산 논리곱 &&");
//        System.out.println(false && ++value1 > 6); //false
//        // x && y 에서 x가 false이면 논리곱 연산은 y까지 읽지 않음(++value1 > 6 무시)
//        System.out.println(value1); //3
//        System.out.println(true && ++value1 > 6); //false
//        System.out.println(value1); //4

        //논리연산 논리합 ||
        int value2 = 5;
        System.out.println(true || value2++ > 6); //true
        // x || y 에서 x가 true이면 논리합 연산은 y까지 읽지 않음(value++ > 6 무시)
        System.out.println(value2); //5
        System.out.println(false || value2++ > 6); //false
        //f || value2 > 6 // f || f // value2 = value2 + 1
        System.out.println(value2); //6


    }
}
