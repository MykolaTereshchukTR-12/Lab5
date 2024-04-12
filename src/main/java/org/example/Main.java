package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int control = 11;


    public static void main(String[] args) {
        Area area = new Area();
        OtherMethods otherMethods = new OtherMethods();
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();

        System.out.println("""
                \nHello! This is a program that performs the tasks of laboratory work in the discipline "Object Oriented Programming". Let's start work!!!
                For help, enter 11;
                Enter 0 to exit the program.""");

        while(true){
            switch(control) {
                case (0): {
                    System.out.println("Before meeting!");
                    System.exit(0);
                }
                case (1): {
                    System.out.println("Enter the actual length of the side of the square:");
                    System.out.println(area.areaSquare(scanner.nextDouble()));
                    main.controlSYS();
                    break;
                }
                case (2): {
                    System.out.println("Enter the actual lengths of the smaller and larger sides of the rectangle:");
                    System.out.println(area.areaRectangle(scanner.nextDouble(), scanner.nextDouble()));
                    main.controlSYS();
                    break;
                }
                case (3): {
                    System.out.println("Enter the actual lengths of the side and the height of the parallelogram:");
                    System.out.println(area.areaParallelogram(scanner.nextDouble(), scanner.nextDouble()));
                    main.controlSYS();
                    break;
                }
                case (4): {
                    System.out.println("Enter the actual length of the rhombus and its smaller angle in radians:");
                    System.out.println(area.areaRhombus(scanner.nextDouble(), scanner.nextDouble()));
                    main.controlSYS();
                    break;
                }
                case (5): {
                    System.out.println("Enter the actual lengths of the legs of a right triangle:");
                    System.out.println(area.areaRightTriangle(scanner.nextDouble(), scanner.nextDouble()));
                    main.controlSYS();
                    break;
                }
                case (6): {
                    System.out.println("Enter the actual lengths of the bases and heights of the trapezium:");
                    System.out.println(area.areaTrapeze(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
                    main.controlSYS();
                    break;
                }
                case (7): {
                    System.out.println("Enter the actual length of the circle radius:");
                    System.out.println(area.areaCircle(scanner.nextDouble()));
                    main.controlSYS();
                    break;
                }
                case (8): {
                    System.out.println("Enter three real numbers to find the smallest of them:");
                    System.out.println(otherMethods.three(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
                    main.controlSYS();
                    break;
                }
                case (9): {
                    System.out.println("Enter the number of elements of the array that will be generated randomly:");
                    System.out.println(Arrays.toString(otherMethods.mass(scanner.nextInt())));
                    main.controlSYS();
                    break;
                }
                case (10): {
                    System.out.println("Enter first the number of elements that will be in the array, and then enter the elements themselves through a space to find the largest element of the array:");
                    double[] mass = new double[scanner.nextInt()];
                    for (int i = 0; i != mass.length; i++) {
                        mass[i] = scanner.nextDouble();
                    }
                    System.out.println(otherMethods.largeNumber(mass, mass.length));
                    main.controlSYS();
                    break;
                }
                case (11): {
                    System.out.println("The essence of the program:");
                    System.out.println(otherMethods.help());
                    control = scanner.nextInt();
                    break;
                }
            }
        }
    }

    public void controlSYS(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue? Enter 11 if yes or 0 to exit the program.");
        control = scanner.nextInt();
    }
}