package school_17;

import java.io.*;
import java.text.*;
import java.util.*;

public class FileEx06 {

    public static void main(String[] args) {
        String currDir = System.getProperty("user.dir"); //C:\\jwork\\lastprj
        File dir = new File(currDir);
        File[] files = dir.listFiles(); //dir.listFiles() = dir안에 있는 폴더랑 파일들의 목록을 다 가져옴 //File[]에 담는다

        for (int i = 0; i < files.length; i++) {
            File f = files[i];
            String name = f.getName();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
            String attribute = "";
            String size = "";

            if (files[i].isDirectory()) {
                //File[] files = dir.listFiles() //files[i] 가 디렉토리(폴더)면 if문 탐
                attribute = "DIR";
            } else { // 디렉토리(폴더)가 아니면 else문 탐
                size = f.length() + " ";
                attribute = f.canRead() ? "R" : " "; //.canRead() = 읽기 전용이니?
                attribute += f.canWrite() ? "W" : " "; //.canWrite() = 쓰기가 되는 파일이니?
                attribute += f.isHidden() ? "H" : " "; //.isHidden() = 숨긴 파일이니?
            }

            System.out.printf("최종 수정일: %s , 파일속성: %3s , 용량: %6s , 파일명: %s\n", df.format(new Date(f.lastModified())), attribute, size, name);
        }
    }

}