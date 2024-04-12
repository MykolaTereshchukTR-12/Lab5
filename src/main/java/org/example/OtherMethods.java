package org.example;

public class OtherMethods {

    public String help(){
        return """
                To find the area of a square, enter 1;\s
                To find the area of a rectangle, enter 2;\s
                To find the area of a parallelogram, enter 3;\s
                To find the area of a rhombus, enter 4;\s
                To find the area of a right triangle, enter 5;\s
                To find the area of a trapezoid, enter 6;\s
                To find the area of a circle, enter 7;\s
                To find the smallest number of the three given, enter 8;\s
                To output an array of random numbers, enter 9;\s
                To output the largest value from the user-entered array, enter 10;\s
                Enter 0 to exit the program.""";
    }

    public String three(double a, double b, double c){
        return "" + Math.min(a, Math.min(b, c));
    }

    public double[] mass(int len){
        double[] arr = new double[len];
        for(int i = 0; i != len; i++){
            arr[i] = 100 * Math.random();
        }
        return arr;
    }

    public String largeNumber(double[] arr, int len){
        double max = arr[0];
        for(int i = 0; i != len; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        return "" + max;
    }

}
