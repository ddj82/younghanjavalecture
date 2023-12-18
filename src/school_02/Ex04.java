package school_02;

public class Ex04 {
    public static void main(String[] args) {
        int a = 12, b = 4, c = 19;

        int max = (a > b) ? a : b; //12
        // (조건식) ? (참값, 참실행문) : (거짓값, 거짓실행문)
        max = (max > c) ? max : c; //19
        System.out.println("최대값은 " + max);

    }
}
