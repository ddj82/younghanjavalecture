package school_09.test.other;

import school_09.VIPCustomer;

public class ChileClassEx {

    public static void main(String[] args) {
        //지역에선 접근제어자, 기타제어자 final만 가능
        //객체생성문
        ChileClass cc = new ChileClass(); //생성자호출문 //ChileClass의 접근제어자가 public이라 모든 프로젝트에서 생성 가능

        //객체를 통한 메소드 호출문
        cc.md(); //메소드 호출문

//		VIPCustomer vc = new VIPCustomer();
//
//		vc.saleRatio = 0.1;
//		vc.customerID = 1;
    }

}