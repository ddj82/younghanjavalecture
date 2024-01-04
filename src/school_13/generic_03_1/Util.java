package school_13.generic_03_1;

public class Util {
    public static <T> Box<T> boxing(T t) {
        //메소드에만 제네릭타입을 쓰려면 리턴타입 앞에 타입변수 제네릭타입을 명시 해줘야함
        //메소드에서만 제네릭 타입을 쓸 땐 메소드호출시 매개변수에 따라 달라짐
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }
}
