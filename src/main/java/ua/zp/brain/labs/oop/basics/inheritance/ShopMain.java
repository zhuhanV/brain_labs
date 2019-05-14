package main.java.ua.zp.brain.labs.oop.basics.inheritance;


import main.java.ua.zp.brain.labs.oop.basics.inheritance.people.*;

public class ShopMain {
    public static void main(String[] args) {
        Shop.openUp();
        Security security = new Security("VOVAN", "+30985268585");
        security.comeWork();
        System.out.println(security.toString());
        security.sayHello();
        security.doesJob();
        security.speaksRadio();
        Manager manager = new Manager("ANNA", "+380953652525", "apple");
        manager.comeWork();
        System.out.println(manager.toString());
        manager.sayHello();
        manager.doesJob();
        manager.consult();
        Shop.goLunch();


    }
}
