package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 9;
        rectangle.height = 8;

        int area = rectangle.calculaterArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean square = rectangle.isSquare();

        System.out.println("넓이: " + area);
        System.out.println("둘레 길이: " + perimeter);
        System.out.println("정사각형 여부: " + square);
    }
}
