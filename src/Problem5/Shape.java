package Problem5;

public abstract class Shape {
    String color;
    public Shape(String color){
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public void displayInfo() {
        System.out.println(getClass().getSimpleName() + " " + color + " " + getArea() + " " + getPerimeter());
    }
}
