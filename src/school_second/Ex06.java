package school_second;

public class Ex06 {
    public static void main(String[] args) {
        //3점 이하인 학생들 명단 모두 출력되도록 수정
        /*
         * 박희동 또치 마이콜
         */
        int i = 3;
        String str = "";
        switch (i) {
            case 6 : str += "고길동 "; //str = str + "고길동 " //str = "고길동 "
            case 5 : str += "도우너 "; //str = str + "도우너 " //str = "도우너 "
            case 4 : str += "둘리 "; //str = str + "둘리 " //str = "둘리 "
            case 3 : str += "박희동 "; //str = str + "박희동 " //str = "박희동 "
            case 2 : str += "또치 "; //str = str + "또치 " //str = "또치 "
            default : str += "마이콜 "; //str = str + "마이콜 " //str = "마이콜 "
        }
        System.out.println(str);

    }
}
