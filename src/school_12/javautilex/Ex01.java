package school_12.javautilex;

import java.util.Scanner;

class Main {
    private String nm;
    private int age;
    private String gender;

    public String getNm() {
        return nm;
    }
    public void setNm(String nm) {
        this.nm = nm;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

}


public class Ex01 {

    public static void main(String[] args) {
        System.out.println("정보를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        System.out.print("이름은: ");
        m.setNm(sc.nextLine());

        System.out.print("나이는: ");
        m.setAge(sc.nextInt());

        System.out.print("성별은: ");
        m.setGender(sc.next());

        System.out.println("\n\n입력하신 정보는 아래와 같습니다.");
        System.out.println("이름 : " + m.getNm());
        System.out.println("나이 : " + m.getAge());
        System.out.println("성별 : " + m.getGender());
    }

}