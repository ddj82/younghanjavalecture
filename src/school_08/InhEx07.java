package school_08;

public class InhEx07 {

    public static void main(String[] args) {
        Pt pt = new Pt(); //papa
        pt.display();
        //a 10
        //b 20

        Cd ch = new Cd(); //chacha
        ch.display();
        //getA() 10
        //b 20
        //c 30

        Pt ch1 = new Cd(); //pacha
        ch1.display();
        //getA() 10
        //b 20
        //c 30
    }

}

class Pt {
    private int a = 10;
    public int b = 20;

    void display() {
        System.out.println("Pt_a : " + a);
        System.out.println("Pt_b : " + b);
        System.out.println();
    }

    public int getA() {
        return a;
    }
}

class Cd extends Pt {
    //	public int a = 11;
    public int c = 30;

    void display() {
        // 상속받은 private 필드, 가려짐.
//		System.out.println("Cd_a : " + a);
        System.out.println("Cd_a : " + getA());
        // 상속받은 public 필드 참조.
        System.out.println("Cd_b : " + b);
        // 자식 클래스에서 선언한 public 필드 참조
        System.out.println("Cd_c : " + c);
        System.out.println();
    }

}