package school_17.thread04;

class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread5 : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinEx {

    public static void main(String[] args) { //메인스레드 생성 //메인메소드 시작시 메인스레드 시작
        MyThread thread = new MyThread(); //Thread 객체 생성 //Thread-0
        //Thread 시작
        thread.start(); //run() 메소드 호출
        System.out.println("Thread가 종료될때까지 기다립니다.");
        try {
            //해당 스레드가 멈출때까지 멈춤
            thread.join(); //.join() = 대기하세요 .앞에 스레드가 끝나기 전까지 대기
            //thread.join()에서 thread = new MyThread()에 run()메소드
            /*
             * thread.join();를 실행시킨 스레드는 메인스레드
             * .join();는 .앞에 스레드((MyThread)thread.run())가 끝날때까지 thread.join();를 실행시킨 스레드한테 대기하라는 말
             * thread.join();를 실행시킨 메인스레드는 (MyThread)thread.run()가 끝날때까지 대기해
             *
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread가 종료되었습니다.");

    }

}