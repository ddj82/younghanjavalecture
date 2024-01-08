package school_17;

import java.io.*;

public class FileEx03_02 {

    public static void main(String[] args) throws Exception {
        //파일 출력용
        FileOutputStream fos1 = new FileOutputStream("C:/jwork/out_utf8.txt", true); //출력
        FileOutputStream fos2 = new FileOutputStream("C:/jwork/out_ansi.csv"); //출력 //엑셀파일형
        //ANSI계열 인코딩 유형 - ms949 : 확장완성형
        //한글 깨짐의 보완하려면 ms949를 사용하는 것이 좋다

        //위 두코드 인코딩하는 코드
        OutputStreamWriter osw1 = new OutputStreamWriter(fos1, "utf-8"); //txt 다른이름으로 저장 인코딩 utf-8
        OutputStreamWriter osw2 = new OutputStreamWriter(fos2, "ms949"); //ANSI계열 인코딩 유형 - ms949 : 확장완성형 //윈도우즈 전용 인코딩

        int c;

        System.out.println("아무 내용이나 입력하세요. 꼭 엔터를 해 주어야만 글이 입력됩니다." + "\n종료를 원하시면 ctrl + z를 눌러주세요.");

        InputStreamReader isr = new InputStreamReader(System.in); //입력 //스캐너기능 //저장위치 = isr
        while ((c = isr.read()) != -1) {
            //스캐너기능 //저장위치 = isr //System.in 콘솔창에 쓴 내용을 c = isr.read() 하나하나 읽어서
            osw1.write(c); //osw1에 씀 //= (fos1, "utf-8")
            osw2.write(c); //osw2에 씀 //=fos2, "ms949"
        }

        System.out.println("작업 완료\n");

        //닫을 때는 꼭 역순으로 닫아준다.
        isr.close();
        osw1.close();
        osw2.close();
        fos1.close();
        fos2.close();

        FileInputStream fis = new FileInputStream("C:/jwork/out_ansi.csv");
        isr = new InputStreamReader(fis, "ms949");
        c = 0;

        while ((c = isr.read()) != -1) {
            System.out.print((char) c);
        }

        System.out.println();
        System.out.println("출력 끝");

        isr.close();
        fis.close();

    }

}