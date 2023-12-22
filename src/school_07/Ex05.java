package school_07;

public class Ex05 {
    //문자열 치환 : replace( , ), replaceAll( , ) // replaceAll( , )에서는 정규표현식 사용가능
    //replace(a, b) //replaceAll(a, b) //a = 기존문자열, b = 변경할 문자열
    public static void main(String[] args) {
        //문자열 치환 : replace( , ), replaceAll( , ) // replaceAll( , )에서는 정규표현식 사용가능
        //replace(a, b) //replaceAll(a, b) //a = 기존문자열, b = 변경할 문자열
        String b = "Welcome to Java World";
        System.out.println(b.replace("Java", "Computer"));
        System.out.println(b.replaceAll("Java", "Computer"));

        System.out.println("\n" + b + "\n"); //원본은 훼손되지 않음

        String str = "abcdefghijk";
        System.out.println("result ===> " + str.replaceAll("[abchij]", "굿")); //replaceAll([aaa], b) //[aaa]에서 a,a,a 하나하나 b로 //replaceAll(a, b)에서만 사용가능
        System.out.println("result ===> " + str.replaceAll("[^abchij]", "굿")); //replaceAll([^aaa], b) //[^aaa]빼고 나머지를 하나하나 b로  //replaceAll(a, b)에서만 사용가능

        //체이닝기법 : 접근연산자를 이용해서 여러 객체에 접근하는 기법
        System.out.println("result ===> " + str.replace("a", "굿").replace("b", "굿").replace("c", "굿").replace("h", "굿").replace("i", "굿").replace("j", "굿"));
        System.out.println("result ===> " + str.replace("abc", "굿굿굿").replace("hij", "굿굿굿"));

    }
}
