package org.example;

//A class that contains methods responsible for finding the areas of figures
public class Area {

    //Square
    public String areaSquare(double side) {
        if(side >= 0){
            return "Area of square is " + (side * side) + "!";
        } else {
            return "Error: square with negative sides does not exist.";
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
    public String areaRhombus(double side, double angle_in_radians){
        if(side >= 0){
            if(angle_in_radians >= 0 && angle_in_radians <= (2*Math.PI)){
                return "Area of rhombus is " + (side * side * Math.sin(angle_in_radians)) + "!";
            } else if(angle_in_radians < 0){
                return "Error: the smaller angle is negative.";
            } else {
                return "Error: The smaller angle cannot be greater than 2π radians.";
            }
        } else {
            return "Error: rhombus with negative sides does not exist.";
        }
    }

    //A right triangle
    public String areaRightTriangle(double first_leg, double second_leg){
        if(first_leg >= 0 && second_leg >= 0){
            return "Area of a right triangle by its two legs is " + (0.5 * first_leg * second_leg) + "!";
        } else {
            return "Error: right triangle with negative legs does not exist.";
        }
    }

    //Trapeze
    public String areaTrapeze(double larger_base, double smaller_base, double height_of_trapezium){
        if(larger_base < 0 || smaller_base < 0 || height_of_trapezium < 0){
            return "Error: a trapezoid with negative sides does not exist.";
        } else {
            return "Area of trapeze is " + ((larger_base + smaller_base)/2)*(height_of_trapezium) + "!";
        }
    }

    //Circle
    public String areaCircle(double radius){
        if(radius >= 0){
            return "Area of circle is " + (radius * radius * Math.PI) + "!";
        } else {
            return "Error: circle with negative radius does not exist.";
        }
    }
}
