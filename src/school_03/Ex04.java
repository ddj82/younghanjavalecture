package school_03;

public class Ex04 {
    public static void main(String[] args) {
//        int[] score = {79, 88, 91, 33, 100, 55, 95};
//
//        int max = score[0];
//        int min = score[0];
//
//        for (int i = 0; i < score.length; i++) {
//            if (score[i] > max) {
//                max = score[i];
//            }
//            if (score[i] < min) {
//                min = score[i];
//            }
//        }
//        System.out.println("최대값 : " + max);
//        System.out.println("최소값 : " + min);


        //변수의 생존범위 예시, 값이 변하지 않는 상수도 for문안에 선언이 되었기 때문에 for문이 돌때마다 달라진다.
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            final int b = a + i;
            System.out.println(a + ", " + b + ", " + i);
        }
    }
}
