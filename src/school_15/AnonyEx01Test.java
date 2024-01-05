package school_15;

abstract class AnonyEx01Abstract { //추상클래스 //ASub부모추상클래스
    public String s;
    public abstract void doSomething();
}

class ASub extends AnonyEx01Abstract { //AnonyEx01Abstract자식클래스

    @Override
    public void doSomething() {
        System.out.println("ASub클래스 doSomething()메소드 호출");
    }

}

public class AnonyEx01Test {

    public static void main(String[] args) { //메인메소드
        int aa = 5; //지역변수
        final int AA = 7; //지역상수

        AnonyEx01Abstract myClass = new ASub() {
            //익명클래스
//			AnonyEx01Abstract[조상] myClass = new ASub[부모]() {[자식-익명클래스]};

            //pacha케이스, 멤버변수 하이딩
            private int a = 15; //멤버변수
            String s = "AnonymousClass"; //멤버변수
            final int AA = 0; //멤버상수
//			static final int AA = 0;
//			static int st = 0;

            @Override
            public void doSomething() {
//				aa = a + aa;
                super.doSomething();
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

        myClass.doSomething(); //오버라이드, 외부접근가능, 마지막자식인 익명클래스꺼 호출가능
//		myClass.etcMethod(); //pacha라서 다른이름 메소드 자식(익명클래스)꺼 Hiding 외부접근불가.
//		aa = aa + 15;
        System.out.println("aa: " + aa);
        System.out.println(myClass.s);
        //pacha에서 같은이름 멤버필드는 부모꺼사용 //(조상)AnonyEx01Abstract s 출력 //다른이름 멤버변수는 자식꺼 Hiding(조상/부모에 s가 없으면 에러)

    }

}