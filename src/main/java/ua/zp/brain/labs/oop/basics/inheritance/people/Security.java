package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

public class Security extends Worker {

    public Security(String name, String numberTel) {
        super(name, numberTel);

    }

    public void speaksRadio() {
        System.out.println("The security speaks on the radio");
    }

    @Override
    public void doesJob() {
        System.out.println("The security does the job");
    }

    @Override
    public String toString() {
        return "Security: "+super.toString();
    }
}
