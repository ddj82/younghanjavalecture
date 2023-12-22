package school_07singleton;

public class OneClass {
    private static OneClass ocs;
    private int iNum;

    private OneClass() {}

    public static OneClass getIns() {
        return ocs;
    }

    public int getINum() {
        return iNum;
    }

    public void setINum(int iNun) {

    }

    public static void main(String[] args) {

    }
}
