package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

import java.util.Objects;

/**
 * class Security
 *
 * @author Vira Zhuhan
 * * @version 1.0
 */
public class Security extends Worker {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Security(String name, String numberTel, int id) {
        super(name, numberTel);
        this.id = id;

    }

    public void speaksRadio() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " speaks on the radio");
    }

    @Override
    public void doesJob() {
        speaksRadio();
    }

    @Override
    public String toString() {
        return "Security: № " + getId() + " " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Security)) return false;
        if (!super.equals(o)) return false;
        Security security = (Security) o;
        return getId() == security.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
