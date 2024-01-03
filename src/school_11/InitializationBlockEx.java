package school_11;

public class InitializationBlockEx {

    public static void main(String[] args) {

        System.out.println(InitBlock.classVar);

        InitBlock myInit = new InitBlock();
        System.out.println(myInit.instanceVar);

        myInit.setInstanceVar(555);
        System.out.println(myInit.instanceVar);
    }

}

class InitBlock {
    //클래스변수 (명시적초기화)
    static int classVar = 10;
    //인스턴스변수 = 멤버변수 (명시적초기화)
    int instanceVar = 10;
    //인스턴스상수 = 멤버상수 (선언만)
    final int MAX;

    //클래스(static)필드 초기화블록
    static {
        classVar = 20;
//		instanceVar = 555;
    }

    //인스턴스필드 초기화블록
    {
        this.instanceVar = 20;
        this.classVar = 50;
//		MAX = 100;
    }

    //기본생성자
    public InitBlock() {
        instanceVar = 30;
        this.classVar = 77;
        this.MAX = 100;
    }

    //setter메소드
    public void setInstanceVar(int instanceVar) {
        this.instanceVar = instanceVar;
    }
}