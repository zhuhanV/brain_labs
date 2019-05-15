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

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void openUp() {
        Security security = new Security("VOVAN", "+30985268585", 15);
        Manager manager = new Manager("ANNA", "+380953652525", "APPLE");
        Cashier cashier = new Cashier("INNA", "+380953659858", 3);
        Client client = new Client("OLGA", "+380685987452", 174);

        System.out.println("The shop has opened");

        security.comeWork();
        System.out.println(security.toString());
        security.sayHello();
        security.doesJob();


        manager.comeWork();
        System.out.println(manager.toString());
        manager.sayHello();


        cashier.comeWork();
        System.out.println(cashier.toString());
        cashier.sayHello();


        client.sayHello();
        System.out.println(client.toString());

        manager.doesJob();
        client.boughtProduct();
        cashier.doesJob();
        manager.sayBue();
        client.sayBue();
        cashier.sayBue();

    }

    public static void sellGoods() {
        System.out.println("The shop sell goods");
    }

    public static void goLunch() {
        System.out.println("The shop closed for lunch");
    }


    @Override
    public String toString() {
        return "Shop: " + name +
                ", address: " + address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Shop shop = (Shop) o;
        if (!manager.equals(((Shop) o).manager)) return false;
        if (!cashier.equals(((Shop) o).cashier)) return false;
        if (!security.equals(((Shop) o).security)) return false;
        if (!client.equals(((Shop) o).client)) return false;
        return name != null ? name.equals(((Shop) o).name) : ((Shop) o).name == null;
    }



}
