package school_01;

public class Ex03 {
    public static void main(String[] args) {
        int a = 3;

        ++a;
        System.out.println("1: " + a);
        a--;
        System.out.println("2: " + a);

        int x = 5;
        int y = ++x;
        System.out.println("3: " + x + " " + y);

        int x2 = 5;
        int y2 = x2++;
        System.out.println("4: " + x2 + " " + y2);
        /*
        x2 = 5;
        y2 = x2++ >>> y2 = (x2) / x2++ >>> y2 = 5; / x2 = x2 + 1 >>>
        y2 = 5; / x2 = 6;
         */
    }

}
