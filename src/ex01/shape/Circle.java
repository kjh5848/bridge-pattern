package ex01.shape;

import ex01.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
        color.setColor(); // tor
    }
}
