package ua.zp.brain.labs.oop.basics.abstracts.devices;

import java.util.Objects;

public class SmartPhone extends Mobile{

    private String os;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public SmartPhone(String name, Integer serial) {
        super(name, serial);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone)) return false;
        if (!super.equals(o)) return false;
        SmartPhone that = (SmartPhone) o;
        return Objects.equals(getOs(), that.getOs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOs());
    }

    @Override
    public String toString() {
        return "SmartPhone " +
                super.toString();
    }
}
