import java.util.Date;

public class Account {
    private int id = 0; // Account id (default is 0)
    private double balance = 0.0; // Account balance (default is 0)
    private static double annualInterestRate = 0.0; // Annual interest rate (default is 0)
    private Date dateCreated; // Account creation date

    // Default constructor
    public Account() {
        this.dateCreated = new Date();
    }

    // Id and balance constructor
    public Account(int newId, double newBalance) {
        this();
        this.id = newId;
        this.balance = newBalance;
    }

    /*
     * Accessor methods
     */

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return Account.annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    /*
     * Mutator methods
     */

    public void setId(int newId) {
        this.id = newId;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        Account.annualInterestRate = newAnnualInterestRate;
    }

    // Calculates the monthly interest rate
    public double getMonthlyInterestRate() {
        return (Account.annualInterestRate / 100) / 12;
    }

    // Calculates the account's monthly interest
    public double getMonthlyInterest() {
        return this.balance * getMonthlyInterestRate();
    }

    // Withdraws specific amount from the account if his balance accepts that
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.err.println("ERROR: The specified amount to withdraw is more than the account's balance.");
        }
    }

    // Deposits specific amount to the account
    public void deposit(double amount) {
        this.balance += amount;
    }
}
