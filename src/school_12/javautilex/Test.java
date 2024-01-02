package school_12.javautilex;

public class Test {

    public static void main(String[] args) {
        int[] lotto = new int[45];
        for (int i = 1; i <= 45; i++) {
            lotto[i-1] = i;
        }

        int[] luckyNum = new int[7];
        System.out.print("당첨번호는: ");

        for(int j = 0; j < 7; j++) {
            int p = (int)(Math.random()*44)+0;
            luckyNum[j] = lotto[p];
            if (j < 5) {
                System.out.print(luckyNum[j] + " ");
            }
            if (j == 5) {
                System.out.print(luckyNum[j]);
            }
        }
        System.out.println(", 보너스번호: " + luckyNum[6]);



    }

}
