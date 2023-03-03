package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {


    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(30, 44);
        Rectangle rectangle3 = new Rectangle(50, 20);
        System.out.println("rectangle1 area "+rectangle1.getArea());
        System.out.println("rectangle1 area "+rectangle1.getPerimeter());
        System.out.println("rectangle2 area "+rectangle2.getArea());
        System.out.println("rectangle2 area "+rectangle2.getPerimeter());
        System.out.println("rectangle3 area "+rectangle3.getArea());
        System.out.println("rectangle3 area "+rectangle3.getPerimeter());
        System.out.println("Total number of rectangles created "+Rectangle.getNumOfRectangle());

    }
}

class Rectangle {
    private double width;
    private double height;
    private static int numOfRectangle;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        Rectangle.numOfRectangle++;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public static int getNumOfRectangle() {
        return numOfRectangle;
    }
}
