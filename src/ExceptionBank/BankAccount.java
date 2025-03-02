package ExceptionBank;


public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if (amount > balance){
            throw new InsufficientBalanceException("Kifayet qeder balans yoxdur.");
        }else {
            balance -= amount;
            System.out.println("Ugurludur, balans: " + balance);
        }
    }
}
