package school_11;

interface PaTest { //Test클래스의 부모인터페이스
    public static final String KIND = "사람";
    public abstract void trueKind();
    public abstract void falseind();

}

public class Test implements PaTest{ //PaTest인터페이스의 자식클래스
    private String name;
    private int age;

    public Test() {

    }
    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void trueKind() { //PaTest부모인터페이스 몸체
        System.out.println(KIND + "입니다.");
    }

    @Override
    public void falseind() { //PaTest부모인터페이스 몸체
        System.out.println(KIND + "이 아닙니다.");
    }
}
