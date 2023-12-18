package school_04;

public class Ex07Main {
    public static void main(String[] args) {
        //자료형(=클래스명) 객체명 = new 자료형();
        Ex07Class e7c = new Ex07Class();

//		e7c.x = 10; //e7c.x => 10으로 변경됨.
        e7c.setX(10); //e7c.x => 10으로 변경됨.
//		e7c.y = 20; //e7c.y => 20으로 변경됨.
        e7c.setY(20); //e7c.y => 20으로 변경됨.

        System.out.println(e7c.x);
    }
}
