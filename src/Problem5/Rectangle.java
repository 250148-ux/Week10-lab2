package Problem5;

public class Rectangle extends Shape{
    double width, height;

    public Rectangle(String color, double w, double h) {
        super(color);
        this.width=w;
        this.height=h;
    }

    @Override
    public double getArea() {
        return width*height;
    }
    @Override
    public double getPerimeter() {
        return 2*(height+width);
    }
}
