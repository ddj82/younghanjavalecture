package school_09;

public class OverridingTest1 {

    public static void main(String[] args) {
        int price = 10000;
        Customer customerLee = new Customer(10010, "이순신"); //"Cusomer(int, String) 생성자 호출"
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다."); //bonusPoint = 100
        //이순신 님이 지불해야 하는 금액은 10000원입니다.

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345); //"Cusomer(int, String) 생성자 호출"
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
        //calcPrice(price), 동일한 메소드, chacha케이스, 자식꺼만
        //김유신 님이 지불해야 하는 금액은 9000원입니다.

        Customer vc = new VIPCustomer(10030, "나몰라", 2000); //"Cusomer(int, String) 생성자 호출"
        System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
        //calcPrice(10000), 동일한 메소드, pacha케이스, 자식꺼만
        //나몰라 님이 지불해야 하는 금액은 9000원입니다.

//		System.out.println(customerLee.saleRatio); //papa, 외부접근 내꺼만(부모꺼만), x
//		System.out.println(customerLee.agentID); //papa, 외부접근 내꺼만(부모꺼만), x
//		System.out.println(customerLee.getAgentID()); //papa, 외부접근 내꺼만(부모꺼만), x
//
//		System.out.println(customerKim.saleRatio); //chacha, 이름 다른 이라 외부접근 가능, o
//		System.out.println(customerKim.agentID); //chacha, 이름 다른 이라 외부접근 가능한데 쟤는 private이라 외부접근 불가, x
//		System.out.println(customerKim.getAgentID()); //chacha, 이름 다른 이라 외부접근 가능, o
//
//		System.out.println(vc.saleRatio); //pacha, 이름 다른 이라 외부접근 부모꺼만 가능, x
//		System.out.println(vc.agentID); //papcha, 이름 다른 이라 외부접근 부모꺼만 가능, x
//		System.out.println(vc.getAgentID()); //pacha, 이름 다른 이라 외부접근 부모꺼만 가능, x

    }

}
