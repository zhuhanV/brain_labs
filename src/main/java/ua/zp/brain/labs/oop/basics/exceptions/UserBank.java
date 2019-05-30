package ua.zp.brain.labs.oop.basics.exceptions;

public class UserBank {
    public static void main(String[] args) {

        try {
            MoneyTransactionUtil.sendTo("555", "666", 99000);
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("При обработке " +
                    "транзакции банка произошла ошибка");
        }


    }
}
