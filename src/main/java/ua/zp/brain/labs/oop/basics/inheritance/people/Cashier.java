package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

public class Cashier extends Worker {

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

    public void countMoney() {
        System.out.println("The cashier counted the money");
    }

    @Override
    public void doesJob() {
        System.out.println("The cashier does the job");
        ;
    }

}
