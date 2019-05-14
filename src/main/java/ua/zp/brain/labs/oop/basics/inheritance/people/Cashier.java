package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

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
     * @see countMoney
     */
    public void countMoney() {
        System.out.println("The cashier counted the money");
    }

    @Override
    public void doesJob() {
        System.out.println("The cashier does the job");
        ;
    }

}
