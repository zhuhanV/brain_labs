package ua.zp.brain.labs.oop.basics.abstracts.devices;

public class Test {

    public static void main(String[] args) {

        System.out.println("\nTry equals two iPads:");
        Pad p1 = new Pad("iPad", 20_000, 1000);
        Pad p2 = new Pad("iPad", 20_000, 1000);
        p1.call();
        System.out.println(p1.equals(p2));
        System.out.println("\nTry Pad toString:");
        System.out.println(p1);


        System.out.println("\nTry own equals two SmartPhone:");
        SmartPhone s1 = new SmartPhone("Galaxy S8", 10_000);
        SmartPhone s2 = new SmartPhone("Galaxy S8", 10_000);
        s1.call();
        System.out.println(s1.equals(s2));
        System.out.println("\nTry SmartPhone toString:");
        System.out.println(s1);

        System.out.println("\nTry own equals two DialPhone:");
        DialPhone d1 = new DialPhone("Philips", 10_002);
        DialPhone d2 = new DialPhone("Philips", 10_102);
        d1.call();
        System.out.println(d1.equals(d2));
        System.out.println("\nTry DialPhone toString:");
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("");
        goOff(s1, s2, d1, d2);

    }

    public static void goOff(AbstractDevice... abstractDevices) {
        for (AbstractDevice ad : abstractDevices) {
            ad.powerOff();

        }

    }
}
