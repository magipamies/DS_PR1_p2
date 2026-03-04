package edu.uoc.ds.adt;

/*
Classe per fer els càlculs
 */

public class SpiralGenerator {

    // Generena un array de punts de l'espiral d'Arqímedes. Cal posar les variables d'entrada per generar-la
    public static Point[] generate(double a, double b, double thetaMax, double step) {

        // Calculem quants punts hi haurà
        int numPoints = (int)(thetaMax / step) + 1;

        // Creem l'arrray de punts
        Point[] points = new Point[numPoints];

        // Generem cada un dels punts i els afegim a l'array de punts
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
