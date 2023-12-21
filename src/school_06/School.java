package school_06;

class Student {
    private String name; //str인스턴스 = 홍길동 //s1인스턴스 = 마이콜 //s2인스턴스 = 고길동
    private int id; //str인스턴스 = 2017313297 //s1인스턴스 = 220302005 //s2인스턴스 = 200302001
    private int age; //str인스턴스 = 20 //s1인스턴스 = 25 //s2인스턴스 = 41

    public Student() {}

    public Student(String name, int id, int age) { //기타생성자
        //new s1로 갈 ("마이콜", 220302005, 25) 실행
        // new s2로 갈 ("고길동", 200302001, 41) 실행
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) { //매개변수 String 1개인 메소드
        this.name = name;
    }
    public void setId(int id) { //매개변수 int 1개인 메소드
        this.id = id;
    }
    public void setAge(int age) { //매개변수 int 1개인 메소드
        this.age = age;
    }
    public String getName() { //메소드
        return name;
    }
    public int getId() { //메소드
        return id;
    }
    public int getAge() { //메소드
        return age;
    }
}

public class School {
    public static void main(String[] args) {
        Student stu = new Student(); //공간할당, 주소값할당, 끝
        stu.setName("홍길동"); //setName(String name) 메소드 호출문
        stu.setId(2017313297); //setId(int id) 메소드 호출문
        stu.setAge(20); //setAge(int age) 메소드 호출문

        System.out.println("이름 : " + stu.getName()); //이름 : 홍길동 출력
        System.out.println("학번 : " + stu.getId()); //학번 : 2017313297 출력
        System.out.println("나이 : " + stu.getAge()); //나이 : 20 출력

        Student s1 = new Student("마이콜", 220302005, 25); //공간할당, 주소값할당, 해당 케이스 생성자 명령문 실행
        Student s2 = new Student("고길동", 200302001, 41); //공간할당, 주소값할당, 해당 케이스 생성자 명령문 실행

        Student[] sarr = new Student[2]; //자료형이 Student이고 length가 2인 배열 생성
        sarr[0] = s1; //0번 인덱스에 s1인스턴스 주소값 저장
        sarr[1] = s2; //1번 인덱스에 s2인스턴스 주소값 저장
        System.out.printf("%s, %d, %d\n", sarr[0].getName(), sarr[0].getId(), sarr[0].getAge());
        //sarr[0]. = s1인스턴스에 진입/ 후 각 메소드의 리턴값을 가져온다 // 마이콜, 220302005, 25, 출력
        System.out.printf("%s, %d, %d\n", sarr[1].getName(), sarr[1].getId(), sarr[1].getAge());
        //sarr[1]. = s2인스턴스에 진입/ 후 각 메소드의 리턴값을 가져온다 // 고길동, 200302001, 41, 출fur
    }
}
