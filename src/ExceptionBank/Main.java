package ExceptionBank;

public class Main {
    public static void main(String[] args) {

            BankAccount account = new BankAccount("123445", 567.98);
            System.out.println("Baslangic balans: " + account.getBalance());
            account.withdraw(543);

            try{
                account.withdraw(700);
            }catch (InsufficientBalanceException e){
                System.err.println(e.getMessage());
            }

            CustomerValidator validator = new CustomerValidator();
            try{
                validator.validateCustomer("Yeter N");
                validator.validateCustomer("");
            }catch (InvalidCustomerException e){
                System.err.println(e.getMessage());
            }

            CurrencyConverter converter = new CurrencyConverter();
            try{
                double convertedAmount = converter.convert(123,"USD","AZN");
            }catch (UnsupportedCurrencyException e){
                System.err.println(e.getMessage());
            }
    }
}
