package school_10;

abstract class Animal {
    private String astr = "추상클래스";
    abstract void cry(); //abstract메소드가 있다는건 상속받을 자식이 존재한다는 말임
    public String getAstr() {
        return astr;
    }
}

class Cat extends Animal {

    public void cry() {
        System.out.println("냐옹냐옹!");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍!");
    }
}

public class AbstractEx01 {
    public static void main(String[] args) {
        //추상 클래스는 인스턴스를 생성할 수 없음.
//		Animal a = new Animal();

        Cat c = new Cat();
        c.cry();
        Dog d = new Dog();
        d.cry();
//		Animal c = new Cat();
//		c.cry();
//		c = new Dog();
//		c.cry();

        System.out.println(c.getAstr());


//		Animal a1 = new Cat();
//		Animal a1 = new Dog();
//		a1.cry();
    }
}