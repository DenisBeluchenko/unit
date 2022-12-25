import accounts.CheckingAccount;
import accounts.SavingsAccount;
import accounts.CreditAccount;
import clients.Client;
import accounts.Account;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Denis", 4);
        client.add(new CreditAccount("Denis", 1000));

    }
}