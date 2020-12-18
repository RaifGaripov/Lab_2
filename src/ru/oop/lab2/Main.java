package ru.oop.lab2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3.2));
        shapes.add(new Square(7));
        shapes.add(new Rectangle(9.3, 3.3));
        shapes.add(new Triangle(5.2, 8.1, 6.9));

        double S = shapes.stream().mapToDouble(Shape::calcArea).sum();
        System.out.println("Total square: " + S);

        System.out.println("Shapes sorted by area: ");
        shapes.sort(Comparator.comparingDouble(Shape::calcArea).reversed());
        shapes.forEach(shape -> System.out.println(shape.toString()));

        System.out.println("Shapes sorted by perimeter: ");
        shapes.sort(Comparator.comparingDouble(Shape::calcPerimeter).reversed());
        shapes.forEach(shape -> System.out.println(shape.toString()));
    }
}
