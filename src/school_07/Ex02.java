package school_07;

public class Ex02 {
    public static void main(String[] args) {
        // concat : 문자열 뒤로 추가
        // 형식 : 문자열객체.concat("뒤에 추가할 문자열");

        String str = new String("Java");
        System.out.println("원본 문자열 : " + str);
        System.out.println(str.hashCode()); //str이 가리키는 값의 주소값


        System.out.println(str.concat("수업")); //String에서 제공하는 메소드는 원본 훼손이 일어나지 않는다 //"Java수업" => 새로운 주소값 할당
        System.out.println("concat() 메소드 호출 후 원본 문자열 : " + str); //String에서 제공하는 메소드는 원본 훼손이 일어나지 않는다 //"Java" 출력
        System.out.println(str.hashCode()); //str이 가리키는 값의 주소값
        System.out.println(str.concat("수업").hashCode()); //str.concat("수업")이 가리키는 값의 주소값

    }
}
