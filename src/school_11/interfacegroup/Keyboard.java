package school_11.interfacegroup;

public class Keyboard extends ModuleImpl {
    //전원 온/오프, 키누름/눌렀다땜

    Keyboard() {
        System.out.println("Keyboard기능을 시작합니다.");
    }

    public void powerOn() {
        super.powerOn();
    }

    public void powerOff() {
        super.powerOff();
    }

    public void keyPress() {
        super.keyPress();
    }

    public void keyClick() {
        super.keyClick();
    }
}
