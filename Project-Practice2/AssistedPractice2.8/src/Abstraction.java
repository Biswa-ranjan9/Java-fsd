abstract class Shape {
    protected int area;
    public abstract void calculateArea();
    public void displayArea() {
        System.out.println("Area: " + area);
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
   public void calculateArea() {
        area = (int) (Math.PI * radius * radius);
    }
}
class Rectangle extends Shape {
    private int length;
    private int width;
   public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public void calculateArea() {
        area = length * width;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        circle.calculateArea();
        circle.displayArea();
        Shape rectangle = new Rectangle(4, 6);
        rectangle.calculateArea();
        rectangle.displayArea();
    }
}
