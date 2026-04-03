package Problem5;

public class ShapeDemo {
    public static Shape findLargest(Shape[] shapes) {
        Shape largest = shapes[0];
        for (Shape s : shapes) {
            if (s.getArea() > largest.getArea()) {
                largest = s;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("red", 5),
                new Circle("blue", 3),
                new Rectangle("green", 4, 6),
                new Rectangle("yellow", 2, 8),
                new Triangle("purple", 3, 4, 5),
                new Triangle("orange", 6, 8, 10)
        };

        for (Shape s : shapes) {
            s.displayInfo();
        }

        Shape largest = findLargest(shapes);
        System.out.println("\nLargest: " + largest.getClass().getSimpleName() + " area=" + largest.getArea());

        double total = 0;
        for (Shape s : shapes) total += s.getArea();
        System.out.println("Total area: " + total);
    }
}
