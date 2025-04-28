package labtuan4.BAI3;
public class Main {
    public static void main(String[] args) {
        // Shape
        Shape shape = new Shape("blue", false);
        System.out.println(shape);

        // Circle
        Circle circle = new Circle(2.0, "green", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Rectangle
        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", false);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Square
        Square square = new Square(2.5, "purple", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}