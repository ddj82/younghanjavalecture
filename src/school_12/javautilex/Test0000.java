package school_12.javautilex;

public class Test0000 {
    public static void main(String[] args) {
        int[] lotto = new int[45];
        for (int i = 1; i <= 45; i++) {
            lotto[i - 1] = i;
        }

        int[] luckyNum = new int[7];
        System.out.print("당첨번호는: ");

        // 중복을 방지하기 위해 사용된 숫자를 기억하는 배열
        boolean[] usedNumbers = new boolean[46];

        for (int j = 0; j < 7; j++) {
            int p;

            // 중복된 숫자가 나오지 않을 때까지 반복
            do {
                p = (int)(Math.random() * 45) + 1;
            } while (usedNumbers[p]);

            luckyNum[j] = lotto[p - 1];
            usedNumbers[p] = true;

            if (j < 5) {
                System.out.print(luckyNum[j] + ", ");
            }
            if (j == 5) {
                System.out.print(luckyNum[j]);
            }
        }

        System.out.println(" 보너스번호: " + luckyNum[6]);


    }

}