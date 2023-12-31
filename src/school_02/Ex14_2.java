package school_02;

public class Ex14_2 {
    public static void main(String[] args) {
        /*
         * 1, 3, 5, 7, 8, 10, 12 월 >>> 31일
         * 2월 >>> 년도를 4로 나눈 나머지가 0인 경우는 29
         * 0이 아닌 경우는 28일
         * 4, 6, 9, 11 월 >>> 30일
         *
         * 출력결과 : 2023년도 2월은 28일까지 입니다.
         */

//        int year = 2023;
//        int month = 2;
//        int day = 30;
//
//        switch (month) {
//            case 2 :
//                if (year % 4 == 0) day = 29;
//                else day = 28;
//                break;
//            case 4 : case 6 :case 9 :case 11 : day = 30;
//                break;
//            default : day = 31;
//        }
//
//        System.out.printf("%d년도 %d월은 %d일까지 입니다.\n", year, month, day);


//        if (month == 2) {
//            if (year % 4 == 0) {
//                day = 29;
//            } else {
//                day = 28;
//            }
//        } else if (month == 4 || month == 6 ||  month == 9 ||  month == 11) {
//            day = 30;
//        } else {
//            day = 31;
//        }
//        System.out.printf("%d년도 %d월은 %d일까지 입니다.\n", year, month, day);




        int year = 2023;
        int day = 30;

        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 2:
                    if (year % 4 == 0) {
                        day = 29;
                    } else {
                        day = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;
                default:
                    day = 31;
            }
            System.out.printf("%d년도 %d월은 %d일까지 입니다.\n", year, month, day);
        }
    }
}
