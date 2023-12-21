package school_06;

class Car { //Car일반클래스
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) { //기타생성자
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    Car() { //기본생성자
        this("소나타", 2012, "검정색", 160);
    }

    public String getModel() { //메소드
        return this.modelYear + "년식 " + this.modelName + " " + this.color; //기타생성자 호출문
    }
} //Car클래스 종료중괄호

public class CarEx { //CarEx메인클래스
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.getModel()); //2012년식 소나타 검정색
    }
}
