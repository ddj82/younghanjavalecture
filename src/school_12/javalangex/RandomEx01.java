package school_12.javalangex;

import java.util.Random;

public class RandomEx01 {

    public static void main(String[] args) {
        Random random = new Random();
//		int num = random.nextInt();
//		System.out.println("int의 유효범위 내의 임의의 정수 값 : " + num);
//		nextInt에 값 지정이 안되면 int의 유효범위 내의 정수가 임의 출력 //0포함

        int num = random.nextInt(11); //0부터 11개 >> 0 ~ 10 //(a) a는 양수만 가능
        System.out.println("0부터 10 사이의 임의의 정수 값 : " + num);

        float f = random.nextFloat();
        System.out.println("0.0부터 1.0 사이의 임의의 실수 값 : " + f);
        f = (random.nextFloat() * 10);
        System.out.println("0.0부터 10.0 사이의 임의의 실수 값 : " + f);

        boolean b = random.nextBoolean();
        System.out.println("임의의 논리값 : " + b);

    }

}