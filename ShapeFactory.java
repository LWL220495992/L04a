import java.util.Scanner;

public abstract class ShapeFactory {
    public abstract Circle createCircle(Scanner scanner);
    public abstract Rectangle createRectangle(Scanner scanner);

    public Point createPoint(Scanner scanner) {
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        return new Point(x, y);
    }
}
