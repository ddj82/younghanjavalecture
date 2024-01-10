package school_17.thread03_001_unsynchronized;

public class User1 extends Thread {
    private Calculator calculator; //null => &100

    public void setCalculator(Calculator calculator) { //&100
        this.setName("User1"); //Thread-1 => User1
        this.calculator = calculator;  //&100
    }

    public void run() {
        calculator.setMemory(100); //&100에 100
    }
}