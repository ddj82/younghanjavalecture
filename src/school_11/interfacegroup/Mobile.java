package school_11.interfacegroup;

public class Mobile extends ModuleImpl {
    //전원 온/오프/재시작, 볼륨 업/다운, 밝기 업/다운
//	ModuleImpl m = new ModuleImpl();

    Mobile() {
        System.out.println("Mobile기능을 시작합니다.");
    }

    public void powerOn() {
        super.powerOn();
    }

    public void powerOff() {
        super.powerOff();
    }

    public void powerRestart() {
        super.powerRestart();
    }

    public void volumeUp() {
        super.volumnUp();
    }

    public void volumeDown() {
        super.volumnDown();
    }

    public void lightUp() {
        super.lightUp();
    }

    public void lightDown() {
        super.lightDown();
    }

}
