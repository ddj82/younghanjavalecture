package school_16;

public class ExceptEx02 {

    public static void main(String[] args) {
        System.out.println(1); //실행
        System.out.println(2); //실행
        try {
            System.out.println(3); //실행
            System.out.println(0 / 0); //에러코드 catch문으로
            System.out.println(4); //실행안됨
        } catch (ArithmeticException ae) {
            System.out.println(ae); //ArithmeticException ae = java.lang.ArithmeticException: by zero
            System.out.println("ArithmeticException에러메세지: " + ae.getMessage()); //위랑 같은데 이유만 //by zero
        }
    }

}