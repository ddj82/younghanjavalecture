package school_11.interfacegroup;

public class TV extends ModuleImpl {
    //전원 온/오프, 볼륨 업/다운, 밝기 업/다운
    TV() {
        System.out.println("TV기능을 시작합니다.");
    }

    public void powerOn() {
        super.powerOn();
    }

    public void powerOff() {
        super.powerOff();
    }

    public void volumnUp() {
        super.volumnUp();
    }

    public void volumnDown() {
        super.volumnDown();
    }

    public void lightUp() {
        super.lightUp();
    }

    public void lightDown() {
        super.lightDown();
    }
}