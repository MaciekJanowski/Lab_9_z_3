
public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException (String message) { super(message);}
}

class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getBalance() { return balance; }

    public void withdrawal(int amount) throws NotEnoughMoneyException {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            throw new NotEnoughMoneyException("Not enough money/funds in the account.");
        }
    }
}
