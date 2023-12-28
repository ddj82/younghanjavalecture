package school_09.test.other;

import school_09.test.SameClass;

public class ChileClass extends SameClass{
    // public ChileClass() {}

    public void md() {
//		SameClass sp = new SameClass();
//		System.out.println(sp.sameVar);
        //sp는 SameClass이고 외부접근 가능하려면 SameClass이 SameClass를 상속받아야 하는데 protected이더라도 내가 나를 상속할수없음 안됨

//		System.out.println(sameVar);
        // 다른 패키지에 속하는 자식 클래스까지 허용
    }
}