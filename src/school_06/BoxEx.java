package school_06;

class Box {
    long idNum;
    static long boxID = 0;  //static변수 long boxID => static영역으로

    public Box() { //기본생성자
        idNum = boxID++;
    }
}

public class BoxEx {
    public static void main(String[] args) { //static영역으로
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();
        System.out.println("box1의 idNum : " + box1.idNum);
        System.out.println("box2의 idNum : " + box2.idNum);
        System.out.println("box3의 idNum : " + box3.idNum);
        System.out.println("box4의 idNum : " + box4.idNum);
        System.out.println("박스 총 개수 : " + Box.boxID);
    }
}
