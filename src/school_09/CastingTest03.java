package school_09;

class Person1 {
    private String name;

    public Person1(String name) { //Person1기타생성자
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student1 extends Person1 {
    private String dept;

    public Student1(String name) {
        super(name); //Person1기타생성자 호출
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

}

public class CastingTest03 {

    public static void main(String[] args) {
        //업캐스팅 선행
        Person1 person1 = new Student1("Duly");

        //다운캐스팅
        Student1 student1 = (Student1) person1;
//		Student1 student1 = (Student1) new Person1("MadPlay"); //new Person1에는 Student1의 자료형이 없기때문에 오류

        student1.setName("Gogildong");
        String strName = person1.getName();

//		student1.setDept("Computer Eng");
        String strDept = student1.getDept();
        System.out.println(strName + ", " + strDept);
    }

}