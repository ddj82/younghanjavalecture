package school_11;

public interface Color {
    // public static final 생략된 것이므로 상수
    int RED = 1;
    int GREEN = 2;
    int BLUE = 3;

    // public abstract 생략된 것이므로 추상메소드
    void setColor(int c);
    int getColor();
}
