package Problem2;

public class InsufficientFundsException extends Exception{
    double shortfall;
    public InsufficientFundsException(double shortfall) {
        super(String.format("Insufficient funds: %.2f", shortfall));
        this.shortfall = shortfall;
    }
}
