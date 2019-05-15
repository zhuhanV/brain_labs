package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

import main.java.ua.zp.brain.labs.oop.basics.inheritance.people.Person;

import java.util.Date;
import java.util.Objects;

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
        System.out.println("The worker " + getClass().getSimpleName() + " come to work");
    }

    public void goLunch() {
        System.out.println("The worker went to lunch");
    }

    public void doesJob() {
        System.out.println("The worker does the job");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return getSalary() == worker.getSalary() &&
                isPresence() == worker.isPresence() &&
                Objects.equals(getEmployment(), worker.getEmployment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployment(), getSalary(), isPresence());
    }
}
