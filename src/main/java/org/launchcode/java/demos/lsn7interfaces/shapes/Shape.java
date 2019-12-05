package org.launchcode.java.demos.lsn7interfaces.shapes;

public abstract class Shape implements Geometry, Comparable {

    private double width;
    private double length;

    @Override
    public int compareTo(Object o) {
        Double areaDiff = this.area() - ((Shape) o).area();
        return areaDiff.intValue();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + String.format("&.2f", this.area());
    }
}
