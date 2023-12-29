package school_11.classdiagram;

class Pa {
    public void pa() {
        System.out.println("Pa클래스");
    }
}

class Ca {
    Pa p1;
    public void setP(Pa p) {
        this.p1 = p;
    }
    public Pa getP() {
        return p1;
    }
}

public class PCMain {
    public static void main(String[] args) {
        Ca c = new Ca();
        Pa pp = new Pa();
        c.setP(pp);
    }
}