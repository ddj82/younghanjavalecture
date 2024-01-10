package school_17.networkex.chatting;

import java.io.*;
import java.net.*;

public class Receiver implements Runnable {

    Socket socket;
    DataInputStream in;
    String name;
    User user = new User();

    /*
     * 전역변수들을 전부 초기화 합니다.
     * 또한 user클래스에 AddClient를 호출하여 사용자를 등록합니다.
     */

    public Receiver(User user, Socket socket) throws Exception { //9 //2번을 받음"127.0.0.1", 7777
        this.user = user;
        this.socket = socket;
        in = new DataInputStream(socket.getInputStream()); //10 //7에서 담은닉네임 여기담아
        this.name = in.readUTF(); //UTF-8로 인코딩 후 읽어옴 //11 //7에서 인코딩한 닉네임 여기담아
        user.AddClient(name, socket); //사용자 등록 //12등록, AddClient실행 닉네임,7777
    }

    public void run() {
        try {
            while (true) {
                System.out.println("리시버클래스1");
                String msg = in.readUTF(); //in에서 들어온 메세지를 UTF-8로 인코딩 후 읽어옴 //19메세지 읽을거 생길떄까지 대기
                //20콘솔메시지 인코딩된거 읽기로 인코딩후 리시버msg에 저장
                System.out.println("리시버클래스2");
                user.sendMsg(msg, name); //name이름을 가진 user가 msg라는 메세지를 보냄
                //21 //20콘솔메세지로 받은 내용=msg thisname은 닉네임 //유저에 샌드엠에스지메소드 호출
                System.out.println("리시버클래스3");
                if (msg.equals("종료")) {
                    user.RemoveClient(this.name);
                }
            }
        } catch (Exception e) {
            user.RemoveClient(this.name); //에러 발생시 name유저를 client에서 삭제
        }
    }

}