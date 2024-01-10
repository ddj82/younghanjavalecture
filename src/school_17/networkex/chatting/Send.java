package school_17.networkex.chatting;

import java.io.*;

/*
 * extends Thread, implements Runnable은 스레드 구현을 위해 사용합니다.
 * extends Thread는 Thread를 상속받고 객체화한 뒤에 객체명.start()를 통해 사용하며,
 * implements Runnable은 Thread 객체 안에 스레드를 사용하려는 객체를 넣어줘서 객체화한 뒤 사용합니다.
 * extends Thread와 implements Runnable은 비슷합니다.
 * 하지만 implements Runnable을 사용하면 다중 상속이 가능합니다.
 */
public class Send implements Runnable {
    //Send Class는 Client에서 스레드를 실행할 때 사용됩니다

    DataOutputStream out;

    //Send 클래스에서의 in2는 채팅 내용을 받아오는 역할을 합니다.
    BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));

    public Send(DataOutputStream out) { //18 //7에서 인코딩된 닉네임받음
        this.out = out; //샌드클래스 필드out도 닉네임
    }

    public void run() {
        while (true) {
            try {
                System.out.println("샌드 닉네임 받아옴1");
                String msg = in2.readLine(); //메세지를 받아오면 //19메시지 쓸때까지 대기 //20콘솔에메시지 입력하면 샌드msg에저장
                System.out.println("샌드 닉네임 받아옴2");
                out.writeUTF(msg); //msg 출력 //21콘솔메세지-샌드msg를 인코딩하고 샌드out에 저장 후 반복문대기
                System.out.println("샌드 닉네임 받아옴3");
            } catch (Exception e) {
                System.out.println("Send클래스 스레드 에러: " + e.getMessage());
            }
        }
    }
}