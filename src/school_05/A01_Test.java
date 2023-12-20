package school_05;

public class A01_Test {
    public static void main(String[] args) {
        A01_Memory m1 = new A01_Memory();
        A01_Memory m2 = new A01_Memory("기타생성자로 객체생성", 1);

        System.out.println(m1.returnStr());
        System.out.println(m1.returnNum());
        System.out.println(m2.returnStr());
        System.out.println(m2.returnNum());


    }
}
