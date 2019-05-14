package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

import main.java.ua.zp.brain.labs.oop.basics.inheritance.people.Person;

import java.util.Date;

public class Worker extends Person {
    private Date employment;
    private int salary;
    private boolean isPresence = false;

    public Date getEmployment() {
        return employment;
    }

    public void setEmployment(Date employment) {
        this.employment = employment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isPresence() {
        return isPresence;
    }

    public void setPresence(boolean presence) {
        isPresence = presence;
    }

    public Worker(String name, String numberTel) {
        super(name, numberTel);

    }

    public void comeWork() {
        System.out.println("The worker come to work");
    }

    public void goLunch() {
        System.out.println("The worker went to lunch");
    }

    public void doesJob() {
        System.out.println("The worker does the job");
    }

}
