package main.java.ua.zp.brain.labs.oop.basics.packages.test;

import main.java.ua.zp.brain.labs.oop.basics.packages.citizen.Passport;
import main.java.ua.zp.brain.labs.oop.basics.packages.citizen.PassportUtil;

public class CitizenMain {
    public static void main(String[] args) {
        Passport passportCitizen1 = new Passport();
        Passport passportCitizen2 = new Passport();
        passportCitizen1.setId(2);
        passportCitizen2.setId(3);
        System.out.println(passportCitizen1);
        System.out.println(passportCitizen2);
        PassportUtil.marriageRegistrate(passportCitizen1, passportCitizen2);
        System.out.println(passportCitizen1);
        System.out.println(passportCitizen2);
    }
}
