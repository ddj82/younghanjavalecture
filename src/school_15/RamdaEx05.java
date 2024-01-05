package school_15;

interface Ramda5 {
    void showString(String str);
}

public class RamdaEx05 {

    public static void main(String[] args) {
        Ramda5 lamda5 = returnString(); //변수로 반환 받기
//		Ramda5 lamda5 = s -> System.out.println(s + " java"); //위와 같음
        lamda5.showString("hello");
    }

    public static Ramda5 returnString() {
        return s -> System.out.println(s + " java");
    }

}