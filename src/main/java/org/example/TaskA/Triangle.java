package org.example.TaskA;

public class Triangle extends GeometricFigure{
    private double a, b, c, height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("Area of triangle: " + (0.5 * b * height));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of triangle: " + (a + b + c));
    }
}
