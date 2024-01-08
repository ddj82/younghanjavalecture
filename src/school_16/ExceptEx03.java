package school_16;

public class ExceptEx03 {

    public static void main(String[] args) {
        String c = null;
        System.out.println(" 문자열 값은: " + c);

        try {
//			System.out.println(" 문자열 값은: " + c); //에러코드가 아니면 catch문 안감, finally는 감
            System.out.println(" 문자열 값은: " + c.toString()); //에러코드(null은 주소값, 인스턴스가 없어서 아무것도 없음, 메소드호출 불가), catch문으로
        } catch (NullPointerException e) {
            System.out.println("예외가 발생하여 Exception 객체가 잡음");
            System.out.println(e); //java.lang.NullPointerException
            System.out.println(e.getMessage()); //에러내용 //null
            System.out.println(e.getCause()); //에러이유 //null
        } finally { //에러가 발생이 되든, 발생이 되지 않든 반드시 try ~ catch문이 실행된 후 마지막에 실행
            System.out.println("finally 블럭 수행");
        }
        System.out.println("정상 종료");
    }

}