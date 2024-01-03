package oop1.ex;

public class Rectangle {

    int width;
    int height;
    int area = 0;
    int perimeter = 0;
    boolean square = false;

    int calculaterArea() {
        area = width * height;
        return area;
    }

    int calculatePerimeter() {
        perimeter = (width + height) * 2;
        return perimeter;
    }

    boolean isSquare() {
        if (width == height) {
            square = true;
        }
        return square;
    }
}
