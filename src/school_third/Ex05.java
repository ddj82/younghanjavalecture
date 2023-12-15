package school_third;

public class Ex05 {
    public static void main(String[] args) {
        int[][] a = new int [2][3];
        a[0][0] = 0;
        a[0][1] = 1;
        a[0][2] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 5;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == a[i].length - 1) {
                    System.out.println(a[i][j]);
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
