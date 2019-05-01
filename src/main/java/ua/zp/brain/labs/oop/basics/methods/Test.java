package main.java.ua.zp.brain.labs.oop.basics.methods;

public class Test {
    public static void main(String[] args) {


        System.out.println(PostOffice.calculateWeight(2, 3, 3));
        PostOffice po = new PostOffice();
        PostOffice po1 = new PostOffice();
        System.out.println(po.calcParsel(5));

        System.out.println(po1.getQuantityParsel());
    }
}