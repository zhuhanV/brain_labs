package ua.zp.brain.labs.oop.basics.threads;

import java.util.ArrayList;
import java.util.List;

public class Race {
    public static void main(String[] args) {
       List < RaceCarRunnable >cars = new ArrayList();
       cars.add(1,new RaceCarRunnable("Audi",320,100));
        cars.add(2,new RaceCarRunnable("Opel",285,100));

        List <Thread> threads = new ArrayList();
        threads.add(new Thread(cars.get(1)));
        threads.add(new Thread(cars.get(2)));


    }

//    static void startRace(List<Thread> cars){
//        {new Thread(new Runnable(){
//            @Override
//            public void run() {
//                for (int i = 0; i < ; i++) {
//
//                }
//            }
//        }
//    }}
}
