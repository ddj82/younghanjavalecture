package school_13.generic_01;

public class Box<T> {
    private T t;

    //public Box<T> () {}
    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
