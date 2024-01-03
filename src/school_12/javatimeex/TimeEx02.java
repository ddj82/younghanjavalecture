package school_12.javatimeex;

import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class TimeEx02 {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS a");
        //SimpleDateFormat처럼 내가 원하는 표기법으로 바꿀 수 있는 서식지정자 포멧형식으로 만들지만 객체생성 불가능
        //클래스명.메소드호출 >> 스태틱메소드 호출
        //SimpleDateFormat과 형식이 반대 ㄱ 처럼
        String date = LocalDate.now().atStartOfDay().format(formatter); //뭐시기.뭐시기.뭐시기. >> 체인기법
        System.out.println("금일 자정: " + date + "\n");

        LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
        date = tomorrow.format(formatter);
        System.out.println("내일 현재 시간: " + date + "\n");

        tomorrow = LocalDateTime.now().plusDays(1).with(LocalTime.MAX);
        date = tomorrow.format(formatter);
        System.out.println("내일의 맨 마지막 시간: " + date + "\n");

        tomorrow = LocalDateTime.now().plusDays(1).with(LocalTime.MIN);
        date = tomorrow.format(formatter);
        System.out.println("내일의 처음 시간: " + date + "\n");

        LocalDateTime todate = LocalDateTime.now().with(LocalTime.NOON);
        date = todate.format(formatter);
        System.out.println("오늘 날짜의 정오: " + date + "\n");

        todate = LocalDateTime.now();
        String dayOfWeek = todate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        // .getDisplayName(요일표기법, 해당국가시스템) //getDefault() - 설정되어 있는 국가, 위에서 설정한 디폴트값이 한국임
        date = todate.format(formatter);
        System.out.println(date + " " + dayOfWeek);
    }

}