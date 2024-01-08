package school_16;

public class ExceptEx04 {

    public static void main(String[] args) {
        try {
//			해보기:
//			매개인자 0개 입력하고 실행하기 : => ArrayIndexOutOfBoundsException Index 0 out of bounds for length 0예외 발생
//			매개인자 1개 입력하고 실행하기 : 숫자로 => java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1예외 발생
//			매개인자 2개 입력하고 실행하기 : 숫자로, 젯수 0으로 입력하기 => java.lang.ArithmeticException: / by zero예외 발생
//			매개인자 2개 입력하고 실행하기 : 숫자로, String으로 입력 => java.lang.NumberFormatException: For input string: "김"예외 발생
//			매개인자 String으로 입력하고 실행하기 : => java.lang.NumberFormatException: For input string: "김"예외 발생

            System.out.println("매개변수로 받은 두개의 값");
            int a = Integer.parseInt(args[0]); //문자열 값을 정수로 변환
            //숫자값이 아닌 다른 자료형이 들어오는 경우 에러 발생(Integer.parseInt에서), catch문으로 //매개인자 String으로 입력 //부터 실행안됨
            System.out.println("a의 값: " + a);

            int b = Integer.parseInt(args[1]);
            //배열의범위 에러 발생(args[1])에서, catch문으로 //매개인자 1개 : 숫자로 //부터 실행안됨
            //매개인자 2개 입력하고 실행하기 : 숫자로, String으로 입력 에러 발생(Integer.parseInt)에서, catch문으로 //매개인자 String으로 입력 //부터 실행안됨
            System.out.println("b의 값: " + b);

            System.out.println(" a = " + a + ", b = " + b);
            System.out.println(" a를 b로 나눈 몫 = " + (a / b)); //산술연산 에러 발생(a / b)에서, catch문으로 //매개인자 2개 입력 : 숫자로, 젯수 0으로 입력 //부터 실행안됨
            System.out.println("나눗셈 수행");
        } catch (ArithmeticException e) { //산술연산 에러 발생 //매개인자 2개 입력 : 숫자로, 젯수 0으로 입력
            System.out.println("===================");
            System.out.println("ArithmeticException 처리 루틴 : ");
            System.out.println(e + " 예외 발생"); //finally문으로
        } catch (ArrayIndexOutOfBoundsException e) { //배열의범위 에러 발생 //매개인자 1개 : 숫자로
            System.out.println("===================");
            System.out.println("ArrayIndexOutOfBoundsException 처리 루틴 : ");
            System.out.println(e + "예외 발생"); //finally문으로
        } catch (NumberFormatException e) { //숫자값이 아닌 다른 자료형이 들어오는 경우 에러 발생 //매개인자 String으로 입력
            System.out.println("===================");
            System.out.println("NumberFormatException 처리 루틴 : ");
            System.out.println(e + "예외 발생"); //finally문으로
        } catch (Exception e) { //자바의 전체 에러 범위 처리 //최고 에러조상 Exception는 모든 catch문 중 가장 마지막에 기술 //Exception catch문 밑에 catch문이 있으면 에러
            System.out.println("Exception 처리 루틴");
        } finally {
            System.out.println("===================");
            System.out.println("finally 블럭 수행");
        }
    }

}