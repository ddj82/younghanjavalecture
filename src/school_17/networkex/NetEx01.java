package school_17.networkex;

import java.net.*;

public class NetEx01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
//		getLocalHost() 메소드는 static으로 선언된 클래스 메소드임
        System.out.println("로컬 컴퓨터의 이름 : " + Address.getHostName());
        System.out.println("로컬 컴퓨터의 IP 주소1 : " + Address.getHostAddress()); //내 피씨의 IPv4 주소
        System.out.println("로컬 컴퓨터의 IP 주소2 : " + Address.toString());
        System.out.println("로컬 컴퓨터의 IP 주소2 : " + Address); //객체명으로도 toString() 자동호출

        Address = InetAddress.getByName("java.sun.com"); //ip주소나 host이름 가져오는데 ("java.sun.com")처럼 도메인주소로 호출 가능
        System.out.println("java.sun.com 컴퓨터의 이름과 IP 주소 : " + Address);
        System.out.println();

        System.out.println("naver도메인에 대응되는 IP를 반환함");
//		http://223.130.200.104 또는http://223.130.195.95 로 접근 가능
        InetAddress sw[] = InetAddress.getAllByName("www.naver.com"); //("www.naver.com") 해당 도메인의 대응되는 ip주소 모두 배열에 저장
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
        }
        for (InetAddress i : sw) {
            System.out.println(i);
        }
    }
}