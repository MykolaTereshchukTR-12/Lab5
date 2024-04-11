package org.example;

public class Area {

    //Square
    public String areaSquare(double side) {
        if(side >= 0){
            return "Area of square is " + (side * side) + "!";
        } else {
            return "Error: square with negative numbers does not exist.";
        }
    }

    //Rectangle
    public String areaRectangle(double smaller_side, double larger_side) {
        if(smaller_side >= 0 && larger_side >= 0){
            return "Area of rectangle is " + (smaller_side * larger_side) + "!";
        } else {
            return "Error: rectangle with negative sides does not exist.";
        }
    }

    //Parallelogram
    public String areaParallelogram(double larger_side, double height_of_larger_side){
        if(larger_side >= 0 && height_of_larger_side >= 0){
            return "Area of parallelogram is " + (larger_side * height_of_larger_side) + "!";
        } else {
            return "Error: parallelogram with negative sides does not exist.";
        }
    }

    //Rhombus


    //A right triangle


    //Trapeze


    //Circle


}
