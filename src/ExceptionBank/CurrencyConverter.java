package ExceptionBank;

public class CurrencyConverter {

    private boolean isSupportedCurrecy(String currency){
        for (Currency c : Currency.values()){
            if (c.name().equals(currency))
                return true;
        }
        return false;
    }

    public double convert(double amount, String fromCurrency, String toCurrency) throws UnsupportedCurrencyException{
        if (!isSupportedCurrecy(fromCurrency) || !isSupportedCurrecy(toCurrency)){
            throw new UnsupportedCurrencyException("Valyuta desteklenmir.");
        }else {
            return amount;
        }
    }
}
