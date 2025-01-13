package org.example;

import org.example.TaskA.*;
import org.example.TaskB.*;

public class Main {
    public static void main(String[] args) {
        ///// Task A
        GeometricFigure triangle = new Triangle(3, 4, 5, 4);
        GeometricFigure rectangle = new Rectangle(5, 3);
        GeometricFigure trapezium = new Trapezium(4, 6, 5, 5, 3);

        triangle.area();
        triangle.perimeter();

        rectangle.area();
        rectangle.perimeter();

        trapezium.area();
        trapezium.perimeter();


        ///// Task B
        System.out.println();
        Animal cat = new Cat("Coco");
        Animal dog = new Dog("Lucy");
        Animal duck = new Duck("Daisy");


        cat.getName();
        cat.sound();

        dog.getName();
        dog.sound();

        duck.getName();
        duck.sound();


    }
}