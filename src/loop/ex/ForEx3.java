package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
//        int max = 100;
//        for (int sum = 1, i = 1; i <= max; i++, sum += i) {
//            System.out.println("max=" + i);
//            System.out.println(sum);
//        }
        int max = 100;
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
