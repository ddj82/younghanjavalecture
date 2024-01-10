package school_17.thread03_001_unsynchronized;

public class MainThreadExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //공간할당, 주소값부여, &100

        User2 user2 = new User2(); //Thread-0
        user2.setCalculator(calculator); //setCalculator(&100) //Thread-0 => User2
        user2.start(); //run() 실행

        User1 user1 = new User1(); //Thread-1
        user1.setCalculator(calculator); //setCalculator(&100) //Thread-1 => User1
        user1.start(); //run() 실행
    }

}