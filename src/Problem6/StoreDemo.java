package Problem6;

public class StoreDemo {
    public static void main(String[] args) {
        Printable[] items = {
                new Product("Notebook", 5.00),
                new TaxableProduct("Headphones", 50.00),
                new DigitalProduct("Java Course", 30.00, "https://courses.example.com/java")
        };
        double totalTax = 0;

        for (Printable item : items) {
            item.print();
            if (item instanceof Taxable t) {
                totalTax += t.calculateTax();
            }
            System.out.println();
        }

        System.out.println("Total tax collected: $" + totalTax);
    }
}
