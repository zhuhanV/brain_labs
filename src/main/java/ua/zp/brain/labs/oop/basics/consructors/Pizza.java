package ua.zp.brain.labs.oop.basics.consructors;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pizza {
    private Circle basis;
    private String[] composition;
    private String name;
    private int cost;

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    public String[] getComposition() {
        return composition;
    }

    public void setComposition(String[] composition) {
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Pizza(String name, String[] composition, int cost, double diameter) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        new Circle(diameter / 2);
        System.out.println("Пицца " + name + "\n" + "Вартість: " + cost);
        System.out.println("Склад: " + Arrays.toString(composition));
    }

}
