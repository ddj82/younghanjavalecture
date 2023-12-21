package school_06;

public class AccountEx {
    public static void main(String[] args) {
        System.out.println("Account.total : " + Account.total);

        Account acc01 = new Account(10);
        System.out.println("acc01.total : " + acc01.total);
        System.out.println("acc01.count : " + acc01.count);

        Account acc02 = new Account(10);
        System.out.println("acc02.total : " + acc02.total);
        System.out.println("acc02.count : " + acc02.count);

        Account acc03 = new Account(10);
        System.out.println("acc03.total : " + acc03.total);
        System.out.println("acc03.count : " + acc03.count);
    }
}

class Account {
    int count;
    static int total; //0, (acc01)-10, (acc02)-20, (acc03)-30

    Account(int amount) {
        count += amount;
        total += amount;
    }
}
