package nl.avans.drivio.model;

import org.springframework.data.geo.Point;

import javax.persistence.*;

// MappedSuperclass because of the inheritance
@MappedSuperclass
public abstract class Car {
    // Generates an ID on auto mode, which generates an ID over the whole app
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int carId;
    private String imageUrl;
    private String brand;
    private String model;
    private String fuelType;
    private int buildYear;
    private String numberPlate;
    private String carType;
    private String gearBox;
    private double latitude;
    private double longitude;
    // Joins the column user_id to the car tables
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Car() {
    }

    public Car(String imageUrl, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, User user, double latitude, double longitude) {
        this.imageUrl = imageUrl;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.buildYear = buildYear;
        this.numberPlate = numberPlate;
        this.carType = carType;
        this.gearBox = gearBox;
        this.user = user;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", imageUrl='" + imageUrl + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", buildYear=" + buildYear +
                ", numberPlate='" + numberPlate + '\'' +
                ", carType='" + carType + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", user=" + user +
                '}';
    }
}
