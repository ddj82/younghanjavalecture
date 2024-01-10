package school_17.thread01;

public class BeepPrintExample1 {

    public static void main(String[] args) { //메인메소드 = 메인스레드
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500); //Thread.sleep(500) = 해당 스레드(메인스레드 말함)에 0.5초 지연 넣어라
                //.sleep(매개숫자) 매개숫자 = 1/1000초, 500 넣으면 0.5초 지연
            } catch (Exception e) {

            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("동");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }

}