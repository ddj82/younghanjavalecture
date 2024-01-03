package school_12.javautilex;

import java.util.Arrays;

public class Test {
    static void arrayPrint(int[] lNum) {
        for (int i : lNum) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] lotto = new int[45];
        for (int i = 1; i <= 45; i++) {
            lotto[i-1] = i;
        }

        int a = 0; //보너스번호(lotto[6]) 담을 공간
        for(int i = 0; i < 7; i++) {
            int b = (int) (Math.random()*44); //랜덤로또번호 추출
            a = lotto[i]; //옮겨질 값의 임시거처 //lotto[i]와 lotto[b] 자리바꿈 //1번순서 //lotto[i]를 a에
            lotto[i] = lotto[b]; //lotto[i]는 안전하게 옮겨놔서 바껴도 됨 //lotto[i]에 lotto[b]를 //2번순서 //lotto[b]는 랜덤번호
            lotto[b] = a; //lotto[i]를 a에 줬으니 a를 lotto[b]에 //lotto[b]에 lotto[i]를 넣어야 자리바꿈이니까 //자리바꿈 성공
            if(i == 6) {
                a = lotto[i];
            }
            //for문이 다 돌면 lotto[0]~lotto[6] 값 변경
            //포문 끝나고 이 7개의 값을 불러와야 함
        }
        int[] lNum = new int[6];
        System.arraycopy(lotto, 0, lNum, 0, 6);
        System.out.print("당첨번호는: ");
        Arrays.sort(lNum);
        arrayPrint(lNum);
        System.out.println("보너스번호는: " + a);


    }

}
