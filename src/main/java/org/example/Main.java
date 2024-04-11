package org.example;
public class Main {
    public static void main(String[] args) {
        Area area = new Area();

        System.out.println(area.areaSquare(5));

        System.out.println(area.areaRectangle(5,4));

        System.out.println(area.areaParallelogram(5,3));

        System.out.println(area.areaRhombus(5,(Math.PI)/3));

        System.out.println(area.areaRightTriangle(3,4));

        System.out.println(area.areaTrapeze(10,5,5));


    }
}