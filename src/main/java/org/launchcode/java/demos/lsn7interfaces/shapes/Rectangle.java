package org.launchcode.java.demos.lsn7interfaces.shapes;

public class Rectangle extends Shape {

    private double length;
    private double width;

    @Override
    public double area() {
        return length * width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }
}
