package school_04;

class Ex10Class {
    int x;
    int y;

    public Ex10Class() {
        System.out.println("매개변수가 없는 디폴트 생성자");
    }
    //생성자

    public Ex10Class(int new_x, int new_y) {
        x = new_x;
        y = new_y;
    }
    //생성자

    public void showPoint() {
        System.out.println(x + ", " + y);
    }
    //매서드
}

public class Ex10Main {
    public static void main(String[] args) {
        Ex10Class pt07 = new Ex10Class(100, 200);
        System.out.println(pt07.x + ", " + pt07.y);

        Ex10Class pt08 = new Ex10Class(300, 400);
        System.out.println(pt08.x + ", " + pt08.y);

    }
}
