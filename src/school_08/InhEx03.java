package school_08;

class Parent {

}

class Child extends Parent {

}

class Brother extends Parent {

}

public class InhEx03 {
    public static void main(String[] args) {
        //다형성 : 한 객체가 여러개의 타입(자료형)을 갖을 수 있는 것
        Parent p = new Parent(); //Parent, Object //파파케이스
        System.out.println("1번. " + (p instanceof Object)); //t
        System.out.println("2번. " + (p instanceof Parent)); //t
        System.out.println("3번. " + (p instanceof Child)); //f
        System.out.println();

        Parent c = new Child(); //Parent, Child, Object //파차케이스
        System.out.println("4번. " + (c instanceof Object)); //t
        System.out.println("5번. " + (c instanceof Parent)); //t
        System.out.println("6번. " + (c instanceof Child)); //t
        System.out.println("7번. " + (c instanceof Brother)); //f
        System.out.println();

        c = new Brother(); //Parent, Brother, Object //파차케이스
        System.out.println("8번. " + (c instanceof Object)); //t
        System.out.println("9번. " + (c instanceof Parent)); //t
        System.out.println("10번. " + (c instanceof Child)); //f
        System.out.println("11번. " + (c instanceof Brother)); //t
        System.out.println();

        Child c1 = new Child(); //Parent, Child, Object //차차케이스
        System.out.println("12번. " + (c1 instanceof Object)); //t
        System.out.println("13번. " + (c1 instanceof Parent)); //t
        System.out.println("14번. " + (c1 instanceof Child)); //t
//		System.out.println("15번. " + (c1 instanceof Brother)); //f


    }
}
