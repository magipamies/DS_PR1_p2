package edu.uoc.ds.adt;

public class SpiralGenerator {

    // Generemun array de punts per l'espiral d'Arqímedes
    public static Point[] generate(double a, double b, double thetaMax, double step) {

        // Calculem quants punts hi haurà
        int numPoints = (int)(thetaMax / step) + 1;

        // Creem l'arrray de punts
        Point[] points = new Point[numPoints];

        // Generem cada un dels punts
        double theta = 0;
        for (int i = 0; i < numPoints; i++) {
            double r = a + b * theta;
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            points[i] = new Point(x, y);
            theta += step;
        }

        return points;
    }
}
