package main.java.ua.zp.brain.labs.oop.basics.packages.technics;

import javax.xml.crypto.Data;
import java.util.Date;

public class PassportUtil {
    private PassportUtil() {
        //"закрытый конструктор"
    }

    public static void warrantyReplace(Passport old) {
        old.setWarrantyStartDate(new Date() {
        });

    }

    public static void main(String[] args) {
        Passport b = new Passport();
        b.setWarrantyStartDate(new Date(335987));
        System.out.println(b);
        PassportUtil.warrantyReplace(b);
        System.out.println(b);
    }
}
