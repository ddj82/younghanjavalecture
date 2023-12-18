package school_01;

public class Ex11 {
    public static void main(String[] args) {
        final int MAX = 100, MIN = 0;
        int score = 50;

//        MAX = 20;
//        MIN = 10;

        boolean tf = (score >= MIN) && (score <= MAX);
        System.out.println("질문: 점수는 " + MIN + "점 보다 같거나 커야하고 또한 " + MAX + "점 보다 작거나 같습니까?");
        System.out.println("답변: " + tf);

    }
}
