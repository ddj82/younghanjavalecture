package school_16;

public class ExceptEx00 {

    public static void main(String[] args) {
        //예외처리문 책임감형
        try {
            Class c = Class.forName("String"); //Class.forName("java.lang.String")
//			Class c = Class.forName("String");가 에러 구문이라 바로 catch문으로
            System.out.println("111");
            System.out.println(c);

        } catch (Exception e) { //예외처리에선 Exception이 최고 조상 //Object같은
            System.out.println(e); //Exception e = 에러내용
        }
        System.out.println("시스템 정상 종료"); //예외처리문 책임감형에선 뒤에 코드까지 실행함
    }


//	public static void main(String[] args) throws ClassNotFoundException {
//		//예외처리문 책임전가형
//		System.out.println("111");
//		Class c1 = Class.forName("String");
//		//예외처리문 책임전가형에선 에러코드 throws로 던지고 뒤에 코드 실행안함
//		System.out.println(c1);
//		System.out.println("222");
//}

}