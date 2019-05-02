package main.java.ua.zp.brain.labs.oop.basics.methods;

/**
 * Describes the work of receiving and sending post office parcels.
 * Added:
 * calculateWeight()
 * parcel weight calculation method;
 * calcParsel ()
 * method of receiving the list of parcels;
 * packSend ()
 * packaging method and sending parcel list
 *
 * {@link PostOffice#calcParsel(int)}
 *
 * @author Brainacad35
 */
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
    private int quantityParsel;
    private String typePack;

    public String getTypePack() {
        return typePack;
    }

    public void setTypePack(String typePack) {
        this.typePack = typePack;
    }

    public int getQuantityParsel() {
        return quantityParsel;
    }

    public void setQuantityParsel(int quantityParsel) {
        this.quantityParsel = quantityParsel;
    }

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
        weightParsel = widthParcel * heightParcel * lengthParsel * 20;
        return weightParsel;
    }

    public PostOffice[] calcParsel(int quantityParsel) {
        PostOffice[] arrParsel = new PostOffice[quantityParsel];
        for (int i = 0; i < arrParsel.length; i++) {
            arrParsel[i] = new PostOffice();
        }
        for (int i = 0; i < arrParsel.length; i++) {
            System.out.println(arrParsel);
        }
        return arrParsel;
    }

    public void packSend(String typePack) {
        String msg = "message";
        String box = "box";
        int countMsg = 0;
        int countBox = 0;
        if (typePack.equals(msg)) {
            for (int i = 0; i < quantityParsel; i++) {
                countMsg++;
            }

            System.out.println("Відправлено " + countMsg + "листів");
        } else if (typePack.equals(box)) {
            for (int i = 0; i < quantityParsel; i++) {
                countBox++;
            }
            System.out.println("Відправлено " + countBox + "коробок");
        } else if ((countMsg + countMsg) == quantityParsel) {

            System.out.println("Все відправлено: \n"
                    + countBox + "коробок \n"
                    + countMsg + "листів");
        } else {
            System.out.println("посилок без упаковання: " + (quantityParsel - (countMsg + countMsg)));
        }

    }
}
