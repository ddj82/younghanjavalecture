package school_15;

abstract class AnonyEx02Abstract { //추상클래스
    public abstract void doSomething();
}

public class AnonyEx02Test {
    public static void md(AnonyEx02Abstract n) {
        n.doSomething();
    }

    public static void main(String[] args) {
        AnonyEx02Test a = new AnonyEx02Test();
        int aa = 5; //지역변수
        final int AA = 7; //지역상수

        AnonyEx02Test.md(new AnonyEx02Abstract(){
            //md() 메소드 매개변수로 ();에 new AnonyEx02Abstract(){}를 넣은거 //(new AnonyEx02Abstract()=부모 {익명클래스}=자식); //대표자료형-AnonyEx02Abstract
            private int a = 15;
            String s = "AnonymousClass";
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
            }
        }); //md() 메소드호출문

    }

}