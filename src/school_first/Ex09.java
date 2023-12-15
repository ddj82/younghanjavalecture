package school_first;

public class Ex09 {
    public static void main(String[] args) {
        //비트연산 AND
//        System.out.println("비트연산 AND : 곱");
//        System.out.println(0 & 0); //0
//        System.out.println(0 & 1); //0
//        System.out.println(1 & 0); //0
//        System.out.println(1 & 1); //1
//        System.out.println(12 & 5); //4
//        /*
//        12 >> 2진수로
//        (8  4  2  1)
//        1  1  0  0  << 12 2진수
//
//        5 >> 2진수로
//        (8  4  2  1)
//        0  1  0  1  << 5 2진수
//
//        12 & 5 >> 2진수로 만들어서 곱
//        (8  4  2  1)
//        1  1  0  0
//        0  1  0  1

//        0  1  0  0  >> 4
//         */

        //비트연산 OR
//        System.out.println("비트연산 OR : 합");
//        System.out.println(0 | 0); //0
//        System.out.println(0 | 1); //1
//        System.out.println(1 | 0); //1
//        System.out.println(1 | 1); //1
//        System.out.println(12 | 5); //13
//        /*
//        (8  4  2  1)
//        1  1  0  0  << 12 2진수
//        0  1  0  1  << 5 2진수
//
//        1  1  0  1  >> 13
//         */

        //비트연산 XOR
        System.out.println("비트연산 XOR : 배타적 합");
        System.out.println(0 ^ 0); //0
        System.out.println(0 ^ 1); //1
        System.out.println(1 ^ 0); //1
        System.out.println(1 ^ 1); //0
        System.out.println(12 ^ 5); //9
        /*
        (8  4  2  1)
        1  1  0  0  << 12 2진수
        0  1  0  1  << 5 2진수

        1  0  0  1  >> 9
         */


    }
}
