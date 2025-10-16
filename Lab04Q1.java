import java.util.Scanner;
import java.util.Vector;

public class Lab04Q1 {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        int command;

        do {
            System.out.println("Enter command: 0 = exit, 1 = draw all shapes, 2 = create circle, 3 = create rectangle");
            command = scanner.nextInt();

            switch (command) {
                case 1:
                    for (Shape shape : shapes) {
                        ClientShape.doAction(shape);
                    }
                    break;
                case 2:
                    shapes.add(ShapeFactory.createCircle(scanner));
                    break;
                case 3:
                    shapes.add(ShapeFactory.createRectangle(scanner));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        } while (command != 0);

        scanner.close();
    }
}
