package school_09;

public class Customer {

    protected int customerID; //2. customerLee주소지: 10010 //8. customerKim주소지: 10020
    protected String customerName; //3. customerLee주소지: "이순신" //9. customerKim주소지: "김유신"
    protected String customerGrade; //1. customerLee주소지: "SILVER" //6. customerKim주소지: "SILVER" 지우고 //7. "VIP"
    int bonusPoint; //4. customerLee주소지: 1000 //10. customerKim주소지: 10000
    double bonusRatio; //1. customerLee주소지: 0.01 //6. customerKim주소지: 0.01 지우고 //7. 0.05

    public Customer(){ //1. //6.
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Cusomer() 생성자 호출");//1."Cusomer() 생성자 호출" 출력 //6. "Cusomer() 생성자 호출" 출력
    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Cusomer(int, String) 생성자 호출");
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){ //5. 출력 //11. 출력
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) { //2. customerID = 10010 //8. customerID = 10020
        this.customerID = customerID; //2. customerLee주소지: this.customerID = 10010 //8. customerKim주소지 this.customerID = 10020
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) { //3. customerName = "이순신" //9. customerName = "김유신"
        this.customerName = customerName; //3. customerLee주소지: this.customerName = "이순신" //9. customerKim주소지 this.customerName = "김유신"
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}
