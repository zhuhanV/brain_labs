package ua.zp.brain.labs.oop.basics.threads;

import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class RaceCarRunnable extends Car implements Runnable {

    private int passed;
    private int distance;
    private boolean isFinish;
    private CountDownLatch cdl;
    private long finishTime;

     public long getFinishTime() {
        return finishTime;
    }

    public CountDownLatch getCdl() {
        return cdl;
    }

    public void setCdl(CountDownLatch cdl) {
        this.cdl = cdl;
    }

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

    public RaceCarRunnable(String name, int maxSpeed, int distance, CountDownLatch cdl) {
        super(name, maxSpeed);
        this.distance = distance;
        this.cdl = cdl;

    }

    public int getRandomSpeed() {
        int randomSpeed = ThreadLocalRandom.current().nextInt(getMaxSpeed() / 2, getMaxSpeed());
        return randomSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RaceCarRunnable)) return false;
        RaceCarRunnable that = (RaceCarRunnable) o;
        return getPassed() == that.getPassed() &&
                getDistance() == that.getDistance() &&
                isFinish() == that.isFinish();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPassed(), getDistance(), isFinish());
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
            if (passed < distance) {
                passed += (currentSpeed * 1000 / (60 * 60));
                System.out.printf("\n" + super.getName() + " время заезда: " + finishTime + " => speed: %d; progress: %d / %d \n", currentSpeed, passed, distance);
                cdl.countDown();
            } else {
                this.isFinish = true;
                System.out.println(super.getName()+" FINISHED !");
            }
        }
    }

    static String convertToTime(long time) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        return dateFormat.toString();
    }

}
