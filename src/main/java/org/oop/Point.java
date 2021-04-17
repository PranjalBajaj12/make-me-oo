package org.oop;

public class Point {
    private final double xCoordinate;
    private final double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistance(Point endPoint) {
        double xCoordinateDistance = getCoordinateDistance(xCoordinate, endPoint.xCoordinate);
        double yCoordinateDistance = getCoordinateDistance(yCoordinate, endPoint.yCoordinate);
        return Math.sqrt(Math.pow(xCoordinateDistance, 2) + Math.pow(yCoordinateDistance, 2));
    }

    private double getCoordinateDistance(double startCoordinate, double endCoordinate) {
        return endCoordinate - startCoordinate;
    }

    public double getDirectionAngle(Point endPoint) {
        double xCoordinateDistance = getCoordinateDistance(xCoordinate, endPoint.xCoordinate);
        double yCoordinateDistance = getCoordinateDistance(yCoordinate, endPoint.yCoordinate);
        return Math.atan2(yCoordinateDistance, xCoordinateDistance);
    }
}
