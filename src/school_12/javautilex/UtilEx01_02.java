package school_12.javautilex;

public class UtilEx01_02 {

    public static void main(String[] args) {

        Book[] book1 = new Book[3];
        Book[] book2 = new Book[3];
        book1[0] = new Book("동백꽃필무렵", "김유정");
        book1[1] = new Book("태백산맥", "조정래");
        book1[2] = new Book("수난이대", "하근찬");
        //Book[] book1 = {Book("동백꽃필무렵", "김유정")의 주소값(&10), Book("태백산맥", "조정래")의 주소값(&20), Book("수난이대", "하근찬")의 주소값(&30)}

        System.arraycopy(book1, 1, book2, 0, 2);
        //System.arraycopy(배열객체1, 배열객체1의 복사시작인덱스번호, 배열객체2, 배객체열2의 복사시작인덱스번호, 복사길이)
        //book1[]의 1번인덱스부터 2칸의 값들을 book2[]의 0번인덱스부터 2칸에 값복사
        //Book[] book2 = {Book("태백산맥", "조정래")의 주소값(&20), Book("수난이대", "하근찬")의 주소값(&30), null}

        book2[2] = new Book("진주목걸이", "모파상");
        //Book[] book2 = {Book("태백산맥", "조정래")의 주소값(&20), Book("수난이대", "하근찬")의 주소값(&30), Book("진주목걸이", "모파상")의 주소값(&40)}
        arrayPrint("(1) book1 : ", book1);
        arrayPrint("(1) book2 : ", book2);
        System.out.println();

        book1[1].setBookName("운수좋은날");
        book1[1].setAuthor("현진건");
        //Book[] book1 = {Book("동백꽃필무렵", "김유정")의 주소값(&10), Book("운수좋은날", "현진건")의 주소값(&20), Book("수난이대", "하근찬")의 주소값(&30)}
        //Book[] book2 = {Book("운수좋은날", "현진건")의 주소값(&20), Book("수난이대", "하근찬")의 주소값(&30), Book("진주목걸이", "모파상")의 주소값(&40)}
        arrayPrint("(2) book1 : ", book1);
        arrayPrint("(2) book2 : ", book2);
        System.out.println();

        book2[2] = (Book) book1[1].clone(); //book2[1]를 새로운주소 clone()에 복사해서 book2[2]에 복사(&50)
        arrayPrint("(3) book1 : ", book1);
        arrayPrint("(3) book2 : ", book2);
        System.out.println();

        book1[1].setBookName("그많던싱아는누가다먹었을까");
        book1[1].setAuthor("박완서");
        //Book[] book1 = {Book("동백꽃필무렵", "김유정")의 주소값, Book("그많던싱아는누가다먹었을까", "박완서")의 주소값(&20), Book("수난이대", "하근찬")의 주소값(&30)}
        //Book[] book2 = {Book("그많던싱아는누가다먹었을까", "박완서")의 주소값, Book("수난이대", "하근찬")의 주소값, Book("동백꽃필무렵", "김유정")의 주소값(&50)}
        arrayPrint("(4) book1 : ", book1);
        arrayPrint("(4) book2 : ", book2);
        System.out.println();

        book2[0] = (Book) book2[2].clone(); //book2[2]를 새로운주소 clone()에 복사해서 book2[0]에 복사(&60)
        arrayPrint("(5) book1 : ", book1);
        arrayPrint("(5) book2 : ", book2);
        System.out.println();
    }//메인 메소드 종료 중괄호

    static void arrayPrint(String s, Book[] a) {
        //"(1) book1 : ", book1
        //Book[] book1 = {Book("동백꽃필무렵", "김유정"), Book("태백산맥", "조정래"), Book("수난이대", "하근찬")}
        //"(1) book2 : ", book2
        //Book[] book2 = {Book("동백꽃필무렵", "김유정")의 주소값, Book("태백산맥", "조정래")의 주소값, Book("진주목걸이", "모파상")의 주소값}
        System.out.println(s);
        for (Book i : a) {
            i.showBookInfo();
        }
        System.out.println();
    }

}