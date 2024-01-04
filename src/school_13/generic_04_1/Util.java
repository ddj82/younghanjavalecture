package school_13.generic_04_1;

public class Util {
    //자식, 자손이 될 수 있는 자료형클래스 extends 부모, 조상 클래스 인터페이스
    public static <T extends Ancestor> void boundType(T t1) {
        //<T extends 클래스명/인터페이스명> = T는 해당 클래스명/인터페이스명의 자식/자손 만 가능
        //<T extends 클래스명> = 클래스는 T에 해당클래스 포함 해당클래스의 자식/자손
        //<T extends 인터페이스명> = 인터페이스는 객체생성 불가능이라 T에 해당인터페이스는 안됨

        t1.ancestor();
    }
}
