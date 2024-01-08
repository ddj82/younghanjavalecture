package school_17;

import java.io.*;

public class FileEx01_01 {

    public static void main(String[] args) throws IOException {
        String path = "C:/upload/files"; //(저장)경로설정
        File file = new File(path);
//		if (!file.isDirectory()) { //해당 경로의 디렉토리가 있는지(해당 폴더가 있는지)
//			file.mkdirs();
//			// 폴더가 여러개 = .mkdirs()
//			// 폴더가 한개 = .mkdir()
//		}
        if (!file.exists()) { //해당 경로의 디렉토리나 파일이 있는지
            file.mkdirs();
        }
        path = path + "/file.txt"; //path = "C:/upload/files/file.txt"; //위의 path와 주소값 다름.

//		FileWriter("파일경로포함/파일명.확장자명", append여부에 대한 boolea값);
//											true는 뒷 줄에 추가 됨.
//		디폴트는 false임. false는 계속 덮어쓰기 됨.
        FileWriter fw = new FileWriter(path, true); //path대로 파일 생성, true는 지정한곳(path) 뒷 줄에 추가 됨

        fw.write("FileWeiter는 한글로된 " + "\n");
        fw.write("문자열을 바로 출력할 수 있다." + "\n");
        fw.flush(); //내가 .write()를 쓰는 동안 .close()되기 전에 임시공간에서 fw(원하는 출력공간)로 보내는 코드
        //.flush()만 하면 데이터 유실 될 수 있음
        fw.close(); //.close()에는 .flush()의 기능이 있음

        System.out.println("파일에 저장되었습니다.");

    }

}