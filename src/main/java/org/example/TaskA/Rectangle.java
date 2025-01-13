package org.example.TaskA;

public class Rectangle extends GeometricFigure {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle: " + (length * width));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of rectangle: "  + (2 * (length + width)));
    }
}
