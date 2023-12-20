package school_05;

class Fruits1 {
    int apple;
    private int straw;
    private int grapes;
    int sum;

    public Fruits1 (int ap, int st, int gr) {
        apple = ap;
        straw = st;
        grapes = gr;
    }

    public int count() {
        sum = apple + straw + grapes;
        return sum;
    }
}

public class A04_Ex {
    public static void main(String[] args) {
        int total;
        Fruits1 f1 = new Fruits1(30, 30, 30);
        total = f1.count();
        System.out.println(total);
        System.out.println(f1.count());
        System.out.println(f1.apple);
    }
}
