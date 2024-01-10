package school_17.networkex;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("서버가 실행되었습니다.");

        //서버생성, 실행, 준비
        ServerSocket serverSocket = new ServerSocket(5000);
        //client의 접속을 허용(accept)

        BufferedReader bufReader = null;
        BufferedWriter bufWriter = null;
        try {
            Socket socket = serverSocket.accept();

            while (true) {
                //client가 보낼 데이터를 담음
                bufReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //들어올때까지 대기
                String message = bufReader.readLine(); //들어오면 읽어들여서 message에 담기
                System.out.println("클라이언트Message : " + message); //받은거 출력

                //client에 데이터 전송
                Scanner sc = new Scanner(System.in); //콘솔창에 입력가능하게
                System.out.println("[서버 메세지] : ");
                String str = sc.nextLine(); //콘솔창에 입력한거 str에 담음

                //client에 보낼 데이터를 담을 객체 생성
                bufWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //보낼꺼 모으기

                //client가 보낸 메세지가 "종료"라는 글자가 들어있으면 client로 "종료"글자 보내기
                if (message.contains("종료")) {
                    str = "종료";
                } //내가 종료 를 보내면 str에 종료 담기

                bufWriter.write(str); //종료 담은 str 보내기 위해 bufWriter에 다시 씀
                bufWriter.newLine(); //깔끔하게 한줄 바꾸고
                //client로 데이터 전송하기
                bufWriter.flush(); //보내기

                if (message.contains("종료")) {
                    socket.close();
                    break;
                }

            }//while문 종료 중괄호

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufReader.close();
            bufWriter.close();
            serverSocket.close();
        }
    }

}