package clients;

import accounts.Account;
import accounts.MoneyTarget;

public class Client implements MoneyTarget {
    protected String name;
    protected Account[] accounts;

    public Client(String name, int maximumAccounts) {
        this.accounts = new Account[maximumAccounts];
        this.name = name;
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счёта нет! :(");
    }

    public boolean pay(Account account, long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        return false;
    }
}
