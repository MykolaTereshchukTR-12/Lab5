package org.example;

public class Area {

    //Square
    public String areaSquare(double a) {
        if(a >= 0){
            return "Area of square is " + a*a + "!";
        } else {
            return "Error: square with negative numbers does not exist.";
        }
    }

    //Rectangle
    public String areaRectangle(double b, double c) {
        if(b >= 0 && c >= 0){
            return "Area of rectangle is " + b*c + "!";
        } else {
            return "Error: rectangle with negative sides does not exist.";
        }
    }

    //Parallelogram


    //Diamond


    //A right triangle


    //Trapeze


    //Circle


}
