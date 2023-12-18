package school_01;

public class Ex15 {
    public static void main(String[] args) {
        //자동 타입 변환 = 묵지석 타입 변환 (업캐스팅)
        //byte < short < int < long < float < double
        byte b = 20; //-128 ~ 0 ~ 127
//        short s = b;
//        System.out.println("변수 b의 값: " + b);
//        System.out.println("변수 s의 값: " + s);
//
//        int i = b;
//        System.out.println("변수 i_b의 값: " + i);
//        i = s;
//        System.out.println("변수 i_s의 값: " + i);

        long l = b;
//        System.out.println("변수 l_b의 값: " + l);
//        l = s;
//        System.out.println("변수 i_s의 값: " + i);
//        l = i;
//        System.out.println("변수 i_i의 값: " + l);


        float f = b;
//        System.out.println("변수 i_b의 값: " + f);
//        f = s;
//        System.out.println("변수 f_s의 값: " + f);
//        f = i;
//        System.out.println("변수 f_i의 값: " + f);
//        f = l;
//        System.out.println("변수 f_l의 값: " + f);


        double d = b;
//        System.out.println("변수 d_b의 값: " + d);
//        d = s;
//        System.out.println("변수 d_s의 값: " + d);
//        d = i;
//        System.out.println("변수 d_i의 값: " + d);
        d = l;
        System.out.println("변수 d_l의 값: " + d);
//        d = f;
//        System.out.println("변수 d_f의 값: " + d);

        //[부호(1bit) + 정수(63bit) = 64bit = 8byte]
        //(-2의63승) ~ 0 ~ (2의63승 - 1)
        long ll = 999999999999999999L;
        //값 손실 발생
        //[부동소수점방식: 부호(1bit) + 지수(8bit) + 가수(23bit) = 32bit = 4byte]
        //-3.4*10의38승 ~ 3.4*10의38승
        System.out.println(ll);
        f = ll;
        System.out.println(f);
        //값 손실 발생
        //[부동소수점방식: 부호(1bit) + 지수(11bit) + 가수(52bit) = 64bit = 8byte]
        //-1.7*10의308승 ~ 1.7*10의308승
        d = ll;
        System.out.println(d);

    }
}
