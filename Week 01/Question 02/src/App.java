public class App {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000); // creates new account with id 1122, 20000 balance
        Account.setAnnualInterestRate(4.5); // annual interest rate for all accounts is 4.5%

        account.withdraw(2500); // withdraws 2500 from the balance
        account.deposit(3000); // deposits 3000 to the balance

        // Prints the account information
        System.out.println("Balance = " + account.getBalance());
        System.out.println("Monthly interest = " + account.getMonthlyInterest());
        System.out.println("Date created = " + account.getDateCreated());
    }
}
