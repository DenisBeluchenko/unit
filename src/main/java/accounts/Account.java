package accounts;

public abstract class Account implements MoneyTarget {
    public String name;
    public Long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean pay(long amount) {
        if (balance - amount < 0) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    public boolean transfer(Account accountTo, int amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        }
        return false;
    }
}

