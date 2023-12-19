package school_04;

class T {
    int c;
}

class E {
    int i; boolean b; char c; double d; float f; long l; //멤버변수
    String s; T t; //멤버 참조변수

    //public E(){} => 숨겨진 기본생성자
    public void md() {
        int i = 0; boolean b = false; char c = ' '; double d = 0.0; float f = 0.0f; long l = 0L; //멤버변수
        String s = null; T t = null; //멤버 참조변수


        System.out.println("i의 초기값 : " + i);
        System.out.println("b의 초기값 : " + b);
        System.out.println("c의 초기값 : " + c);
        System.out.println("d의 초기값 : " + d);
        System.out.println("f의 초기값 : " + f);
        System.out.println("l의 초기값 : " + l);
        System.out.println("s의 초기값 : " + s);
        System.out.println("t의 초기값 : " + t);
    }
}

public class Ex11Main {

    public static void main(String[] args) {
        E e = new E();
        e.md();
    }
}
