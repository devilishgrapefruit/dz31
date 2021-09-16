package com.dz;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getSquare() {
        return 2*Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getLengthArc(double rad) {
        return radius * rad;
    }

    public double getSquareSector(double rad) {
        return 0.5 * Math.pow(radius,2) * rad;
    }

    public void print(double rad) {
        System.out.print("Radius: " + getRadius() + "\nDiameter: " + getDiameter() + "\nSquare: " + getSquare() +
                "\nLength: " + getPerimeter() + "\nLengthArc: " + getLengthArc(rad) + "\nSquareSector: "
                + getSquareSector(rad));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
