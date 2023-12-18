package school_04;

public class Ex06Main {
    public static void main(String[] args) {
        //객체 선언 및 공간할당(new -> 클래스복제 메모리에 올려놓기)
        //자료형(=클래스) 객체명 = new 자료형(); //자료형() -> 생성자호출문
        Ex06Class e6c = new Ex06Class();
        e6c.x = 10;
        System.out.println(e6c.x + ", " + e6c.y);

        Ex06Class e6c1 = new Ex06Class();
        e6c1.y = 5;
        System.out.println(e6c1.x + ", " + e6c1.y);
    }

}
