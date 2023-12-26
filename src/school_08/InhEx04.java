package school_08;

class Par {
    int p = 0;
}

class Cld extends Par {
    int c = 1;
}

class Bro extends  Par {
    int b = 2;
}

public class InhEx04 {
    public static void main(String[] args) {
        Par pa01 = new Par(); // Par, Object
        Cld ch = new Cld(); // Cld, Par
        Par pa02 = new Bro(); // Par, Bro
        Bro br = new Bro(); // Bro, Par

        pa01 = ch; //업캐스팅, (Par)생략 //pa01 = (Par) ch; 와 같으며, 타입 변환을 생략할 수 있음.

        pa01.p = 2;
        System.out.println(pa01.p);
//        pa01.c = 2; //pa01의 타입중에 Cld는 없어서 c에 접근 불가

        ch.p = 5; //ch의 타입중에 Par가 있어서 p에 접근 가능
        br.p = 5; //br의 타입중에 Par가 있어서 p에 접근 가능
//        pa02.b = 6;

        //타입 변환을 생략할 수 없음. 다운캐스팅: 다시 자식 자료형으로 돌아오는 것
        br = (Bro)  pa02;

//        pa02.b = 7;
//		System.out.println("pa02.b : " + pa02.b);

        br.p = 5;
        br.b = 7;
        System.out.println("br.p : " + br.p + " / br.b : " + br.b);
//		br = (Bro) ch; // 직접적인 상속 관계가 아니므로, 오류 발생.
    }

}

