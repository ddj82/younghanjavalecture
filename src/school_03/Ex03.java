package school_03;

public class Ex03 {
    public static void main(String[] args) {
        int[] a = {95, 73, 100};
        int[] b = {100, 100, 100};
        int tot = 0, tot1 = 0;
        double avg;
        int i;

        for (i = 0; i < a.length; i++) {
            tot += a[i];
            tot1 += b[i];
        }

        avg = (double) tot / a.length;
        avg = tot / a.length;

        System.out.println("a의 총합 = " + tot);
        System.out.println("a의 평균 = " + avg);
        System.out.println("b의 총합 = " + tot1);
    }
}
