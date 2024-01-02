package school_12.javalangex;

public class ClassEx {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("java.lang.String"); //문자열-패키지명.까지 다 붙여야 됨 //문자열 < 이 클래스에 대한 정보를 알려줘, (ex)드라이버설치) //외부라이브러리를 사용하는
        System.out.println(c1);
        System.out.println(c1.toString()); //오브젝트가 가지고 있는 메소드 //모든 자식클래스에서 오버라이드해서 사용가능 //재정의는 무조건 문자열로 출력 될 수 있게 //내가 해당클래스에 재정의해서
        System.out.println(c1.toGenericString()); //더 자세히
        System.out.println();

        c1 = Class.forName("java.util.List");
        System.out.println(c1.getName());
        System.out.println(c1.toString());
        System.out.println(c1.toGenericString());
        System.out.println();

        c1 = Class.forName("java.lang.Object");
        System.out.println(c1.toString());
        System.out.println(c1.toGenericString());
        System.out.println();

        c1 = Class.forName("java.awt.event.WindowAdapter");
        System.out.println(c1.toString());
        System.out.println(c1.toGenericString());
    }
}
