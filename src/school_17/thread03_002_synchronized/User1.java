package school_17.thread03_002_synchronized;

public class User1 extends Thread {
    private Calculator calculator; //&100

    public void setCalculator(Calculator calculator) { //&100
        this.setName("User1"); //Thread-0 => User1
        this.calculator = calculator;
    }

    public void run() { //user1.start();
        calculator.setMemory(100);
    }
}
