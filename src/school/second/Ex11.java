package school.second;

public class Ex11 {
    public static void main(String[] args) {
//        System.out.println("do~while문 1");
//        int total = 0;
//        int i = 1;
//
//        do {
//            total += i;
//            i++;
//        } while (i <= 10);
//        System.out.println(total);
//        System.out.println(i);

        int i = 5;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);
        System.out.println("\ndo~while문 종료 후 : " + i);
    }
}
