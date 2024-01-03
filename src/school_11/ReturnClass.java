package school_11;

class Return {
    public void say_nick(String nick) {
        if ("fool".equals(nick)) { //객체.equals(객체) 객체안의 문자열 *값 비교
            //return키워드의 또 다른 쓰임새, 메소드의 종료 중괄호로 빠져나감.
            return; //메소드의 종료 중괄호로 나가라.
        }
        System.out.println("나의 별명은 " + nick + " 입니다.");
    }
}

public class ReturnClass {

    public static void main(String[] args) {
        Return rt = new Return();
        rt.say_nick("notfool");
        System.out.println("출력결과 ");
    }

}
