// Base class Account
class Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest); // uses parent class method
        System.out.println("Interest added: " + interest);
    }
}

public class TestAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(5.0); // 5% interest
        sa.deposit(1000);
        sa.addInterest();
        System.out.println("Final Balance: " + sa.getBalance());
    }
}
