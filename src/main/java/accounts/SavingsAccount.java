package accounts;

public class SavingsAccount extends Account {
    long minimumBalance;

    public SavingsAccount(String name, long balance, long minimumBalance) {
        super(name, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean pay(long amount) {
        if (balance < minimumBalance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    @Override
    public boolean accept(int money) {
        return false;
    }
}
