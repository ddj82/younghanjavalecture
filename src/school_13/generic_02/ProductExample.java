package school_13.generic_02;

public class ProductExample {

    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<Tv, String>();
        product1.setKind(new Tv("런닝맨", 6, 15, 50));
        product1.setModel("Tv자료형");

        Tv tv = product1.getKind();
        System.out.println(product1.getModel());
        System.out.println(tv.toString());
        System.out.println(tv);

        Product<Car, String> product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("Car자료형");

        Car car = product2.getKind(); //product2.getKind()는 new Car()의 인스턴스 주소값을 리턴해줌
        System.out.println(product2.getModel()); //Car자료형 출력
        System.out.println(car); //new Car()의 인스턴스 주소값이지만 toString()가 있기때문에 toString()호출

    }

}