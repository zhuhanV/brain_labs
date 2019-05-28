package ua.zp.brain.labs.oop.basics.abstracts.devices;

import java.util.Objects;

public abstract class AbstractDevice {
    private String name;
    private Integer serial;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractDevice)) return false;
        AbstractDevice that = (AbstractDevice) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getSerial(), that.getSerial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSerial());
    }

    @Override
    public String toString() {
        return name +
                ", serial " + serial;
    }

    protected AbstractDevice() {
        switchPower();
        powerOn();
    }


    public AbstractDevice(String name, Integer serial) {
        this.name = name;
        this.serial = serial;
    }

    protected String getPasport() { return name + "#" + serial; }

    abstract void powerOn();

    abstract void powerOff();
    protected abstract void switchPower();
}
