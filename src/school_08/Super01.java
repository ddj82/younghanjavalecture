package school_08;

class Pa3 { //부모 Super 상위 기본
    int x = 1000; //chacha케이스 동일한 속성 부모꺼 Hiding //외부접근불가
    void display() { //chacha케이스 동일한 메소드 부모꺼 Hiding //외부접근불가
        System.out.println("상위클래스 display()");
    }
}

class Ch3 extends Pa3 { //자식 Sub 하위 파생
    int x = 2000; //chacha케이스 동일한 속성 자식꺼 사용 //외부접근가능
    void display() { //chacha케이스 동일한 메소드 자식꺼 사용 Overriding //외부접근가능
        System.out.println("하위클래스 display()");
    }
    void write() { //chacha케이스 다른 메소드 다 사용
        super.display(); //super(부모). 호출 후 부모메소드 //내부접근으로 "상위클래스 display()" 출력
        this.display(); //this(자식) 호출 후 자식메소드 //내부접근으로 "하위클래스 display()" 출력
        System.out.println("super.x : " + super.x); //super(부모). x 호출 //내부접근 부모x 1000 출력
        System.out.println("this.x : " + x); //그냥 x //내부접근 자식x 2000 출력
    }

}

public class Super01 {
    public static void main(String[] args) {
        Ch3 d = new Ch3(); //chacha케이스
        d.write();
    }

}
