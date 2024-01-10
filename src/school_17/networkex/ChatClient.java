package school_17.networkex;

import java.io.*;
import java.net.*;

//키보드로 메세지를 입력받아 서버에 접속하여 전달하는 클라이언트 프로그램
public class ChatClient {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = null;

//		socket객체 생성: 서버에 접속 요청을 한다.
//		Socket socket = new Socket("자신의 ip주소 입력", 4000);
        Socket socket = new Socket("127.0.0.1", 4000); //("서버의 ip주소", 서버에서 열어준 포트번호) //요 코드가 서버랑 연결해달라는 뜻
        try {
            System.out.println("전달 메세지 입력 >>");
            String message = in.readLine();
            //BufferedReader in = new BufferedReader(new InputStreamReader(System.in))
            //입력하는 줄단위로 읽어드림

            //서버로 데이터를 보낼 (써서 담아둘) 객체 생성
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            out.write(message); //메세지 쓰기
            out.flush(); //메세지 내보내기, 버퍼 강제 비우기

        } catch (IOException e) {
            System.out.println("[에러] 서버에 접속할 수 없습니다.");
        } finally {
            out.close();
            in.close();
            socket.close();
        }
    }

}