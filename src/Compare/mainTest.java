package Compare;

import Shape.Circle;
import Shape.Rectangle;
import Shape.Square;

import java.util.Arrays;

public class mainTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("black",false,1.8);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        CircleCompare circleComparator = new CircleCompare();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }


        Square[] squares = new Square[3];
        squares[0] = new Square(3.6);
        squares[1] = new Square();
        squares[2] = new Square(4,"red",false);

        System.out.println("Pre-sorted:");
        for (Square square : squares) {
            System.out.println(square);
        }

        SquareCompare squareCompare = new SquareCompare();
        Arrays.sort(squares, squareCompare);

        System.out.println("After-sorted:");
        for (Square square : squares) {
            System.out.println(square);
        }

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3.6, 5.0);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(1.8,3.0);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        RectangleCompare rectangleCompare = new RectangleCompare();
        Arrays.sort(rectangles, rectangleCompare);

        System.out.println("After-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
