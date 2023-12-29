package school_11.interfacegroup;

public class ModuleEx {
    public static void main(String[] args) {
        Module m;

        m = new TV();
        m.powerOn();
        m.volumnUp();
        m.volumnDown();
        m.lightUp();
        m.lightDown();
        m.powerOff();
        System.out.println("TV볼륨 끝까지 올리는 코드");
        for (int i = 0; i <= Module.MAX_VOLUMN; i++) {
            if (i < Module.MAX_VOLUMN - 1) {
//                System.out.print("볼륨: " + i + ", ");
            } else if (i == Module.MAX_VOLUMN - 1) {
                System.out.println("볼륨: " + i);
            } else {
                System.out.println("볼륨: " + i);
                m.volumnMax();
                m.volumnUp();
            }
        }
        m.volumnMin(); //ModuleImpl의 변수 volumn은 자식속성이라 Hiding, 그래서 0으로 초기화 해주는 메소드
        System.out.println();

        m = new Radio();
        m.powerOn();
        m.volumnUp();
        m.volumnDown();
        m.powerOff();
        System.out.println();

        m = new Keyboard();
        m.powerOn();
        m.keyPress();
        m.keyClick();
        m.powerOff();
        System.out.println();

        m = new Mobile();
        m.powerOn();
        m.volumnUp();
        m.volumnDown();
        m.lightUp();
        m.lightDown();
        m.lightDown();
        m.powerRestart();
        m.powerOff();

    }
}
