package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

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
        System.out.println("The manager talks about the product");
    }

    public void talksDiscounts() {
        System.out.println("The manager talks about discounts");
    }

    public void advises() {
        System.out.println("The manager advises");
    }

    @Override
    public void doesJob() {
        System.out.println("The manager does the job");
    }

    @Override
    public String toString() {
        return "Manager: " +
                "department= " + department + ", "+
                 super.toString();
    }


}

