package Bank;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, int accountNumber, double overdraftLimit){
        super(accountHolder,balance,accountNumber);
        this.overdraftLimit = overdraftLimit;
    }
    public  double getOverdraftLimit(){
        return overdraftLimit;
    }
    public void setOverdraftLimit(){
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
    @Override
    public void withdraw(double amount){
        if (getBalance() + overdraftLimit >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        }else {
            System.out.println("Invalid");
        }
    }
}