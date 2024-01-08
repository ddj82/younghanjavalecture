package school_17;

import java.io.*;

public class FileEx02 {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data1.txt"); //입력 -> "[c:/jwork/lastprj/]data1.txt"
        //매개변수가 한개면 내가 작업하는 프로젝트 경로가 생략되어있음 = [c:/jwork/lastprj/]

        int i;
        while ((i = fr.read()) != -1) { //.read() = 아스키코드로 가져옴 //아스키코드,유니코드 의 시작이 0부터라 -1은 읽어올게 없을때 까지임
            System.out.print((char) i);
        }
        fr.close(); //닫아줘야 메모리 유실 없음
    }

}