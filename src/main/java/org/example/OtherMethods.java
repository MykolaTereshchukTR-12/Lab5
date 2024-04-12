package org.example;

public class OtherMethods {

    public String three(double a, double b, double c){
        return "" + Math.max(a, Math.max(b, c));
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
