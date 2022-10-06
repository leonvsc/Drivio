package nl.avans.drivio.model;

public class Advertisement {
    private String AdvertisementId;
    private String Name;
    private double Price;
    private String Description; // TODO: Ander datatype zoeken.
    private String Pictures; // TODO: Juiste datatype zoeken.
    private nl.avans.drivio.model.Car Car;
    private User Owner; // TODO: Andere naamgeving?

    public Advertisement(String advertisementId, String name, double price, String description, String pictures, nl.avans.drivio.model.Car car, User owner) {
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

    public nl.avans.drivio.model.Car getCar() {
        return Car;
    }

    public void setCar(nl.avans.drivio.model.Car car) {
        this.Car = car;
    }

    public User getOwner() {
        return Owner;
    }

    public void setOwner(User owner) {
        this.Owner = owner;
    }
}
