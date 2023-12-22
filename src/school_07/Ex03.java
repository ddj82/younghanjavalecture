package school_07;

public class Ex03 {
    public static void main(String[] args) {
        String str1 = new String("해피썬데이");

        System.out.println("기존 str1의 길이 : " + str1.length());
        str1 = "  " + str1 + "   "; //앞에 2개, 뒤에 3개의 공백 추가
        System.out.println("공백 추가된 str1의 길이 : " + str1.length());
        str1 = str1.trim();
        System.out.println("공백 제거된 str1의 길이 : " + str1.length());

        char ch = str1.charAt(2); //str1.charAt(인덱스번호) => str1 문자열에서 (인덱스번호)의 문자 가져와라
        //특정 위치에 있는 문자(char)
        System.out.println(str1 + "의 charAt(2) : " + ch);


        //substring(값1) : 값1에 해당되는 인덱스번호의 문자열부터 마지막문자열까지의 문자열 가져와라
        //substring(값1, 값2) : 값1에 해당되는 인덱스번호부터 ((값2)-1)을 한 인덱스번호까지의 문자열 가져와라
        String str2 = str1.substring(3);
        //문자열의 일부분을 발췌
        //3번 인덱스 ~ 끝까지
        System.out.println(str1 + "의 substring(3) : " + str2);

        String str3 = str1.substring(2, 4);
        //2번 ~ (4 - 1)번 인덱스
        System.out.println(str1 + "의 substring(2, 4) : " + str3);
    }
}
