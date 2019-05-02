package main.java.ua.zp.brain.labs.oop.basics.consructors;

public class Circle {
    private double radius;
    private String color;
    private double length;
    private double square;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.length = 2 * Math.PI * radius;
        this.square = Math.PI * Math.pow(radius, 2);
        System.out.println("Довжина окружності: " + length);
        System.out.println("Площа окружності: " + square);

    }

    public Circle(double radius, String color) {
        this(radius);
        this.color = color;
        System.out.println("Колір: " + color);
    }

}
