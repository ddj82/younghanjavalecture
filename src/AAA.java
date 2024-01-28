public class AAA {
public static void main(String[] args) {
    String code = "abc1abc1abc";
    String ret = "";
    int mode = 0;
    System.out.println(code.substring(0, 1));
    for (int i = 0; i < code.length(); i++) {
        if(mode == 0) {
            if (code.charAt(i) != '1') {
                if (i % 2 == 0) {
                    ret += code.charAt(i);
                }
            } else {
                mode = 1;
                continue;
            }
        }
        if (mode == 1) {
            if (code.charAt(i) != '1') {
                if (i % 2 == 1) {
                    ret += code.charAt(i);
                }
            } else {
                mode = 0;
                continue;
            }
        }
    }
    System.out.println(ret);
    System.out.println(mode);
    }
}








