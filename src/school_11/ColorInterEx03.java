package school_11;

class Triangle implements Color {
    int color = 0;
//  public Triangle() {
//	상속자식 실행생성자 처음 명령에 숨어있는 super()는 부모가 클래스일때만
//	부모가 인터페이스면 super() 없음 인터페이스는 생성자를 가질 수 없어서
//	}

    public int getColor() {
        return color;
    }

    public void setColor(int c) {
        color = c;
    }
}

public class ColorInterEx03 {
    public static void main(String[] args) {
        Triangle ref = new Triangle();
        ref.setColor(Color.RED);
        switch (ref.getColor()) {
            case 1:
                System.out.print("빨간색");
                break;
            case 2:
                System.out.print("초록색");
                break;
            case 3:
                System.out.print("파란색");
                break;
        }
        System.out.println("  삼각형");
    }
}
