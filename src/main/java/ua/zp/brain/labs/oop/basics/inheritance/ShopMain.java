package main.java.ua.zp.brain.labs.oop.basics.inheritance;


import main.java.ua.zp.brain.labs.oop.basics.inheritance.people.*;

public class ShopMain {
    public static void main(String[] args) {


        Shop shop = new Shop("Penny", "Zaporizhzhya");
        shop.openUp();
        shop.sellGoods();
        shop.goLunch();


    }
}
