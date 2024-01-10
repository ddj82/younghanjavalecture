package school_17.networkex.chatting;

import java.net.*;

public class Server {

    public static void main(String[] args) {
        Socket socket = null; //Client와 통신하기 위한 Socket 생성
        User user = new User(); //채팅방에 접속해 있는 Client 관리 객체
        ServerSocket server_socket = null; //Client 접속을 받기 위한 ServerSocket 객체 생성

        //스레드 할당을 위한 정수
        int count = 0;
        //10개까지 스레드 할당, 즉 채팅방에 10명이 접속 사능
        Thread thread[] = new Thread[10];

        try {
            server_socket = new ServerSocket(7777); //서버 포트로 소켓을 연다 //1
            while (true) {
                socket = server_socket.accept(); //통신이 종료되기 전까지 연결 //3
                System.out.println("클라이언트접속 서버클래스대기"); //5
                /*
                 * receiver Class에서 implements Runnable을 사용했기 때문에
                 * Thread 객체 안에 스레드를 사용하려는 객체를 넣어줘서 객체화를 할 수 있습니다.
                 */
                //Receiver 클래스를 Thread에서 돌림
                thread[count] = new Thread(new Receiver(user, socket)); //8리시버,샌드스레드
                System.out.println("서버1");
                thread[count].start(); //18 //리시버클래스 런메소드
                System.out.println("서버2");
                count++; // //빈스레드 되고 새클라이언트 오면 돌거야
                System.out.println("서버3");
            }//while문 종료 중괄호

        } catch (Exception e) {
            System.out.println("Server에러 : " + e.getMessage());
        }
    }

}