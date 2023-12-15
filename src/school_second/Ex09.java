package school_second;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("for문 2");
        for(int n = 1; n <= 10; n++) {
            if (n % 2 == 1) {
                continue;
            }
            System.out.println(n);
        }
        System.out.println();

        System.out.println("for문 3");
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.print("\n");

        System.out.println("while문 1");
        int total = 0, i = 1;

        while(i <= 10) {
            total += i;
            i++;
        }
        System.out.println("total의 값은: " + total);
        System.out.println("i의 값은: " + i);
    }
}
