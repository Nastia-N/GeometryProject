package com.geometry;

import com.geometry.shapes.Circle;
import com.geometry.shapes.Rectangle;
import com.geometry.shapes.Triangle;
import com.geometry.utils.GeometryComparator;
import com.geometry.d3.Cube;
import com.geometry.d3.Sphere;

public class App {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.printf("Круг: площадь = %.2f, периметр = %.2f%n",
                circle.getArea(), circle.getPerimeter());
        System.out.printf("Прямоугольник: площадь = %.2f, периметр = %.2f%n",
                rect.getArea(), rect.getPerimeter());
        System.out.printf("Треугольник: площадь = %.2f, периметр = %.2f%n",
                triangle.getArea(), triangle.getPerimeter());

        boolean isGreater = GeometryComparator.isCircleAreaGreaterThanRectangle(circle, rect);
        System.out.printf("Площадь круга больше площади прямоугольника? %b%n", isGreater);

        double ratio = GeometryComparator.circleAreaToRectangleAreaRatio(circle, rect);
        System.out.printf("Отношение площади круга к площади прямоугольника: %.2f%n", ratio);

        Cube cube = new Cube(3);
        System.out.printf("Куб: объём = %.2f, площадь поверхности = %.2f%n",
                cube.getVolume(), cube.getSurfaceArea());

        Sphere sphere = new Sphere(2);
        System.out.printf("Сфера: объём = %.2f, площадь поверхности = %.2f%n",
                sphere.getVolume(), sphere.getSurfaceArea());
    }
}
