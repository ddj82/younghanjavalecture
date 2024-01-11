package school_17.networkex.chatting;

import java.io.*;
import java.net.*;

//서버에서 전송하는 데이터를 감지하는 객체 클라이언트글래스
public class Client {

    public static void main(String[] args) { //클라이언트클래스 실행
        Socket socket = null; //10 //14.1-&100 //서버와 통신가능한 소켓객체 생성

        DataInputStream in = null; //11 //15. 14-&100소켓에 연결된 서버에서 데이터가 들어오는지 감지하는 객체

        BufferedReader in2 = null; //12 //16 클라이언트의 콘솔창에서 입력받는 객체

        DataOutputStream out = null; //13 //17 클라이언트에서 서버로 데이터를 전송(출력)하는 객체

        try {
            InetAddress ia = null;

            socket = new Socket("127.0.0.1", 7777); //14-&100

            in = new DataInputStream(socket.getInputStream()); //15 서버에서 들어오는 데이터가 있는지 감지하는 객체
            in2 = new BufferedReader(new InputStreamReader(System.in)); //16 클라이언트의 콘솔창에서 입력받는 객체
            out = new DataOutputStream(socket.getOutputStream()); //17 클라이언트에서 서버로 데이터를 전송(출력)하는 객체
            //3개의 객체만 생성(15.16.17)

            System.out.println("닉네임을 입력해주세요 : "); //18
            String data = in2.readLine(); //19 클라이언트의 콘솔창에서 데이터를 입력하기 전까지 *대기중
            //"둘리"입력 =>data
            out.writeUTF(data); //23 서버로데이터를전송(출력)하는객체.writeUTF("둘리")
            Thread th = new Thread(new Send(out)); //24 new //28 Thread-&60 (new //25 Send-&40(클라이언트에서 서버로 데이터를 전송(출력)하는 객체))
            th.start(); //29 샌드클래스의 런메소드호출

        } catch (IOException e) {
            System.out.println("Client에러1 : " + e.getMessage());
        }

        try {

            while (true) { //30
                String str2 = in.readUTF(); //31 &100소켓에 연결된 서버에서 데이터가 들어올때까지 *대기중 //34 다시 연결된 서버에서 데이터가 들어올때까지 대기
                //32 서버의 User클래스38번으로 .writeUTF("둘리" + " : " + "하이요") 받음 => str2
                System.out.println(str2);
                //33 "둘리 : 하이요" 출력, 종료라는글자 없어서 if문 안타고 while문 진행
                if (str2.equals("종료")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Client에러2 : " + e.getMessage());
        }
    }

}