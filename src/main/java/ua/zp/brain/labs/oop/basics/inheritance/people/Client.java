package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

public class Client extends Person {
    private int discountCard;
    private int amountMoney;

    public Client(String name, String numberTel) {
        super(name, numberTel);

    }

    public int getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(int discountCard) {
        this.discountCard = discountCard;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    public void learnProduct() {
        System.out.println("The client found out about the product");
    }

    public void boughtProduct() {
        System.out.println("The client bought the product");
    }
}
