package school_third;

public class Ex07 {
    public static void main(String[] args) {
        int[][] a = {{0, 1}, {2, 3, 4}};

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
