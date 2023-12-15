package school_second;

public class Ex15 {
    public static void main(String[] args) {
        //무한루프문 - 반드시 break문이 있어야 한다.
//        System.out.println("무한루프 for문");
        int i = 1;
        for (;;) {
            System.out.print((i != 1 ? "  " : "") + i);
            i++;
            if(i > 10) {
                break;
            }
        }
        System.out.println("\n종료 후 i의 값 : " + i);
        System.out.println("\n----------------------------\n");

        System.out.println("무한루프 while문");
        i = 1;
        boolean tf = true;
        while (tf) {
            System.out.print((i != 1 ? "  " : "") + i);
            i++;
            if(i > 10) {
                tf = false;
            }
        }
        System.out.println("\n종료 후 i의 값 : " + i);
        System.out.println("\n----------------------------\n");



        System.out.println("무한루프 do~while문");
        i = 1;
        do {
            System.out.print( (i != 1 ? "  " : "") + i);
            i++;
            if (i > 10) {
                break;
            }
        } while (true);

        System.out.println("\n종료 후 i의 값 : " + i);
        System.out.println("\n-------------------------\n");

    }
}
