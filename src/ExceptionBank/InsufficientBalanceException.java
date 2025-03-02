package ExceptionBank;

public class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String messsage){
        super(messsage);
    }
}
