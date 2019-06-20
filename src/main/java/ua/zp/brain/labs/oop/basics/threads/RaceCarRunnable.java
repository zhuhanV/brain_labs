package ua.zp.brain.labs.oop.basics.threads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

import static ua.zp.brain.labs.oop.basics.threads.Race.startRaceTime;

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
            finishTime = System.currentTimeMillis() - startRaceTime.get();
            if (passed < distance) {
                passed += (currentSpeed * 1000 / (60 * 60));
                System.out.printf("\n" + super.getName() + " время заезда: " + convertToTime(finishTime) + " секунд => speed: %d; progress: %d / %d \n", currentSpeed, passed, distance);


            } else {
                this.isFinish = true;
                System.out.println(super.getName() + " FINISHED !");
                }
        }
        cdl.countDown();
    }

    static String convertToTime(long time) {
        String oldDateString = String.valueOf(time / 1000);
        SimpleDateFormat dateFormat = new SimpleDateFormat("ss", Locale.getDefault());
        Date date = null;
        try {
            date = dateFormat.parse(oldDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String result = dateFormat.format(date);
        return result;
    }

}
