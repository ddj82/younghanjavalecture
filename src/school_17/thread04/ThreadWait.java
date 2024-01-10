package school_17.thread04;

//***notify()와 wait()메소드는 반드시 synchronized블록 안에서만 사용할 수 있다.
class ThreadBB extends Thread {
    //해당 thread가 실행되면 자기 자신의 모니터링 락을 획득
    //5번 반복하면서 1초씩 쉬면서 total에 값을 누적
    //그 후에 notify()메소드를 호출하여 wait하고 있는 thread를 깨움

    int total;

    @Override
    public void run() {
        synchronized (this) { //여기부터 //synchronized (this)에서 this는 run()를 호출한 놈
            for (int i = 0; i < 5; i++) {
                System.out.println("TreadBB : " + i);
                total += i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify(); //멈춰있는 스레드중 랜덤으로 하나만 깨우는 메소드
            //notifyAll(); => 멈춰있는 스레드를 다 깨우긴 하는데 깨우는 순서는 랜덤
        } //여기까지만 동기화

        //여기는 동기화x 얘는 상관없음 동기화블럭이 끝나고 랜덤으로 출력
        System.out.println("TreadBB의 작업 종료");
    }


}

public class ThreadWait {

    public static void main(String[] args) {
        //해당 thread가 실행되면, 해당 thread는 run메소드 안에서 자신의 모니터링 락을 획득
        ThreadBB b = new ThreadBB();
        b.start(); //ThreadBB b에 run()메소드 호출

        //b에 대하여 동기화 블럭을 설정
        //만약 메인thread가 아래의 블록을 위의 ThreadBB보다 먼저 실행되었다면
        //wait를 하게 되면서 모니터링 락을 놓고 대기
        synchronized (b) { //synchronized (b) => b객체에 동기화 하겠다 선언만 한 것
            try {
                //b.wait()메소드를 호출
                //메인thread는 정지
                //ThreadB가 5번 값을 더한 후 notify를 호출하게 되면 wait에서 깨어남
                System.out.println("b 종료까지 대기");
                b.wait(); //현재 작업중인 메인스레드는 기다려야함 b.wait() b의 작업이 끝날때까지
                //모니터링 락이 풀리는 것, b한테 모니터링 락을 걸어준다 동기화되는 synchronized블럭까지만

                //여기는 동기화x 얘는 상관없음 동기화블럭이 끝나고 랜덤으로 출력
                System.out.println("b스레드 동기화 종료 후 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //깨어난 후 결과를 출력
            //여기는 동기화x 얘는 상관없음 동기화블럭이 끝나고 랜덤으로 출력
            System.out.println("total : " + b.total);
        }

        System.out.println("메인스레드 종료");
    }

}
