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
    private int waitingCounter;


    public void loadGame(Game game) {
        if (firstGamepad.isOn || secondGamepad.isOn) {
            this.activeGame = game;
            System.out.println("Игра " + activeGame.getName() + " загружается");
        }

    }

    public void playGame() throws ExeptionActivity {
        checkStatus();
        if (firstGamepad.isOn) {
            if (firstGamepad.chargeLevel <= 0) {
                firstGamepad.powerOff();
            }

            if (firstGamepad.chargeLevel > 0) {
                if (activeGame != null) System.out.println("Играем в " + activeGame.getName());
                System.out.println("заряд джойстика " + firstGamepad.connectedNumber + ": " + firstGamepad.chargeLevel);
                firstGamepad.chargeLevel -= 10;
            }
        }
        if (secondGamepad.isOn) {
            if (secondGamepad.chargeLevel <= 0) {
                secondGamepad.powerOff();
            }

            if (secondGamepad.isOn && secondGamepad.chargeLevel > 0) {
                if (activeGame != null) System.out.println("Играем в " + activeGame.getName());
                System.out.println("заряд джойстика " + secondGamepad.connectedNumber + ": " + secondGamepad.chargeLevel);
                secondGamepad.chargeLevel -= 10;
            }
        }


    }

    private void checkStatus() throws ExeptionActivity {
        if (firstGamepad.isOn || secondGamepad.isOn) {
            waitingCounter = 0;
        }
        if (!firstGamepad.isOn && !secondGamepad.isOn) {
            if (waitingCounter < 5) {
                System.out.println("Подключите джойстик");
                ++waitingCounter;
            } else {
//               powerOff();
                throw new ExeptionActivity();
            }

        }
    }

    public GameConsole(Brand brand, String model, String serial) {
        this.brand = brand;
        this.model = model;
        this.serial = serial;
        firstGamepad = new Gamepad(this.brand, 1);
        secondGamepad = new Gamepad(this.brand, 2);
        if (firstGamepad.isOn) {
            secondGamepad.connectedNumber = 1;
        }
        firstGamepad.color = Color.RED;
        secondGamepad.color = Color.BLUE;
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
        if (isOn) {
            System.out.println("GameConsole " +
                    toString() + " is On");
        }
    }

    @Override
    public void powerOff() {
        System.out.println("GameConsole is Off");
    }


    @Override
    public String toString() {
        return "brand " + brand +
                ", model= " + model +
                ", serial= " + serial;
    }

    public class Gamepad implements Powered {
        private Brand brand;
        final String consoleSerial;
        int connectedNumber;
        private Color color;
        private double chargeLevel;
        private boolean isOn;

        public Brand getBrand() {
            return brand;
        }

        public void setBrand(Brand brand) {
            this.brand = brand;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        public String getConsoleSerial() {
            return consoleSerial;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public double getChargeLevel() {
            return chargeLevel;
        }

        public void setChargeLevel(double chargeLevel) {
            this.chargeLevel = chargeLevel;
        }

        private Gamepad(Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            this.consoleSerial = serial;
            this.chargeLevel = 100.00;

        }

        @Override
        public void powerOn() {
            System.out.println("Gamepad " + toString() +
                    " is ON");
            GameConsole.this.powerOn();
            if (!GameConsole.this.isOn) {
                GameConsole.this.isOn = true;

            } else isOn = true;

        }


        @Override
        public void powerOff() {
            if (!firstGamepad.isOn && !secondGamepad.isOn) {
                GameConsole.this.powerOff();
            }
            System.out.println("Gamepad " + toString() +
                    " is OFF");
            isOn = false;

        }

        @Override
        public String toString() {
            return connectedNumber +
                    ", марка " + brand +
                    ", серийный номер: " + consoleSerial +
                    ", цвет: " + color +
                    ", заряд: " + chargeLevel;
        }
    }


}