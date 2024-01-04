package school_13.generic_03_1;

public class BoxingMethodExample {

    public static void main(String[] args) {
        Box<Integer> box1 = Util.boxing(100);
        //Util의 메소드 호출에 매개변수 100 int - Integer 들어가면서 Util의 T가 Integer이 됨
//		Box<Integer> box1 = Util.<Integer>boxing(100); //둘다 가능
        System.out.println(box1.get());

        Box<String> box2 = Util.boxing("홍길동");
        //Util의 메소드 호출에 매개변수 "홍길동" - String 들어가면서 Util의 T가 String이 됨
        System.out.println(box2.get());

        System.out.println(box1);

    }

}