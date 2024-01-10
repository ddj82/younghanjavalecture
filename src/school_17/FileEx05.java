package school_17;

import java.io.*;

public class FileEx05 {

    public static void main(String[] args) {
        File f = new File("C:/jwork/First/fileEx/FileEx01.java");

        String fileName = f.getName(); //FileEx01.java
        int pos = fileName.lastIndexOf("."); //8 //끝에서부터 찾아봄, .을, 해당 인덱스 가져옴

        System.out.println("경로를 제외한 파일이름 - " + fileName); //fileName = f.getName()
        //파일이름을 가져와 //ex) C:/jwork/First/fileEx/FileEx01.java >> FileEx01.java만
        System.out.println("확장자를 제외한 파일이름 - " + fileName.substring(0, pos)); //f.getName().substring(0, pos)
        //0-(8-1) //0~7 //FileEx01
        System.out.println("확장자명 - " + fileName.substring(pos + 1)); //f.getName().substring(pos + 1)
        //(8+1) 부터 끝까지 //9부터 끝까지 //java

        System.out.println("경로를 제외한 파일이름 - " + f.getPath()); //웹상주소를 가져올수 있음
        System.out.println("파일의 절대경로		 - " + f.getAbsolutePath()); //무조건 피씨에 저장된 경로 가져옴
        System.out.println("파일이 속해 있는 디렉토리 - " + f.getParent());
        System.out.println();
        System.out.println("File.separator - " + File.separator); //separator = 구분자 //실질적으로 인식하는 구분자 가져옴 /로 작성해도 \가져옴
        System.out.println("File.separatorChar - " + File.separatorChar); //File.separator를 char자료형으로 가져옴
        System.out.println("현재 파일이 작업중인 디렉토리(프로젝트) = " + System.getProperty("user.dir")); //getProperty = 속성명, 속성값 쌍으로 된 메소드
        //user.dir = 작업중인 파일이 속한 프로젝트 가져옴

    }

}