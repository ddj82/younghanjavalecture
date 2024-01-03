package school_12.javautilex;

import java.util.Calendar;

//Calendar = 추상클래스
public class UtilEx02 {
    public static void main(String[] args) {
        String[] months = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
        String[] week = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        Calendar calendar = Calendar.getInstance();


        System.out.println("날짜 : " + calendar);
        System.out.print(calendar.get(Calendar.YEAR) + "년 ");
        System.out.print(months[calendar.get(Calendar.MONTH)]); //calendar.get(Calendar.MONTH) >> 0~11
        System.out.print(" " + calendar.get(Calendar.DATE) + "일 ");
        System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK) - 1]); //1부터 반환하므로 //calendar.get(Calendar.DAY_OF_WEEK) >> 1~7

        System.out.print("시간 : ");
        //get(Calendar.AM_PM) => 0: 오전, 1: 오후
        if (calendar.get(Calendar.AM_PM) == 0) {
            System.out.print("오전 ");
        } else {
            System.out.print("오후 ");
        }

        System.out.print(calendar.get(Calendar.HOUR) + "시 ");
        System.out.print(calendar.get(Calendar.MINUTE) + "분 ");
        System.out.println(calendar.get(Calendar.SECOND) + "초");

        System.out.print(calendar.get(Calendar.YEAR));
        System.out.print(". " + calendar.get(Calendar.MONTH)); //0부터리턴
        System.out.print(". " + calendar.get(Calendar.DATE)); //0부터리턴
        System.out.println(". " + calendar.get(Calendar.DAY_OF_WEEK)); //요일: 1부터리턴
        System.out.println();





        //내가 설정하는 방법
        calendar.set(Calendar.YEAR, 1997);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DATE, 10);
        calendar.set(Calendar.HOUR, 12);
        calendar.set(Calendar.MINUTE, 25);
        calendar.set(Calendar.SECOND, 00);

        System.out.print(calendar.get(Calendar.YEAR) + "년 ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE) + "일 ");
        System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
        System.out.print(calendar.get(Calendar.HOUR) + "시 ");
        System.out.print(calendar.get(Calendar.MINUTE) + "분 ");
        System.out.println(calendar.get(Calendar.SECOND) + "초");


        System.out.print(calendar.get(Calendar.YEAR));
        System.out.print(". " + calendar.get(Calendar.MONTH)); //0부터리턴
        System.out.print(". " + calendar.get(Calendar.DATE)); //0부터리턴
        System.out.print(". " + calendar.get(Calendar.DAY_OF_WEEK)); //요일: 1부터리턴

    }
}