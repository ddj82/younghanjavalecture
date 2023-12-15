package school_first;

public class Ex13 {
    public static void main(String[] args) {
        //printf()
        int a = 30;
        //서식지정자 형식
        //System.out.printf("문자열안에 필요한 서식지정자를 기술", 서식기정자의 나열한 갯수와 나열한 순서에 맞게끔 입력 될 값을 ,(콤마)로 나열해주어야 한다.);
        /*
        System.out.printf("문자열서식지정자: %s, 십진정수서식지정자: %d, 실수형식지정자: %f, "문자열서식지정자" , 50, 5.25);
         */
        System.out.printf("%d\n", a);
        System.out.printf("(30)10진수 => (%o)8진수 소문자표기%n", a);
        System.out.printf("(30)10진수 => (%x)16진수 소문자표기%n", a);
        System.out.printf("(30)10진수 => (%X)16진수 대문자표기%n", a);
        System.out.printf("%%s서식지정자(formatter) %s\n", "문자열 출력");
        System.out.printf("%%f서식지정자(formatter) %f\n", 3.2582);
        System.out.printf("%f\n", 3.2582);
        System.out.printf("%2.2f\n", 3333.2582);
        System.out.printf("%-10d과 %.4f\n", 10, 3.2582);
        System.out.printf("바나나우유 230ML는 %,10d원 입니다.\n", 1200);
//        System.out.printf();
    }
}
