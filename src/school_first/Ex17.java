package school_first;

public class Ex17 {
    public static void main(String[] args) {
        System.out.printf(" 문자 %c 의 유니코드/아스키코드 값은 %d \n", 'A', (int) 'A');
        System.out.printf(" 문자 %c 의 유니코드/아스키코드 값은 %d \n", 'a', (int) 'a');
        System.out.printf(" 문자 %c 의 유니코드/아스키코드 값은 %d \n", '0', (int) '0');
        System.out.printf(" 문자 %c 의 유니코드 값은 %d \n", '가', (int) '가');
        System.out.printf("========================================\n");
        System.out.printf(" 문자 %c 의 유니코드/아스키코드 값은 %d \n", 'A' + 1, (int) ('A' + 1));

    }
}
