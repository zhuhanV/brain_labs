package ua.zp.brain.labs.oop.basics.abstracts.devices;

public abstract class Phone extends AbstractDevice {

    public Phone(String name, Integer serial) {
        super(name, serial);
    }

    abstract void call();



}
