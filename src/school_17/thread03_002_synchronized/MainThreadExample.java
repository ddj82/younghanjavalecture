package school_17.thread03_002_synchronized;

public class MainThreadExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //&100

        User1 user1 = new User1(); //Thread-0
        user1.setCalculator(calculator); //&100보냄
        user1.start(); //run()실행

        User2 user2 = new User2(); //Thread-1
        user2.setCalculator(calculator); //&100보냄
        user2.start(); //run()실행인데
        //synchronized이 붙어있으면 실행되는 스레드가 있을때 다른 스레드 접근 안됨
        //User1스레드가 끝나고 User2스레드 실행
    }

}