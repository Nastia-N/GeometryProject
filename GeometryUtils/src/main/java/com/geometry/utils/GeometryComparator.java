package com.geometry.utils;

import com.geometry.shapes.Circle;
import com.geometry.shapes.Rectangle;

public class GeometryComparator {

    public static boolean isCircleAreaGreaterThanRectangle(Circle circle, Rectangle rectangle) {
        return circle.getArea() > rectangle.getArea();
    }

    public static double circleAreaToRectangleAreaRatio(Circle circle, Rectangle rectangle) {
        if (rectangle.getArea() == 0) {
            return 0;
        }
        return circle.getArea() / rectangle.getArea();
    }
}
