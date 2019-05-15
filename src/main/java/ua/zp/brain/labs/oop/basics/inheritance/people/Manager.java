package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

import java.util.Objects;

public class Manager extends Worker {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Manager(String name, String numberTel, String department) {
        super(name, numberTel);
        this.department = department;
    }

    public void consult() {
        System.out.println("The manager talks " + Client.class.getSimpleName() + " about the product");
    }

    public void talksDiscounts() {
        System.out.println("The manager talks " + Client.class.getSimpleName() + " about discounts");
    }

    public void advises() {
        System.out.println("The manager advises to buy the product");
    }

    @Override
    public void doesJob() {
        consult();
        talksDiscounts();
        advises();
    }

    @Override
    public String toString() {
        return "Manager: " +
                "department= " + department + ", " +
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Manager manager = (Manager) o;
        return department != null ? department.equals(((Manager) o).department) : ((Manager) o).department == null;
    }
}

