package Test;

import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    public void testPay() {
        SavingsAccount acc = new SavingsAccount("Denis", 200, 200);
        boolean test = acc.pay(1500);
        Assertions.assertTrue(test);
    }

    @org.junit.jupiter.api.Test
    public void testAdd() {
        CreditAccount acc = new CreditAccount("Ana", 100);
        boolean test = acc.add(100);
        Assertions.assertFalse(test);
    }
    @org.junit.jupiter.api.Test
    public void testAccept(){
        CheckingAccount acc= new CheckingAccount("Igor",500);
        boolean test=acc.accept(300);
        Assertions.assertFalse(test);

    }
}

