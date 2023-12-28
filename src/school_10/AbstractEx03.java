package school_10;

abstract class Shape1 {
    public double res = 0;
    public abstract double area();
    public void printArea() {
        System.out.println("면적은 " + res);
    }
}

class Circle1 extends Shape1 {
    public int r = 5;

    public double area() {
        System.out.println("Circle1 area()메소드");
        res = r * r * Math.PI; // Math.PI = 3.14159265358979323846 = 78.53981...
        return res; //78.53981...
    }
}

class Rectangle extends Shape1 {
    public int w = 10, h = 10;

    public double area() {
        System.out.println("Rectangle area()메소드");
        res = w * h;
        return res; //100
    }
}

public class AbstractEx03 {
    public static void main(String[] args) {
        Shape1 ref = new Circle1(); //Circle1와 pacha
        ref.area(); //오버라이딩 "Circle1 area()메소드"
        ref.printArea(); //면적은 78.53981...

        ref = new Rectangle(); //Rectangle와 pacha
        ref.area(); //오버라이딩 "Rectangle area()메소드"
        ref.printArea(); //면적은 100.0

    }

}