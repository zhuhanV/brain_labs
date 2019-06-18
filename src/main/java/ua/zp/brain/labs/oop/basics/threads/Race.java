package ua.zp.brain.labs.oop.basics.threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class Race {
    public static AtomicLong startRaceTime;


    public static void main(String[] args) {

        List<RaceCarRunnable> cars = new ArrayList<>();
        CountDownLatch cdl = new CountDownLatch(cars.size());


        int distanse = 100;
        cars.add(new RaceCarRunnable("Audi", 320, distanse, cdl));
        cars.add(new RaceCarRunnable("Opel", 285, distanse, cdl));

        for (RaceCarRunnable car : cars) {
            System.out.println(car);
        }

        final List<Thread> threads = new ArrayList();
        for (RaceCarRunnable car : cars) {
            threads.add(new Thread(car));
        }
        startRace(threads);

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    static void startRace(final List<Thread> cars) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 3;
                while (count != 0) {
                    try {
                        Thread.sleep(500);
                        System.out.println("\"" + count + "...\"");
                        if (count == 0) {
                            System.out.println("\"GO!!!\"");
                        }
                        startRaceTime = new AtomicLong(System.currentTimeMillis());
                        synchronized (cars) {
                            for (Thread car : cars) car.start();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                }
            }
        }
        ).start();
    }
}




