package Bank;

public class SavingsAccount extends BankAccount{
    private double monthlyInterestRate;
    private int withdrawalLimit = 3;
    private int withdrawalMade = 0;

    public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate){
        super(accountHolder,balance,accountNumber);
        this.monthlyInterestRate= monthlyInterestRate;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }
    public void setMonthlyInterestRate(){
        this.monthlyInterestRate = monthlyInterestRate;
    }
    public int getWithdrawalLimit(){
        return withdrawalLimit;
    }
    public int getWithdrawalMade(){
        return withdrawalMade;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate + "Remaining withdraw: " + (withdrawalLimit - withdrawalMade));
    }

    @Override
    public void withdraw(double amount){
        if (withdrawalMade < withdrawalLimit){
            super.withdraw(amount);
            withdrawalMade++;
        }else {
            System.out.println("Reached withdraw limit");
        }
    }
    public void applyInterest(){
        double interest = getBalance() * (monthlyInterestRate / 100);
        setBalance(getBalance() + interest);
        System.out.println("Interest applied: " + interest);
    }
}