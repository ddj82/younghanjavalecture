public class AAA {
public static void main(String[] args) {
    String my_string = "BCBBBBBBdbe";
    StringBuffer str = new StringBuffer(my_string);
    String letter = "B";
    String answer = "";
//    answer = String.valueOf(str.deleteCharAt(my_string.indexOf(letter)));

    for (int i = 0; i < my_string.length(); i++) {
        if (my_string.indexOf(letter) == i) {
            my_string = String.valueOf(str.deleteCharAt(i));
            i--;
        }
    }
//    for (;;) {
//        if (answer.indexOf(letter) > 0) {
//            answer = String.valueOf(str.deleteCharAt(my_string.indexOf(letter)));
//        } else {
//            break;
//        }
//    }

//    System.out.println(my_string.indexOf(letter));
    System.out.println(my_string);
    }
}








