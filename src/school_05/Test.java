package school_05;

public class Test {
    public static void main(String[] args) {
        Memory m1 = new Memory();
        Memory m2 = new Memory("기타생성자로 객체생성", 1);

        System.out.println(m1.returnStr());
        System.out.println(m1.returnNum());
        System.out.println(m2.returnStr());
        System.out.println(m2.returnNum());


    }
}
