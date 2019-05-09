package main.java.ua.zp.brain.labs.oop.basics.packages.transport;

import java.util.Date;

public class Passport {
    private String model;
    private long id;
    private Date dateManufacture;
    private String country;
    private String nameOwner;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateManufacture() {
        return dateManufacture;
    }

    public void setDateManufacture(Date dateManufacture) {
        this.dateManufacture = dateManufacture;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public static void changeOwner(Passport pas, String nameOwner) {
        pas = new Passport();

    }

    public Passport changeOwner(String nameOwner) {
        Passport pas = new Passport();
        pas.setCountry(this.country);
        pas.setDateManufacture(this.dateManufacture);
        pas.setModel(this.model);
        pas.setId(this.id);
        this.nameOwner = nameOwner;
        return pas;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "model='" + model + '\'' +
                ", id=" + id +
                ", dateManufacture=" + dateManufacture +
                ", country='" + country + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                '}';
    }
}
