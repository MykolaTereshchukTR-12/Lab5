package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println(area.areaSquare(5));
        System.out.println(area.areaRectangle(5,4));
        System.out.println(area.areaParallelogram(5,3));
        System.out.println(area.areaRhombus(5,(Math.PI)/3));
        System.out.println(area.areaRightTriangle(3,4));
        System.out.println(area.areaTrapeze(10,5,5));
        System.out.println(area.areaCircle(4));

        OtherMethods otherMethods = new OtherMethods();
        System.out.println(otherMethods.three( 3, 4, 5));
        System.out.println(Arrays.toString(otherMethods.mass(10)));
        double[] mass = {1,2,3,4,5,6,7,7,8,9,9,0,12,-12344,111,-1};
        System.out.println(otherMethods.largeNumber(mass, mass.length));
    }
}