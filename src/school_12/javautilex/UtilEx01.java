package school_12.javautilex;

import java.util.Arrays;
//Arrays클래스 >> 배열에 관련된 클래스

public class UtilEx01 {

    //메인 메소드
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //배열객체 단축형식 //length = 10

        arrayPrint("초기 배열 : ", a); //해당 멤버 메소드
        System.out.println();

        //Arrays.fill(배열객체, 인덱스a, 인덱스b, 변경할값) //원본훼손 됨
        // >> 해당 배열객체의 인덱스a ~ (인덱스b-1)번 요소를 변경할값으로 변경
        Arrays.fill(a, 3, 5, 33); //배열의 3 ~ 4번 요소를 33으로 채움
        // 0, 1, 2, 33, 33, 5, 6, 7, 8, 9
        arrayPrint("fill() 수행 후 : ", a);
        System.out.println();

        //Arrays.sort(배열객체) //원본훼손 됨
        // >> 해당 배열객체를 오름차순으로 정렬
        Arrays.sort(a);
        // 0, 1, 2, 5, 6, 7, 8, 9, 33, 33
        arrayPrint("sort() 수행 후 : ", a);
        System.out.println();

        //Arrays.binarySearch() //원본훼손 안됨
        // >> 2진탐색. 해당 배열객체를 반으로 나눠서 왼쪽부터  해당 값을 탐색, 없으면 절반제외, 남은 오른쪽도 절반을 나눠서 왼쪽부터 탐색
        // 조건
        // 1. 오름차순 정렬이 되어야 한다.
        // 2. 데이터를 n/2으로 나눠서 비교
        System.out.println("33은 배열의 " + Arrays.binarySearch(a, 33) + "번 요소"); // 0, 1, 2, 5, 6, 7, 8, 9, 33, 33 //해당인덱스값 리턴 //8

        //배열에 없는 값을 탐색하는 경우 해당 값을 정렬시킨 후 상대적으로 값 출력 (-1부터 셈)
        System.out.println("-3은 배열의 " + Arrays.binarySearch(a, -3) + "번 요소"); // 0, 1, 2, 5, 6, 7, 8, 9, 33, 33 에 -3이 없어서 오름차순으로 해당값 위치 후 -1부터 셈
        // [-1]-3, [-2]0, [-3]1, [-4]2, [-5]5, [-6]6, [-7]7, [-8]8, [-9]9, [-10]33, [-11]33 //해당인덱스값 리턴 //-1

        System.out.println("53은 배열의 " + Arrays.binarySearch(a, 53) + "번 요소"); // 0, 1, 2, 5, 6, 7, 8, 9, 33, 33 에 53이 없어서 오름차순으로 해당값 위치 후 -1부터 셈
        // [-1]0, [-2]1, [-3]2, [-4]5, [-5]6, [-6]7, [-7]8, [-8]9, [-9]33, [-10]33, [-11]53 //해당인덱스값 리턴 //-11

        System.out.println("4은 배열의 " + Arrays.binarySearch(a, 4) + "번 요소"); // 0, 1, 2, 5, 6, 7, 8, 9, 33, 33 에 4 없어서 오름차순으로 해당값 위치 후 -1부터 셈
        // [-1]0, [-2]1, [-3]2, [-4]4, [-5]5, [-6]6, [-7]7, [-8]8, [-9]9, [-10]33, [-11]33 //해당인덱스값 리턴 //-4
        System.out.println();

//		// int a[] = {0, 1, 2, 5, 6, 7, 8, 9, 33, 33}
//		for (int i = 0; i < a.length; i++) {
//			Arrays.fill(a, i, i + 1, i);
//		} // int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }
//		Arrays.sort(a);
//		arrayPrint("sort() 수행 후 : ", a);
//		System.out.println();

        int[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //배열객체 단축형식 //length = 10

        //Arrays.equals(배열객체1, 배열객체2)
        // >> 두 배열객체가 같은지 비교, true/false
        System.out.println("배열a와 배열b가 같은가 : " + Arrays.equals(a, b));
        System.out.println();

        int[] c = new int[5];
        //System.arraycopy(배열객체1, 배열객체1의 복사시작인덱스번호, 배열객체2, 배객체열2의 복사시작인덱스번호, 복사길이)
        //깊은복사 = 값만 복사
        System.arraycopy(b, 1, c, 0, 5);
        arrayPrint("c : ", c);
        System.out.println();

        b[3] = 15;
        arrayPrint("b : ", b);
        arrayPrint("c : ", c);
        System.out.println();

    } //메인 메소드 종료 중괄호

    //스태틱 메소드1(메소드 오버로딩)
    static void arrayPrint(String s, int[] a) { //매개변수 (int[] a) 는 얕은 복사
        System.out.print(s);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    } //스태틱 메소드1 종료 중괄호

//	//스태틱 메소드2(메소드 오버로딩)
//	static void arrayPrint(String s, Book[] a) {
//		System.out.println(s);
//		for (Book i : a) {
//			i.showBookInfo();
//		}
//		System.out.println();
//	} //스태틱 메소드2 종료 중괄호

} //class 종료 중괄호
