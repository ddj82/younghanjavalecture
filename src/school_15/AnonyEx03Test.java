package school_15;

class AnonyEx03 { //익명클래스의 부모클래스
    void amd() {
        System.out.println("AnonyEx03 클래스의 amd()메소드 호출");
    }

}

public class AnonyEx03Test {

    public static void main(String[] args) {
        AnonyEx03 ac3 = new AnonyEx03() { //익명클래스 //AnonyEx03자식클래스
            int c = 5;
            void cmd() {
                System.out.println("익명클래스의 cmd() 메소드");
            }
        };

        ac3.amd();
//		ac3.cmd();
    }

}