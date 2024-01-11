package school_17.networkex.chatting;

import java.io.*;
import java.net.*;

//클라이언트의 샌드틀래스에서 서버로 전송하는 데이터관리는 **리시버에서만
public class Receiver implements Runnable { //17-&30

    Socket socket; //17.null //20-&100 클라이언트로 데이터를 주고 받을 수 있는 소켓객체
    DataInputStream in; //17.null //21 클라이언트에서 &100소켓에 들어오는 데이터가 있으면 감지하는 객체
    String name; //17.null //24-"둘리"
    User user = new User(); //17.&50 //19-&10



    public Receiver(User user, Socket socket) throws Exception { //18(&10, &100) 대입
        this.user = user; //19 this.user = &10
        this.socket = socket; //20 this.socket = &100
        in = new DataInputStream(socket.getInputStream()); //21 클라이언트에서 &100소켓에 들어오는 데이터가 있으면 감지하는 객체
        this.name = in.readUTF(); //22 클라이언트에서 데이터가 들어올때까지 *대기중
        //24 Client클래스의 23번에 의해서 writeUTF("둘리")받아옴
        user.AddClient(name, socket); //25 &10.AddClient("둘리", &100) //29끝내고 Receiver호출한놈으로
    }

    public void run() { //32 서버31에서호출
        try {
            while (true) {
                String msg = in.readUTF();
                //33 String msg = 클라이언트에서 &100소켓에 들어오는 데이터가 있으면 감지하는 객체에 readUTF()로 들어올때까지 *대기중
                //34 샌드32에서 "하이요" 받음
                if (msg.equals("나가기")) {
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                    out.writeUTF("종료");
                    user.RemoveClient(this.name);
                } else {
                    user.sendMsg(msg, name); //35 sendMsg("하이요", "둘리") &10 호출
                }
            }
        } catch (Exception e) {
            user.RemoveClient(this.name); //에러 발생시 name유저를 client에서 삭제
        }
    }

}