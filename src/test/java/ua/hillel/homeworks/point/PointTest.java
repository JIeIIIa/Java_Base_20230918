package ua.hillel.homeworks.point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private static final double PRECISION = 0.0001;

    @Test
    void distanceBetweenNulls() {
        // when
        double result = Point.distanceBetween(null, null);

        //then
        assertEquals(-1, result);
    }

    @Test
    void distanceBetweenPointAndNull() {
        // given
        Point point = new Point(42, 0);

        // when
        double result = Point.distanceBetween(point, null);

        // then
        assertEquals(-1, result);
    }

    @Test
    void distanceBetweenNullAndPoint() {
        // given
        Point point = new Point(-42, 0);

        // when
        double result = Point.distanceBetween(null, point);

        // then
        assertEquals(-1, result);
    }

    @Test
    void distanceBetweenSamePoints() {
        // given
        Point point = new Point(1, 2);

        // when
        double result = Point.distanceBetween(point, point);

        // then
        assertEquals(0, result);
    }

    @Test
    void distanceBetweenEqualPoints() {
        // given
        Point point = new Point(1, 2);
        Point another = new Point(1, 2);


        // when
        double result = Point.distanceBetween(point, another);

        // then
        assertEquals(0, result);
    }

    @Test
    void distanceBetweenSuccess() {
        // given
        Point point = new Point(-3, 1);
        Point another = new Point(0, 5);


        // when
        double result = Point.distanceBetween(point, another);

        // then
        assertEquals(5, result, PRECISION);
    }

    @Test
    void distanceToNull() {
        // given
        Point point = new Point(13, 0);

        // when
        double result = point.distanceTo(null);

        // then
        assertEquals(-1, result);
    }

    @Test
    void distanceToSamePoints() {
        // given
        Point point = new Point(2, 1);

        // when
        double result = point.distanceTo(point);

        // then
        assertEquals(0, result);
    }

    @Test
    void distanceToEqualPoints() {
        // given
        Point point = new Point(123, 321);
        Point another = new Point(123, 321);


        // when
        double result = point.distanceTo(another);

        // then
        assertEquals(0, result);
    }

    @Test
    void distanceToSuccess() {
        // given
        Point point = new Point(3, -1);
        Point another = new Point(0, 3);


        // when
        double result = point.distanceTo(another);

        // then
        assertEquals(5, result, PRECISION);
    }
}