package ex02.shape;

import ex02.color.Color;
import ex02.size.Size;

public class Circle implements Shape {
    protected Color color;
    protected Size size;

    public Circle() {
    }

    public Circle(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
        if (color != null) color.setColor();
        if (size != null) size.setSize();
    }
}
