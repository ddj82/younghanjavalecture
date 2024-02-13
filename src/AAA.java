import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    /*
    String myString = "AbCdEfG";
    String pat = "aBc";
    int answer = 0;
    String a = "1234";
    String b = pat.toLowerCase();
    if (a.contains(b)) {
        answer = 1;
    }
    int aa = Integer.parseInt(String.valueOf(a.charAt(2)));
    System.out.println(aa);*/

//    ArrayList<Integer> list = new ArrayList<>();
//    int[] arr = new int[list.size()];
//
//    for (int i = 0; i < 5; i++) {
//        list.add(i);
//    }
//
//    System.out.println(list);
//
//    arr = list.stream()
//            .mapToInt(Integer::intValue)
//            .toArray();
//
//    System.out.println(Arrays.toString(arr));
//    String rsp = "205";
//    String answer = "";
//    for (int i = 0; i < rsp.length(); i++) {
//        if (rsp.charAt(i) == 2) {
//            answer += 0;
//        } else if (rsp.charAt(i) == 0) {
//            answer += 5;
//        } else {
//            answer += 2;
//        }
//    }
//    System.out.println(answer);
//    System.out.println(rsp.charAt(0) == '2');

//    int n = 10;
//    int k = 3;
//    int[] answer = new int[n / k];
//
//    int j = 0;
//    for (int i = 1; i <= n; i++) {
//        if (i % k == 0) {
//            answer[j] = i;
//            j++;
//        }
//    }
//    System.out.println(Arrays.toString(answer));

//        String is_prefix = "";

//        int answer = 0;
//        my_string.startsWith(is_prefix);
//        System.out.println(answer);
//        String s = "cccCCC";

//        String my_string = "abCdEfghIJ";
//        String a = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (Character.isLowerCase(my_string.charAt(i))) {
//                a += Character.toUpperCase(my_string.charAt(i));
//            } else if (Character.isUpperCase(my_string.charAt(i))) {
//                a += Character.toLowerCase(my_string.charAt(i));
//            }
//        }
//        System.out.println(a);

//        String[] strArr = {"AAA","BBB","CCC","DDD"};
//        for (int i = 0; i < strArr.length; i++) {
//            if (i % 2 == 0) {
//                strArr[i] = strArr[i].toLowerCase();
//            } else {
//                strArr[i] = strArr[i].toUpperCase();
//            }
//        }
//        System.out.println(strArr[0].toLowerCase());
//        System.out.println(Arrays.toString(strArr));
        int answer = 0;
        int [] arr1 = {100, 17, 84, 1}; //202
        int [] arr2 = {55, 12, 65, 36}; //168
        if (arr1.length == arr2.length) {
            int a1 = 0;
            int a2 = 0;
            for (int i = 0; i < arr1.length; i++) {
                a1 += arr1[i];
                a2 += arr2[i];
            }
            System.out.println(a1);
            System.out.println(a2);
            if (a1 > a2) {
                answer = 1;
            } else if (a1 < a2) {
                answer = -1;
            }
        }
        System.out.println(answer);
    }
}










