package org.oop;

public class DistanceAndDirectionCalculator {

    public static double direction(Point from, Point to) {
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.atan2(yDistance, xDistance);
    }
}
