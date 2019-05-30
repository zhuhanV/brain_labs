package ua.zp.brain.labs.oop.basics.exceptions;

public class UserBank {
    public static void main(String[] args) {

        try {
            MoneyTransactionUtil.sendTo("555", "666", 99000);
        } catch (AccountException e) {
            System.out.println("Ошибка с реквизитами банка.\n" +
                    "Возможно, номер карты отправителя и получателя совпадают");
        } catch (MoneyValueExeption e) {
            System.out.println("Ошибка с суммой отправки.\n" +
                    "Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000");
        } catch (RuntimeException e) {
            System.out.println("При обработке " +
                    "транзакции банка произошла ошибка");
        }
    }}
