package school_05;

public class Memory {
    String str;
    int num;

    Memory() {}
    public Memory(String str, int num) {
        this.str = str;
        this.num = num;
    }
    public String returnStr() {
        return str;
    }

    public int returnNum() {
        return num;
    }
}
