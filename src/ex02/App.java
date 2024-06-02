package ex02;

import ex02.color.RedColor;
import ex02.shape.Circle;
import ex02.shape.Shape;
import ex02.shape.Square;
import ex02.size.Large;
import ex02.size.Small;

public class App {
    public static void main(String[] args) {
        // 빨간색 원을 생성
        Shape redCircle = new Circle(new RedColor(), new Large());
        redCircle.draw();

        // 파란색 사각형을 생성
        Shape blueSquare = new Square(null, new Small());
        blueSquare.draw();
    }
}
