package main.java.ua.zp.brain.labs.oop.basics.inheritance;


import main.java.ua.zp.brain.labs.oop.basics.inheritance.people.*;

public class Shop {
    private String name;
    private String address;
    private Manager manager;
    private Cashier cashier;
    private Security security;
    private Client client;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void openUp() {
        System.out.println("The shop has opened");
    }

    public void sellGoods() {
        System.out.println("The shop " + getName() + " sell goods");
    }

    public void goLunch() {
        System.out.println("The shop " + getName() + " closed for lunch");
    }

}
