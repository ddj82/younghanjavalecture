package school_05;

public class A02_ArgumentClass {
    public static void main(String[] args) {

        if (args.length <= 0) {
            System.out.println("파라미터를 입력해주세요");
        } else {
            int a = 0;
            int i = 0;
            for (String s : args) {
                System.out.println("args[" + i + "]의 값은 " + s);
                i++;
            }
        }
    }
}
