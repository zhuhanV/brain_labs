package ua.zp.brain.labs.oop.basics.abstracts.devices;

import java.util.Objects;

public class Cooker extends Multicooker {

    private int numberProgram;

    public int getNumberProgram() {
        return numberProgram;
    }

    public void setNumberProgram(int numberProgram) {
        this.numberProgram = numberProgram;
    }

    public Cooker(int numberProgram) {
        super();
        this.numberProgram = numberProgram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cooker)) return false;
        if (!super.equals(o)) return false;
        Cooker cooker = (Cooker) o;
        return getNumberProgram() == cooker.getNumberProgram();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberProgram());
    }

    @Override
    void powerOff() {

    }

    @Override
    void cook() {
        System.out.println(getClass().getSimpleName() + " is cook");

    }

    @Override
    protected void switchPower() {

    }

    public void switchProgram(int numberProgram) {
        System.out.println("Program number: " + numberProgram);
    }


}
