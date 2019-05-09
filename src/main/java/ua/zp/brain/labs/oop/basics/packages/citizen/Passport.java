package main.java.ua.zp.brain.labs.oop.basics.packages.citizen;

import java.util.Date;

public class Passport {
    private String name;
    private Date dateBirth;
    private String country;
    private int spouseId;
    private int id;

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

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(int spouseId) {
        this.spouseId = spouseId;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", dateBirth=" + dateBirth +
                ", country='" + country + '\'' +
                ", spouseId=" + spouseId +
                ", id=" + id +
                '}';
    }
}
