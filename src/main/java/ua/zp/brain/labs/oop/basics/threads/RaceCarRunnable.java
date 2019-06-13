package ua.zp.brain.labs.oop.basics.threads;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RaceCarRunnable extends Car implements Runnable {

    private int passed;
    private int distance;
    private boolean isFinish;

    public double getPassed() {
        return passed;
    }

    public void setPassed(int passed) {
        this.passed = passed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public RaceCarRunnable(String name, int maxSpeed, int distance) {
        super(name, maxSpeed);
        this.distance = distance;
    }

    public int getRandomSpeed() {
        Random r = new Random();
        int randomSpeed = ThreadLocalRandom.current().nextInt(getMaxSpeed() / 2, getMaxSpeed());
        return randomSpeed;
    }


    @Override
    public void run() {
        while (!isFinish) {
            int currentSpeed = getRandomSpeed();
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            passed += (currentSpeed*1000/(60*60));
            System.out.printf(super.getName() + " => speed: %d; progress: %d / %d", currentSpeed, passed, distance);

            if (distance>=passed){
                this.isFinish=true;
            }

        }
    }
}
