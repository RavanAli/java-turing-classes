package Bank;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private int accountNumber;

    public BankAccount (String accountHolder, double balance, int accountNumber){
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(){
        this.accountHolder=accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        balance +=amount;
        System.out.println("Depozited: "+amount);
    }

    public void withdraw(double amount){
        if (balance - amount >= 0){
            balance -=amount;
            System.out.println("Withdrawn: " + amount);
        }else {
            System.out.println("Not enough balance");
        }
    }

    public void displayInfo(){
        System.out.println("Account Holder: " + accountHolder + "Account Number: " + accountNumber + "Balance: " + balance);
    }

    public void transfer(BankAccount recipient, double amount){
        if (this.balance >= amount){
            this.balance -= amount;
            recipient.deposit(amount);
            System.out.println("Transferred: " + amount + "to account " + recipient.getAccountNumber());
        }else {
            System.out.println("Invalid request");
        }
    }
}
