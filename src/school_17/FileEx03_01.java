package school_17;

import java.io.*;

public class FileEx03_01 {

    public static void main(String[] args) {
        try {
            OutputStream output = new FileOutputStream("C:/jwork/Output.txt"); //출력 //공파일 생성.
            String str = "오늘 날씨는 아주 덥습니다."; //한글이라 유니코드가 필요함 //아스키코드로 불가
            byte[] by = str.getBytes(); //.getBytes() = 문자열을 바이트코드화 해주는 메소드

            output.write(by); //by = 문자열을 바이트코드화 해서 담은 byte[](바이트배열)
            output.close();

            FileInputStream fis = new FileInputStream("C:/jwork/Output.txt"); //입력 //바이트코드로 읽음
            InputStreamReader isr = new InputStreamReader(fis); //입력 //위 코드를 인코딩하는 코드
            int c;
            while ((c = isr.read()) != -1) {
                System.out.print((char) c);
            }
            isr.close();
            fis.close();

//			System.out.println();
            System.out.println("작업 완료\n");

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}