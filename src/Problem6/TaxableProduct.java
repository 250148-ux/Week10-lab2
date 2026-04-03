package Problem6;

public class TaxableProduct extends Product implements Taxable {
    public  TaxableProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {return price * TAX_RATE;}
    @Override
    public void print() {
        System.out.println("Product: " + name + ", Price: $" + price
                + ", Tax: $" + calculateTax()
                + ", Total: $" + (price + calculateTax()));
    }
}
