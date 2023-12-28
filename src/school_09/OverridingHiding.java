package school_09;

public class OverridingHiding {

    public static void main(String[] args) {
        Car.printCompany(1);
        Truck.printCompany(2);

//        Car c = new Car();
//        c.printCompany(1);
//        Truck t = new Truck();
//        t.printCompany(2);

        Car car = new Car("소나타", "현대 자동차", 3000 , 3);
        Truck truck = new Truck("Volvo", "General Auto",5000, 10, 4);

        car.printInfo(5);
        truck.printInfo(6);
        System.out.println();

        car.printCompany(7);
        truck.printCompany(8);

        Car c = (Car)truck; //원본훼손이 안되기 때문에 truck의 대표클래스는 Truck 이기 때문에 pacha케이스 //c는 대표클래스-Car, Truck
        c.printInfo(9); //pacha케이스, 동일한 메소드 자식꺼로(truck) 실행
        //9번(Car의 printInfo()메소드):  차종:Volvo     제조사:General Auto     가격:5000    (Truck의 printCompany()메소드) 적재중량:10
        System.out.println();
        c.printInfo1(10); //pacha케이스, 동일한 메소드 자식꺼로(truck) 실행
        //10번 : (Truck의 printCompany()메소드) 적재중량:10
    }
}

class Car {
    String carName;
    String company;
    int price;
    int num;

    Car(){}

    Car(String carName, String company, int price, int num) {
        this.carName = carName;
        this.company = company;
        this.price = price;
        this.num = num;
        System.out.println(num +"번 Car()생성자 호출");
    }

    static void printCompany(int num) {
        System.out.println(num +"번(Car의 printCompany()메소드): 현대 자동차");
    }

    public void printInfo(int num) {
        System.out.printf("\n"+ num +"번(Car의 printInfo()메소드):  "
                + "차종:%s \t제조사:%s \t가격:%d \t", carName,company,price);
    }

    public void printInfo1(int num) {
        System.out.printf("\n"+ num +"번(Car의 printInfo()메소드):  "
                + "차종:%s \t제조사:%s \t가격:%d \t", carName,company,price);
    }
}

class Truck extends Car {
    int carName;
    int maxLoad;

    Truck(){}

    Truck(String carName, String company, int price, int maxLoad, int num) {
        super(carName, company, price, num);
        this.maxLoad = maxLoad;
        System.out.println(num +"번 Truck()생성자 호출");
    }

    public static void printCompany(int num) {
        System.out.println(num + "번(Truck의 printCompany()메소드): "
                + "General Auto Truck Division");

    }

    public void printInfo(int num) {
        super.printInfo(num);
        System.out.printf("(Truck의 printCompany()메소드) 적재중량:%d", maxLoad);
    }

    public void printInfo1(int num) {
        System.out.printf(num+ "번 : (Truck의 printCompany()메소드) 적재중량:%d", maxLoad);
    }
}

