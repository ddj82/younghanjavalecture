package school_17.thread03_002_synchronized;

public class User2 extends Thread {
    private Calculator calculator; //&100

    public void setCalculator(Calculator calculator) { //&100
        this.setName("User2"); //Thread-1 => User2
        this.calculator = calculator;
    }

    public void run() { //user2.start();
        calculator.setMemory(50);
    }
}