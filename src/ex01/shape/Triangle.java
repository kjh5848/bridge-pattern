package ex01.shape;

import ex01.color.Color;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
        color.setColor(); // tor
    }
}
