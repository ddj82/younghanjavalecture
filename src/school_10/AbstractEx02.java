package school_10;

abstract class Shape { //추상부모클래스
    public abstract void draw();
}

class Circle extends Shape { //자식클래스
    public void draw() {
        System.out.println("원을 그리다.");
    }
}

public class AbstractEx02 {
    public static void main(String[] args) {
        Shape ref; //추상클래스 인스턴스 선언문
        ref = new Circle(); //pacha 객체선언 초기화
        ref.draw(); //draw메소드 호출 자식꺼 오버라이딩 draw메소드 실행
    }
}