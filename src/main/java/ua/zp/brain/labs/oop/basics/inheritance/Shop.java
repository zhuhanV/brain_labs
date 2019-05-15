package main.java.ua.zp.brain.labs.oop.basics.inheritance;


import main.java.ua.zp.brain.labs.oop.basics.inheritance.people.*;

import java.util.Objects;

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

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    {
        security = new Security("VOVAN", "+30985268585", 15);
        manager = new Manager("ANNA", "+380953652525", "APPLE");
        cashier = new Cashier("INNA", "+380953659858", 3);
        client = new Client("OLGA", "+380685987452", 174);
    }

    public void openUp() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " has opened");

        security.comeWork();
        System.out.println(security.toString());
        manager.comeWork();
        System.out.println(manager.toString());
        cashier.comeWork();
        System.out.println(cashier.toString());
        security.sayHello();
        manager.sayHello();
        cashier.sayHello();

    }

    public void sellGoods() {
        System.out.println("The shop sell goods");
        security.doesJob();
        client.sayHello();
        System.out.println(client.toString());
        manager.doesJob();
        client.boughtProduct();
        cashier.doesJob();

    }

    public void goLunch() {
        System.out.println("The shop closed for lunch");
        manager.sayBue();
        client.sayBue();
        cashier.sayBue();
    }


    @Override
    public String toString() {
        return "Shop: " + name +
                ", address: " + address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(getName(), shop.getName()) &&
                Objects.equals(getAddress(), shop.getAddress()) &&
                Objects.equals(getManager(), shop.getManager()) &&
                Objects.equals(getCashier(), shop.getCashier()) &&
                Objects.equals(getSecurity(), shop.getSecurity()) &&
                Objects.equals(getClient(), shop.getClient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getManager(), getCashier(), getSecurity(), getClient());
    }
}
