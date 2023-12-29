package school_11;

public interface X {
    void xmeth1();
    void xmeth2();
}
interface Y{
    void ymeth1();
}
interface Z extends X, Y { //두 개의 인터페이스 상속 //다형성 = 다중상속 = 인터페이스의 목적
    void zmeth1();
}
