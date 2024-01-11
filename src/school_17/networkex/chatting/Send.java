package school_17.networkex.chatting;

import java.io.*;

//클라이언트의 샌드클래스에서 서버의 리시버클래스로 데이터를 전송하는 객체 샌드클래스
public class Send implements Runnable { //클라이언트25-&40

    DataOutputStream out; //클라이언트25에서 호출 (out = 클라이언트에서 서버로 데이터를 전송(출력)하는 객체)

    BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
    // new BufferedReader( new InputStreamReader(System.in) = 클라이언트의 콘솔창에서 입력받는 객체 )

    public Send(DataOutputStream out) { //26 클라이언트25에서 호출 (out = 클라이언트에서 서버로 데이터를 전송(출력)하는 객체)
        this.out = out; //27 바꾸고 호출한놈으로-클라이언트25
    }

    public void run() { //30 클라이언트29에서 호출
        while (true) {
            try {

                String msg = in2.readLine(); //31 클라이언트의 콘솔창에서 데이터를 입력할때까지 *대기중
                //31 "하이요" 입력 >> msg
                out.writeUTF(msg); //32 클라이언트에서 서버로 데이터를 전송(출력)하는 객체 로 msg="하이요" 보내라
                //33 유저들렸다가 호출한놈한테-클라이언트29

            } catch (Exception e) {
                System.out.println("Send클래스 스레드 에러: " + e.getMessage());
            }
        }
    }
}