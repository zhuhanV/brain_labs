package main.java.ua.zp.brain.labs.oop.basics.wrappers;

public class Main {
    Integer i = 10;
    Integer i1 = Integer.valueOf(10);
    Integer i2 = new Integer(10);
    Integer i3 = Integer.parseInt("10");

    Long l = 10L;
    Long l1 = Long.valueOf(10);
    Long l2 = new Long(10);
    Long l3 = Long.parseLong("10");

    Float f = 10f;
    Float f1 = Float.valueOf(10);
    Float f2 = new Float(10);
    Float f3 = Float.parseFloat("10");

    Double d = 10d;
    Double d1 = Double.valueOf(10);
    Double d2 = new Double(10);
    Double d3 = Double.parseDouble("10");

    Boolean isB = null;
    Boolean isB1 = Boolean.valueOf(true);
    Boolean isB2 = new Boolean(false);
    Boolean isB3 = Boolean.parseBoolean("10");

    Character c = '1';
    Character c2 = new Character('1');

    Byte b = 10;
    Byte b3 = Byte.parseByte("10");


    public static void main(String[] args) {
        Double doub = 225.25555555;
        byte by = doub.byteValue();
        short sh = doub.shortValue();
        int in = doub.intValue();
        float fl = doub.floatValue();
        long lo = doub.longValue();
        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(fl);
        System.out.println(lo);

        Double nonZero = 1.0;
        Double zero = 0.0;

        Double nanValue = nonZero / zero;
        System.out.println(nanValue);

        Double infinityValue = zero / nonZero;
        System.out.println(infinityValue);

    }


}
