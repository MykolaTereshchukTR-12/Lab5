package org.example;
public class Main {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Area of square is " + area.areaSquare(5));
        System.out.println("Area of rectangle is " + area.areaRectangle(3, 4, 5));
    }
}