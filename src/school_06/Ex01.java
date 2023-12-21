package school_06;

public class Ex01 {
    int x = 0;
    static int y = 5;

    //기본생성자 숨어있음 - public Ex01 (){}

    static int add (int a, int b) { //int형 매개변수가 2개인 메소드
        return y + a + b;
    }

    void add (int a, int b, int[] result) { //int형 매개변수가 2개, int배열 1개인 메소드
        result[0] = a + b;
    }

    public static void main(String[] args) { //메인메소드
        add(5, 3);
        System.out.println(y);
        Ex01 r = new Ex01();

        int result = r.add(3, 5); //(= Ex01.add(3, 5)) //메소드호출 return값 8, result = 8;
        System.out.println(result); // 8 출력

        int[] result2 = {0}; //length가 1인 int배열 int[0] result2 = 0;
        r.add(3, 5, result2); //메소드호출 result2[0] = a + b; = 8
        System.out.println(result2[0]); //int[0] result2 = 8;
    }
}
