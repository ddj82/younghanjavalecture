package school;

public class Ex08 {
    public static void main(String[] args) {
        boolean tf = !true;
        System.out.println("!true : " + tf);
        System.out.println("!false : " + !false);
        System.out.println("============\n");

        String str = "Hello";
        System.out.println(str instanceof String);
        // (객체명) instanceof (자료형)
        // instanceof 비교는 참조변수 이상만 가능
    }
}
