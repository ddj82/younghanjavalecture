package school_16;

public class ExceptEx06 {

    public static void main(String[] args) {
        try {
            String c = null;
            System.out.println("c값: " + c); //실행 됨
            System.out.println(" 문자열 값: " + c.toString()); //에러발생, c.toString(), null이라 메소드호출 불가 //부터 실행 안됨
            System.out.println("c값: " + c); //실행 안됨
        } catch (Exception e) {
            System.out.println(" >> 예외처리 구문 << ");
            System.out.println(" >> e << ");
            System.out.println(e); //java.lang.NullPointerException
            System.out.println(" >> e.toString() << ");
            System.out.println(e.toString());
            //java.lang.NullPointerException //Exception extends Throwable, Throwable.toString()에 오버라이드 //e 출력
            System.out.println(" >> e.getMessage() << ");
            System.out.println(e.getMessage()); //null
            //발생한 예외 클래스의 인스턴스에 저장된 메시지 얻어오기
            System.out.println(" >> e.printStackTrace() << ");
            e.printStackTrace(); //더 자세하게 에러내용 가져옴
//			java.lang.NullPointerException
//				at exceptex.ExceptEx06.main(ExceptEx06.java:9)
            //예외 발생 당시의 호출 스택에 있는 메소드의 정보와 예외 메시지를 화면에 출력
        } finally {
            System.out.println("finally처리");
        }
        System.out.println("완료");
    }

}