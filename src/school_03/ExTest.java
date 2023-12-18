package school_03;

public class ExTest {
    public static void main(String[] args) {
        /*
         * 국어 : 80점
         * 영어 : 96점
         * 수학 : 100점
         * 홍길동님의 평균은 92.0점입니다.
         *
         */

        String[] sj = {"국어", "영어", "수학"};
        int[] score = {80, 96, 100};
        int tot = 0;

        for (int i = 0; i < sj.length; i++) {
            System.out.println(sj[i] + " : " + score[i]);
            tot += score[i];
        }
        System.out.println("홍길동님의 평균은 " + ((double)tot / sj.length) + "점입니다.");
    }
}
