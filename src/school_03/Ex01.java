package school_03;

public class Ex01 {
    public static void main(String[] args) {
        //배열의 요소값이 기본 자료형인 경우
        int[] a;
        a = new int[] {1, 2, 3, 4, 5};
        System.out.println(a); //int배열 a의 주소값이 입력된다.

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();



//        //배열의 길이(방개수)
        System.out.println(a.length);

        int[] b = new int[5];
        b[2] = 1;
        System.out.println(b); //int배열 b의 주소값이 입력된다.
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();


        //for확장형
        int[] c = {1, 2, 3, 4, 5};
        System.out.println(c); //int배열 c의 주소값이 입력된다.
        for (int i : c) {
            System.out.print(i + " ");
        }
    }
}
