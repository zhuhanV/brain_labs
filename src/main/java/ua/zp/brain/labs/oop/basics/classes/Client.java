package main.java.ua.zp.brain.labs.oop.basics.classes;

public class Client {
    private int id;
    private String name;
    private String numberTel;
    private String address;
    private String dateOfPurchase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberTel() {
        return numberTel;
    }

    public void setNumberTel(String numberTel) {
        this.numberTel = numberTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] buyProduct(String product) {
        String[] products = new String[10];
        for (int i = 0; i < products.length; i++) {
            products[i] = product;
        }
        return products;
    }
}
