package school_05;

class Fruit {
    private int apple;
    private int straw;
    private int grapes;

    public void setFruit(int ap, int st, int gr) {
        apple = ap;
        straw = st;
        grapes = gr;
    }

    public int getFruit() {
        int result = apple + straw + grapes;
        return result;
    }
}


public class Ex2 {
    public static void main(String[] args) {
        int quantity1, quantity2;
        Fruit f1 = new Fruit();
        Fruit f2 = f1;
        f1.setFruit(5, 10, 15);
        quantity1 = f1.getFruit();
        quantity2 = f2.getFruit();
        System.out.println("객체 f1의 초기 과일 개수 " + quantity1 + "개");
        System.out.println("객체 f2의 초기 과일 개수 " + quantity2 + "개");

        f2.setFruit(10, 15, 20);
        quantity1 = f1.getFruit();
        quantity2 = f2.getFruit();
        System.out.println("객체 f1의 초기 과일 개수 " + quantity1 + "개");
        System.out.println("객체 f2의 초기 과일 개수 " + quantity2 + "개");

    }
}
