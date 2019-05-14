package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

import java.util.Date;

/**
 * Implementing a class hierarchy with fields and methods
 */

public class Person {
    private String name;
    private Date dateBirth;
    private String numberTel;

    public Person(String name, String numberTel) {
        this.name = name;
        this.numberTel = numberTel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getNumberTel() {
        return numberTel;
    }

    public void setNumberTel(String numberTel) {
        this.numberTel = numberTel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", numberTel='" + numberTel + '\'' +
                '}';
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayBue() {
        System.out.println("Bue");
    }
}
