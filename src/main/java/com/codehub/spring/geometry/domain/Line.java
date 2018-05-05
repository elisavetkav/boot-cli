package com.codehub.spring.geometry.domain;

public class Line {

    Point a;
    Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }


    public double distance() {
        return distance(this.a, this.b);
    }

    public double distance(Point a, Point b) {
        double x = Math.abs(a.getX() - b.getX());
        double y = Math.abs(a.getY() - b.getY());
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }
}
