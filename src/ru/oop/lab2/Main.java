package ru.oop.lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Shape[] figures = new Shape[4];
        figures[0] = new Circle(7.8);
        figures[1] = new Square(3.2);
        figures[2] = new Rectangle(9.3, 3.3);
        figures[3] = new Triangle(5.2, 8.1, 6.9);

        ArrayList<Shape> figureList = new ArrayList<>(Arrays.asList(figures));

        double sumArea = 0;

        double[] maxArea = {0, 5};
        double[] minArea = {Double.MAX_VALUE, 5};
        double[] maxPerimeter = {0, 5};
        double[] minPerimeter = {Double.MAX_VALUE, 5};

        for (int i = 0; i < figureList.size(); i++)
        {
            double Area = figureList.get(i).calcArea();
            double Perimeter = figureList.get(i).calcPerimeter();
            if(Area > maxArea[0]) {
                maxArea[0] = Area;
                maxArea[1] = i;
            }
            else if(Area < minArea[0]) {
                minArea[0] = Area;
                minArea[1] = i;
            }
            if(Perimeter > maxPerimeter[0]) {
                maxPerimeter[0] = Perimeter;
                maxPerimeter[1] = i;
            }
            else if(Perimeter < minPerimeter[0]) {
                minPerimeter[0] = Perimeter;
                minPerimeter[1] = i;
            }
            sumArea += Area;
        }

        System.out.format("Сумма площадей фигур = %.2f%n", sumArea);
        System.out.format("Фигура с наибольшей площадью - %s (%.2f)%n",
                figureList.get((int)maxArea[1]).name(), maxArea[0]);
        System.out.format("Фигура с наименьшей площадью - %s (%.2f)%n",
                figureList.get((int)minArea[1]).name(), minArea[0]);
        System.out.format("Фигура с наибольшим периметром - %s (%.2f)%n",
                figureList.get((int)maxPerimeter[1]).name(), maxPerimeter[0]);
        System.out.format("Фигура с наименьшим периметром - %s (%.2f)%n",
                figureList.get((int)minPerimeter[1]).name(), minPerimeter[0]);
    }
}
