package school_05;

class MyDate {
    private int y, m, d; // [1-3] 멤버변수 값 바뀜 2021, 5, 31
    private  String str;

    private void setMyDate(int r) { //[2-8] 호출 시작 r = 1
        if (r == 1) { //[2-9] r == 1, 멤버변수 str = "유효한 날짜입니다."
            str = "유효한 날짜입니다.";
        } else {
            str = "유효하지 않은 날짜입니다.";
        } //[2-10] if문 끝
    } //[2-11] if문 탈출, setMyDate(r) 메소드 끝 탈출, [2-12로]

    public String getMyDate() { //[3-2] 호출 시작
        return str; //[3-3] 나를 호출한 호출문에 매개변수 값 str을 return 해줌, 멤버변수 str = "유효한 날짜입니다."
    } //[3-4] getMyDate() 매소드 끝 탈출 [3-5로]

    public MyDate(int d, int m, int y) { //[1-2] 해당 생성자 명령문 실행
        this.y = y; //[1-3] 2021 멤버변수에 값 대입
        this.m = m; //[1-3] 5 멤버변수에 값 대입
        this.d = d; //[1-3] 31 멤버변수에 값 대입
    } //[1-4] MyDate 생성문 끝 탈출 [1-5로]

    public void isValid() { //[2-2] 호출 시작
        int r;
        switch (m) { //[2-3] switch 조건문 시작 멤버변수 m = 5 [2-4로]
            case 4: case 6: case 9: case 11:
                r = (d <= 30) ? 1 : 0;
                break;
            case 2:
                if (y % 4 == 0) {
                    r = (d <= 29) ? 1 : 0;
                    break;
                } else {
                    r = (d <= 28) ? 1 : 0;
                    break;
                }
            default: //[2-4] 실행
                r = (d <= 31) ? 1 : 0; //[2-5] 멤버변수 d = 31, true, r = 1
        } //[2-6] switch 조건문 끝 탈출
        setMyDate(r); //[2-7] setMyDate(r) 메소드 호출, r = 1 [2-8로]
    } //[2-12] isValid() 메소드 끝 탈출, [2-13으로]
}

public class A10_MyDateTest {
    public static void main(String[] args) {
        MyDate id = new MyDate(31, 5, 2021); //[1-1] new공간할당, MyDate복제, 해당 생성자 명령문 실행 [1-2로], [1-5] id에 인스턴스 주소값 저장, [1-1끝, 2-1로]
        id.isValid(); //[2-1] id 인스턴스 주소값 안에 isValid() 메소드 호출 [2-2로], [2-13, 2끝, 3-1로]
        System.out.println(id.getMyDate()); //[3-1] 출력문 : id 인스턴스 주소값 안에 getMyDate() 메소드 호출 [3-2로], [3-5, 3끝, 출력문 실행 : "유효한 날짜입니다." (한줄바꾸기)]
    }
}
