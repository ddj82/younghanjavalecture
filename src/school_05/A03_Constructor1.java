package school_05;

class Fruits {
    int apple;
    int straw;
    int grapes;
    int sum;

    public Fruits (int ap, int st, int gr) {
        apple = ap;
        straw = st;
        grapes = gr;
    }

    public int count() {
        sum = apple + straw + grapes;
        return sum;
    }
}

public class A03_Constructor1 {
    public static void main(String[] args) {
        int total;

        Fruits f1 = new Fruits(30, 30, 30);
        total = f1.count();
        System.out.println("객체 f1의 총 개수 = " + total);
        System.out.println("객체 f1의 apple 개수 = " + f1.apple);
        System.out.println("객체 f1의 straw 개수 = " + f1.straw);
        System.out.println("객체 f1의 grapes 개수 = " + f1.grapes);

    }
}
