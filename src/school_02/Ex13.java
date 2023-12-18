package school_02;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("라벨 분기점 for문");
        gugudan:
        for (int i = 2; i <= 9; i++) {
            System.out.println("구구단 " + i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }
}
