package main.java.ua.zp.brain.labs.oop.basics.packages.technics;


import java.util.Date;

public class Passport {
    private String model;
    private Date dateManufacture;
    private String country;
    private Date warrantyStartDate;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public Date getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }


    @Override
    public String toString() {
        return "Passport{" +
                "model='" + model + '\'' +
                ", dateManufacture=" + dateManufacture +
                ", country='" + country + '\'' +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }
}

