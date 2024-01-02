package school_12.javalangex;

public class MathEx01 {

    public static void main(String[] args) {
        System.out.println(Math.random());
        // 숫자0과 숫자1 사이의 실수(0.~) 반환
        // (+a >> a부터, Math.random() * b >> b까지)

        System.out.println("0번: " + ((int)(Math.random() * 6) + 1)); // 1 ~ 6 사이 정수
        System.out.println("1번: " + ((int)(Math.random() * 6) + 3)); // 3 ~ 8 사이 정수
        System.out.println();

//		// abs(a) >> a의 절대값
//		System.out.println(Math.abs(10));
//		System.out.println(Math.abs(-10));
//		System.out.println(Math.abs(-3.14));
//		System.out.println();
//
//		// Math.ceil >> 무조건 올림처리
//		// Math.floor >> 무조건 내림처리
//		// Math.rint >> 반올림 처리
//		// ㄴ a.bc - b 5이상, c 0이면 내림 // a.bc - b 5이상, c 1이상 올림 // a.bc - b 5미만 내림
//
//		System.out.println("무조건 올림처리 ceil: " + Math.ceil(10.12));
//		System.out.println("무조건 내림처리 floor: " + Math.floor(10.92));
//		System.out.println("반올림 처리 rint: " + Math.rint(10.51));
//		// a.bc - b 5이상, c 0이면 내림 // a.bc - b 5이상, c 1이상 올림 // a.bc - b 5미만 내림
//		System.out.println("PI(원주율)의 값: " + Math.PI);
//		System.out.println();
//
//		System.out.println("10, 20 중에 큰 값: " + Math.max(10, 20));
//		System.out.println("10, 20 중에 작은 값: " + Math.min(10, 20));
//		System.out.println();

    }

}