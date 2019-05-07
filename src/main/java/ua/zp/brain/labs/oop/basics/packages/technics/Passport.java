package main.java.ua.zp.brain.labs.oop.basics.packages.technics;

import java.util.Date;

public class Passport {
    private String model;
    private int yearsWarranty;
    private Date dateManufacture;
    private String country;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearsWarranty() {
        return yearsWarranty;
    }

    public void setYearsWarranty(int yearsWarranty) {
        this.yearsWarranty = yearsWarranty;
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
}
