package ua.zp.brain.labs.oop.basics.enums;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Anna", "222", "kk025k");
        User user2 = new User("Petr", "111", "kkk04745k");
        User user3 = new User("oleg", "333", "kk04242kk");
        User user4 = new User("olga", "221252", "k47210kkk");
        User user5 = new User("Igor", "2258", "4040k");
        user1.setRole(Role.DIRECTOR);
        user2.setRole(Role.MANAGER);
        user3.setRole(Role.CLIENT);
        user4.setRole(Role.CLIENT);

        User[] users = {user1, user2, user3, user4, user5};

        Store store = new Store();
        store.setArrUsers(users);
        store.setUrlShop("356");
        System.out.println(store.switchLogin("111", "222"));

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i] + " магазин " + "\"" + store.getUrlShop());
            store.getCurrentUserRights(users[i]);
        }

        for (int i = 0; ; i++) {
            tryLogin(store);

        }
    }

    static void tryLogin(Store store) {
        System.out.println("Введите имя");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.nextLine();
        System.out.println("Введите логин");
        Scanner scanLog = new Scanner(System.in);
        String login = scanLog.nextLine();
        System.out.println("Введите пароль");
        Scanner scanPas = new Scanner(System.in);
        String password = scanPas.nextLine();
        boolean isLogin = store.switchLogin(login, password);
        if (isLogin) {
            store.getCurrentUserRights();
            store.logout();
        } else {
            System.out.println("Неверный логин и\\или пароль");
        }
    }


}
