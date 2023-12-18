package school_04;

public class Ex05 {
    static void printstr(String str) {
        System.out.println(str);
    }

    static void printstr(char ch, int cnt) {
        for (int i = 0; i < cnt; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printstr("하늘은 파랗다.");
        printstr('A', 10);
    }
}
