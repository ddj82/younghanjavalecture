package school_05;

public class A01_MemoryTest {
    public static void main(String[] args) {
        A01_Memory m1 = new A01_Memory("hello", 5);
        System.out.println("m1객체의 출력값 : " + m1.returnStr() + ", " + 	m1.returnNum());

        A01_Memory m2 = new A01_Memory("hello", 7);
        System.out.println("m2객체의 출력값 : " + m2.returnStr() + ", " + 	m2.returnNum());

        A01_Memory m3 = m2;
        System.out.println("m3객체의 출력값 : " + m3.returnStr() + ", " + 	m3.returnNum());

        System.out.println(m1 == m2);
        System.out.println(m1 == m3);
        System.out.println(m2 == m3);

    }
}
