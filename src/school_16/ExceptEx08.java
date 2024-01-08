package school_16;

public class ExceptEx08 {

    public static void main(String[] args) {
        try {
            findClass();
        } catch (Exception e) { //findClass()안에서 예외 발생, findClass()가 throws한 ClassNotFoundException 이상 급으로 처리해야 함.
            System.out.println("클래스가 존재하지 않습니다.");
            System.out.println("에러 사유: " + e); // java.lang.ClassNotFoundException: java.lang.WowClass
        }

    }

    public static void findClass() throws ClassNotFoundException {
        //호출 한 놈한테 실행문의 에러를 throws ClassNotFoundException 이상 급으로 던져라
        Class clazz = Class.forName("java.lang.WowClass"); //고의 에러 발생 //에러내용 = "java.lang.WowClass"
    }

}