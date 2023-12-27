package school_09;

class PUnit { //조상 //Unit1의 부모
    int u = 1;
}
class Unit1 extends PUnit { //PUnit의 자식 //Unit2의 부모
    int u1 = 2;
}
class Unit2 extends Unit1 { //Unit1의 자식 //Unit3의 부모
    int u2 = 3;
}
class Unit3 extends Unit2 { //Unit2의 자식
    int u3 = 5;
}


public class CastingTest04 {

    public static void main(String[] args) {
        Unit2 unit1 = new Unit2(); //chacha케이스 //unit1 //대표자료형 Unit2 ,Unit1 ,PUnit
        Unit3 unit2 = new Unit3(); //chacha케이스 //unit2 //대표자료형 Unit3 ,Unit2 ,Unit1 ,PUnit

        int result = unit1.u + unit1.u1 + unit1.u2;
        int result1 = unit2.u + unit2.u1 + unit2.u2 + unit2.u3;
        System.out.println("1번: " + unit1.u + " + " + unit1.u1 + " + " + unit1.u2 + " = " + result);
        System.out.println("2번: " + unit2.u + " + " + unit2.u1 + " + " + unit2.u2 + " + " + unit2.u3 + " = " + result1);
        System.out.println("----------------------------------------------");

        System.out.println("0번: " + (unit1 instanceof PUnit)); //t
        System.out.println("1번: " + (unit1 instanceof Unit1)); //t
        System.out.println("2번: " + (unit1 instanceof Unit2)); //t
        System.out.println("3번: " + (unit1 instanceof Unit3)); //f

        System.out.println("4번: " + (unit2 instanceof PUnit)); //t
        System.out.println("5번: " + (unit2 instanceof Unit1)); //t
        System.out.println("6번: " + (unit2 instanceof Unit2)); //t
        System.out.println("7번: " + (unit2 instanceof Unit3)); //t

    }

}