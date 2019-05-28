package ua.zp.brain.labs.oop.basics.abstracts.devices;

public class DialPhone extends Phone {
    private boolean hasAnswerPhone;

    public boolean isHasAnswerPhone() {
        return hasAnswerPhone;
    }

    public void setHasAnswerPhone(boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
    }

    public DialPhone(String name, Integer serial) {
        super(name, serial);
    }

    @Override
    void call() {
        System.out.println("DialPhone is call");

    }

    @Override
    void powerOn() {
        System.out.println("DialPhone is on");
    }

    @Override
    void powerOff() {
        System.out.println("DialPhone is off");
    }

    @Override
    protected void switchPower() {
    }

    public void autoAnswer() {
        if (!hasAnswerPhone)
            System.out.println("its autoAnswer");
    }

    @Override
    public String toString() {
        return "DialPhone " + super.toString();
    }
}
