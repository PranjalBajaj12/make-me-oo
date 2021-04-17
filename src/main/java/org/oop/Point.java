package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point endPoint) {
        double xCoordinateDistance = getCoordinateDistance(x, endPoint.x);
        double yCoordinateDistance = getCoordinateDistance(y, endPoint.y);
        return Math.sqrt(Math.pow(xCoordinateDistance, 2) + Math.pow(yCoordinateDistance, 2));
    }

    private double getCoordinateDistance(double startCoordinate, double endCoordinate) {
        return endCoordinate - startCoordinate;
    }

    public double getDirectionAngle(Point endPoint) {
        double xCoordinateDistance = getCoordinateDistance(x, endPoint.x);
        double yCoordinateDistance = getCoordinateDistance(y, endPoint.y);
        return Math.atan2(yCoordinateDistance, xCoordinateDistance);
    }
}
