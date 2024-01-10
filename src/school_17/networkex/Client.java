package school_17.networkex;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("클라이언트가 접속되었습니다.");

        //서버 접속
//		Socket socket = new Socket("192.168.0.54", 5000);
        Socket socket = new Socket("127.0.0.1", 5000);
//		Socket socket = new Socket("localhost", 4000);

        //Server에 보낼 데이터
        BufferedWriter bufWriter = null;
        BufferedReader bufReader = null;

        try {

            while (true) {
                //Server에 보낼 데이터를 담는 객체 생성
                bufWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //보낼꺼 모으기

                Scanner sc = new Scanner(System.in); //콘솔창에 입력가능하게
                System.out.println("[클라이언트 메세지] : ");
                String str = sc.nextLine(); //콘솔창에 입력한거 str에 담음
                bufWriter.write(str); //str에 있는걸 보내기 위해 bufWriter에 다시 씀
                bufWriter.newLine(); //깔끔하게 한줄 바꾸고

                //Server로 데이터 전송(버퍼 강제 비움)
                bufWriter.flush(); //보내기

                //Server가 보낸 데이터를 담는 객체 생성
                bufReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //들어올때까지 대기
                String message = bufReader.readLine(); //들어오면 읽어들여서 message에 담기
                bufWriter.newLine(); //깔끔하게 한줄 바꾸고
                System.out.println("0000");

                System.out.println("서버Message : " + message); //받은거 출력

                if (message.contains("종료")) {
                    str = "종료";
                    bufWriter.write(str);
                    bufWriter.newLine();
                    bufWriter.flush();
                    break;
                }

            }//while문 종료 중괄호

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            socket.close();
            bufReader.close();
        }

    }

}