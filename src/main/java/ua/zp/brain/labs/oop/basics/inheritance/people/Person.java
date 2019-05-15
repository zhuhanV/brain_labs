package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

import java.util.Date;
import java.util.Objects;

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
        return
                "name= " + name +
                        ", numberTel= " + numberTel;
    }

    public void sayHello() {

        System.out.println(getClass().getSimpleName() + " " + getName() + " say Hello");
    }

    public void sayBue() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " say Bue");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if (!dateBirth.equals(o)) return false;
        return name != null ? name.equals(person.name) : person.name == null;

    }



}
