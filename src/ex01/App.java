package ex01;

import ex01.color.BlueColor;
import ex01.color.RedColor;
import ex01.color.YellowColor;
import ex01.shape.Circle;
import ex01.shape.Shape;
import ex01.shape.Square;
import ex01.shape.Triangle;

/**
 * 목적 :
 */
public class App {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape redSquare = new Square(new RedColor());
        Shape redTriangle = new Triangle(new RedColor());

        Shape blueCircle = new Circle(new BlueColor());
        Shape blueSquare = new Square(new BlueColor());
        Shape blueTriangle = new Triangle(new BlueColor());

        Shape yellowCircle = new Circle(new YellowColor());
        Shape yellowSquare = new Square(new YellowColor());
        Shape yellowTriangle = new Triangle(new YellowColor());

        redCircle.draw();
        System.out.println("===============================");
        redSquare.draw();
        System.out.println("===============================");
        redTriangle.draw();
        System.out.println("===============================");

        blueCircle.draw();
        System.out.println("===============================");
        blueSquare.draw();
        System.out.println("===============================");
        blueTriangle.draw();
        System.out.println("===============================");

        yellowCircle.draw();
        System.out.println("===============================");
        yellowSquare.draw();
        System.out.println("===============================");
        yellowTriangle.draw();
        System.out.println("===============================");

    }
}
