public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }
}

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        System.out.println("Current balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("New balance after deposit: " + account.getBalance());

        account.withdraw(1200.0);
        System.out.println("New balance after withdrawal: " + account.getBalance());
    }
}
