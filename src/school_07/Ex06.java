package school_07;

public class Ex06 {
    public static void main(String[] args) {
        //문자열 인덱스 indexOf
        String a = "Good Afternoon!!";
        System.out.println("1번. " + a.indexOf("noon"));
        System.out.println("1번. " + a.indexOf(" Af"));

        String hello = "HelloWorld_MyWorld";
        //indexOf(문자열) : 해당 문자열의 맨 앞글자를 왼쪽에서부터 찾아서 해당 인덱스를 반환함.
        System.out.println("3번. " + hello.indexOf("World"));

        //indexOfI(문자열, 인덱스번호) : 해당 문자열의 맨 앞글자를 왼쪽에서부터 찾아서 해당 인덱스를 반환하는 것은 동일함.
        //단, 인덱스번호를 시작지점으로 인식하여, 그 지점부터 해당 문자열의 맨 앞글자를 왼쪽에서부터 찾아서 해당 인덱스를 반환함.
        System.out.println("3번. " + hello.indexOf("World", 10));

        //lastIndexOf(문자열) : 해당 문자열의 맨 앞글자를 오른쪽에서부터 찾아서 해당 인덱스를 왼쪽에서부터 세어 반환함.
        System.out.println("5번. " + hello.lastIndexOf("World"));

        //lastIndexOf(문자열, 인덱스번호) : 해당 문자열의 맨 앞글자를 오른쪽에서부터 찾는것은 동일함.
        //단, 인덱스 번호를 앞에서부터 세어 그 지점을 끝지점으로 인식하여,
        //그 지점부터 오른쪽에서 왼쪽으로 해당 문자열의 맨 앞글자를 찾아서 해당 인덱스를 앞에서부터 세어 반환함.
        System.out.println("6-1번. " + hello.lastIndexOf("World", 13));
        System.out.println("6-2번. " + hello.lastIndexOf("World", 10));

        hello = "AaBbCc";
        //아스키코드 값으로 인덱스 찾기
        //indexOf(아스키코드) : 아스키코드 값에 해당하는 문자를 찾아 인덱스를 반환함.
        System.out.println("7번. " + hello.indexOf(65));
        System.out.println("8번. " + hello.indexOf(99));

        //lastIndexOf 활용
        String fname = "C:/jwork/third/file.jpg";
        System.out.println(fname.lastIndexOf("/"));
        System.out.println(fname.substring(fname.lastIndexOf("/") + 1));

    }
}
