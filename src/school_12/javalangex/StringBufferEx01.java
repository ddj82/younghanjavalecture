package school_12.javalangex;

public class StringBufferEx01 {

    public static void main(String[] args) {
        //delete()메소드
        StringBuffer str = new StringBuffer("Java Oracle"); // (0J, 1a, 2v, 3a, 4" ", 5O, 6r, 7a, 8c, 9l, 10e)
        System.out.println("원본 문자열 : " + str);
        System.out.println("길이0: " + str.length());
//		System.out.println("공간0: " + str.capacity() + "\n"); //임의의 공간 수 //계속 변함
        System.out.println();

        //시작인덱스 ~ (인덱스 - 1)번까지
        System.out.println("str1: " + str.delete(4, 8)); //인덱스4 ~ 인덱스7(" ", O, r, a) 제거 //str = "Javacle"
        System.out.println("str1: " + str); //str = "Javacle"
        System.out.println("길이1: " + str.length());
//		System.out.println("공간1: " + str.capacity() + "\n");

        //해당 인덱스 문자만 제거
        //str = "Javacle" // J0 a1 v2 a3 c4 l5 e6
        System.out.println("str2: " + str.deleteCharAt(1)); //인덱스1(a) 제거 //str = "Javcle"
        System.out.println("str2: " + str); //str = "Javcle"
        System.out.println("길이2: " + str.length());
//		System.out.println("공간2: " + str.capacity() + "\n");

        //해당 인덱스 문자만 가져오기
        //str = "Javcle" // J0 v1 a2 c3 l4 e5
        System.out.println("str3: " + str.charAt(1)); //str = "Javcle"
        System.out.println("str3: " + str);
        System.out.println("길이3: " + str.length());
//		System.out.println("공간3: " + str.capacity() + "\n");
        System.out.println("deleteCharAt(), str.charAt() 메소드 호출 후 원본 문자열: " + str);
    }

}