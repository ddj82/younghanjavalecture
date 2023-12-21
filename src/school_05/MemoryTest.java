package school_05;

public class MemoryTest {
    public static void main(String[] args) {
        Memory m1 = new Memory("hello", 5);
        System.out.println("m1객체의 출력값 : " + m1.returnStr() + ", " + 	m1.returnNum());

        Memory m2 = new Memory("hello", 7);
        System.out.println("m2객체의 출력값 : " + m2.returnStr() + ", " + 	m2.returnNum());

        Memory m3 = m2;
        System.out.println("m3객체의 출력값 : " + m3.returnStr() + ", " + 	m3.returnNum());

        System.out.println(m1 == m2);
        System.out.println(m1 == m3);
        System.out.println(m2 == m3);

    }
}
