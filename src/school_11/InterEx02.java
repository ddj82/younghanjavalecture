package school_11;

abstract class Shape { //Rectangle의 부모추상클래스
    public double res = 0;
    public abstract double area();
    public void printArea() {
        System.out.println("면적은 " + res);
    }
}

class Rectangle extends Shape implements Drawable { //추상클래스Shape의 자식 //인터페이스Drawable의 자식
    public int w = 10, h = 10;

    public double area() {
        System.out.println("Rectangle area()메소드");
        res = w * h;
        return res;
    }
    public void draw() {
        System.out.println("사각형을 그리다.");
    }
}

public class InterEx02 {
    public static void main(String[] args) {
        Rectangle ref = null;
        ref = new Rectangle();
        ref.area();
        ref.printArea();
        ref.draw(); //오버라이드 "사각형을 그리다."
    }
}
