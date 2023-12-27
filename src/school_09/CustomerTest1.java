package school_09;

public class CustomerTest1 {

    public static void main(String[] args) {
//		Customer customerLee = new Customer(10010, "이순신");
        Customer customerLee = new Customer(); //1. //chacha 다른이름 부모자식 다 접근가능 //"Cusomer() 생성자 호출" 출력
        customerLee.setCustomerID(10010); //2.
        customerLee.setCustomerName("이순신"); //3.
        customerLee.bonusPoint = 1000; //4.
        System.out.println(customerLee.showCustomerInfo());//5. "이순신 님의 등급은 SILVER이며, 보너스 포인트는 1000입니다." 출력

//		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
        VIPCustomer customerKim = new VIPCustomer();//6. //chacha 다른이름 부모자식 다 접근가능 //super()가 숨어있어서 "Cusomer() 생성자 호출" 출력
        customerKim.setCustomerID(10020); //8. 부모에만 있는 메소드라 부모자식 다 가능 호출
        customerKim.setCustomerName("김유신"); //9. 부모에만 있는 메소드라 부모자식 다 가능 호출
        customerKim.bonusPoint = 10000; //10. 부모에만 있는 속성이라 부모자식 다 가능 외부접근
        System.out.println(customerKim.showCustomerInfo()); //11. 김유신 님의 등급은 VIP이며, 보너스 포인트는 10000입니다."
    }
}
