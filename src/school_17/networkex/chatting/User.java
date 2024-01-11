package school_17.networkex.chatting;

import java.io.*;
import java.net.*;
import java.util.*;

//서버에서 클라이언트클래스로 데이터를 전송하는 객체 유저클래스
public class User { //2-&10
    HashMap<String, DataOutputStream> clientmap = new HashMap<String, DataOutputStream>();



    public synchronized void AddClient(String name, Socket socket) { //25 //리시버25에서 호출 AddClient("둘리", &100)

        try {
            sendMsg(name + " 님이 입장하셨습니다.", "Server"); //26 sendMsg("둘리 님이 입장하셨습니다.", "Server")호출
            clientmap.put(name, new DataOutputStream(socket.getOutputStream()));
            //28 clientmap.put("둘리", new DataOutputStream(&100소켓의 클라이언트로 전송하는객체)) //clientmap size => 1됨

            System.out.println("채팅 참여 인원 : " + clientmap.size()); //29 clientmap.size() = 1 출력후 AddClient호출한놈으로

        } catch (Exception e) {
            System.out.println("User에러1 : " + e.getMessage());
        }

    }

    public synchronized void RemoveClient(String name) {
        try {
            if(clientmap.get(name) != null) {
                sendMsg(name + " 님이 퇴장하였습니다.", "Server");
            }
            clientmap.remove(name);
            sendMsg(name + " 님이 퇴장하였습니다.", "Server");
            System.out.println("채팅 참여 인원 : " + clientmap.size());
            if(clientmap.size()==0) {
                Socket socket = new Socket(InetAddress.getLocalHost() , 7777);
                socket.close();
            }
        } catch (Exception e) {
            System.out.println("User에러2: "+e.getMessage());
        }
    }


    public synchronized void sendMsg(String msg, String name) throws Exception { //26에서 호출(msg = "둘리 님이 입장하셨습니다.",name = "Server")
        //35 리시버35에서 호출 "하이요", "둘리"

        Iterator iterator = clientmap.keySet().iterator(); //27 Iterator iterator = null //처음엔 null이라(clientmap.size) while문 안탐
        //36 clientmap사이즈 변경으로 keySet생겨서 while문 탐
        while (iterator.hasNext()) { //key값의 next가 존재한다면 계속 루프
            String clientname = (String) iterator.next();
            //37 clientname = (String) "둘리"

            clientmap.get(clientname).writeUTF(name + " : " + msg);
            //38 clientmap.get(clientname)=&100소켓의 클라이언트로 전송하는객체.writeUTF("둘리" + " : " + "하이요") 보내고 샌드런매소드로
        }
    }

}