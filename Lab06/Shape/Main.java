package Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "blue", false);
        Shape rectangle = new Rectangle(4.0, 7.0, "green", true);
        Shape square = new Square(3.0, "yellow", true);

        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());

        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea() + ", Perimeter: " + square.getPerimeter());
    }
}
