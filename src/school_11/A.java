package school_11;

public interface A {
    final int CONS = 5; //public static 생략 //pacha 외부접근(o) //chacha 외부접근(x)
    public void display(String s); //abstract 생략 //pacha 외부접근(x)
    void imd(); //public abstract 생략 //pacha 외부접근(x)

    //public default가 원래 기술형식임
    default void dfmd(String str) { //public 생략, default메소드는 몸체가능, 그래서 재정의 안해도 사용가능
        System.out.println("A인터페이스 안의 dfmd메소드의 str변수 값: " + str + "와 CONS의 값: " + CONS);
    }

    //pacha 외부접근(o) //chacha 외부접근(x)
    static int stmd(int c) {
        return CONS + c;
    }

    //private이라 외부접근 그냥 안됨
    private void pmd() { //자바 9버전 이상부터 사능
        System.out.println("A인터페이스 안의 pmd");
    }
}
