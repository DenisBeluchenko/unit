package accounts;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean accept(int money) {
        return false;
    }
}
