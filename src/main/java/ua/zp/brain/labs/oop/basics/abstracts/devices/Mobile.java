package ua.zp.brain.labs.oop.basics.abstracts.devices;

import java.util.Objects;

public class Mobile extends Phone {
    private int simCount;
    private String display;

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Mobile(String name, Integer serial) {
        super(name, serial);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mobile)) return false;
        if (!super.equals(o)) return false;
        Mobile mobile = (Mobile) o;
        return getSimCount() == mobile.getSimCount() &&
                Objects.equals(getDisplay(), mobile.getDisplay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSimCount(), getDisplay());
    }

    @Override
    void powerOn() {
        System.out.println("Mobile Is on");
    }

    @Override
    void powerOff() {
        System.out.println("Mobile Is off");
    }


    @Override
    public void switchPower(){
        System.out.println("hold on/off button");
    }

    @Override
    void call() {
        System.out.println("Mobile Is call");
    }


}
