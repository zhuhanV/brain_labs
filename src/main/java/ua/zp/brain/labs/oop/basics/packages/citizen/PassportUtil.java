package main.java.ua.zp.brain.labs.oop.basics.packages.citizen;

public class PassportUtil {

    private PassportUtil() {
        //"закрытый конструктор"
    }

    public static void marriageRegistrate(Passport spouse1, Passport spouse2) {
        spouse1.setSpouseId(spouse2.getId());
        spouse2.setSpouseId(spouse1.getId());
    }

    public static void main(String[] args) {
        Passport p1 = new Passport();
        Passport p2 = new Passport();
        p1.setName("qqq");
        p2.setName("www");
        p1.setId(52);
        p2.setId(30);

        System.out.println(p1);
        System.out.println(p2);

        PassportUtil.marriageRegistrate(p1, p2);

        System.out.println(p1);
        System.out.println(p2);


    }

}
