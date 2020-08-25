package OOP.FirstLecture.pointInRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int bottomleftX = scanner.nextInt();
        int bottomleftY = scanner.nextInt();
        int topRightX = scanner.nextInt();
        int topRightY = scanner.nextInt();
        Rectangle rectangle = new Rectangle(new Point(bottomleftY,bottomleftY)
                , new Point(topRightX,topRightY));

        int numberOfPoints = scanner.nextInt();

        for (int i = 0; i < numberOfPoints; i++) {
            int pointX = scanner.nextInt();
            int pointY = scanner.nextInt();
            Point point = new Point(pointX,pointY);
            System.out.println(rectangle.contains(point));
        }


    }
}
