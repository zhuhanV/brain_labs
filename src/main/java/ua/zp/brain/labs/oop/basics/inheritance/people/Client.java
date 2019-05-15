package main.java.ua.zp.brain.labs.oop.basics.inheritance.people;

import java.util.Objects;

public class Client extends Person {
    private int id;
    private int discountCard;
    private int amountMoney;

    public Client(String name, String numberTel, int discountCard) {
        super(name, numberTel);
        this.discountCard = discountCard;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void learnProduct() {
        System.out.println(getClass().getSimpleName() + " found out about the product");
    }


    public void boughtProduct() {
        System.out.println(getClass().getSimpleName() + " bought the product");
    }

    @Override
    public String toString() {
        return "Client: " +
                "discountCard № " + discountCard +
                ", " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Client client = (Client) o;
        if (id != ((Client) o).id) return false;
        return discountCard != 0 ? discountCard == ((Client) o).discountCard : ((Client) o).discountCard == 0;
    }

}
