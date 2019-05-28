package ua.zp.brain.labs.oop.basics.abstracts.devices;

public abstract class Multicooker extends AbstractDevice {

    @Override
    void powerOn() {
        System.out.println("Multicooker is On");
    }

    @Override
    void powerOff() {
        System.out.println("Multicooker is off");
    }

    abstract void cook();
}
