package school_17;

import java.io.*;

public class FileEx07 {

    public static void main(String[] args) {
        try {
            File f = new File("C:/jwork/lastprj/src/fileex", "FileEx01_00.java"); //있는 경로
            //File("1", "2") = 1 >> 경로, 2 >> 파일명

            System.out.println(f.getName()); //FileEx01_00.java
            System.out.println(f.exists()); //true
            System.out.println(f.getPath()); //경로포함 파일명
            System.out.println(f.length()); //파일뒤에 랭스 = 파일의 용량
            System.out.println(File.separator);
//			boolean result = new File("C:/jwork/Exam/log").mkdir(); //중복폴더에는 mkdirs 해야함
//			boolean result = new File("C:/jwork/Exam").mkdir();
            boolean result = new File("C:/jwork/Exam/log").mkdirs(); //.mkdirs() = 한번만 만듬, "C:/jwork/Exam/log"에 만들어져있으면 더 안만들어짐

            if (result == true) {
                System.out.println("Exam 디렉토리 생성 성공");
            } else {
                System.out.println("Exam 디렉토리 생성 실패");
            }

            String[] listing = new File("C:/jwork/Exam").list(); //.list() = 해당 디렉토리안에 있는 파일이나 디렉토리 이름들만 가져와
            for (String x : listing) {
                System.out.println("디렉토리 목록 : " + x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}