package school_17;

import java.io.*;

public class FileEx01_02 {

    public static void main(String[] args) throws IOException {
//		\r : 캐리지리턴, 그 줄의 처음으로 이동하라는 의미
//		\n : 한 줄 바꿈의 의미
//		\r\n : 개행문자, 다음 줄의 처음으로 이동하라는 의미

        String currDir = System.getProperty("user.dir"); //getProperty(키)
        //user.dir 키 = 현재 내가 작업중인 디렉토리
        System.out.println(currDir); //currDir = C:\jwork\lastprj
        File file = new File(currDir + "/test.txt"); //임시공간 file에 new File(currDir + "/test.txt") 경로를 담아놓음

        if (!file.exists()) { //!file.exists() = file에 .exists() 있는가 !의 반대 경로에 없으면 if문 탐
            file.createNewFile(); //if문 file 타고 그대로 생성
        } //FileWriter fw = new FileWriter(file);와 같은 코드

        FileWriter fw = new FileWriter(file); //출력 //파일생성
        //여까지 빈파일 생성임

        char[] buf = {'m', 'e', 's', 's', 'a', 'g', 'e'};
        for (int i = 0; i < buf.length; i++) {
            fw.write(buf[i]);
        }
        fw.write("이 줄의 마지막에서 개행문자 \r\n");
        fw.close(); //닫아줘야 메모리 누수 없음


        FileReader fr = new FileReader(file); //입력 //file를 읽어와라
        final int EOF = -1; //EOF = End Of File
        int c;
        while ((c = fr.read()) != EOF) { //.read() = 아스키코드로 가져옴
            //아스키코드는 0부터라서 //(c = fr.read()) != EOF(-1) >> fr.read()에서 아스키코드로 표현할 수 없는것 까지 라는 뜻
//			System.out.println(c + ", ");
            System.out.print((char) c);
        }
        fr.close(); //닫아줘야 메모리 누수 없음
    }

}