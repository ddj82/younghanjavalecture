package school.second;

public class Ex14 {
    public static void main(String[] args) {
//        System.out.println("분기문 for문");
//        int i = 5;
//        for ( ; i >= 1; i--) {
//            if (i == 3) {
//                break;
//            }
//            System.out.print(i + " ");
//        }
//        System.out.println("\nfor문 종료 후 : " + i);

//        System.out.println("분기문 while문");
//        int i = 5;
//        while (i >= 1) {
//            if (i == 3) {
//                break;
//            }
//            System.out.print(i + " ");
//            i--;
//        }
//        System.out.println("\nwhile문 종료 후 : " + i);


        /*
        * 1~ 10까지의 숫자 중 짝수만 출력하도록 로직을 만드세요.
        * for, while, do~while
        */

        System.out.println("1~ 10까지의 숫자 중 짝수만 출력하도록 for문을 만드세요.");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


        System.out.println("\n1~ 10까지의 숫자 중 짝수만 출력하도록 while문을 만드세요.");
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();


        System.out.println("\n1~ 10까지의 숫자 중 짝수만 출력하도록 do~while문을 만드세요.");
        i = 1;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 10);
        System.out.println();


    }
}
