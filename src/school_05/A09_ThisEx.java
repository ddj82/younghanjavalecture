package school_05;

class This {
    int num = 1;
    String str = "한글";

    //기본생성자 숨어있음
    public void setNum(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public int getNum(int j) {
        this.num = num * j;
        return num;
    }

    public void amd() {
        int num = 5;
        int str = 7;
        if (num <= 5) {
            System.out.println("this.num 는 " + this.num);
            System.out.println("this.str 는 " + this.str);
        }
        System.out.println("num 는 " + num);
        System.out.println("str 는 " + str);
        System.out.println();
    }
}

public class A09_ThisEx {
    public static void main(String[] args) {
        This a = new This();
        a.amd();

        a.setNum(2, "테스트");
        a.amd();

        int x = a.getNum();
        System.out.println(x);
        int y = a.getNum(5);
        System.out.println(y);
    }
}
