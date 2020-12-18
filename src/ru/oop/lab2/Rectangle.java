package ru.oop.lab2;

public class Rectangle implements Shape {
    private final double side1;
    private final double side2;

    public Rectangle(double a, double b) throws IllegalArgumentException {
        if(a <= 0 || b <= 0)
            throw new IllegalArgumentException("Length and width must be positive");
        else {
            this.side1 = a;
            this.side2 = b;
        }
    }

    @Override
    public double calcArea() {
        return side1 * side2;
    }

    @Override
    public double calcPerimeter() {
        return (side1 + side2) * 2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }
    @Override
    public String toString() {
        return "Rectangle (a = " + side1 + ", b = " + side2 + "):\n" +
                "Area = " + calcArea() + "\n" +
                "Perimeter = " + calcPerimeter() + "\n";
    }
}

