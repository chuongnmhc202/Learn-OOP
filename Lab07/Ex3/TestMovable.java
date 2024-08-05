package Ex3;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point);
        point.moveUp();
        System.out.println("After moving up: " + point);
        point.moveRight();
        System.out.println("After moving right: " + point);

        MovableCircle circle = new MovableCircle(0, 0, 2, 2, 5);
        System.out.println(circle);
        circle.moveUp();
        System.out.println("After moving up: " + circle);
        circle.moveRight();
        System.out.println("After moving right: " + circle);
    }
}