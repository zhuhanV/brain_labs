package ua.zp.brain.labs.oop.basics.nestedclasses;


public class GameConsole {

    private Brand brand;
    private String model;
    private String serial;

    private Gamepad firstGamepad;
    private Gamepad secondGamepad;
    private boolean isOn;

    class Gamepad {
        Brand brand;
        final String consoleSerial;
        final int connectedNumber;
        Color color;
        double chargeLevel =100.0;
        boolean isOn;

        public String getConsoleSerial() {
            return consoleSerial;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        private Gamepad (Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            this.consoleSerial = serial;

        }
    }

    public GameConsole (Brand brand, String serial){
        this.brand = brand;
        this.serial = serial;
        Gamepad firstGamepad = new Gamepad(brand,1);
        Gamepad secondGamepad = new Gamepad(brand, 2);
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public void setFirstGamepad(Gamepad firstGamepad) {
        this.firstGamepad = firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public void setSecondGamepad(Gamepad secondGamepad) {
        this.secondGamepad = secondGamepad;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }


}
