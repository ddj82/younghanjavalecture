package school_15;

interface AnonyEx04Abstract {
    String s = "상수"; //public static final 숨어있음
    void doSomething(); //public abstract 숨어있음
    void etcMethod(); //public abstract 숨어있음
}

public class AnonyEx04Test {

    public static void main(String[] args) {
        int aa = 5;
        final int AA = 7;

        AnonyEx04Abstract myClass = new AnonyEx04Abstract() {
            //익명클래스
            //AnonyEx04Abstract myClass = new AnonyEx04Abstract[부모]() {[자식-익명클래스]};
            //pacha케이스, 멤버변수 하이딩
            private int a = 15; //멤버변수
            String s = "AnonymousClass"; //멤버변수
            //			final int AA = 0; //멤버상수
            static final int AA = 0;
            //			static int st = 0;
            @Override
            public void doSomething() {
//				aa = a + aa;
                System.out.println("내부 익명 클래스의 doSomething메소드");
                System.out.println("s : " + s);
                System.out.println("a : " + a);
                System.out.println("aa : " + aa);
                System.out.println("AA : " + AA);
                etcMethod();
            }

            public void etcMethod() {
                System.out.println("기본 메소드입니다.");
            }
        };

        myClass.doSomething();
        myClass.etcMethod();
//		aa = aa + 15;
        System.out.println("aa: " + aa);
        System.out.println(myClass.s);

    }

}