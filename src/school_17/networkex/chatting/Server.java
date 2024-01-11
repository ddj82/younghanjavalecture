package school_17.networkex.chatting;

import java.net.*;

public class Server {

    public static void main(String[] args) { //서버클래스 실행
        Socket socket = null; //1 //14.2-&100
        User user = new User(); //2-&10
        ServerSocket server_socket = null; //3 //6.1-&1


        int count = 0; //4 //서버-32 count=1

        Thread thread[] = new Thread[10]; //5

        try {
            server_socket = new ServerSocket(7777); //6
            System.out.println("서버시작"); //7
            while (true) {
                System.out.println("클라이언트[" + count + "]번 접속 전"); //8 //33
                socket = server_socket.accept();//9 대기중 Client에서 소켓객체를 생성하는 순간 요청이 들어오면서 만들어짐. //34 클라이언트가 추가될때까지 대기중
//				//14.1 ㄴserver_socket.accept(); = Client클래스에서 &100부여, = socket
                if (socket.isClosed()) { //15
                    break;
                }
                System.out.println("클라이언트["+count+"]번 접속: "+ System.identityHashCode(socket)); //16


                thread[count] = new Thread(new Receiver(user, socket));
//				//17 new Thread-&20(new 17.Receiver-&30(user-&10, socket-&100)) //리시버-30에서 끝내고 new Thread-&20 = thread[count]에 하나 추가
                thread[count].start(); //31 &30번지 리시버런메소드호출
                count++; //32
            }

        } catch (Exception e) {
            System.out.println("Server에러 : " + e.getMessage());
        }
        System.out.println("서버가 종료되었습니다.");
    }

}