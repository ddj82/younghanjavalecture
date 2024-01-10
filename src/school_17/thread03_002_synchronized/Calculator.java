package school_17.thread03_002_synchronized;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        //User1에서 100받음 synchronized이 붙어있어서 User1스레드가 끝나고 User2에서 50받음
        //현재 접근하고 있는 스레드명: User1
        //synchronized이 붙어있으면 실행되는 스레드가 있을때 다른 스레드 접근 안됨
        //User1스레드가 끝나고 접근하는 스레드명: User2

        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        System.out.println(Thread.currentThread().getName() + ": " + this.memory);

    }
}