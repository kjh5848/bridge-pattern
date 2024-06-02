package ex02.shape;

import ex02.color.Color;
import ex02.size.Size;

// 사각형을 구현한 클래스
public class Square implements Shape {
    protected Color color;
    protected Size size;

    public Square() {
    }

    public Square(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
        if (color != null) color.setColor();
        if (size != null) size.setSize();
    }

}
