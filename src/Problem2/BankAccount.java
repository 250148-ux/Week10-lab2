package Problem2;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        System.out.println("Current balance is "+balance);
        balance -= amount;
        System.out.println("Withdrew "+amount);
        return balance;
    }
}
