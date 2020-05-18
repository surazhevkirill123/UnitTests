package by.bsu.triangle.validator;

import java.util.Arrays;

public class TriangleValidator {
    public boolean isSide(double a) {
        return a > 0;
    }

    public boolean isTriangle(double a, double b, double c) {
        if (!isSide(a) || !isSide(b) || !isSide(c)) {
            return false;
        }

        double[] sides = {a,b,c};
        Arrays.sort(sides);

        return sides[2] < sides[0] + sides[1];
    }
}
