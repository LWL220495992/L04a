import java.util.Scanner;

public class ConcreteShapeFactory extends ShapeFactory {
    @Override
    public Circle createCircle(Scanner scanner) {
        Point point = createPoint(scanner);
        System.out.println("Enter radius:");
        int radius = scanner.nextInt();
        return new Circle(radius, point);
    }

    @Override
    public Rectangle createRectangle(Scanner scanner) {
        Point point = createPoint(scanner);
        System.out.println("Enter width:");
        int width = scanner.nextInt();
        System.out.println("Enter height:");
        int height = scanner.nextInt();
        return new Rectangle(width, height, point);
    }
}
