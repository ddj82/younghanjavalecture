package school_17.networkex.chatting;

import java.io.*;
import java.net.*;
import java.util.*;

public class User {
    HashMap<String, DataOutputStream> clientmap = new HashMap<String, DataOutputStream>();
    //clientmap은 String형의 key와 DataOutputSream형의 Value(값)을 받음

    public synchronized void AddClient(String name, Socket socket) { //13 //닉네임,7777 받음
        try {
            System.out.println("유저1");
            sendMsg(name + " 님이 입장하셨습니다.", "Server"); //server에 입장 메세지 전달
            System.out.println("유저2");
            clientmap.put(name, new DataOutputStream(socket.getOutputStream())); //16 //참여한 클라이언트 1개임
            //HashMap의 put(key, value)함수는 key와 value를 받는다
            System.out.println("유저3");
            System.out.println("채팅 참여 인원 : " + clientmap.size()); //17 출력

        } catch (Exception e) {
            System.out.println("AddClient에러 : " + e.getMessage());
        }

    }

    public synchronized void RemoveClient(String name) {
        try {
            System.out.println("유저4");
            clientmap.remove(name); //name value를 가지는 client 제거
            System.out.println("유저5");
            sendMsg(name + " 님이 퇴장하였습니다.", "Server");
            System.out.println("채팅 참여 인원 : " + clientmap.size());
        } catch (Exception e) {
            System.out.println("RemoveClient에러 : " + e.getMessage());
        }
    }


    public synchronized void sendMsg(String msg, String name) throws Exception {
        //14 //msg = "닉네임님이입장하였습니다" name = "Server"
        //21 //msg = 메세지 name = 닉네임
        //clientmap의 key값들을 읽어옵니다.
        System.out.println("유저6");
        Iterator iterator = clientmap.keySet().iterator(); //15 //키값 > 닉네임입장문구 덩어리로모아 //21 키값모아
        System.out.println("유저7");
        while (iterator.hasNext()) { //key값의 next가 존재한다면 계속 루프
            //22 넥스트생김
            //채팅을 입력한 유저 이름을 받아와서
            System.out.println("유저8");
            String clientname = (String) iterator.next(); //22받아옴
            System.out.println("유저9");
            //양식대로 채팅을 출력합니다.
            clientmap.get(clientname).writeUTF(name + " : " + msg); //23 //받아온거 닉네임 : 메세지 쓰기로인코딩
            System.out.println("유저10");
        }
    }

}