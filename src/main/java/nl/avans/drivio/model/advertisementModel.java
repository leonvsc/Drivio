package nl.avans.drivio.model;

public class advertisementModel {
    private String AdvertisementId;
    private String Name;
    private double Price;
    private String Description; // TODO: Ander datatype zoeken.
    private String Pictures; // TODO: Juiste datatype zoeken.
    private carModel Car;
    private userModel Owner; // TODO: Andere naamgeving?

    public advertisementModel(String advertisementId, String name, double price, String description, String pictures, carModel car, userModel owner) {
        this.AdvertisementId = advertisementId;
        this.Name = name;
        this.Price = price;
        this.Description = description;
        this.Pictures = pictures;
        this.Car = car;
        this.Owner = owner;
    }

    public String getAdvertisementId() {
        return AdvertisementId;
    }

    public void setAdvertisementId(String advertisementId) {
        this.AdvertisementId = advertisementId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getPictures() {
        return Pictures;
    }

    public void setPictures(String pictures) {
        this.Pictures = pictures;
    }

    public carModel getCar() {
        return Car;
    }

    public void setCar(carModel car) {
        this.Car = car;
    }

    public userModel getOwner() {
        return Owner;
    }

    public void setOwner(userModel owner) {
        this.Owner = owner;
    }
}
