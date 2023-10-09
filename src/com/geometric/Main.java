package com.geometric;

public class Main {
    public static void main(String[] args) {
        GeometricShape[] shapes = new GeometricShape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(4.0);
        shapes[2] = new Triangle(6.0, 8.0);

        // calculate total area all shapes
        double totalArea = calculateTotalArea(shapes);

        System.out.println("Total area all shape: " + totalArea);
    }

    // Method for calculating the total area of all shapes in an array
    public static double calculateTotalArea(GeometricShape[] shapes) {
        double totalArea = 0.0;
        for (GeometricShape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}