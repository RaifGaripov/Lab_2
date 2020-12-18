package ru.oop.lab2;

public class Circle implements Shape {
    private final double radius;

    public Circle(double a) throws IllegalArgumentException {
        if(a <= 0)
            throw new IllegalArgumentException("Radius must be positive");
        else
            this.radius = a;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Circle (Radius = " + radius + "):\n" +
                "Area = " + calcArea() + "\n" +
                "Perimeter = " + calcPerimeter() + "\n";
    }
}