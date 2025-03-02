package ExceptionBank;

public class CustomerValidator {
    public void validateCustomer(String customerName) throws InvalidCustomerException{
        if (customerName == null || customerName.trim().isEmpty()){
            throw new InvalidCustomerException("Musteri adi sehvdir.");
        }else {
            System.out.println("Ad duzgundur: " + customerName);
        }
    }
}
