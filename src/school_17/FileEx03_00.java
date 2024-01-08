package school_17;

import java.io.*;

public class FileEx03_00 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("stream1.txt"); //출력
        //바이트(숫자형) 스트림 파일을 출력하기 위한 객체 fos 생성
        //Stream에는 문자열을 입력할 수 없다.
//		fos.write("하늘임.");
        //바이트(숫자형) 스트림 파일을 출력하기 위한 객체이기 때문에 아스키코드로 출력가능한 ''문자나 숫자만 가능
        for (int i = 69; i < 80; i++) {
            fos.write(i);
        }
        fos.close();
        System.out.println("ByteStreamFile을 생성");


//		FileWriter fw = new FileWriter("data1.txt");
//		for (int i = 69; i < 80; i++) {
//			fw.write(i);
////			String s = i + "";
////			fw.write(s);
//		}
//		fw.close();
//		System.out.println("FileWriter을 생성");

//		FileReader fd = new FileReader("data1.txt");
//		int c;
//		while ((c = fd.read()) != -1) {
////			System.out.println(c);
//			System.out.println((char) c);
//		}
//		fd.close();
//		System.out.println("FileReader");


        FileInputStream fis = new FileInputStream("stream1.txt");
//		FileInputStream fis = new FileInputStream("data1.txt");
        //바이트 스트림 입력을 위한 객체 fis 생성

        int i;
        while ((i = fis.read()) != -1) { //.read() = 아스키코드로 가져옴 //아스키코드,유니코드 의 시작이 0부터라 -1은 읽어올게 없을때 까지임
            System.out.println((char) i);
        }
        System.out.println("ByteStream을 File로부터 입력");
        fis.close();

    }

}
