package school_07;

public class Ex09 {
    public static void main(String[] args) {
        //형변환 (String => ) : 바꾸고자 하는 기본자료형의 Wraper클래스.parse해당Wraper클래스(String객체명)
        String str = new String("Java");
        System.out.println("원본 문자열 : " + str);
        System.out.print("charAt() 메소드 호출 후 원본 문자열 : ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("\ncharAt(0) 메소드 호출 : " + str.charAt(0));
        System.out.println();

        String s = "50";
        int i = Integer.parseInt(s); //String s 를 int로 형변환 //객체를 기본자료형으로 형변환이 불가능해서 Integer 사용
        System.out.println(i);
        System.out.println(Integer.valueOf(s).getClass().getName());

        s = "3.14";
        System.out.println(Double.parseDouble(s));
        System.out.println(Double.valueOf(s).getClass().getName());

        float f = Float.parseFloat(s);
        System.out.println(f);
        System.out.println(Float.valueOf(s).getClass().getName());
        System.out.println();

        //형변환 ( => String) : valueOf() , toString()
        double d = 3.141592;
        s = String.valueOf(d);
        System.out.println(s);

        i = 50;
        System.out.println(Integer.toString(i));
        Integer x = 5;
        System.out.println(x.toString(x));
        System.out.println(x.toString());
        f = 3.141592f;
        System.out.println(Float.toString(f));

        long l = 329L;
        System.out.println(Long.toString(l));
        System.out.println();

    }
}
