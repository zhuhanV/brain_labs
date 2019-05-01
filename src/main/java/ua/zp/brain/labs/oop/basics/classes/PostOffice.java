package main.java.ua.zp.brain.labs.oop.basics.classes;

public class PostOffice {
    private int id;
    private String name;
    private String numberTel;
    private String address;
    private String addressDelivery;
    private String departureDate;
    private String dateOfReceiving;
    private int idClient;
    private double widthParcel;
    private double heightParcel;

    public double getLengthParsel() {
        return lengthParsel;
    }

    public void setLengthParsel(double lengthParsel) {
        this.lengthParsel = lengthParsel;
    }

    private double lengthParsel;

    public double getHeightParcel() {
        return heightParcel;
    }

    public void setHeightParcel(double heightParcel) {
        this.heightParcel = heightParcel;
    }

    public String getAddressDelivery() {
        return addressDelivery;
    }

    public void setAddressDelivery(String addressDelivery) {
        this.addressDelivery = addressDelivery;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDateOfReceiving() {
        return dateOfReceiving;
    }

    public void setDateOfReceiving(String dateOfReceiving) {
        this.dateOfReceiving = dateOfReceiving;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public double getWidthParcel() {
        return widthParcel;
    }

    public void setWidthParcel(double widthParcel) {
        this.widthParcel = widthParcel;
    }

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

    public static double calculateWeight(double widthParcel, double heightParcel, double lengthParsel) {
        double weightParsel;
        weightParsel = widthParcel * heightParcel * lengthParsel * 200;
        return weightParsel;
    }
}
