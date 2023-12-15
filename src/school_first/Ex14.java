package school_first;

public class Ex14 {
    public static void main(String[] args) {
//        char value1 = 'A';
//        char value2 = '가';
//        char value3 = '3';
//        char value33 = (char) 3;
//        System.out.println(value1);
//        System.out.println(value2);
//        System.out.println(value3);
//        System.out.println(value33);

        //정수로 대입
//        char value4 = 65;
//        char value5 = 51;
//        char value6 = 0xac00;
//        char value7 = '\uAC00';
//        System.out.println(value4);
//        System.out.println(value5);
//        System.out.println(value6);
//        System.out.println(value7);

        String str = "\uAC00 \u0000 kk\u0020kk";
        System.out.println(str);
        str = null;
        System.out.println(str);
    }
}
