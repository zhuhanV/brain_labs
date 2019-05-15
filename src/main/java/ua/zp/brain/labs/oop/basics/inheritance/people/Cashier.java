package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

import java.util.Objects;

/**
 * A simple class with the construct and methods of demonstrating the work of the cashier.
 *
 * @author Vira Zhuhan
 * @version 1.0
 */
public class Cashier extends Worker {

    /**
     *
     *
     */
    private int numberCashier;

    public int getNumberCashier() {
        return numberCashier;
    }

    public void setNumberCashier(int numberCashier) {
        this.numberCashier = numberCashier;
    }

    public Cashier(String name, String numberTel, int numberCashier) {
        super(name, numberTel);
        this.numberCashier = numberCashier;
    }

    /**
     * The cashier counted the money.
     *
     * @see
     */
    public void countMoney() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " counted the money");
    }

    @Override
    public void doesJob() {
        countMoney();

    }

    @Override
    public String toString() {
        return "Cashier: " +
                "cash desk №" + numberCashier +
                ", " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cashier)) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return getNumberCashier() == cashier.getNumberCashier();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberCashier());
    }
}
