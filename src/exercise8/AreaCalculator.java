package exercise8;

public class AreaCalculator {
    public static double area(double radius) {
        double radiusCalc = radius * radius * Math.PI;
        if (radius < 0) {
            return -1.0;
        }

        return radiusCalc;
    }

    public static double area(double x, double y) {
        double areaOfRect = x * y;
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return areaOfRect;
    }
}
