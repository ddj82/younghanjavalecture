package school_17.thread03_001_unsynchronized;

public class Calculator {
    private int memory; //&100에 50  //&100에 100

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
//		System.out.println(4 / 0); //하나의 스레드에서 에러가 나면 모든 스레드에 에러
        try {
            Thread.sleep(2000); //Thread. = User2, User1
        } catch (InterruptedException e) {

        }

        System.out.println(Thread.currentThread().getName() + ": " + this.memory);

    }
}