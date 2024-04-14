package org.example;

public class OtherMethods {

    //Help block
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

    //Method to find the smallest number of three given by the user
    public String three(double a, double b, double c){
        return "" + Math.min(a, Math.min(b, c));
    }

    //A method that generates an array of a given length and outputs it
    public double[] mass(int len){
        double[] arr = new double[len];
        for(int i = 0; i != len; i++){
            arr[i] = 100 * Math.random();
        }
        return arr;
    }

    //A method that allows you to find the largest element of a user-specified array
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
