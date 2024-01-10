package school_17.thread01;

public class BeepPrintExample2 {

    public static void main(String[] args) {
//		방법.1 Runnable객체를 직접 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성

//		Runnable beepTask = new BeepTask(); //Runnable객체를 먼저 직접 생성하여
//		Thread thread = new Thread(beepTask); //스레드생성자의 매개인자로 보내어 스레드 객체 생성


//		방법.2 Runnable객체를 익명클래스로 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성
//		익명클래스로 생성하여 스레드 객체 먼저 실행되는게 아니라 메인하고 왔다리갔다리 랜덤으로 실행됨

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("동");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {

                    }
                }
            }
        });


//		방법.3 Runnable객체를 람다식으로 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성
//		람다식으로 생성하여 스레드 객체 먼저 실행되는게 아니라 메인하고 왔다리갔다리 랜덤으로 실행됨

//		Thread thread = new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("동");
//				try {
//					Thread.sleep(500);
//				} catch (Exception e) {
//
//				}
//			}
//		});


//		방법.1 Runnable객체를 직접 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성
//		후 .start()로 실행
        thread.start(); //thread에 접근 thread이 갖고 있는 오버라이드한 run()실행
        //thread.start()먼저 실행되는게 아니라 메인하고 왔다리갔다리 랜덤으로 실행됨

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }

    }

}