import java.util.*;

public class AAA {
public static void main(String[] args) {
//    String my_string = "BCBdbe";
//    StringBuffer str = new StringBuffer(my_string);
//    String letter = "B";
//
//    for (int i = 0; i < my_string.length(); i++) {
//        if (my_string.indexOf(letter) == i) {
//            my_string = String.valueOf(str.deleteCharAt(i));
//            i--;
//        }
//    }
//    String answer = my_string;
//    System.out.println(answer);
//
//    String s = "nice to meet you";
//    String r = "";
//    String q = "aeiou";
//    StringBuffer s1 = new StringBuffer(s);
//
//    for (int i = 0; i < q.length(); i++) {
//        for (int j = 0; j < s.length(); j++) {
//            if (q.charAt(i) == s.charAt(j)) {
//                s = String.valueOf(s1.deleteCharAt(j));
//                j--;
//            }
//        }
//
//        }
//    System.out.println(s);
//
//    r = s.replaceAll("[aeiou]", "");
//    System.out.println(r);
//
//    int n = 144;
//    int a = 0;
//
//    for (int i = 1; i <= (976 / 2) + 1; i++) {
//        if (n <= 0) {
//            break;
//        }
//        if (i % 2 == 1) {
//            n -= i;
//        }
//    }
//
//    for (int i = 1; i <= n / 2; i++) {
//        if (i * i == n) {
//            a = 1;
//            break;
//        } else {
//            a = 2;
//        }
//    }
//    System.out.println(a);

//    int n = 1234;
//    int answer = 0;
//    String s = String.valueOf(n);
//    String r = "";
//    for (int i = 0; i < s.length(); i++) {
//        r += s.charAt(i);
//        answer += Integer.parseInt(r);
//        r = "";
//    }
//    System.out.println(answer);

//    String s = "1a2b3c4d123";
//    char[] a = new char[1];
//    String s2 = "";
//    int d = 0;
//    for (int i = 0; i < s.length(); i++) {
//        a[0] = s.charAt(i);
//        if (Character.isDigit(a[0])) {
//            s2 += a[0];
//            d += Integer.parseInt(s2);
//            s2 = "";
//        }
//    }
//    System.out.println(d);
//    s2 = s.replaceAll("[^0-9]", "");
//    System.out.println(s2);
//    for (int i = 0; i < s2.length(); i++) {
//
//        d += Integer.parseInt(String.valueOf(s2.charAt(i)));
//    }
//    System.out.println(d);
//    int n = 123;
//    String s = "";
//    s = String.valueOf(n);
//    s.toUpperCase();
//    String s = "ProgrammerS123";
//    int n = 11;
//    StringBuffer s = new StringBuffer(my_string);
//    s = s.reverse();
//    String s2 = "";
//    for (int i = 0; i < 11; i++) {
//        s2 += s.charAt(i);
//
//    }
//    StringBuffer s1 = new StringBuffer(s2);
//    String answer = String.valueOf(s1.reverse());
//    System.out.println(answer);
//    String a = s.substring(s.length() - n);
//    System.out.println(a);
//    int[] a = {1, 2, 3, 100, 99, 98};
//    int[] b = a;
//    for (int i = 0; i < b.length; i++) {
//        System.out.print(b[i] + " ");
//    }
    String myString = "ABBAA";
    myString = myString.replaceAll("A", "a");
    myString = myString.replaceAll("B", "A");
    myString = myString.replaceAll("a", "B");
    System.out.println(myString);

//    int[] arr = {293, 1000, 395, 678, 94};
    int[] delete_list = {94, 777, 104, 1000, 1, 12};
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(293);
    arr.add(1000);
    arr.add(395);
    arr.add(678);
    arr.add(94);

//    Arrays.stream(arr).map(i -> arr.remove(Arrays.stream(delete_list).boxed())).collect();

    }
}









