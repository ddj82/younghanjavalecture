package school_17;

import java.io.*;

public class FileEx01_00 {

    public static void main(String[] args) throws Exception {
        String source = " 죽는 날까지 하늘을 우러러 한 점 부끄러움이 없기를\n" +
                "잎새에 이는 바람에도 나는 괴로워했다.\n" +
                "별을 노래하는 마음으로 모든 죽어가는 것을 사랑해야지.\n" +
                "오늘 밤에도 별이 바람에 스치운다.\n";

        System.out.println(source.length());
        char intxt[] = new char[source.length()];

        //getChars(복사할 객체의 시작인덱스번호(int), 복사할객체의 마지막인덱스-1(int), 복사해서 붙여넣기 할 객체명, 붙여넣을 객체의 시작 위치 인덱스번호(int))
        source.getChars(0, source.length(), intxt, 0); //원본훼손 됨
//		source.getChars(6, 20, intxt, 5);

        //경로 기술 없는 경우는 프로젝트를 기본(root) 경로로 인식한다
        FileWriter fw = new FileWriter("data1.txt"); //파일생성
        //매개변수가 한개면 ("data1.txt"[, false])에 [, false]가 생략되어있음. 계속 파일 붙여넣기 한다는 뜻
        fw.write(intxt); // 해당 파일에 문자배열 intxt 씀
//		fw.write(source); // 해당 파일에 문자열 source 씀
        fw.close(); //new FileWriter()의 공간은 기본적으로 밑이 뚫려있는 모양이기 때문에 .close로 닫아줘야 정상적을 저장 됨.
//		.close 안해주면 빈파일 저장

    }

}