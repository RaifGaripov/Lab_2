package ru.oop.lab2;

public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double a, double b, double c) throws IllegalArgumentException{
        if(a >= b + c || b >= a + c || c >= a + b ||
                a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("Nonexistent triangle");
        else {
            this.side1 = a;
            this.side2 = b;
            this.side3 = c;
        }
    }

    @Override
    public double calcArea() {
        double p = calcPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double calcPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSide1() { return side1; }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public String toString() {
        return "Triangle (a = " + side1 + ", b = " + side2 + ", c = " + side3 + "):\n" +
                "Area = " + calcArea() + "\n" +
                "Perimeter = " + calcPerimeter() + "\n";
    }
}