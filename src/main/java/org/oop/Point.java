package org.oop;

public class Point {
    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point end) {
        double xCoordinateDistance = end.x - x;
        double yCoordinateDistance = end.y - y;
        return Math.sqrt(Math.pow(xCoordinateDistance, 2) + Math.pow(yCoordinateDistance, 2));
    }
}
