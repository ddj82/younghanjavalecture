package school_07;

public class Ex01 {
    public static void main(String[] args) {
        //직접 문자열을 지정(canonical 문자열)
        //단축(shorthand) 초기화로 객체생성
        String s1 = "Java Korea";

        String s2 = new String("Java Korea");

        //s2 문자열을 canonical 문자열로 전환
        String s3 = s2.intern(); //s2.intern() => s2가 가리키고 있는 값 가져와

        //단축 초기화로 객체생성
        String s4 = "Java Korea";

        System.out.println(">> String 객체가 참조하는 주소가 같은지 비교");
        System.out.println("s1 == s2 : " + (s1 == s2)); //f
        System.out.println("s2 == s3 : " + (s2 == s3)); //f
        System.out.println("s1 == s3 : " + (s1 == s3)); //t
        System.out.println("s1 == s4 : " + (s1 == s4)); //t

        System.out.println(">> String 데이터 값(내용)이 같은지 비교"); //문자열객체.equals(문자열객체) 문자열값 비교 메소드
        System.out.println(s1.equals(s2)); //t
        System.out.println(s2.equals(s3)); //t
        System.out.println(s1.equals(s3)); //t
        System.out.println(s1.equals(s4)); //t

        System.out.println(">> String 데이터의 해쉬코드"); //다 같음
        System.out.println(s1.hashCode()); //System.identityHashCode(s1) => s1가 가리키고 있는 값의 주소값 가져와
        System.out.println(s2.hashCode()); //System.identityHashCode(s2) => s2가 가리키고 있는 값의 주소값 가져와
        System.out.println(s3.hashCode()); //System.identityHashCode(s3) => s3가 가리키고 있는 값의 주소값 가져와
        System.out.println(s4.hashCode()); //System.identityHashCode(s4) => s4가 가리키고 있는 값의 주소값 가져와

        System.out.println(">> String 테이터의 식별해쉬코드");
        System.out.println(System.identityHashCode(s1)); //System.identityHashCode(s1) => s1가 들어있는 주소값 가져와  단축들 s1 s3 s4 같음
        System.out.println(System.identityHashCode(s2)); //System.identityHashCode(s1) => s2가 들어있는 주소값 가져와  new라서 얘만 다름
        System.out.println(System.identityHashCode(s3)); //System.identityHashCode(s1) => s3가 들어있는 주소값 가져와  단축들 s1 s3 s4 같음
        System.out.println(System.identityHashCode(s4)); //System.identityHashCode(s1) => s4가 들어있는 주소값 가져와  단축들 s1 s3 s4 같음

        //해당 객체가 해당 자료형이 맞는지 확인
        String str = "Hello";
        System.out.println(str instanceof String);
    }
}
