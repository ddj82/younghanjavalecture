package school_08;

class P { //부모, 상위, 기본, Super
    int a = 0; //(ParCha, 부모꺼 사용) (ChaCha, 자식꺼 사용, Hiding)
    int b = 5; //(ParCha, 부모꺼 사용) (ChaCha, 부모꺼 사용)

    public void md() { //부모자식 같은 메소드, (ParCha, 자식꺼 사용, Hiding) (ChaCha, 자식꺼 사용, Hiding)
        a = 5;
        System.out.println(a + b);
    }
}

class C extends P { //자식, 하위, 파생, Sub
     String a = "오버라이딩"; //(ParCha, 부모꺼 사용, Hiding) (ChaCha, 자식꺼 사용)

     public void md() { //부모자식 같은 메소드, (ParCha, 자식꺼 사용, Overriding) (ChaCha, 자식꺼 사용)
         System.out.println(a + b);
         super.md();
         this.md1();
     }

     public void md1() { //자식만 있는 메소드, (ParCha, 자식만 있는거 Hiding) (ChaCha, 자식꺼 사용)
         System.out.println("md()메소드 호출");
     }
}


public class InhEx02 {
    public static void main(String[] args) {
        C c = new C(); //차차케이스

        //업캐스팅 - 하위클래스(=서브클래스 =자식클래스) 자료형이 상위클래스로 변환되는 것
        P p = new C(); //파차케이스
        c.md();
        p.md();
    }
}
