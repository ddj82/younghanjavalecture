package school_16;

public class ExceptEx01 {

    public static void main(String[] args) {
        int c;
        System.out.println("1111"); //출력됨
//		c = 4 / 0; //에러코드, 윗줄 실행 후 비정상종료 됨
        System.out.println("2222"); //출력됨
        try {
            System.out.println("3333"); //출력됨
            c = 4 / 0; //젯수가 0이면 에러 비정상종료 안되고 catch문으로
            System.out.println("4444"); //에러코드 다음줄 출력안됨
        } catch (ArithmeticException e) { //산술연산에러자료형 = ArithmeticException
            System.out.println("젯수(나누는 수)는 0이 될 수 없습니다.\n0이상이 되도록 변경해주세요.");
        }

        System.out.println("5555"); //출력됨
        System.out.println("시스템 종료"); //출력됨
    }

}