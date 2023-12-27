package school_08;

class One { //부모 Super 기본 상위
    int d1;
    int s;

    One() {
        System.out.println("One의 디폴트 생성자");
    }

    One(int s1) {
        System.out.println("One의 생성자");
        s = s1; //s = 10
        d1 = s * s; // d1 = 10 * 10 = 100
    }
}

class Two extends One { //자식 Sub 파생 하위
    int d2;
    int t;

    Two() {
        this(10, 20); //내꺼 자식 생성자 호출문
        System.out.println("Two의 디폴트 생성자");
    }

    Two(int s1, int t1) { //s1 = 10  t1 = 20
        super(s1); //부모 One 기타 생성자 호출문
        System.out.println("Two의 생성자");
        t = t1; // t = 20
        d2 = t * t; // d2 = 20 * 20 = 400
    }
}

public class Super02 {

    public static void main(String[] args) {
        Two super1 = new Two(); //chacha
        /* super1 인스턴스
         *
         * "One의 생성자"
         * 부모 s = 10 d1 = 100
         * "Two의 생성자"
         * 자식 t = 20 d2 = 400
         * "Two의 디폴트 생성자"
         *
         */
        Two super2 = new Two(10, 20); //chacha
        /* super2 인스턴스
         *
         * "One의 생성자"
         * 부모 s = 10 d1 = 100
         * "Two의 생성자"
         * 자식 t = 20 d2 = 400
         *
         */
        System.out.println("10의 제곱 : " + super2.d1);
        System.out.println("20의 제곱 : " + super2.d2);

        System.out.println(super1.d1); //super2.d1 랑 다른애
        System.out.println(super1.d2); //super2.d2 랑 다른애

    }

}
