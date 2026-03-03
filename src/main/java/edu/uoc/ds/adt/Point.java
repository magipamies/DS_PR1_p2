package edu.uoc.ds.adt;

public class Point {

    private double x;
    private double y;

    // Constructor: crea un punt amb les seves coordenades
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Retorna la coordenada x
    public double x() {
        return this.x;
    }

    // Retorna la coordenada y
    public double y() {
        return this.y;
    }

    // Per imprimir el punt per la cosola
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
