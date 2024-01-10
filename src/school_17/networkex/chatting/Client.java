package school_17.networkex.chatting;

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        Socket socket = null;
        DataInputStream in = null; //이 변수는 사용가자 입력하는 채팅 부분에 해당
        BufferedReader in2 = null; //이 변수는 사용자의 닉네임에 해당

        DataOutputStream out = null; //이 변수는 사용자가 입력한 데이터를 출력할 때 사용

        try {
            InetAddress ia = null; //Local Host IP Address 가져오기 위한 변수
//			ia = InetAddress.getLocalHost(); //현재 PC의 IP Address 가져오기
//			socket = new Socket(ia, 7777); //서버의 IP와 port번호 입력
            socket = new Socket("127.0.0.1", 7777); //서버의 IP와 port번호 입력 //2

            /*
             * DataInputStream은 입력 스트림을 받는 매개변수이며,
             * socket.getInputStream()함수를 통해 소켓에서 전달되는 데이터 스트림을 읽어옵니다.
             * BufferedReader는 Scanner와 비슷한 개념입니다.
             * Scanner보다 빠르다는 장점이 있지만 String형으로 버퍼에 저장하기 때문에
             * 따로 데이터를 가공해서 사용해야하는 경우가 많습니다.
             */
            in = new DataInputStream(socket.getInputStream());
            in2 = new BufferedReader(new InputStreamReader(System.in));
            out = new DataOutputStream(socket.getOutputStream());
            System.out.println("클라이언트클래스대기"); //4
            System.out.println("닉네임을 입력해주세요 : ");//4
            String data = in2.readLine(); //채팅에 사용할 닉네임을 받아옵니다. //6입력까지 대기 //입력하면in2로
            System.out.println("닉네임 보내기1");
            out.writeUTF(data); //닉네임을 UTF-8로 변경 후 출력스트림에 넣습니다 //7입력닉네임 인코딩
            System.out.println("닉네임 보내기2");
            Thread th = new Thread(new Send(out)); //새로운 스레드에 out을 집어넣도록 합니다. //8리시버,샌드스레드
            System.out.println("닉네임 보내기3");
            th.start(); //스레드 시작  //18 //샌드클래스 런메소드
            System.out.println("닉네임 보내기4");

        } catch (IOException e) {
            System.out.println("Client에러1 : " + e.getMessage());
        }

        try {
            /*끊어기지 전까지는 계속 채팅을 입력받기 때문에
             * 무한루프(while)안에서 동작합니다.
             * 만일 끊고 싶다면 break에 대한 조건문을 걸면 됩니다.
             */
            while (true) {
                System.out.println("클라이언트while문1");
                String str2 = in.readUTF(); //23 //유저클래스에서 쓰기로인코딩된 닉네임:메세지 형식 str2에 저장
                System.out.println("클라이언트while문2");
                System.out.println(str2); //str2출력
                if (str2.equals("종료")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Client에러2 : " + e.getMessage());
        }
    }

}