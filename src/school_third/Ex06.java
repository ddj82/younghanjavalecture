package school_third;

public class Ex06 {
    public static void main(String[] args) {
        int[][] a = new int [2][];

        a[0] = new int[2];
        a[1] = new int[3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j;

                if (j == a[i].length - 1) {
                    System.out.println(a[i][j]);
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
