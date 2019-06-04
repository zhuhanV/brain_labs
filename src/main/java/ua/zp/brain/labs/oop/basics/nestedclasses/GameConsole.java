package ua.zp.brain.labs.oop.basics.nestedclasses;


import java.util.Objects;

public class GameConsole implements Powered {

    private Brand brand;
    private String model;
    private String serial;
    private Gamepad firstGamepad;
    private Gamepad secondGamepad;
    private boolean isOn;
    private Game activeGame;


    public void loadGame(Game game) {
        this.activeGame = game;
        System.out.println("Игра " + activeGame + " загружается");
    }

    public void playGame()  {
        if (activeGame!=null)System.out.println("Играем в " + activeGame);
        firstGamepad.chargeLevel =100.00;
        System.out.println("заряд джойстика 1: "+ firstGamepad.chargeLevel);
//        firstGamepad.chargeLevel = firstGamepad.chargeLevel - 10;
//        secondGamepad.chargeLevel -= 10;
//        if (firstGamepad.chargeLevel == 0 || secondGamepad.chargeLevel == 0) {
            powerOff();


    }

    public GameConsole(Brand brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        Gamepad firstGamepad = new Gamepad(brand, 1, serial);
        Gamepad secondGamepad = new Gamepad(brand, 2, serial);
        if (firstGamepad.isOn) {
            secondGamepad = new Gamepad(brand, 1, serial);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameConsole)) return false;
        GameConsole that = (GameConsole) o;
        return isOn() == that.isOn() &&
                getBrand() == that.getBrand() &&
                Objects.equals(getModel(), that.getModel()) &&
                Objects.equals(getSerial(), that.getSerial()) &&
                Objects.equals(getFirstGamepad(), that.getFirstGamepad()) &&
                Objects.equals(getSecondGamepad(), that.getSecondGamepad());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getSerial(), getFirstGamepad(), getSecondGamepad(), isOn());
    }

    public Game getActiveGame() {
        return activeGame;
    }

    public void setActiveGame(Game activeGame) {
        this.activeGame = activeGame;
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

    @Override
    public void powerOn() {
        System.out.println("GameConsole is On");
    }

    @Override
    public void powerOff() {
        System.out.println("GameConsole is Off");
    }


    public class Gamepad implements Powered {
        Brand brand;
        final String consoleSerial;
        final int connectedNumber;
        Color color;
        double chargeLevel = 100.0;
        boolean isOn;


        public String getConsoleSerial() {
            return consoleSerial;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        private Gamepad(Brand brand, int connectedNumber, String consoleSerial) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            this.consoleSerial = serial;

        }

        @Override
        public void powerOn() {
            if (!isOn) {
                System.out.println("Gamepad is On");
                GameConsole.this.powerOn();
            }
        }

        @Override
        public void powerOff() {
            if (isOn) {
                System.out.println("Gamepad is Off");
            }
        }

        @Override
        public String toString() {
            return  connectedNumber +
                    ", марка " + brand +
                    ", серийный номер: " + consoleSerial +
                    ", цвет: " + color +
                    ", заряд: " + chargeLevel +
                    '}';
        }
    }


}