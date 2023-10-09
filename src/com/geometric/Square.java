package com.geometric;

public class Square implements GeometricShape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return 2 * length;
    }
}
