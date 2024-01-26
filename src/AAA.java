public class AAA {
public static void main(String[] args) {

    String str1 = "aaaaa";
    String str2 = "bbbbb";
    String s = "";

    for(int i = 0; i < str1.length(); i++) {
        s += str1.charAt(i);
        s += str2.charAt(i);

    }

    System.out.println(s);


    }
}








