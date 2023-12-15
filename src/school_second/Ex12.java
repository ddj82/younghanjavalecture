package school_second;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("중첩 for문");
        for (int j = 1; j <= 5; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
