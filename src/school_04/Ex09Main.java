package school_04;

class Ex09Class {
    int x;
    int y;

    //생성자 : 객체를 생성할 수 있도록 해주는 기능
    public Ex09Class() {
        System.out.println("매개변수가 없는 디폴트 생성자");
    }

    public void showPoint() {
        System.out.println(x + ", " + y);
    }
}
public class Ex09Main {
    public static void main(String[] args) {
        //객체생성문 형식
        //자료형(=클래스명) 객체명 = new 생성자호출문(); //생성자호출문 => 클래스명();
        Ex09Class e9c = new Ex09Class();
        e9c.showPoint();

    }
}
