package school_17.thread02;

public class ThreadNameExample {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

        ThreadA threadA = new ThreadA();
        //원래 이름이 Thread-0 인데 => ThreadA의 생성자에서 setName()을 하니 ThreadA가 됨
        System.out.println("작업 스레드 이름: " + threadA.getName());
        threadA.start();

        ThreadB threadB = new ThreadB(); //Thread-1
        System.out.println("작업 스레드 이름: " + threadB.getName());
        threadB.start();

    }

}