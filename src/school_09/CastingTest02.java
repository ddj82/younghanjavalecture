package school_09;

public class CastingTest02 {

    public static void main(String[] args) {
        Guest guest = new Guest();
//		Food foodone = new Food(); //1.papa
//		Food foodone = new Jjigae(); //2.pacha
        Food foodone = new Tang(); //3.pacha
        guest.foodEat(foodone);
        /*
         * 1.
         * "Guest 간맞추기"
         * "Food 간맞추기"
         *
         * 2.
         * "Guest 간맞추기"
         * "Jjigae 간맞추기"
         *
         * 3.
         * "Guest 간맞추기"
         * "Tang 간맞추기"
         */
    }

}

class Food { //부모(Super 상위 기본)
    public void cook() {
        System.out.println("Food 간맞추기");
    }
}

class Jjigae extends Food { //Food자식1(Sub 하위 파생)
    public void cook() {
        System.out.println("Jjigae 간맞추기");
    }
}

class Tang extends Food { //Food자식2(Sub 하위 파생)
    public void cook() {
        System.out.println("Tang 간맞추기");
    }
}

class Guest {
    public void foodEat(Food somefood) {
        System.out.println("Guest 간맞추기");
        somefood.cook();
    }
}