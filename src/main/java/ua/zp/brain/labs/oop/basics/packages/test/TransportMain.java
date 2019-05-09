package main.java.ua.zp.brain.labs.oop.basics.packages.test;

import main.java.ua.zp.brain.labs.oop.basics.packages.technics.PassportUtil;
import main.java.ua.zp.brain.labs.oop.basics.packages.transport.Passport;

public class TransportMain {
    public static void main(String[] args) {
        Passport passportTransport = new Passport();
//        PassportUtil passportTransport1 = new PassportUtil();
        System.out.println(passportTransport);
        passportTransport.changeOwner("ofc");
        System.out.println(passportTransport);
    }
}
