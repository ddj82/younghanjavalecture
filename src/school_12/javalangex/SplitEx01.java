package school_12.javalangex;

public class SplitEx01 {
    public static void main(String[] args) {
        /*
         * 문자열객체명.split("구분자"[, 숫자값]) 메소드 :
         * 숫자값이 없는 경우 : nolimit = default (배열로 나누면서 연속적으로 끝까지 아무 값도 없는 경우는 배열에서 제외 됨)
         * => 해당 구분자를 기준으로 문자열 객체를 하나씩 나누어 문자열 배열 형태(반환타입 String[])로 만든다.
         * => 해당 구분자는 삭제된다.
         *
         * 숫자값이 있는 경우 : (범위 지정 => (인덱스 - 1)배열까지)의 String[]로 나눈다.
         *
         **/


        String str = "123::4:67:10::::";
        System.out.println(str + "\n==============================\n");

        //	"123" : " " : "4" : "67" : "10" : " " : " " : " " : " " :	//

        //noLimit.length = 5 (뒤에 아무 값도 없는 구분자 제외)
        String[] noLimit = str.split(":");
        System.out.println("-----noLimit-----" + noLimit.length);
        for (int cnt = 0; cnt < noLimit.length; cnt++) {
            System.out.print("[" + cnt + "]" + noLimit[cnt] + "\t");
        }
        System.out.println("\n");


        //구분자, (인덱스 - 1)배열까지
        String[] limitTwo = str.split(":", 2); // 구분자 기준, 2 = limitTwo.length //인덱스 0 ~ 1
        System.out.println("-----limitTwo-----" + limitTwo.length);
        for (int cnt = 0; cnt < limitTwo.length; cnt++) {
            System.out.print("[" + cnt + "]" + limitTwo[cnt] + "\t");
        }
        System.out.println("\n");

        String[] limitPlus = str.split(":", 7); // 구분자 기준, 7 = limitTwo.length //인덱스 0 ~ 6
        System.out.println("-----limitPlus-----" + limitPlus.length);
        for (int cnt = 0; cnt < limitPlus.length; cnt++) {
            System.out.print("[" + cnt + "]" + limitPlus[cnt] + "\t");
        }
        System.out.println("\n");


        //구분자 모두 배열로 구분, 값이 없는 이후 구분자와 값은 무시함(디폴트 0임)
        //noLimit와 동일
        String[] limitZero = str.split(":", 0);
        System.out.println("-----limitZero-----" + limitZero.length);
        for (int cnt = 0; cnt < limitZero.length; cnt++) {
            System.out.print("[" + cnt + "]" + limitZero[cnt] + "\t");
        }
        System.out.println("\n");

        //구분자가 없을 때까지 값이 없어도 표현
        String[] limitMinus = str.split(":", -1);
        System.out.println("-----limitMinus-----" + limitMinus.length);
        for (int cnt = 0; cnt < limitMinus.length; cnt++) {
            System.out.print("[" + cnt + "]" + limitMinus[cnt] + "\t");
        }
        System.out.println("\n");


    }
}