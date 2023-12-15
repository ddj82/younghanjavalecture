package school_third;

public class Ex02 {
    public static void main(String[] args) {
        String[] a = new String[3];
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.println("a[ " + i + " ] = " + a[i]);
            //String의 자동초기화값 null이 입력된다.
        }

        a[0] = "국어";
        a[1] = "수학";
        a[2] = "과학";

        for (i = 0; i < a.length; i++) {
            System.out.println("a[ " + i + " ] = " + a[i]);
        }
    }
}
