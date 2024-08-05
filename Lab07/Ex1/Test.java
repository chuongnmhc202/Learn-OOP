package Ex1;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);

        Shape largestShape = findLargestArea(shapes);
        System.out.println("The shape with the largest area is: " + largestShape);
    }

    public static Shape findLargestArea(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) {
            return null;
        }
        Shape largestShape = shapes[0];
        for (Shape shape : shapes) {
            if (shape.getArea() > largestShape.getArea()) {
                largestShape = shape;
            }
        }
        return largestShape;
    }
}