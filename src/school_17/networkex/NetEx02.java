package school_17.networkex;

import java.io.*;
import java.net.*;

public class NetEx02 {

    public static void main(String[] args) {
        URL url = null;
        BufferedReader input = null; //BufferedReader //Reader클래스인데  Buffered한번에 모아서 입력할수 있는 클래스
        String address = "https://www.naver.com/index.html";
//		String line = "";
//
//		try {
//			url = new URL(address);
//			input = new BufferedReader(new InputStreamReader(url.openStream()));
//
//			while ((line = input.readLine()) != null) {
//				System.out.println(line);
//			}
//			input.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

        try {
//			url = new URL("https://naver.me/5y0TpClb");
            url = new URL("https://www.example.com:80/search/index.html?d=Java");
            //uri => https://www.example.com:80/search/index.html?d=Java => uri
            //프로토콜(protocol) => https
            //호스트명(ip/호스트이름) => www.example.com
            //포트번호 => 80 (없으면 -1)
            //컨텍스트(context)(프로젝트명) => (포트번호 다음) search
            //경로(path) => /search/index.html
            //쿼리스트링 => d=Java
            //쿼리스트링 형식
            //경로?속성명=값...

//			url = new URL("https://localhost:8080/");
            String protocal = url.getProtocol();
            System.out.println("프로토콜: " + protocal);

            String host = url.getHost();
            System.out.println("호스트명: " + host);

            int port = url.getPort();
            System.out.println("포트번호: " + port);

            String file = url.getFile();
            System.out.println("파일 이름(경로+쿼리 문자열): " + file); //= /search/index.html?d=Java

            String path = url.getPath();
            System.out.println("경로: " + path);

            //쿼리 문자열 구하기 (URL이 쿼리 문자열을 포함하지 않는 경우는 null)
            String query = url.getQuery();
            System.out.println("쿼리 문자열: " + query);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}