package ua.zp.brain.labs.oop.basics.threads;


import java.util.Objects;
import java.util.concurrent.atomic.*;


public class Car {
    private String name;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getMaxSpeed() == car.getMaxSpeed() &&
                Objects.equals(getName(), car.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMaxSpeed());
    }

    @Override
    public String toString() {
        return "car " + name +
                ", maxSpeed " + maxSpeed;
    }
}
