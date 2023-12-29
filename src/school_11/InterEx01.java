package school_11;

class Circle implements Drawable {
    public void draw() {
        System.out.println("원을 그리다.");
    }
}
public class InterEx01 {
    public static void main(String[] args) {
        Drawable ref;
        // 형변환(캐스팅) 후, Circle 클래스의 draw 메소드 호출
        ref = new Circle();
        ref.draw(); //오버라이드
    }
}
