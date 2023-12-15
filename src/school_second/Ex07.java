package school_second;

public class Ex07 {
    public static void main(String[] args) {
        int score = 88;
        String grade;

        switch (score / 10) {
            case 10: grade = "A+"; break;
            case 9:
                if (score % 10 > 5) {
                    grade = "A+";
                } else if (score % 10 == 5) {
                    grade = "A0";
                } else {
                    grade = "A-";
                }
                break;
            case 8:
                if (score % 10 > 5) {
                    grade = "B+";
                } else if (score % 10 == 5) {
                    grade = "B0";
                } else {
                    grade = "B-";
                }
                break;
            case 7:
                if (score % 10 > 5) {
                    grade = "C+";
                } else if (score % 10 == 5) {
                    grade = "C0";
                } else {
                    grade = "C-";
                }
                break;

            case 6:
                if (score % 10 > 5) {
                    grade = "D+";
                } else if (score % 10 == 5) {
                    grade = "D0";
                } else {
                    grade = "D-";
                }
                break;
            default: grade = "F";

        }

        System.out.println("학점은 " + grade + "입니다.");

    }
}


