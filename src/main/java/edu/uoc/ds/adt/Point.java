package edu.uoc.ds.adt;
/*
Classe per definir el tipus de dades punt
 */

public class Point {

    // Declarem les variables x i y
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

    // Convertim el punt en un string.
    @Override  // per substituir el toString que te la classe Object
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
