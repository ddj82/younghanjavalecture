package school_17.thread03_001_unsynchronized;

public class User2 extends Thread {
    private Calculator calculator; //null => &100

    public void setCalculator(Calculator calculator) { //&100
        this.setName("User2"); //Thread-0 => User2
        this.calculator = calculator; //&100
    }

    public void run() {
        calculator.setMemory(50); //&100에 50
    }
}