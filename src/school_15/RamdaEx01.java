package school_15;

interface Ramda01{
    int getMax(int num1, int num2); //public abstract 숨어있음
//	int add(int num1, int num2); //람다식이 사용되려면 인터페이스안에 메소드가 단 한 개 여야함
}

//class RamdaCh implements Ramda01 {
//	@Override
//	public int getMax(int num1, int num2) {
//		return (num1 >= num2) ? num1 : num2;
//	}
//}

public class RamdaEx01 {
    public static void main(String[] args) {
//		Ramda01 max = new RamdaCh();
//		int r = max.getMax(10, 20);
//
//		Ramda01 max = new Ramda01() {
//			@Override
//			public int getMax(int num1, int num2) {
//				return (num1 >= num2) ? num1 : num2;
//			}
//
//		}; //이거를 람다식으로 ㄱ
//
//		Ramda01 max = (x, y) -> {
//			return (x >= y) ? x : y;
//		}

        //이건데 중괄호, 리턴키워드 생략가능 ㄱ
        //람다식을 인터페이스형 max변수에 대입
        Ramda01 max = (x, y) -> (x >= y) ? x : y;


        int r = max.getMax(10, 20);

        //인터페이스형 변수로 메소드 호출
        System.out.println(r);
    }
}