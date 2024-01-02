package school_07.singleton;

public class Company {
//    private static Company instance = new Company();
private static Company instance; //자료형이 Company인 객체 instance의 자동초기화값 = null


    private Company() {} //숨겨지지 않고 기술된 기본생성자의 접근제어자는 다 가능
    //생성자가 하나도 없을땐 기본생성자가 숨어있는데 숨어있는 기본생성자의 접근제어자는 무조건 public

    public static Company getInstance() { //geter메소드가 최초로 호출이 되면 객체 instance의 값이 nell이기 때문에 if문을 타고 새로운 주소값을 받음
        if(instance == null) {
            instance = new Company(); //객체 instance의 값이 null에서 &주소값으로 변경.
        }
        return instance; //이후엔 geter메소드가 호출이 되어도 객체 instance의 값이 nell이 아니기 때문에 if문을 타지 않고 호출한 놈에게 리턴값(객체 instance의 &주소값) 던짐
    }

}
