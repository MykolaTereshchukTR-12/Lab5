package org.example;

public class Area {

    //Square
    public double areaSquare(double a) {
        return a*a;
    }

    //Rectangle
    public String areaRectangle(double a, double b, double c) {
        double p = (a + b + c) / 2, res = 0;
        try { res = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } catch(ArithmeticException e) {
            res = 0;
            return "Mistake: " + e.getMessage();
        } return "" + res;
    }

    //Parallelogram


    //Diamond


    //A right triangle


    //Trapeze


    //Circle


}
