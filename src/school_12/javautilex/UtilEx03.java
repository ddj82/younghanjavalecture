package school_12.javautilex;

import java.text.SimpleDateFormat;
import java.util.*;

public class UtilEx03 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)); //이렇게 할수도 있음

        Date day = cal.getTime(); //객체생성, Calendar cal = Calendar.getInstance()에서 현재시간의 정보(long) => (Date)자요형으로
        System.out.println("day: " + day);
        System.out.println();

        Date nowday = new Date(); //객체생성, Calendar cal = Calendar.getInstance()와 같은데 보다 간단한 정보
        System.out.println("nowday: " + nowday);


//		SimpleDateFormat => printf 처럼 내가 원하는 표기법으로 바꿀 수 있는 서식지정자 포멧형식으로 객체생성을 해줘야함
        SimpleDateFormat sdf1, sdf2, sdf3;
        sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
        //yyyy >> 년을 나타내는 서식지정자 //MM >> 월을 나타내는 서식지정자 //dd >> 일을 나타내는 서식지정자 //E >> 요일을 나타내는 서식지정자
        sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //HH >> (12시간제)시를 나타내는 서식지정자 //hh >> (24시간제) //mm >> 분을 나타내는 서식지정자 //ss >> 초를 나타내는 서식지정자 //ss.S >>
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
        //a >> 오전오후를 나타내는 서식지정자

        System.out.println("sdf1: " + sdf1.format(day));
        System.out.println("sdf2: " + sdf2.format(day));
        System.out.println("sdf3: " + sdf3.format(day));
        System.out.println();
        sdf2 = new SimpleDateFormat("yy-M-d- h:m");
        System.out.println("sdf2: " + sdf2.format(day));

    }

}
