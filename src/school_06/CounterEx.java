package school_06;

class Counter {
    static int count = 0;

    Counter() {
        this.count++;
//        Counter.count++;
    }

    public static int getCount() {
//        this.count++;
        return count;
    }

}

public class CounterEx {
    public static void main(String[] args) {
        Counter c1 = new Counter(); //count = 1
        Counter c2 = new Counter(); //count = 2

        System.out.println(Counter.getCount());
        System.out.println(c1.getCount()); // == Countrt.getCount()
        System.out.println(c2.getCount()); // == Countrt.getCount()
    }
}
