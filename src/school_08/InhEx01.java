package school_08;

class AA {
    int i;
    int j;
    int z =5;

    public void setij(int x, int y) {
        System.out.println("상위");
        i = x;
        j = y;
    }

    public void printI() {
        System.out.println("상위 : " + z);
    }
}

class BB extends AA {
    int total;
    String z = "테스트";

    public void sum() {
        total = i + j;
    }

    public void setij(int x, int y) {
        System.out.println("하위");
        i = x + 5;
        j = y + 5;
    }

    public void printI() {
        System.out.println(z);
    }
}

public class InhEx01 {
    public static void main(String[] args) {
        AA subOb = new BB(); // 파차케이스

        subOb.setij(10, 12); //파차케이스 - 같은 메소드 자식걸로 Overriding - o
//        subOb.sum();  //파차케이스 - 다른 메소드 부모것만 - 자식만 있는 메소드 Hiding - x
//        System.out.println("합계 : " + subOb.total);
        System.out.println("합계 : " + subOb.i);
        System.out.println("합계 : " + subOb.j);
        System.out.println();
        subOb.printI(); //메소드 호출로서 가져오는 z는 가장 가까운 z(= 자식z)
        System.out.println("z의 값 : " + subOb.z); //직접 접근 가능한 z는 부모z
    }
}
