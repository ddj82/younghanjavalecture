package school_12.javalangex;

public class SplitEx02 {

    public static void main(String[] args) {
        String mail = "hello-Kitty@hellokitty.com";

        //구분자: - @ . 을 구분자로 인식	.+*등은 \\. \\+ \\* 등으로 해주어야 인식 됨.
        String[] strAry = mail.split("-|@|\\."); //| = or // length = 4
        for (String s : strAry) {
            System.out.print(s + "\t");
        }
        System.out.println("\n");

        //구분자: + 을 구분자로 인식	\\+ 해주어야 인식 됨
        mail = "1+21+3+47+5";
        strAry = mail.split("\\+"); // length = 5
        for (String s : strAry) {
            System.out.print(s + "\t");
        }
        System.out.println("\n");

        //구분자: * 을 구분자로 인식	\\* 해주어야 인식 됨
        mail = "1*21*3*47*5";
        strAry = mail.split("\\*"); // length = 5
        for (String s : strAry) {
            System.out.print(s + "\t");
        }
        System.out.println("\n");
    }

}