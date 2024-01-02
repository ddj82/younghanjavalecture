package school_12.javalangex;

public class StringBufferEx02 {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java 만세!!"); //0J 1a 2v 3a 4" " 5만 6세 7! 8!
        System.out.println("원본 문자열: " + str + "\n");

        //(인덱스번호, 추가 문자열) => (인덱스번호) 앞에, (문자열) 추가
        System.out.println("str0: " + str.insert(4, "Script")); //4번 인덱스 앞에, "Script" 추가
        System.out.println("str0: " + str + "\n"); //원본 바뀜

        //문자열을 역순으로 재배치
        System.out.println("str1: " + str.reverse()); //str = "!!세만 tpircSavaJ"
        System.out.println("str1: " + str); //원본 바뀜
    }

}