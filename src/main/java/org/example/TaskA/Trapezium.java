package org.example.TaskA;

public class Trapezium extends GeometricFigure {
    private double a, b, c, d, height;

    public Trapezium(double a, double b, double c, double d, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("Area of trapezium: " +( 0.5 * (a + b) * height));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of trapezium: " + (a + b + c + d));
    }
}
