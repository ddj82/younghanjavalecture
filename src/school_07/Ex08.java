package school_07;

public class Ex08 {
    public static void main(String[] args) {
        //compareTo : 문자열 비교
        //문자열 비교 : 값을 int로 반환.
        //시작 문자열이 동일하지 않은 문자열 : 시작 문자열의 아스키코드 값 차를 반환.
        //1. 비교대상에 문자열이 포함되어 있을 경우(단, 첫글자부터 다른 문자열인 경우도 해당)
        //2. 비교대상과 전혀 다른 문자열인 경우(단, 첫글자부터 다른 문자열인 경우도 해당)

        String str = new String("abcd");
        System.out.println("원본 문자열: " + str);
        System.out.println("0-1번. 문자열개수비교 : " + str.length() + "개 - 2개 : " + str.compareTo("ab"));
        System.out.println("0-2번. 아스키코드 차 : " + (int) 'a' + " - " + (int) 'b' + " : " + str.compareTo("bc")); //str의 시작문자 a의 아스키코드 - 비교문자열의 시작문자 b의 아스키코드
        System.out.println("1번. 아스키코드 차 : " + (int) 'a' + " - " + (int) 'b' + " : " + str.compareTo("bcef")); //문자열의 길이가 같아도 시작문자가 달라서 아스키코드 값 차

        System.out.println("2-1번. 문자열개수비교 : " + str.compareTo("abcde"));
        System.out.println("2-2번. 아스키코드 차 : "  + (int) 'a' + " - " + (int) 'u' + " : " + str.compareTo("uvwxyz"));

        System.out.println("3번. " + str.compareTo("abcd")); //완전한 포함관계 o : 문자열개수비교
        System.out.println("4번. " + str.compareTo("adej")); //완전한 포함관계 x : 다른 인덱스자리 아스키코드 차 b - d
        System.out.println("5번. " + str.compareTo("Abcd")); //다른 인덱스자리 아스키코드 차 a - A

        //compareToIgnoreCase : 대소문자 같다고 치고 compareTo
        System.out.println("6-1번. " + str.compareToIgnoreCase("abcd"));
        System.out.println("6-2번. " + str.compareToIgnoreCase("ACd")); //대소문자 같아도 완전한 포함관계 x : 다른 인덱스자리 아스키코드 차 b - c
        System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str);
        System.out.println("\n============================================\n");

        //숫자비교 : 값을 int로 반환. 크다(1), 같다(0), 작다(-1)
        Integer x = 3;
        Integer y = 4;
        Double z = 1.0;

        System.out.println("7번. x<y 의미 : " + x.compareTo(y));
        System.out.println("8번. x==3 의미 : " + x.compareTo(3));
        System.out.println("9번. x>2 의미 : " + x.compareTo(2));
        System.out.println("10번. z<2.7 의미 : " + z.compareTo(2.7));
    }
}
