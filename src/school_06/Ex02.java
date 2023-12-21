package school_06;

class One {
    int value; //1. 100// 2. 5

    public One() { //기본생성자
        this(100);
        this.value = 5;
        System.out.println("디폴트생성자");
    }

    public One(int value) { //기타생성자
        //자신의 value 변수에 매개변수로 받은 값을 저장
        this.value = value;
        //클래스 메소드를 호출. 매개변수로 자신의 객체를 전달
        Anorher ano = new Anorher();
        ano.method(this);
    }

    public void md() {
//        this();
    }
} //One클래스 종료중괄호

class Anorher {
    //기본생성자 숨어있음
    void method(One ins) { //ins = t1(One인스턴스)의 주소값
        System.out.println("메소드A에서의 값 : " + ins.value); // 1. "메소드A에서의 값: 100" 출력
        System.out.println("ins의 주소값 : " + ins); // 2. "ins의 주소값: t1(One인스턴스)의 주소값" 출력
    }
}

public class Ex02 {
    public static void main(String[] args) {
        One t1 = new One(); //100에서 5로 바뀌고 기본생성자 명령문 3. "디폴트생성자" 출력
        System.out.println("t1의 주소값 : " + t1); // "t1의 주소값: t1(One인스턴스)의 주소값" 출력 -4
        System.out.println("기본 값 : " + t1.value);// "기본 값: 5" 출력 -5
    }
}
