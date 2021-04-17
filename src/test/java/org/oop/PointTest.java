package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        assertEquals(0, origin.calculateDistance(origin));
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point endPoint1 = new Point(1, 0);
        Point endPoint2 = new Point(0, 1);

        assertEquals(1, origin.calculateDistance(endPoint1));
        assertEquals(1, origin.calculateDistance(endPoint2));
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point startPoint = new Point(1, 0);
        Point endPoint = new Point(-1, 0);

        assertEquals(2, startPoint.calculateDistance(endPoint));
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point endPoint1 = new Point(1, 0);
        Point endPoint2 = new Point(3, 0);

        assertEquals(0, origin.getDirectionAngle(endPoint1));
        assertEquals(0, origin.getDirectionAngle(endPoint2));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point endPoint1 = new Point(-1, 0);
        Point endPoint2 = new Point(-3, 0);

        assertEquals(Math.PI, origin.getDirectionAngle(endPoint1));
        assertEquals(Math.PI, origin.getDirectionAngle(endPoint2));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point endPoint1 = new Point(0, 1);
        Point endPoint2 = new Point(0, 3);

        assertEquals(Math.PI / 2, origin.getDirectionAngle(endPoint1));
        assertEquals(Math.PI / 2, origin.getDirectionAngle(endPoint2));
    }
}
