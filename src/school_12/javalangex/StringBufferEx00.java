package school_12.javalangex;

public class StringBufferEx00 {

    public static void main(String[] args) {
//		String str = new String("Java"); //단축형식 String str = "Java";
//		System.out.println("str 문자열 주소1: " + System.identityHashCode(str));
//		str = str + " 수업";
//		System.out.println("str 문자열 주소2: " + System.identityHashCode(str));
//		str += " 시간";
//		System.out.println("str 문자열 주소3: " + System.identityHashCode(str) + "\n");

        StringBuffer strb = new StringBuffer(""); //StringBuffer = 가변형 자료형 //원본훼손 됨
//		strb = "가나다라마바사"; (x)  //단축형식 불가능
        System.out.println(strb);
        System.out.println("strb 문자열 주소1: " + System.identityHashCode(strb)); //strb
//		System.out.println("길이1: " + strb.length());

        strb = strb.append("Java 수업");
//		System.out.println("strb 문자열 주소2: " + System.identityHashCode(strb));
        System.out.println(strb);
//		System.out.println("길이2: " + strb.length());

        strb = strb.append(" 수업 수업 수업");
//		System.out.println("strb 문자열 주소3: " + System.identityHashCode(strb));
        System.out.println(strb);
//		System.out.println("길이3: " + strb.length());

        strb = strb.append(" 수업");
        System.out.println("strb 문자열 주소4: " + System.identityHashCode(strb));
        System.out.println(strb);
//		System.out.println("길이4: " + strb.length());
    }

}