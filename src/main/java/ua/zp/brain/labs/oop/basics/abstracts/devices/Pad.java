package ua.zp.brain.labs.oop.basics.abstracts.devices;

import java.util.Objects;

public class Pad extends Mobile {

    private String name;
    private int price;

    public Pad(String name, Integer serial, int price) {
        super(name, serial);
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pad pad = (Pad) o;
        return price == pad.price &&
                Objects.equals(name, pad.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String toString() {
        return name + " cost " + price;
    }

    @Override
    void call() {
        System.out.println("Pad Is call");
    }
}
