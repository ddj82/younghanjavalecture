package school_16;

public class ExceptEx07 {

    public static void main(String[] args) {
        try {
            method1();
            //method1() throws 예외처리객체 {} => throws로 던진 클래스(예외처리객체) 이상급으로 받음
            //method1() throws 예외처리객체 {} => catch에는 throws로 던진 클래스(예외처리객체) 이상급으로 해줘야함
        } catch (Exception e) {
            System.out.println("main 에서 Exception예외 처리");
            System.out.println(e.getMessage()); //e.getMessage() = NumberFormatException("숫자형식이 아닙니다.");
//			e.printStackTrace();
        }
        System.out.println("종료");
    }

    static void method1() throws NumberFormatException { //method1() throws Exception = method1() 실행문에서 에러가 발생하면 호출한놈이 책임
        System.out.println("예외발생시키기");
//		throw new Exception(); //예외를 고의로 발생시킴
        throw new NumberFormatException("숫자형식이 아닙니다."); //예외를 고의로 발생시킴
        //throw = 내 뒤에 생성한 예외처리객체로 에러발생 하라는 키워드
        //throw 뒤에는 new로 예외처리객체생성 해야함.
    }

//	static void method1() {
//		System.out.println("예외발생시키기");
//		try {
//			throw new Exception(); //예외를 고의로 발생시킴
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}